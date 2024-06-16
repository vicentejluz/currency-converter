package utils;

import java.net.URI;

public final class ExchangeRatesAPIUtil {
    private ExchangeRatesAPIUtil() {

    }

    public static URI uri(final String API_KEY, String baseCurrency, String targetCurrency, Double amount) {
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + baseCurrency + "/"
                + targetCurrency + "/" + amount);
        return uri;
    }
}