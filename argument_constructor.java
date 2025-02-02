class argument_constructor {

    int i;
    public argument_constructor() {
      i = 5;
      System.out.println("Constructor is called:");
    }
  


    public static void main(String[] args) {
      argument_constructor obj = new argument_constructor();
      System.out.println("Value of i: " + obj.i);
    }
  }