public class CodeBlocks {
  static int x = 5;
  CodeBlocks() {
    System.out.println("In Constructor");
  }

  {
    System.out.println("Before Static block");
  }


  static {
    x++;
    System.out.println(x);

    first : {
      System.out.println("In first block");
      second : {
        System.out.println("In Second Block");
        if(x == 6) break first;
      }
      System.out.println("After seconnd");
    }
  }

  public static void main(String args[]) {
    System.out.println("In main");
    CodeBlocks code = new CodeBlocks();
    int a =5;
    {
     // int a = 190;
      int b = 10;
    }
    int b = 07;
  }

  {
    System.out.println("In a block");
  }



}
