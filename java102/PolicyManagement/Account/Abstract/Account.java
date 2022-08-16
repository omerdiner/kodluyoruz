package PolicyManagement.Account.Abstract;

import PolicyManagement.Address.Concrete.AddressManager;
import PolicyManagement.Insurance.Abstract.Insurance;
import PolicyManagement.Others.InvalidAuthenticationException;
import PolicyManagement.User.AuthenticationStatus;
import PolicyManagement.User.User;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {
    private AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;
    private User user;
    private ArrayList<Insurance> insurances = new ArrayList<>();

    public Account(User user) {
        this.user = user;
    }


    public abstract void addInsurance();

    public final void showUserInfo() {
        System.out.println(this.user.toString());
    }

    public void addAddress() {
        AddressManager.addAddress(this.user);
    }

    public void deleteAddress() {
        AddressManager.deleteAddress(this.user);
    }

    public boolean isOnline() {
        return authenticationStatus == AuthenticationStatus.SUCCESS;
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (this.user.getEmail().equals(email) && this.user.getPassword().equals(password)) {
            authenticationStatus = AuthenticationStatus.SUCCESS;
        } else {
            throw new InvalidAuthenticationException("Username or password is incorrect.");
        }
    }

    @Override
    public int compareTo(Account o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return authenticationStatus == account.authenticationStatus && user.equals(account.user) && insurances.equals(account.insurances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationStatus, user, insurances);
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }
}
