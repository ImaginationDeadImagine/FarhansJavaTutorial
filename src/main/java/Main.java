// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    // Two main types of data in Java:
    // 1. Primitive data types - store values: int, double, boolean, char
    // 2. Reference data types - store references to memorey locations while a dynamic object is being stored: String, Arrays, Objects
    
    // Integer types
    byte aSingleByte = 100;  // -128 to 127
    short aSmallNumber = 20000;  // -32,768 to 32,767
    int anInteger = 2147483647;  // -2,147,483,648 to 2,147,483,647
    long aLargeNumber = 9223372036854775807L;  // 9223372036854775808 to -9223372036854775807

    // Decimal types
    double aDouble = 1.79769313;  // 4.9E-324 to 1.7976931348623157E308
    float aFloat = 3.4028F;  // 1.4E-45 to 3.4028235E38

    // booleans
    boolean isWeekend = false;
    boolean isWorkday = true;

    // characters
    char copyrightSymbol = '\u00A9';
    
    System.out.println("This is the copyright symbol: " + copyrightSymbol);
    }
}