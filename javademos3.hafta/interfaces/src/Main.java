public class Main {
    public static void main(String[] args) {

         // interfacaler sadece refarans tutucu oldukları için newlenemez
        CustomerManager customerManager = new CustomerManager(new MysSqlCustomerDal());
        customerManager.add();

    }
}