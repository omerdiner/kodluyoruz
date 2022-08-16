package PolicyManagement.Admin;

import PolicyManagement.Account.Abstract.Account;
import PolicyManagement.Others.InvalidAuthenticationException;
import PolicyManagement.Others.Login;
import PolicyManagement.User.AuthenticationStatus;

import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts = new TreeSet<>();

    public Account login() {
        String[] userInfo = Login.logIn();
        String email = userInfo[0];
        String password = userInfo[1];
        for (Account account : accounts) {
            try {
                account.login(email, password);
            } catch (InvalidAuthenticationException e) {
                e.printStackTrace();
            } catch (Exception e) {

            }
            if (account.getAuthenticationStatus() == AuthenticationStatus.SUCCESS) {
                System.out.println("Welcome , " + account.getUser().getName());
                return account;
            }

        }
        return null;
    }
}
