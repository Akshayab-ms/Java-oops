class Employee{
    String empid;
    String empname;
    String dept;
    void enrollEmployee(String empid,String empname,String dept){
        this.empid = empid;
        this.empname=empname;
    }
    void displayEmp(){
        System.out.println("emp id:"+empid);
         System.out.println("emp name:"+empname);
        
    }
}
class ContractEmployee extends Employee{
    int contractPeriod;
    int perHour;
    void setContract(int period,int payPerHr)
    {
        contractPeriod=period;
        perHour=payPerHr;
    }
    void displayContract(){
        System.out.println("contractPeriod"+contractPeriod);
         System.out.println("payPerHr"+payPerHr);
        
    }
}
class PermanentEmployee extends Employee{
    int basicSalary;
    void setBasicSalary(int salary)
    {
        basicSalary=salary;
    }
    void getBasicSalary(){
        System.out.println("basicSalary"+basicSalary);
         
        
    }
}
class Main
{
	public static void main(String[] args) {
		ContractEmployee c = new ContractEmployee();
		PermanentEmployee p = new PermanentEmployee();
		c.enrollEmployee("1","ak","seL1");
		c.setContract(2,200);
		p.enrollEmployee("3","zim","ml");
		p.setBasicSalary(30000);
		c.displayEmp();
		c.displayContract();
		p.getBasicSalary();
	}
}
