package io.BankDataAgregation.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


public class Customer {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("address")
  private List<String> address = null;

  @SerializedName("document")
  private String document = null;

  @SerializedName("birth_date")
  private String birthDate = null;

  @SerializedName("names")
  private String names = null;

  @SerializedName("phones")
  private List<String> phones = null;

  @SerializedName("emails")
  private List<String> emails = null;

  @SerializedName("accounts_obj")
  private List<AccountsObj> accountsObj = null;

  public Customer id(String id) {
    this.id = id;
    return this;
  }

  @ApiModelProperty(value = "Customer document id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Customer address(List<String> address) {
    this.address = address;
    return this;
  }

  public Customer addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<String>();
    }
    this.address.add(addressItem);
    return this;
  }

  
  @ApiModelProperty(value = "Array of customer address")
  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }

  public Customer document(String document) {
    this.document = document;
    return this;
  }

  @ApiModelProperty(value = "Customer document id")
  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public Customer birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  @ApiModelProperty(value = "Customer birth date. <br>**Format**: YYYY-MM-DD")
  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public Customer names(String names) {
    this.names = names;
    return this;
  }

   
  @ApiModelProperty(value = "Customer full name")
  public String getNames() {
    return names;
  }

  public void setNames(String names) {
    this.names = names;
  }

  public Customer phones(List<String> phones) {
    this.phones = phones;
    return this;
  }

  public Customer addPhonesItem(String phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<String>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   
  @ApiModelProperty(value = "Array of phone numbers")
  public List<String> getPhones() {
    return phones;
  }

  public void setPhones(List<String> phones) {
    this.phones = phones;
  }

  public Customer emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public Customer addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<String>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   
  @ApiModelProperty(value = "Array of customer email")
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public Customer accountsObj(List<AccountsObj> accountsObj) {
    this.accountsObj = accountsObj;
    return this;
  }

  public Customer addAccountsObjItem(AccountsObj accountsObjItem) {
    if (this.accountsObj == null) {
      this.accountsObj = new ArrayList<AccountsObj>();
    }
    this.accountsObj.add(accountsObjItem);
    return this;
  }

   
  @ApiModelProperty(value = "")
  public List<AccountsObj> getAccountsObj() {
    return accountsObj;
  }

  public void setAccountsObj(List<AccountsObj> accountsObj) {
    this.accountsObj = accountsObj;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.address, customer.address) &&
        Objects.equals(this.document, customer.document) &&
        Objects.equals(this.birthDate, customer.birthDate) &&
        Objects.equals(this.names, customer.names) &&
        Objects.equals(this.phones, customer.phones) &&
        Objects.equals(this.emails, customer.emails) &&
        Objects.equals(this.accountsObj, customer.accountsObj);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, address, document, birthDate, names, phones, emails, accountsObj);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    accountsObj: ").append(toIndentedString(accountsObj)).append("\n");
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

