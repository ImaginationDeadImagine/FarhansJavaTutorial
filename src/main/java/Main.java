// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  // A static variable at the class level.
  // if not initialised in the code, class level variables are initialise to default values by the java compiler.
  // NB A static method (like main here) can only work with static variables.
  static int age;

  public static void main(String[] args) {
    // Variables can be redeclared provided they are unique to a particular code block.
    int age = 63;
    
    System.out.println("I am " + age + " years old.");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}