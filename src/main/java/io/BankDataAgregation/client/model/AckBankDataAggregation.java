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
import org.threeten.bp.OffsetDateTime;


public class AckBankDataAggregation {
  @SerializedName("acknowledgeId")
  private UUID acknowledgeId = null;
  @SerializedName("dateTime")
  private OffsetDateTime dateTime = null;
  
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    REQUEST("request"),
    
    CONSUMPTION("consumption");
    private String value;
    OperationEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperationEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("operation")
  private OperationEnum operation = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("qr")
  private String qr = null;
  @SerializedName("widget_url")
  private String widgetUrl = null;
   
  @ApiModelProperty(example = "627aa72a-c799-4abf-b98e-0c4838af9bd5", value = "Ackknowledge identifier (UUID).")
  public UUID getAcknowledgeId() {
    return acknowledgeId;
  }
   
  @ApiModelProperty(example = "2020-04-12T22:20:50.52Z", value = "Date and time of the acknowledge. As defined by date-time - RFC3339.")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }
   
  @ApiModelProperty(example = "request", value = "Bank data aggregation operation.")
  public OperationEnum getOperation() {
    return operation;
  }
   
  @ApiModelProperty(example = "The bank data aggregation request has been received.", value = "Descriptive and human-readable message.")
  public String getMessage() {
    return message;
  }
   
  @ApiModelProperty(example = "https://chart.googleapis.com/chart?cht=qr&chl=https://dnuzbcecnnq5t.cloudfront.net//sandbox/v1/ada/apiwidget?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpbnF1aXJ5SWQiOiI1MjY5OWIyOS0xNWQ2LTQyMTUtOWI4ZC02NWUxZGI1NWQ5YjAiLCJ4LWFwaS1rZXkiOiJ3eWdhYmFXVGxGVW1wZWdXYzBBTXNVQWhyVWUzdDJXdiIsImlzcyI6InVybjpcL1wvQXBpZ2VlLWVkZ2UtSldULXBvbGljeS1kZW1vbnN0cmF0aW9uIiwiY2xhaW0iOiJ7XCJkYXRhXCI6e1wiaW5mb1wiOlwiZGV0YWxsZXNcIn0iLCJpZCI6IjAwZmY0ZTc0LWM1YjctNDkxMi1hMGZiLTYzMWU4NDc4MzM4YiIsInN1YnNjcmlwdGlvbklkIjoiMDM1MGEwZTUtODQ5Yy00NTE4LTlmMmYtY2E2OWIxY2FhZjFlIiwiZXhwIjoxNjE0MTg5OTY2LCJpYXQiOjE2MTQxODkzNjYsImN1cnAiOiJCQUREMTEwMzEzSENNTE5TMDkiLCJqdGkiOiI5YmMxN2JjMi0xZTYxLTRkOTYtOTIzYi04Mjg1OTU0YTA1ZWMifQ.ARu5czXKp9YNcEebdbJINm6krzWxXQcCFIQvAE6oiyY&choe=UTF-8&chs=200x200&chld=L", value = "The URL where you can get the QR code to redirect to the Widget.")
  public String getQr() {
    return qr;
  }
   
  @ApiModelProperty(example = "https://dnuzbcecnnq5t.cloudfront.net/?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpbnF1aXJ5SWQiOiI1MjY5OWIyOS0xNWQ2LTQyMTUtOWI4ZC02NWUxZGI1NWQ5YjAiLCJ4LWFwaS1rZXkiOiJ3eWdhYmFXVGxGVW1wZWdXYzBBTXNVQWhyVWUzdDJXdiIsImlzcyI6InVybjpcL1wvQXBpZ2VlLWVkZ2UtSldULXBvbGljeS1kZW1vbnN0cmF0aW9uIiwiY2xhaW0iOiJ7XCJkYXRhXCI6e1wiaW5mb1wiOlwiZGV0YWxsZXNcIn0iLCJpZCI6IjAwZmY0ZTc0LWM1YjctNDkxMi1hMGZiLTYzMWU4NDc4MzM4YiIsInN1YnNjcmlwdGlvbklkIjoiMDM1MGEwZTUtODQ5Yy00NTE4LTlmMmYtY2E2OWIxY2FhZjFlIiwiZXhwIjoxNjE0MTg5OTY2LCJpYXQiOjE2MTQxODkzNjYsImN1cnAiOiJCQUREMTEwMzEzSENNTE5TMDkiLCJqdGkiOiI5YmMxN2JjMi0xZTYxLTRkOTYtOTIzYi04Mjg1OTU0YTA1ZWMifQ.ARu5czXKp9YNcEebdbJINm6krzWxXQcCFIQvAE6oiyY", value = "Direct url to the Widget.")
  public String getWidgetUrl() {
    return widgetUrl;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckBankDataAggregation ackBankDataAggregation = (AckBankDataAggregation) o;
    return Objects.equals(this.acknowledgeId, ackBankDataAggregation.acknowledgeId) &&
        Objects.equals(this.dateTime, ackBankDataAggregation.dateTime) &&
        Objects.equals(this.operation, ackBankDataAggregation.operation) &&
        Objects.equals(this.message, ackBankDataAggregation.message) &&
        Objects.equals(this.qr, ackBankDataAggregation.qr) &&
        Objects.equals(this.widgetUrl, ackBankDataAggregation.widgetUrl);
  }
  @Override
  public int hashCode() {
    return Objects.hash(acknowledgeId, dateTime, operation, message, qr, widgetUrl);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckBankDataAggregation {\n");
    
    sb.append("    acknowledgeId: ").append(toIndentedString(acknowledgeId)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    qr: ").append(toIndentedString(qr)).append("\n");
    sb.append("    widgetUrl: ").append(toIndentedString(widgetUrl)).append("\n");
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
