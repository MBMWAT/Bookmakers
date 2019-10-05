package mbmwat.http;

import javax.swing.text.html.Option;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.Optional;

public class HttpFootballMatchesService extends AbstractHttpService{

    @Override
    public Optional<HttpRequest> requestGet(String path) {

        try {
            return Optional.of(HttpRequest.newBuilder()

                    .uri(new URI(path))
                    .version(HttpClient.Version.HTTP_2)
                    .timeout(Duration.ofSeconds(10)) // HttpTimeoutException
                    .header("X-Auth-Token", "ef6a7b8f75d04702b5b6eb8b5509569e")
                    .GET()
                    .build());

        } catch (URISyntaxException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return Optional.empty();
    }

}
