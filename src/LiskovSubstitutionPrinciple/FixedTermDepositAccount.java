package LiskovSubstitutionPrinciple;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account {

    @Override
    protected void deposit(BigDecimal amount) {}

    @Override
    protected void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException("Withdrawals are not supported by" +
                "FixedTermDepositAccount!!");
    }
}
