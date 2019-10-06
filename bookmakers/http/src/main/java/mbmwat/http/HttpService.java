package mbmwat.http;

import org.springframework.stereotype.Service;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

@Service
public interface HttpService{

    Optional<HttpRequest> requestGet(final String path);
    Optional<HttpResponse> get(String apiPath);

}
