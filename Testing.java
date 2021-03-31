import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Testing extends Sub {
	
	
	
/**
 * @param args
 * @throws Exception
 */ 
	public String createLog = "logOneTest", createLog1;
   public void createLog(Visitor visitor) {
      visitor.createLog(this);
   }
   public static void main(String[] args) {
      new Testing().createLog(new IKMVisitor());

  }
	
	
	
	
	/*
		 * String stringA = "A"; String stringB = "B"; String stringnull = null;
		 * StringBuffer bufferc = new StringBuffer("C"); Formatter fmt = new
		 * Formatter(bufferc);
		 * 
		 * fmt.format("%s%s", stringA, stringB); System.out.println("Line 1: "+ fmt);
		 * 
		 * fmt.format("%-2s", stringB); System.out.println("Line 2: "+ fmt);
		 * 
		 * fmt.format("%b", stringnull); System.out.println("Line 3: "+ fmt);
		 */

	//IKMProcessor processor = new IKMProcessor();
//processor.setUp();
//System.out.println("Processing complete");
	
	
	
	//HashMap<OrdersAndInvoices, String> ordersAndInvoices = new HashMap<OrdersAndInvoices, String>();
//ordersAndInvoices.put(new PurchaseOrder(12345),"Sales Dept, Acme Inc.");
//ordersAndInvoices.put(new Invoices("12345"),"Accounts Dept., Acme Inc.");
//ordersAndInvoices.put(new Invoices("12346"),"Accounts Dept., IKM Inc.");
        
//System.out.println(ordersAndInvoices.get(new PurchaseOrder(12345)));
//System.out.println(ordersAndInvoices.get(new Invoices("12345")));
	
		/*
		 * FileInputStream fis = new FileInputStream("file.txt"); InputStreamReader isr
		 * = new InputStreamReader(fis, "UTF-8");
		 * 
		 * RandomAccessFile rf = new RandomAccessFile("file.txt", "r");
		 * 
		 * byte arr[]=new byte[]{2,3,4,5}; for(final int i : getCharArray(arr))
		 * System.out.print(i+" "); } static char[] getCharArray(byte[]arr){ char[]
		 * carr=new char[4]; int i=0; for(byte c : arr){ carr[i]=(char)c++; i++; }
		 * return carr;
		 */


//new PositionManager()
//.initialize()
//.andMoveRight(-3)
//.andMoveUp(9)
//.andPrintPosition();
       
}
	

interface IKMType {
  String value();
}
class Super implements IKMType {
  @Override
  public String value() {
    return "Super";
  }
}
class Sub extends Super {
  @Override
  public String value() {
    return "Sub";
  }
}

 class PositionManager {
   private int horizontalPosition = 0;
   private int verticalPosition = 0;
   public PositionManager initialize() {
      horizontalPosition = verticalPosition = 1;
      return this;
   }
   public PositionManager andMoveRight(int horizontalDisplacement) {
      horizontalPosition += horizontalDisplacement;
      return this;
   }
   public PositionManager andMoveUp(int verticalDisplacement) {
      verticalPosition += verticalDisplacement;
      return this;
   }
   public PositionManager andPrintPosition() {
      switch (horizontalPosition % 2) {
      case 0:
         System.out.print("zoneA;");
         break;
      case 1:
         System.out.print("zoneB;");
         break;
      }
      switch (verticalPosition % 2) {
      case 0:
         System.out.print("zoneC;");
         break;
      case 1:
         System.out.print("zoneD;");
         break;
      }
      return this;
   }
}



 class IKMProcessor {
   public List<String> queueSequence;
   public void setUp() {
      try {
         establishQueueSequence();
      }
      finally {
         cleanupQueueSequence();
         System.out.println("Queue sequence successfully cleaned up");
      }
   }
   private void cleanupQueueSequence() {
      if (queueSequence.size() > 0) {
         System.out.println("Queue size > 0");
      }
   }
   private void establishQueueSequence() {
      if (true) {
         throw new IllegalArgumentException();
      }
      queueSequence = new ArrayList<String>();
   }
}








interface IKMObserver{}
interface Environment {}
interface Order{
	 public void initialize(IKMEnvironment environment);
}
interface IKMEnvironment extends Environment {}
interface IKMProgramEnvironment extends IKMEnvironment {}
class JavaSEEnvironment implements Environment {}
class TestEnvironment implements IKMEnvironment {}
class JavaSETestEnvironment extends TestEnvironment {}
class JavaSE7TestEnvironment implements IKMObserver  {}
class JavaEETestEnvironment implements IKMObserver, IKMProgramEnvironment  {}


class CustomClass implements Order {
   @Override
   public void initialize(IKMEnvironment environment) {
      if (environment instanceof JavaSE7TestEnvironment) { System.out.println("JavaSE7TestEnvironment"); }
      else if (environment instanceof JavaSEEnvironment) { System.out.println("JavaSEEnvironment"); }
      else if (environment instanceof TestEnvironment) { System.out.println("TestEnvironment"); }
      else if (environment instanceof JavaEETestEnvironment) { System.out.println("JavaEETestEnvironment"); }
      else if (environment instanceof JavaSETestEnvironment) { System.out.println("JavaSETestEnvironment"); }
   }
}
interface OrdersAndInvoices {}
class PurchaseOrder implements OrdersAndInvoices {
private Integer orderId = null;
public PurchaseOrder(Integer newOrderId) {
  this.orderId = newOrderId;
}
@Override
public boolean equals(Object anotherPurchaseOrder) {
  return anotherPurchaseOrder instanceof PurchaseOrder &&
  this.orderId.equals(((PurchaseOrder)anotherPurchaseOrder).getOrderId());
}
public int hashCode() {
  return this.orderId.intValue();
}
private Integer getOrderId() {
  return this.orderId;
}
}
class Invoices implements OrdersAndInvoices {
private String relatedPurchaseOrderId;
public int hashCode() {
  return Integer.parseInt(this.relatedPurchaseOrderId);
}
public Invoices(String purchaseOrderId) {
  this.relatedPurchaseOrderId = purchaseOrderId;
}
}
class A {
    public void m1() {
        System.out.print("A.m1, ");
    }
    protected void m2() {
        System.out.print("A.m2, ");
    }
    private void m3() {
        System.out.print("A.m3, ");
    }
    void m4() {
        System.out.print("A.m4, ");
    }
}



class SystemManager {
   private static String initString;
   static {
      String currentString = null;
      try {
         BufferedReader reader = new BufferedReader(new FileReader("initconfig.txt"));
         while ((currentString = reader.readLine()) != null) {
            initString = currentString;
         }
      }
      catch (IOException ex) {
         throw new NoSuchElementException("File initconfig.txt");
      }
   }
   public SystemManager() {
      if (initString.length() == 0) {
         throw new IllegalArgumentException("length is zero");
      }
      System.out.println("It works!");
   }
}

interface Visitor {
   public String createLog = "logOneInterface",createLog1 = null;
   void createLog(Object obj);
}
class IKMVisitor implements Visitor {
   public String createLog, createLog1 = "logOneClass";
   @Override
   public void createLog(Object obj) {
      if (createLog1.isEmpty()) {
         System.out.println("empty");
      }
      else {
         System.out.println(((Testing)obj).createLog1 + Visitor.createLog1);
      }
   }
}


