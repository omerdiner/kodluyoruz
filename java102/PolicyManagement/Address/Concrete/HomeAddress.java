package PolicyManagement.Address.Concrete;

import PolicyManagement.Address.Abstract.Address;

public class HomeAddress extends Address {
    public HomeAddress(String address) {
        super(address);
    }

    @Override
    public void printAddressInfo() {
        System.out.println("----HOME ADDRESS----");
        System.out.println(getAddress());
    }
}
