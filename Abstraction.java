abstract class AbstractEmployee{
    private String name;
    private String address;
    private String number;
    public AbstractEmployee(String name,String address,String number){
       this.name=name;
       this.address=address;
       this.number=number;
    }
   
    
     void showDetails(){
      System.out.println("name"+" "+name);
      System.out.println("address"+" "+address);
      System.out.println("number"+" "+number);
        
    }
   abstract void calculateSalary(int a1,int a2 );
}
class PermanentEmployee extends AbstractEmployee
{
    PermanentEmployee(String name,String address,String number){
        super (name,address,number);
    }
    void calculateSalary(int a1,int a2){
        System.out.println(a1+"working days");
        System.out.println("salary per day"+a2+"rupees");
        float salary = a1+a2;
        System.out.println("salary is"+salary);
        
    }
}


class Main
{
	public static void main(String[] args) {
		PermanentEmployee p = new PermanentEmployee("aksha","chennai","805628888");
		p.showDetails();
		p.calculateSalary(28,4000);

		
	}
}
