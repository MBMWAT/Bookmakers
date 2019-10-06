package mbmwat.http;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.Optional;

@Service
public abstract class AbstractHttpService implements HttpService{

    @Override
    public Optional<HttpResponse> get(String apiPath) {
        HttpResponse<String> response;
        try {

            response = HttpClient
                    .newBuilder()
                    .proxy(ProxySelector.getDefault())
                    .build()
                    .send(requestGet(apiPath).orElseThrow(() -> new NullPointerException("RequestGet method returned null")), HttpResponse.BodyHandlers.ofString());

            return Optional.of(response);

        } catch (InterruptedException e) {

            e.printStackTrace();
            System.out.println(e.getMessage());

        } catch (IOException e) {

            e.printStackTrace();
            System.out.println(e.getMessage());

        }

        return Optional.empty();
    }
}
