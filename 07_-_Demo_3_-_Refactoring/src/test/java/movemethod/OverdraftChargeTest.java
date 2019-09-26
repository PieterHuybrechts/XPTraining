package movemethod;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OverdraftChargeTest {

    @Test
    public void overdraftCharge() {
        Account account = new Account(new AccountType(false), 20);
        double result = account.bankcharge();
        assertEquals(39.5, result, 0.0);
    }

    @Test
    public void overdraftChargeForPremiumAccountIs10() {
        Account account = new Account(new AccountType(true), 5);
        double result = account.bankcharge();
        assertEquals(14.5, result, 0.0);
    }

    @Test
    public void overdraftChargeForPremiumAccountIsHigherIfDaysOverdrawnBiggerThanOneWeek() {
        Account account = new Account(new AccountType(true), 20);

        double result = account.bankcharge();
        assertEquals(27.5, result, 0.0);
    }

}
