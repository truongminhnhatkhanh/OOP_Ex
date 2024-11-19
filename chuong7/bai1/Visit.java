package chuong7.bai1;
import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName(){
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double serveDiscount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = DiscountRate.getProductDiscountRate(customer.getMemberType());
        return (serviceExpense *(1 - serveDiscount) + productExpense * (1 - productDiscount) );
    }

    @Override
    public String toString() {
        return "Visit[" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                ']';
    }
}
