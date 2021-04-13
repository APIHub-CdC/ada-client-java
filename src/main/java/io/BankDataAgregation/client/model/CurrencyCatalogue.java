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
@JsonAdapter(CurrencyCatalogue.Adapter.class)
public enum CurrencyCatalogue {
  
  MX("MX"),
  
  US("US"),
  
  UD("UD");
  private String value;
  CurrencyCatalogue(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CurrencyCatalogue fromValue(String text) {
    for (CurrencyCatalogue b : CurrencyCatalogue.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CurrencyCatalogue> {
    @Override
    public void write(final JsonWriter jsonWriter, final CurrencyCatalogue enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CurrencyCatalogue read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CurrencyCatalogue.fromValue(String.valueOf(value));
    }
  }
}
