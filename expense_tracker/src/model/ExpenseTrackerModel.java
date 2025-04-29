package model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class ExpenseTrackerModel {

  //encapsulation - data integrity
  private List<Transaction> transactions;



  public ExpenseTrackerModel() {
    transactions = new ArrayList<>(); 
  }

  public void addTransaction(Transaction t) {
    // Perform input validation to guarantee that all transactions added are non-null.
    if (t == null) {
      throw new IllegalArgumentException("The new transaction must be non-null.");
    }
    transactions.add(t);
  }

  public boolean removeTransaction(Transaction t) {
    if (t == null) throw new IllegalArgumentException("null tx");
    boolean removed = transactions.remove(t);
    return removed;
  }

  public List<Transaction> getTransactions() {
    //encapsulation - data integrity
    return Collections.unmodifiableList(new ArrayList<>(transactions));
  }

}
