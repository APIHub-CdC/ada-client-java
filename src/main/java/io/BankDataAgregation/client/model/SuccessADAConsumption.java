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
import io.BankDataAgregation.client.model.BankDataAggregation;
import java.io.IOException;
@ApiModel(description = "Information about a successful bank data aggregation process.")


public class SuccessADAConsumption {
  @SerializedName("request")
  private BankDataAggregation request = null;
  @SerializedName("payload")
  private Object payload = null;
  public SuccessADAConsumption request(BankDataAggregation request) {
    this.request = request;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public BankDataAggregation getRequest() {
    return request;
  }
  public void setRequest(BankDataAggregation request) {
    this.request = request;
  }
  public SuccessADAConsumption payload(Object payload) {
    this.payload = payload;
    return this;
  }
   
  @ApiModelProperty(example = "OR8BkEcX/i+DQ2IxMkT2nmII3V8yvm1MInlQrBX4NcgmIA==", value = "Payload encrypt")
  public Object getPayload() {
    return payload;
  }
  public void setPayload(Object payload) {
    this.payload = payload;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessADAConsumption successADAConsumption = (SuccessADAConsumption) o;
    return Objects.equals(this.request, successADAConsumption.request) &&
        Objects.equals(this.payload, successADAConsumption.payload);
  }
  @Override
  public int hashCode() {
    return Objects.hash(request, payload);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessADAConsumption {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
