package model.dto;

import com.google.gson.annotations.SerializedName;

public record ExchangeRatesDTO(String result, @SerializedName("error-type") String errorType,
                @SerializedName("base_code") String baseCode,
                @SerializedName("target_code") String targetCode,
                @SerializedName("conversion_result") Double conversionResult) {

}
