package LiskovSubstitutionPrinciple;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private WithDrawableAccount account;

    public BankingAppWithdrawalService(WithDrawableAccount account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}
