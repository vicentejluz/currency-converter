package utils;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import utils.exception.HttpRequestException;

public final class HttpRequestHandlerUtil {
    private HttpRequestHandlerUtil() {

    }

    public static <T> T sendHttpRequest(final String API_KEY, String baseCurrency, String targetCurrency,
            Double amount, Class<T> responseType) {
        URI uri = ExchangeRatesAPIUtil.uri(API_KEY, baseCurrency,
                targetCurrency, amount);
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(uri).build();
            HttpResponse<String> response;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), responseType);
        } catch (Exception e) {
            throw new HttpRequestException("Erro ao enviar solicitação HTTP: " +
                    e.getMessage());
        }
    }
}