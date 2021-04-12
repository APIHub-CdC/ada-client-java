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
import io.BankDataAgregation.client.model.Account;
import io.BankDataAgregation.client.model.AccountingSummary;
import java.io.IOException;
@ApiModel(description = "Encrypted Bank Information.")


public class Person {
  @SerializedName("fullName")
  private String fullName = null;
  @SerializedName("phoneNumber")
  private String phoneNumber = null;
  @SerializedName("accounts")
  private Account accounts = null;
  @SerializedName("summary")
  private AccountingSummary summary = null;
  public Person fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }
   
  @ApiModelProperty(example = "JUAN SESENTAYSIETE PRUEBA", value = "")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
  public Person phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
   
  @ApiModelProperty(example = "550000067", value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public Person accounts(Account accounts) {
    this.accounts = accounts;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Account getAccounts() {
    return accounts;
  }
  public void setAccounts(Account accounts) {
    this.accounts = accounts;
  }
  public Person summary(AccountingSummary summary) {
    this.summary = summary;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public AccountingSummary getSummary() {
    return summary;
  }
  public void setSummary(AccountingSummary summary) {
    this.summary = summary;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.fullName, person.fullName) &&
        Objects.equals(this.phoneNumber, person.phoneNumber) &&
        Objects.equals(this.accounts, person.accounts) &&
        Objects.equals(this.summary, person.summary);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fullName, phoneNumber, accounts, summary);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
