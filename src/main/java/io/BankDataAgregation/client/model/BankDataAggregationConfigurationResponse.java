package io.BankDataAgregation.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.BankDataAgregation.client.model.AckBankDataAggregation;
import io.BankDataAgregation.client.model.ConfigurationRequest;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
@ApiModel(description = "Acknowledge of a successful bank data aggregation process.")


public class BankDataAggregationConfigurationResponse extends AckBankDataAggregation {
  @SerializedName("configuration")
  private ConfigurationRequest _configuration = null;
  public BankDataAggregationConfigurationResponse _configuration(ConfigurationRequest _configuration) {
    this._configuration = _configuration;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ConfigurationRequest getConfiguration() {
    return _configuration;
  }
  public void setConfiguration(ConfigurationRequest _configuration) {
    this._configuration = _configuration;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankDataAggregationConfigurationResponse bankDataAggregationConfigurationResponse = (BankDataAggregationConfigurationResponse) o;
    return Objects.equals(this._configuration, bankDataAggregationConfigurationResponse._configuration) &&
        super.equals(o);
  }
  @Override
  public int hashCode() {
    return Objects.hash(_configuration, super.hashCode());
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankDataAggregationConfigurationResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
