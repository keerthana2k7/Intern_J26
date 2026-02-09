package project.strategy;

import project.model.Expenses;
import project.model.Group;

public interface SplitStrategy {
    void split(Expenses expense, Group group);
}
