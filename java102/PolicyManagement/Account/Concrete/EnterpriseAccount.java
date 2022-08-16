package PolicyManagement.Account.Concrete;

import PolicyManagement.Account.Abstract.Account;
import PolicyManagement.User.User;

public class EnterpriseAccount extends Account {
    public EnterpriseAccount(User user) {
        super(user);
    }

    @Override
    public void addInsurance() {

    }
}
