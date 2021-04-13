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
import io.BankDataAgregation.client.model.ConfigurationRequest;
import java.io.IOException;
import java.util.UUID;
@ApiModel(description = "Bank data Agregation configuration")


public class BankDataAggregationConfiguration {
  @SerializedName("subscriptionId")
  private UUID subscriptionId = null;
  @SerializedName("configuration")
  private ConfigurationRequest configuration = null;
  public BankDataAggregationConfiguration subscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }
   
  @ApiModelProperty(example = "7c8a0230-36e0-43f4-9b7a-581dc55ea9c3", value = "The API Hub event subscription identifier (UUID).")
  public UUID getSubscriptionId() {
    return subscriptionId;
  }
  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }
  public BankDataAggregationConfiguration _configuration(ConfigurationRequest _configuration) {
    this.configuration = _configuration;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ConfigurationRequest getConfiguration() {
    return configuration;
  }
  public void setConfiguration(ConfigurationRequest _configuration) {
    this.configuration = _configuration;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankDataAggregationConfiguration bankDataAggregationConfiguration = (BankDataAggregationConfiguration) o;
    return Objects.equals(this.subscriptionId, bankDataAggregationConfiguration.subscriptionId) &&
        Objects.equals(this.configuration, bankDataAggregationConfiguration.configuration);
  }
  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, configuration);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankDataAggregationConfiguration {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
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
