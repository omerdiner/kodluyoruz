package PolicyManagement.Account.Concrete;

import PolicyManagement.Account.Abstract.Account;
import PolicyManagement.User.User;

public class IndividualAccount extends Account {
    public IndividualAccount(User user) {
        super(user);
    }

    @Override
    public void addInsurance() {

    }
}
