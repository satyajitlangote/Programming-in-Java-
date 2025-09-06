
Questions :- Play around with the code and understand how concept of interface work in Java.

interface IBankNew{
    boolean applyforCreditCard(Customer customer);
}

interface IBank extends IBankNew{
    int CAUTION_MONEY = 2000;
    String createAccount(Customer customer);
    double issueVehicleLoan(String vehicleType, Customer customer);
    double issueHouseLoan(Customer customer);
    double issueGoldLoan(Customer customer);
}

class Customer {
    private String name;
    private String customerId;
        
    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        this.name=name;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId= customerId;
    }
}

class MumbaiBranch implements IBank {
    public String createAccount(Customer customer){
        return "Acc12345";
    }
    public double issueVehicleLoan(String vehicleType,Customer customer){ 
        if(vehicleType.equals("bike")) {
            return 100000;
        }
        else {
            return 500000;
        }
    }
    public double issueHouseLoan(Customer customer){
        return 200000;
    }
    public double issueGoldLoan(Customer customer){
        return 500000;
    }
    public boolean applyforCreditCard(Customer customer){
        return true;
    }
}

class Execute{
    public static void main(String[] args){
        IBank bank=new MumbaiBranch();  
        Customer customer = new Customer();
        customer.setCustomerId("cust1001");
        customer.setName("Ajay");
        String accountNumber = bank.createAccount(customer);
        System.out.println("Account number is..." +accountNumber);
        double gloan = bank.issueGoldLoan(customer);
        System.out.println("Gold loan amount is..." +gloan);
        double hloan = bank.issueHouseLoan(customer);
        System.out.println("House loan amount is..." +hloan);
        double vloan = bank.issueVehicleLoan("bike", customer);
        System.out.println("Vehicle loan amount is..." +vloan);
        System.out.println("Caution money is..." +IBank.CAUTION_MONEY);
        IBankNew bank1 = new MumbaiBranch();
        boolean credit = bank1.applyforCreditCard(customer);
        System.out.println("Credit card request.." + credit);
    }
}


Execution Result

Output:

Account number is...Acc12345
Gold loan amount is...500000.0
House loan amount is...200000.0
Vehicle loan amount is...100000.0
Caution money is...2000
Credit card request..true
