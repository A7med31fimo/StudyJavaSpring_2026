
/* 1- Java Functions and Methods
     1- Function is defined out of class
     2- Method is defined in class
     3- Java have everything inside class so it have not any func's
*******************************************************************
   2- Exception Handling (try/catch/finally, custom exceptions)
    1- it is unexpected error occur in run time
    2- database connection fail
    3- null pointer
    4- invalid input and so on.
   every Exception inherit from throwable
    Throwable
     ├── Error
     └── Exception
           ├── RuntimeException
           └── Checked Exceptions ->IOException,SQLException
 */
static class InvalidAgeException extends Exception{

    public InvalidAgeException(String msg) {
        super(msg);
    }
}
public class Valided{
    static void checkAge(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Age must be +18");
        }
        IO.println("Allowed");
    }
}
public static void main(String[] args) {
//   try {
//       int x = 0;
//
//       IO.println(20/x);
//   } catch (Exception e) {
//       IO.println(Arrays.toString(e.toString().split(":")));
//   }

    try {
        Valided.checkAge(13);
    }catch (InvalidAgeException e){
        IO.println(e.getMessage());
    }
}
