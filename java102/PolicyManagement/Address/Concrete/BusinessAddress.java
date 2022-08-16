package PolicyManagement.Address.Concrete;

import PolicyManagement.Address.Abstract.Address;

public class BusinessAddress extends Address {
    public BusinessAddress(String address) {
        super(address);
    }

    @Override
    public void printAddressInfo() {
        System.out.println("-----BUSINESS ADDRESS------");
        System.out.println(getAddress());
    }
}
