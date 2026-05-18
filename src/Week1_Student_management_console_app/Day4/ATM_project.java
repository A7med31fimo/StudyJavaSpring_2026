import javax.swing.plaf.synth.SynthTextAreaUI;

public class validationException extends Exception{
    public validationException(String msg){
        super(msg);
    }
}


public class atm{
    private int current_salary;
    private final int limitQuantity = 10000;
    public atm(int current_salary){
        this.current_salary = current_salary;
    }
    public int getCurrent_salary(){
        return current_salary;
    }
    public void setCurrent_salary(int salary){
        current_salary = salary;
    }
    public int getLimitQuantity() {
        return limitQuantity;
    }
    public void withdraw(int quantity) throws validationException{
        if(quantity> this.current_salary){
          throw new validationException("this amount is bigger than available salary");
        }
        setCurrent_salary(current_salary-quantity);
        IO.println("successfully withdrowed your amount by : "+quantity+"current_salary : "+current_salary);
    }
    public void deposit(int quantity) throws validationException{
        if(quantity>limitQuantity){
            throw new validationException("this is bigger than from allowed limit : "+getLimitQuantity());
        }
        setCurrent_salary(current_salary+quantity);
        IO.println("successfully deposited by : "+quantity+"current_salary : "+current_salary);
    }
}
void main() {
   atm a = new atm(20000);
   while(true){
       IO.println("hi ");
       IO.println("select your options : ");
       IO.println("1- Current salary ");
       IO.println("2- Withdraw ");
       IO.println("3- Deposit ");
       IO.println("4- Exit ");

       Scanner sc = new Scanner(System.in);
       int op = sc.nextInt();

       switch (op){
           case 1 : {
               IO.println(a.getCurrent_salary());
               break;
           }
           case 2 : {
               IO.println("Enter money need to withdraw it");
               int amount = sc.nextInt();
               try {
                   a.withdraw(amount);
               }catch (validationException c){
                   IO.println(c.getMessage());
               }
               break;
           }
           case 3 :{
               IO.println("Enter number need to deposit it ");
               int amount = sc.nextInt();
               try {
                   a.deposit(amount);
               }catch (validationException c){
                   IO.println(c.getMessage());
               }
               break;
           }
           default: {
               IO.println("thank you for using my app");
           }
       }
       if(op == 4)
           break;
   }
}
