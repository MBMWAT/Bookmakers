package mbmwat.http;

import javax.swing.text.html.Option;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;


public interface HttpService{

    Optional<HttpRequest> requestGet(final String path);
    Optional<HttpResponse> get(String apiPath);

}
