package SampleApp;

public class Dell implements Company{

    @Override
    public void getProduct() {
        System.out.println("All Products");
    }

    @Override
    public void getEmployee() {
        System.out.println("All Employees");
    }

    public void main(String[] args) {
        getProduct();
        getEmployee();
    }
}
