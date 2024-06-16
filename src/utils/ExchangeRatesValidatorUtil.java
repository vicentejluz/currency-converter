package utils;

import model.dto.ExchangeRatesDTO;
import utils.exception.InactiveAccountException;
import utils.exception.InvalidKeyException;
import utils.exception.MalformedRequestException;
import utils.exception.QuotaReachedException;
import utils.exception.UnknownErrorException;
import utils.exception.UnsupportedCodeException;

public final class ExchangeRatesValidatorUtil {
    private ExchangeRatesValidatorUtil() {
    }

    public static void validateExchangeRatesResponse(ExchangeRatesDTO exchangeRatesDTO) {
        if (exchangeRatesDTO.result().equals("error")) {
            String error = exchangeRatesDTO.errorType();
            switch (error) {
                case "unsupported-code":
                    throw new UnsupportedCodeException("Código de moeda não suportado.");
                case "invalid-key":
                    throw new InvalidKeyException("Chave de API inválida.");
                case "inactive-account":
                    throw new InactiveAccountException("Conta inativa.");
                case "quota-reached":
                    throw new QuotaReachedException("Cota de uso atingida.");
                case "malformed-request":
                    throw new MalformedRequestException("Requisição malformada.");
                default:
                    throw new UnknownErrorException("Erro desconhecido: " + error);
            }
        }
    }
}