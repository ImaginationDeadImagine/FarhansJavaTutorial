public class Main {
  public static void main(String[] args) {
    // Type conversion: double to integer
    
    double number1 = 5.8;
    int number2 = number1;

    // Incompatible types: possible lossy conversion from double to int
    System.out.println("Number 1 is " + number1);
    System.out.println("Number 2 is " + number2);
  }
}