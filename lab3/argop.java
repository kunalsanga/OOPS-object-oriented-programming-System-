public class argop {


    int i;
      
    // constructor with no parameter
    public argop() {
      i = 5;
      System.out.println("Constructor is called");
    }
      
    public static void main(String[] args) {
      
      // calling the constructor without any parameter
      argop obj = new argop();
      System.out.println("Value of i: " + obj.i);
    }
    
}
