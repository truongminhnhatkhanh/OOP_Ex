package chuong7.bai1;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");
        customer.setMember(true);
        customer.setMemberType("Gold");

        Visit visit = new Visit(customer, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(50);

        System.out.println("Customer Info: " + customer);
        System.out.println("Visit Info: " + visit);
        System.out.println("Total Expense after discount: $" + visit.getTotalExpense());
    }
}
