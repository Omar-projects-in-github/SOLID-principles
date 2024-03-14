package LiskovSubstitutionPrinciple;

import java.math.BigDecimal;

public class WithDrawableAccount extends Account {
    @Override
    protected void deposit(BigDecimal amount) {}

    @Override
    protected void withdraw(BigDecimal amount) {}
}
