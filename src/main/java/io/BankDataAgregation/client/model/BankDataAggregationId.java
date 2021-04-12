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
import java.io.IOException;
import java.util.UUID;
@ApiModel(description = "Identifier of the bank data aggregation process.")


public class BankDataAggregationId {
  @SerializedName("bankDataAggregationRequestId")
  private UUID bankDataAggregationRequestId = null;
  @SerializedName("subscriptionId")
  private UUID subscriptionId = null;
  @SerializedName("inquiryId")
  private UUID inquiryId = null;
  public BankDataAggregationId bankDataAggregationRequestId(UUID bankDataAggregationRequestId) {
    this.bankDataAggregationRequestId = bankDataAggregationRequestId;
    return this;
  }
   
  @ApiModelProperty(example = "391d151f-1cac-44e7-a05b-79a1199621d6", value = "The identifier of the bank data aggregation request given by the API consumer (UUID).")
  public UUID getBankDataAggregationRequestId() {
    return bankDataAggregationRequestId;
  }
  public void setBankDataAggregationRequestId(UUID bankDataAggregationRequestId) {
    this.bankDataAggregationRequestId = bankDataAggregationRequestId;
  }
  public BankDataAggregationId subscriptionId(UUID subscriptionId) {
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
   
  @ApiModelProperty(example = "a19fb6b8-2677-44f2-9cd7-3b2f78bb6f8c", value = "The bank data aggregation process identifier given by Círculo de Crédito.")
  public UUID getInquiryId() {
    return inquiryId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankDataAggregationId bankDataAggregationId = (BankDataAggregationId) o;
    return Objects.equals(this.bankDataAggregationRequestId, bankDataAggregationId.bankDataAggregationRequestId) &&
        Objects.equals(this.subscriptionId, bankDataAggregationId.subscriptionId) &&
        Objects.equals(this.inquiryId, bankDataAggregationId.inquiryId);
  }
  @Override
  public int hashCode() {
    return Objects.hash(bankDataAggregationRequestId, subscriptionId, inquiryId);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankDataAggregationId {\n");
    
    sb.append("    bankDataAggregationRequestId: ").append(toIndentedString(bankDataAggregationRequestId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    inquiryId: ").append(toIndentedString(inquiryId)).append("\n");
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
