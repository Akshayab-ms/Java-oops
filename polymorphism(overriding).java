

class Maths {
  public void numbers() {
    System.out.println("ArithmeticOprations");
  }
}

class Sum extends Maths{
  public void numbers() {
    System.out.println("Sum");
  }
}

class Multiplication extends Maths {
  public void numbers() {
    System.out.println("Multiplication");
  }
}

class Main {
  public static void main(String[] args) {
   Maths m  = new Maths();  
    Maths sum = new Sum(); 
    Maths multi = new Multiplication(); 
   m.numbers();
   sum.numbers();
   multi.numbers();
  }
}