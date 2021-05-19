package io.BankDataAgregation.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "Encrypted Bank Information.")

public class Person {
  @SerializedName("customers")
  private Customer customers = null;

  @SerializedName("cards")
  private Card cards = null;

  @SerializedName("accounts")
  private Account accounts = null;

  @SerializedName("summary")
  private AccountingSummary summary = null;

  public Person customers(Customer customers) {
    this.customers = customers;
    return this;
  }

  @ApiModelProperty(value = "")
  public Customer getCustomers() {
    return customers;
  }

  public void setCustomers(Customer customers) {
    this.customers = customers;
  }

  public Person cards(Card cards) {
    this.cards = cards;
    return this;
  }

  @ApiModelProperty(value = "")
  public Card getCards() {
    return cards;
  }

  public void setCards(Card cards) {
    this.cards = cards;
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
    return Objects.equals(this.customers, person.customers) &&
        Objects.equals(this.cards, person.cards) &&
        Objects.equals(this.accounts, person.accounts) &&
        Objects.equals(this.summary, person.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customers, cards, accounts, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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

