package utils;

import model.dto.ExchangeRatesDTO;

public final class CurrencyConverterUtil {
    private CurrencyConverterUtil() {
    }

    public static Double getConversionRate(final String API_KEY, String baseCurrency, String targetCurrency,
            Double amount) {
        ExchangeRatesDTO exchangeRatesDTO = requestExchangeRates(API_KEY, baseCurrency, targetCurrency, amount);

        ExchangeRatesValidatorUtil.validateExchangeRatesResponse(exchangeRatesDTO);

        return exchangeRatesDTO.conversionResult();
    }

    private static ExchangeRatesDTO requestExchangeRates(final String API_KEY, String baseCurrency,
            String targetCurrency,
            Double amount) {
        return HttpRequestHandlerUtil.sendHttpRequest(API_KEY, baseCurrency, targetCurrency, amount,
                ExchangeRatesDTO.class);
    }
}