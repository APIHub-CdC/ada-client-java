package io.BankDataAgregation.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(Icons.Adapter.class)
public enum Icons {
  
  FAS_FA_COG("fas fa-cog"),
  
  FAR_FA_STAR("far fa-star"),
  
  FAS_FA_STAR("fas fa-star"),
  
  FAS_FA_USER("fas fa-user"),
  
  FAS_FA_USER_SHIELD("fas fa-user-shield"),
  
  FAS_FA_USER_LOCK("fas fa-user-lock"),
  
  FAS_FA_KEY("fas fa-key"),
  
  FAR_FA_COMMENT_DOTS("far fa-comment-dots"),
  
  FAS_FA_EDIT("fas fa-edit"),
  
  FAS_FA_CREDIT_CARD("fas fa-credit-card");
  private String value;
  Icons(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static Icons fromValue(String text) {
    for (Icons b : Icons.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<Icons> {
    @Override
    public void write(final JsonWriter jsonWriter, final Icons enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public Icons read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Icons.fromValue(String.valueOf(value));
    }
  }
}
