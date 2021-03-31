
import java.math.BigDecimal;
interface Account{
     BigDecimal balance = new BigDecimal(0.00);                                
}
class SavingsAccount implements Account {
     public SavingsAccount(BigDecimal initialValue) {
          balance = initialValue;
     }
     public String toString() {
          return balance.toString();
     }
     public static void main(String args[]) {
          SavingsAccount instance = new SavingsAccount(new BigDecimal(50.00));
          System.out.println(instance);
     }
}