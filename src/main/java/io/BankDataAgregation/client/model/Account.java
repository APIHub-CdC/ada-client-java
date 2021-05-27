package io.BankDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class Account {
  @SerializedName("customers")
  private List<String> customers = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("last_update")
  private String lastUpdate = null;

  @SerializedName("bank_id")
  private Integer bankId = null;

  @SerializedName("balance")
  private Float balance = null;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("creation_date")
  private String creationDate = null;

  @SerializedName("bank_name")
  private String bankName = null;

  @SerializedName("bank_group_id")
  private Integer bankGroupId = null;

  public Account customers(List<String> customers) {
    this.customers = customers;
    return this;
  }

  public Account addCustomersItem(String customersItem) {
    if (this.customers == null) {
      this.customers = new ArrayList<String>();
    }
    this.customers.add(customersItem);
    return this;
  }

  
  public List<String> getCustomers() {
    return customers;
  }

  public void setCustomers(List<String> customers) {
    this.customers = customers;
  }

  public Account currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Account lastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  
  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Account bankId(Integer bankId) {
    this.bankId = bankId;
    return this;
  }


  
  public Integer getBankId() {
    return bankId;
  }

  public void setBankId(Integer bankId) {
    this.bankId = bankId;
  }

  public Account balance(Float balance) {
    this.balance = balance;
    return this;
  }

   
  
  public Float getBalance() {
    return balance;
  }

  public void setBalance(Float balance) {
    this.balance = balance;
  }

  public Account id(String id) {
    this.id = id;
    return this;
  }

   
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account name(String name) {
    this.name = name;
    return this;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  
  
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public Account bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

 
  
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public Account bankGroupId(Integer bankGroupId) {
    this.bankGroupId = bankGroupId;
    return this;
  }

  
  
  public Integer getBankGroupId() {
    return bankGroupId;
  }

  public void setBankGroupId(Integer bankGroupId) {
    this.bankGroupId = bankGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.customers, account.customers) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.lastUpdate, account.lastUpdate) &&
        Objects.equals(this.bankId, account.bankId) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.creationDate, account.creationDate) &&
        Objects.equals(this.bankName, account.bankName) &&
        Objects.equals(this.bankGroupId, account.bankGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customers, currency, lastUpdate, bankId, balance, id, name, creationDate, bankName, bankGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankGroupId: ").append(toIndentedString(bankGroupId)).append("\n");
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

