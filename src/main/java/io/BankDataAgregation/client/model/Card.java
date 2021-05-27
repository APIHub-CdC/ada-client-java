package io.BankDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


public class Card {
  @SerializedName("_id")
  private Integer id = null;

  @SerializedName("partial_card_number")
  private String partialCardNumber = null;

  @SerializedName("account")
  private String account = null;

  @SerializedName("bank_id")
  private Integer bankId = null;

  @SerializedName("bank_name")
  private String bankName = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("credit_available")
  private Float creditAvailable = null;

  @SerializedName("credit_limit")
  private Float creditLimit = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("network")
  private String network = null;

  @SerializedName("creation_date")
  private String creationDate = null;

  @SerializedName("expiration_date")
  private String expirationDate = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("last_update")
  private String lastUpdate = null;

  @SerializedName("period_ending_date")
  private String periodEndingDate = null;

  @SerializedName("payment_due_date")
  private String paymentDueDate = null;

  @SerializedName("minimum_payment")
  private Float minimumPayment = null;

  @SerializedName("payment_to_avoid_interest")
  private Float paymentToAvoidInterest = null;

  public Card id(Integer id) {
    this.id = id;
    return this;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Card partialCardNumber(String partialCardNumber) {
    this.partialCardNumber = partialCardNumber;
    return this;
  }


  
  public String getPartialCardNumber() {
    return partialCardNumber;
  }

  public void setPartialCardNumber(String partialCardNumber) {
    this.partialCardNumber = partialCardNumber;
  }

  public Card account(String account) {
    this.account = account;
    return this;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Card bankId(Integer bankId) {
    this.bankId = bankId;
    return this;
  }


  public Integer getBankId() {
    return bankId;
  }

  public void setBankId(Integer bankId) {
    this.bankId = bankId;
  }

  public Card bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public Card currency(String currency) {
    this.currency = currency;
    return this;
  }

   
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Card name(String name) {
    this.name = name;
    return this;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Card creditAvailable(Float creditAvailable) {
    this.creditAvailable = creditAvailable;
    return this;
  }


  public Float getCreditAvailable() {
    return creditAvailable;
  }

  public void setCreditAvailable(Float creditAvailable) {
    this.creditAvailable = creditAvailable;
  }

  public Card creditLimit(Float creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }


  public Float getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Float creditLimit) {
    this.creditLimit = creditLimit;
  }

  public Card type(Integer type) {
    this.type = type;
    return this;
  }

 
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Card network(String network) {
    this.network = network;
    return this;
  }


  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public Card creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public Card expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }


  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Card active(Boolean active) {
    this.active = active;
    return this;
  }


  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Card lastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }


  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Card periodEndingDate(String periodEndingDate) {
    this.periodEndingDate = periodEndingDate;
    return this;
  }

 
  public String getPeriodEndingDate() {
    return periodEndingDate;
  }

  public void setPeriodEndingDate(String periodEndingDate) {
    this.periodEndingDate = periodEndingDate;
  }

  public Card paymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
    return this;
  }


  public String getPaymentDueDate() {
    return paymentDueDate;
  }

  public void setPaymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
  }

  public Card minimumPayment(Float minimumPayment) {
    this.minimumPayment = minimumPayment;
    return this;
  }


  public Float getMinimumPayment() {
    return minimumPayment;
  }

  public void setMinimumPayment(Float minimumPayment) {
    this.minimumPayment = minimumPayment;
  }

  public Card paymentToAvoidInterest(Float paymentToAvoidInterest) {
    this.paymentToAvoidInterest = paymentToAvoidInterest;
    return this;
  }


  public Float getPaymentToAvoidInterest() {
    return paymentToAvoidInterest;
  }

  public void setPaymentToAvoidInterest(Float paymentToAvoidInterest) {
    this.paymentToAvoidInterest = paymentToAvoidInterest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.id, card.id) &&
        Objects.equals(this.partialCardNumber, card.partialCardNumber) &&
        Objects.equals(this.account, card.account) &&
        Objects.equals(this.bankId, card.bankId) &&
        Objects.equals(this.bankName, card.bankName) &&
        Objects.equals(this.currency, card.currency) &&
        Objects.equals(this.name, card.name) &&
        Objects.equals(this.creditAvailable, card.creditAvailable) &&
        Objects.equals(this.creditLimit, card.creditLimit) &&
        Objects.equals(this.type, card.type) &&
        Objects.equals(this.network, card.network) &&
        Objects.equals(this.creationDate, card.creationDate) &&
        Objects.equals(this.expirationDate, card.expirationDate) &&
        Objects.equals(this.active, card.active) &&
        Objects.equals(this.lastUpdate, card.lastUpdate) &&
        Objects.equals(this.periodEndingDate, card.periodEndingDate) &&
        Objects.equals(this.paymentDueDate, card.paymentDueDate) &&
        Objects.equals(this.minimumPayment, card.minimumPayment) &&
        Objects.equals(this.paymentToAvoidInterest, card.paymentToAvoidInterest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, partialCardNumber, account, bankId, bankName, currency, name, creditAvailable, creditLimit, type, network, creationDate, expirationDate, active, lastUpdate, periodEndingDate, paymentDueDate, minimumPayment, paymentToAvoidInterest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    partialCardNumber: ").append(toIndentedString(partialCardNumber)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creditAvailable: ").append(toIndentedString(creditAvailable)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    periodEndingDate: ").append(toIndentedString(periodEndingDate)).append("\n");
    sb.append("    paymentDueDate: ").append(toIndentedString(paymentDueDate)).append("\n");
    sb.append("    minimumPayment: ").append(toIndentedString(minimumPayment)).append("\n");
    sb.append("    paymentToAvoidInterest: ").append(toIndentedString(paymentToAvoidInterest)).append("\n");
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

