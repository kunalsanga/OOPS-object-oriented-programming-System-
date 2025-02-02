public class call {

    int sum;
  
    call() {
      this(5, 2);
    }
  
    call(int arg1, int arg2) {
      this.sum = arg1 + arg2;
    }
  
    void display() {
      System.out.println("Sum is: " + sum);
    }
  
    public static void main(String[] args) {
  
      call obj = new call();
      obj.display();
    }
  }