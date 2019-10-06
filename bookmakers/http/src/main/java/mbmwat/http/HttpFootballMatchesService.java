package mbmwat.http;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.Optional;

@Service
public class HttpFootballMatchesService extends AbstractHttpService{

@Value("${generator.password}")
private String password;

    @Override
    public Optional<HttpRequest> requestGet(String path) {
        try {
            return Optional.of(HttpRequest.newBuilder()

                    .uri(new URI(path))
                    .version(HttpClient.Version.HTTP_2)
                    .timeout(Duration.ofSeconds(10)) // HttpTimeoutException
                    .header("X-Auth-Token", password)
                    .GET()
                    .build());

        } catch (URISyntaxException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return Optional.empty();
    }

}
