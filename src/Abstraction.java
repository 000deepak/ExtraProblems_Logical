abstract class Bank {
    abstract int getRateOfInterest() ;
}

 abstract class SBI extends Bank {
  void print(){
      System.out.println("sbi");
  }
}


class PNB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

public class Abstraction {

    public static void main(String args[]) {
        Bank b;
        b = new SBI() {
            @Override
            int getRateOfInterest() {
                return 0;
            }
        };
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
    }
}



