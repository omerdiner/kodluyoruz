package PolicyManagement.Insurance.Abstract;

import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double price;
    private Date startDate;
    private Date endDate;

    public abstract double calculate();
}
