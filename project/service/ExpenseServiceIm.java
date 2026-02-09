package project.service;

import project.model.Expenses;
import project.model.Group;
import project.strategy.SplitStrategy;

public class ExpenseServiceIm {

    public void processExpense(SplitStrategy strategy, Expenses expense, Group group) {
        strategy.split(expense, group);
    }
}
