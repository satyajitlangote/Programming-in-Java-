Play around with the code and understand how variable arguments work in Java.

class Employee{
    private String employeeId;
    Employee(String employeeId){
      this.employeeId=employeeId;
    }
    public int reward(double...fixedDeposit){    //Variable argument
    double sum=0;
    int rewardPoint=0;
    for(double deposit:fixedDeposit){
      sum=sum+deposit;
    }
    if(sum>1000000){
      rewardPoint=20000;
    }
    else if(sum<1000000 && sum>=500000){
      rewardPoint=10000;
    }
    else{
      rewardPoint = 20000;
    }
    return rewardPoint;
    }
    public String getEmployeeId(){ 
      return employeeId; 
    } 
}

class Execute{
  public static void main(String[] args){
    Employee employee1=new Employee("E1001");
    int rewardPoint=employee1.reward(100000,200000,300000);
    Employee employee2=new Employee("E1002");
    int rewardPoint1=employee2.reward(100000,100000);
    System.out.println(employee1.getEmployeeId() +" has got a reward of "+rewardPoint);
    System.out.println(employee2.getEmployeeId() +" has got a reward of "+rewardPoint1);
  }
}
