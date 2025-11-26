package com.mercury.study.tdd.cp13;

public class Sum implements Expression {

    private final Expression augend;
    private final Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Expression getAugend() {
        return augend;
    }

    public Expression getAddend() {
        return addend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = this.augend.reduce(bank, to).getAmount() + this.addend.reduce(bank, to).getAmount();
        return new Money(amount, to);
    }
}
