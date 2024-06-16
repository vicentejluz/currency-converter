import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverterUtil;
import utils.EnvLoaderUtil;
import utils.exception.HttpRequestException;
import utils.exception.InactiveAccountException;
import utils.exception.InvalidKeyException;
import utils.exception.MalformedRequestException;
import utils.exception.QuotaReachedException;
import utils.exception.UnknownErrorException;
import utils.exception.UnsupportedCodeException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        final String API_KEY = EnvLoaderUtil.load(".env").get("API_KEY");

        while (true) {
            try {
                String baseCurrency;
                String targetCurrency;
                double amount;
                double currency;
                menu();
                String resp = sc.next();
                if (resp.equals("1")) {
                    System.out.println("Digite o valor que deseja converter: ");
                    amount = sc.nextDouble();
                    baseCurrency = "USD";
                    targetCurrency = "ARS";
                    currency = CurrencyConverterUtil.getConversionRate(API_KEY, baseCurrency, targetCurrency,
                            amount);
                    showConversionResult(amount, baseCurrency, targetCurrency, currency);
                } else if (resp.equals("2")) {
                    System.out.println("Digite o valor que deseja converter: ");
                    amount = sc.nextDouble();
                    baseCurrency = "ARS";
                    targetCurrency = "USD";
                    currency = CurrencyConverterUtil.getConversionRate(API_KEY, baseCurrency, targetCurrency,
                            amount);
                    showConversionResult(amount, baseCurrency, targetCurrency, currency);
                } else if (resp.equals("3")) {
                    System.out.println("Digite o valor que deseja converter: ");
                    amount = sc.nextDouble();
                    baseCurrency = "USD";
                    targetCurrency = "BRL";
                    currency = CurrencyConverterUtil.getConversionRate(API_KEY, baseCurrency, targetCurrency,
                            amount);
                    showConversionResult(amount, baseCurrency, targetCurrency, currency);
                } else if (resp.equals("4")) {
                    System.out.println("Digite o valor que deseja converter: ");
                    amount = sc.nextDouble();
                    baseCurrency = "BRL";
                    targetCurrency = "USD";
                    currency = CurrencyConverterUtil.getConversionRate(API_KEY, baseCurrency, targetCurrency,
                            amount);
                    showConversionResult(amount, baseCurrency, targetCurrency, currency);
                } else if (resp.equals("5")) {
                    System.out.println("Digite o valor que deseja converter: ");
                    amount = sc.nextDouble();
                    baseCurrency = "USD";
                    targetCurrency = "COP";
                    currency = CurrencyConverterUtil.getConversionRate(API_KEY, baseCurrency, targetCurrency,
                            amount);
                    showConversionResult(amount, baseCurrency, targetCurrency, currency);
                } else if (resp.equals("6")) {
                    System.out.println("Digite o valor que deseja converter: ");
                    amount = sc.nextDouble();
                    baseCurrency = "COP";
                    targetCurrency = "USD";
                    currency = CurrencyConverterUtil.getConversionRate(API_KEY, baseCurrency, targetCurrency,
                            amount);
                    showConversionResult(amount, baseCurrency, targetCurrency, currency);
                } else if (resp.equals("7")) {
                    break;
                } else {
                    System.out.println("Opção inválida!!");
                }
            } catch (UnsupportedCodeException | InvalidKeyException | QuotaReachedException
                    | InactiveAccountException | MalformedRequestException | UnknownErrorException
                    | HttpRequestException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        sc.close();
    }

    public static void menu() {
        System.out.println("*".repeat(50));
        System.out.println("Seja bem vindo ao conversor de moeda:\n");
        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileiro");
        System.out.println("4) Real brasileiro =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Sair");
        System.out.println("Escolha uma opção válida: ");
        System.out.println("*".repeat(50));
    }

    public static void showConversionResult(double amount, String baseCurrency, String targetCurrency,
            double currency) {
        System.out.println("Valor " + String.format("%.2f", amount) + " [" + baseCurrency
                + "] corresponde ao valor final de =>>> " + String.format("%.2f", currency) + " [" + targetCurrency
                + "]");
    }
}
