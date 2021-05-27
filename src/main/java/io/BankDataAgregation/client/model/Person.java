package io.BankDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;


public class Person {
  @SerializedName("customers")
  private List<Customer> customers = null;

  @SerializedName("cards")
  private List<Card> cards = null;

  @SerializedName("accounts")
  private List<Account> accounts = null;

  @SerializedName("summary")
  private AccountingSummary summary = null;

  public Person customers(List<Customer> customers) {
    this.customers = customers;
    return this;
  }

  public Person addCustomersItem(Customer customersItem) {
    if (this.customers == null) {
      this.customers = new ArrayList<Customer>();
    }
    this.customers.add(customersItem);
    return this;
  }

  
  public List<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }

  public Person cards(List<Card> cards) {
    this.cards = cards;
    return this;
  }

  public Person addCardsItem(Card cardsItem) {
    if (this.cards == null) {
      this.cards = new ArrayList<Card>();
    }
    this.cards.add(cardsItem);
    return this;
  }

  
  public List<Card> getCards() {
    return cards;
  }

  public void setCards(List<Card> cards) {
    this.cards = cards;
  }

  public Person accounts(List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  public Person addAccountsItem(Account accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<Account>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  
  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  public Person summary(AccountingSummary summary) {
    this.summary = summary;
    return this;
  }

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

