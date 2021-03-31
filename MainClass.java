import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainClass {
	
	
	   static class Helper {
        private int data = 5;
        public void bump(int inc) {
            inc++;
            data = data + inc;
        }
    } 
	   
	   
	   
	
	   
	   
   public static void main(String args[]) throws Exception {
  
	
	   System.out.println(Math.round(123456789123456789.12f));
	   System.out.println(Integer.MAX_VALUE);
	   
	   //Integer before = new Integer(25);
 //Integer after = ++before == 26?5: new Integer(10);
 //System.out.println(after.intValue()- before.intValue());
	    //Date aDate = null;
   //try {
     // aDate = new SimpleDateFormat("yyyy-mm-dd").parse("2012-01-15");
      //Calendar aCalendar = Calendar.getInstance();
      //aCalendar.setTime(aDate);
      //System.out.print(aCalendar.get(aCalendar.DAY_OF_MONTH)+"," +  aCalendar.get(aCalendar.MONTH));
      //}
      //catch (ParseException ex) {System.out.println(ex);}
	   
	   
	   
	   
	   
	   
	   
	   //StringTokenizer stk1 = new StringTokenizer(",a,b",",");
        //StringTokenizer stk2 = new StringTokenizer(",,ab",",");
        //StringTokenizer stk3 = new StringTokenizer("ab,,,","b");
        //StringTokenizer stk4 = new StringTokenizer(",ab,,a",",");
        //System.out.println(stk1.countTokens()+" "+stk2.countTokens()+" "+stk3.countTokens()+" "+stk4.countTokens());
	   
	   
	   
	   
	   
	   
	   
	   // SortedSet<Elements> s = new TreeSet<Elements>();
      //  s.add(new Elements(15));
       // s.add(new Elements(10));
        //s.add(new Elements(25));
        //s.add(new Elements(10));
        //System.out.println(s.first() + " " + s.size());
	   
	  // Integer number1 = new Integer(1);
//Integer number2 = number1;
//number1+=1;
//System.out.println(number1);
//System.out.println(number2);
	   
	   
	   
	   //java.util.Random r = new java.util.Random();
//int result = r.nextInt(7);
	   
	//   System.out.println(result);
	   
	   //System.out.println(String.format("Local time: %1$tB", Calendar.getInstance()));
	   
	   	//System.out.println(String.format("Local time: %1$", Calendar.getInstance()));
		//System.out.println(String.format("Local time: %tT", Calendar.getInstance()));
		//System.out.println(String.format("Local time: %tH:%tM:%tS", Calendar.getInstance(),Calendar.getInstance(),Calendar.getInstance()));
		//System.out.println(String.format("Local time: %tT", Calendar.getInstance().toString()));
	   
	  
	   
	   // SalesInvoice invoice = new SalesInvoice();
//System.out.println(invoice.formatId("1234"));
	   
	   //Invoice invoice = new Invoice();
//System.out.println(invoice.formatId("1234"));
	   
	  // SalesInvoice invoice = new SalesInvoice();
//System.out.println(Invoice.formatId("1234"));
	   //int x = 0;
        //if (x > 0)
            //System.out.println("One");
            //System.out.println("Two");
	   
	   
	   
	   
	   /*
		 * Helper h = new Helper(); int data = 2; h.bump(data);
		 * System.out.println(h.data + " " + data);
		 * 
		 */
	   
	   
	   
	   /*
		 * double d = -27.2345; System.out.println(Math.ceil(d));
		 * System.out.println(Math.round(d)); System.out.println(Math.abs(d));
		 * System.out.println(Math.floor(d));
		 */
	   
	   
	   
	   
	   
	   
	   
	   
		  int a = 9, b = 2; float f; f = a / b; System.out.println("f = " + f); f = f /
		  2; System.out.println("f = " + f); f = a + b / f; System.out.println("f = " +
		 f);
		 
	   
	   
	   
	   
	   
	   
	   
	   // System.out.printf("%s,%s,%s", Element.HELIUM,Element.HELIUM.getChemicalSymbol(),Element.HELIUM.getNature());
		//System.out.printf("%s,%s,%s", Element[0],Element[0].chemicalSymbol,Element[0].nature);
		//System.out.printf("%s,%s,%s", Element.HELIUM.toString(),Element.HELIUM.chemicalSymbol(),Element.HELIUM.nature());
		//System.out.println(Element.HELIUM);
		//System.out.printf("%s,%s,%s", Element[1],Element[1].chemicalSymbol,Element[1].nature);
	   
	  // Runnable r = () -> System.out.println("HI");
//new Thread(r).start();
	   
   }

   
   
}


class Elements implements Comparable {
 int id;
 
 Elements(int id) {
     this.id = id;
 }
 
 public int compareTo(Object obj) {
     Elements e = (Elements)obj;
     return  this.id - e.id;
 }
 
 public String toString() {
     return "" + this.id;
 }
}

