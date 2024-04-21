// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  // A static variable at the class level.
  // if not initialised in the code, class level variables are initialise by default in java.
  // NB A static method (like main here) can only work with static variables.
  static int age = 63;
  
  public static void main(String[] args) {
    
    System.out.println("I am " + age + " years old.");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}