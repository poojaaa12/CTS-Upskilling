import java.net.URI;
import java.net.http.*;

public class HttpClientExample {

    public static void main(String[] args)
            throws Exception {

        HttpClient httpClient =
                HttpClient.newHttpClient();

        HttpRequest httpRequest =
                HttpRequest.newBuilder()
                        .uri(
                                URI.create(
                                        "https://api.github.com"))
                        .build();

        HttpResponse<String> httpResponse =
                httpClient.send(
                        httpRequest,
                        HttpResponse.BodyHandlers.ofString());

        System.out.println(
                httpResponse.statusCode());

        System.out.println(
                httpResponse.body());
    }
}
