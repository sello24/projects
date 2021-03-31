
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ChoiceFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IKMTest {
	
	
	private static int count;    
    static {
    System.out.println("In block 1");
    count = 10;
    }
   
    private int[] data;
    {
    System.out.println("In block 2");
    data = new int[count];
    for (int i = 0; i < count; i++) {
        data[i] = i;
        }
    }
    
    static int number2=getValue();
    static int number1=10;
    
    static int getValue()
    {
        return number1;
    }
    static int doSum(){ return number1+number2;}
    static int doMinus(){ return number1-number2;}
    
    
     static class Helper {
        private int data = 5;
        public void bump(int inc) {
            inc++;
            data = data + inc;
        }
    }
    
     
     
 static class Shape {}
static class Quadrilateral extends Shape {}
static class Triangle extends Shape{}
     
	/*
	 * static Shape shape = new Quadrilateral(); static Quadrilateral quadrilateral
	 * = new Quadrilateral(); Triangle tri = (Triangle)shape;
	 */
     
     

public IKMTest() {
    this(10);
}
public IKMTest(int dataa) {
    this.dataa = dataa;
}
public void display() {
    class Decrementer {
        public void decrement () {
        	dataa--;
        }    
    }
    Decrementer d = new Decrementer();
    d.decrement();
    System.out.println("data = " + dataa);
}

private int dataa;


@Override
    public String toString() {
        return "ObjectDemo";
    }




   
    public static void main (String arg[]) throws IOException {
    	
    	
    	List<String> letters = new ArrayList(Arrays.asList("D","B","A","C","F","G"));
       Predicate<String> p1 = s -> s.compareTo("C") > 0;
       Predicate<String> p2 = s -> s.equals("B");
       letters.removeIf(p1.negate().or(p2));
       letters.sort((s1,s2) -> s1.compareTo(s2));
       System.out.println(letters);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//shape = quadrilateral;
    	
    	//int dataB = 0;
        //IKMTest t = new IKMTest();
        //t.display();
      //  System.out.println("data = " + dataB);
    	//Helper h = new Helper();
        //int data = 2;
       // h.bump(data);
       // System.out.println(h.data + " " + data);
    	
    	//Optional<Object> o = Optional.of(new ObjectDemo());
        //System.out.println(o.get().toString());
    	//FileReader instream = new FileReader((""));
    	
		/*
		 * String stringA = "A"; String stringB = "B"; String stringnull = null;
		 * StringBuilder bufferc = new StringBuilder("C"); Formatter fmt = new
		 * Formatter(bufferc);
		 * 
		 * fmt.format("%s%s", stringA, stringB); System.out.println("Line 1: "+ fmt);
		 * 
		 * fmt.format("%-2s", stringB); System.out.println("Line 2: "+ fmt);
		 * 
		 * fmt.format("%b", stringnull); System.out.println("Line 3: "+ fmt);
		 */
    	
    	//int data = 0;
    	//IKMTest t = new IKMTest();
        //t.display();
        //System.out.println("data = " + data);
    	  //       Integer x = 3;
          //Integer y = null;
          //try {
            //   System.out.println(Integer.compareUnsigned(x,3) == 0 || Integer.compareUnsigned(y,0)==0);
          //}
          //catch (Exception ex) {
            //   System.out.println(ex.getClass().toString());    
          //}
          //try {
            //   System.out.println(y.compareTo(null)==0 || true);
          //}
          //catch (Exception ex) {
            //   System.out.println(ex.getClass().toString());    
          //}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//System.out.printf("%s,%s,%s", Element2.HELIUM.toString(),Element2.HELIUM.chemicalSymbol(),Element2.HELIUM.nature());
   //System.out.println("Count = " + count);
   // System.out.println("Before 1st call to new");
    //IKMTest test1 = new IKMTest();
   // System.out.println("Before 2nd call to new");
    //IKMTest test2 = new IKMTest();
      // SalesInvoice invoice = new SalesInvoice();
        //System.out.println(Invoice.formatId("1234"));
 	  // Invoice invoice = new Invoice();
 	  //System.out.println(invoice.formatId("1234"));  
    	LocalDate localDate = LocalDate.of(2015,4,4);
         System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
         System.out.println(localDate.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy")));
         System.out.println(localDate.format(DateTimeFormatter.ofPattern("MM/dd/yy")));
    	//int a = 9, b = 2;
        //float f;
     //        System.getProperties().getProperty(key)
    	Integer number1 = new Integer(1);
Integer number2 = number1;
number1+=1;
System.out.println(number1);  
System.out.println(number2);

System.out.println(Stream.of("green", "yellow", "blue")
        .max((s1,s2) -> s1.compareTo(s2))
             .filter(s -> s.endsWith("n"))
             .orElse("yellow"));   


//ResourceBundle bundle = ResourceBundle.getBundle("MyBundle", currentLocale);
byte c1[] = {10,20,30,40,50};
        byte c2[] = {60,70,80,90};
        ByteArrayOutputStream b1= new ByteArrayOutputStream();
        ByteArrayOutputStream b2= new ByteArrayOutputStream(10);
        b2.write(100);
        System.out.println("Out 1 : "+b2.size());
        b2.write(c1,0,c2.length);
        System.out.println("Out 2 : "+b2.size());
        byte b[] = b2.toByteArray();
        System.out.println("Out 3 : "+b.length);
        b2.flush();
        System.out.println("Out 4 : "+b2.size());
        b2.reset();
        System.out.println("Out 5 : "+b2.size());
        b1.writeTo(b2);
        System.out.println("Out 6 : "+b1.size());

 try {
            double[] limits = { 1, 2, 3 };
            String[] strArray = { "{2}", "{2}", "{2}" };
            ChoiceFormat choiceFormat = new ChoiceFormat(limits, strArray);
            Format[] formatArray = { choiceFormat, null, NumberFormat.getInstance() };
            MessageFormat messageFormat = new MessageFormat("{0} out of {2}");
            messageFormat.setFormats(formatArray);
            Object[] testArgs = { null, "3", null };
            for (int i = 0; i < 4; ++i) {
                testArgs[0] = new Integer(i);
                testArgs[2] = testArgs[0];
                System.out.println(messageFormat.format(testArgs));
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }


 List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add(0,"3");
        list.add(1,"4");
        list.forEach(System.out::println);




Long l = new Long(1234);
Long l1 = l;
if(l==l1)
  System.out.println("Equal Objects");
else
  System.out.println("Not Equal Objects");
l++;
if(l==l1)
  System.out.println("Equal Objects");
else
  System.out.println("Not Equal Objects");












List<Map<List<Integer>, List<String>>> officeParametersList =
                          new ArrayList<>();     

    	         new ArrayList<>();     
                  Map<List<Integer>, List<String>> officeParamMap = new HashMap<>();
                  officeParametersList.add(null);        
                  officeParametersList.add(officeParamMap);
                  officeParametersList.add(new HashMap<List<Integer>,                      
                                                                            List<String>>()); 
                officeParametersList.forEach(e -> System.out.print(e + " "));
		
		/*
		 * byte c1[] = {10,20,30,40,50}; byte c2[] = {60,70,80,90};
		 * ByteArrayOutputStream b1= new ByteArrayOutputStream(); ByteArrayOutputStream
		 * b2= new ByteArrayOutputStream(10); b2.write(100);
		 * System.out.println("Out 1 : "+b2.size()); b2.write(c1,0,c2.length);
		 * System.out.println("Out 2 : "+b2.size()); byte b[] = b2.toByteArray();
		 * System.out.println("Out 3 : "+b.length); b2.flush();
		 * System.out.println("Out 4 : "+b2.size()); b2.reset();
		 * System.out.println("Out 5 : "+b2.size()); b1.writeTo(b2);
		 * System.out.println("Out 6 : "+b1.size());
		 * 
		 */
    
    //SortedSet<String> set;
    	  Set<String> set = new LinkedHashSet<String>();
         set.add("3");
         set.add("1");
         set.add("3");
         set.add("2");
         set.add("3");
         set.add("1");
               set.forEach(s -> System.out.print(s+"-"));
    	
		/*
		 * //System.out.println(Stream.of("green", "yellow", "blue") //.max((s1,s2) ->
		 * s1.compareTo(s2)) .filter(s -> s.endsWith("n")) .orElse("yellow"));
		 */
    	Double d = 1.0;
        if (d instanceof Number)
            d = d++;
        boolean condition1 = (d == 2) ? true : false;
        if(condition1)
            System.out.println("Perform action1");
        double e = 1.0;
        if ((Double) e instanceof Double | d++ == e++)
            d += d;
        boolean condition2 = (d > 2) ? true : false;
        if(condition2)
            System.out.println("Perform action2");        
        boolean condition3 = condition1 ^ condition2;
        if(condition3)
            System.out.println("Perform action3");
		/*
		 * File file = new File("Data.txt"); FileWriter output = new FileWriter(file);
		 * for(int i = 0; i<5; i++) output.write(String.valueOf(i)); file.toString();
		 * output.flush();
		 */
    	
		/*
		 * int p = 10, q = 12; for (;;) { if (p++ < q--) continue; else break;
		 * System.out.println(p + " " + q); }
		 */      
        
        
		/*
		 * try { double[] limits = { 1, 2, 3 }; String[] strArray = { "{2}", "{2}",
		 * "{2}" }; ChoiceFormat choiceFormat = new ChoiceFormat(limits, strArray);
		 * Format[] formatArray = { choiceFormat, null, NumberFormat.getInstance() };
		 * MessageFormat messageFormat = new MessageFormat("{0} out of {2}");
		 * messageFormat.setFormats(formatArray); Object[] testArgs = { null, "3", null
		 * }; for (int i = 0; i < 4; ++i) { testArgs[0] = new Integer(i); testArgs[2] =
		 * testArgs[0]; System.out.println(messageFormat.format(testArgs)); } } catch
		 * (Exception e) { System.out.println(e.getClass()); }
		 */
    	
		/*
		 * List<String> list = new ArrayList<String>(); list.add("1"); list.add("2");
		 * list.add(0,"3"); list.add(1,"4"); list.forEach(System.out::println);
		 * 
		 * 
		 */    	
    	
    	//meth(arg);
    	
    	//Runnable r = () -> System.out.println("HI");
//new Thread(r).start();
    	//Collector<String,?,String> myCollector = Collector.of(String::new,s ->s.tLowerCase(),(x,y)->{x.add(y);return x;});
    	//String coll;
    	
    	 //coll = Stream.of("Bob","Carol","Ted","Bob","Alice")
               //             .collect(myCollector);
        //coll.forEach((k,v) -> System.out.println(k + ":" + v));
    	
    	// final String s1 = "HI";
        //final Integer i1 = 3;
        //final int x=1;
       // MyPredicate<Object>[] p = new MyPredicate[4];
        //p[0] = new MyPredicate(e -> e.equals(s1));
        //p[1] = new MyPredicate(e -> {if (x==1) return e.equals(s1); return !e.equals(s1);});
        //p[2] = new MyPredicate(e -> {if (x!=1) return e.equals(i1); return !e.equals(s1);});
        //p[3] = new MyPredicate((Object e) -> {if (x!=1) return e.equals(i1); return !e.equals(s1);});
        //for (MyPredicate<Object> pp:p) {
          //  System.out.println(testit(s1,pp));
        //}
    	
        
        
		/*
		 * int x = 0; if ( x > 0) System.out.println("One"); System.out.println("Two");
		 */
                
		/*
		 * Double d = 1.0; if (d instanceof Number) d = d++; boolean condition1 = (d ==
		 * 2) ? true : false; if(condition1) System.out.println("Perform action1");
		 * double e = 1.0; if ((Double) e instanceof Double | d++ == e++) d += d;
		 * boolean condition2 = (d > 2) ? true : false; if(condition2)
		 * System.out.println("Perform action2"); boolean condition3 = condition1 ^
		 * condition2; if(condition3) System.out.println("Perform action3");
		 */
        
        
        
       // System.out.println("Number1 + Number2 = "+ doSum());
        //System.out.println("Number1 - Number2 = "+ doMinus());

		/*
		 * ZoneId ny = ZoneId.of("America/New_York"); ZoneId la =
		 * ZoneId.of("America/Los_Angeles");
		 * 
		 * LocalDateTime localDT = LocalDateTime.of(2015,Month.MARCH,14,8,13,13);
		 * ZonedDateTime nyDT = new ZonedDateTime.of(localDT, ny); ZonedDateTime laDT =
		 * new ZonedDateTime.of(localDT, la);
		 * 
		 * 
		 * System.out.println(nyDT); System.out.println(laDT); if (nyDT.equals(laDT))
		 * System.out.println("EQUAL"); Duration d = Duration.between(nyDT,laDT);
		 * System.out.println("Duration="+d);
		 */
    	
    	
    	//List<String> letters = new ArrayList(Arrays.asList("D","B","A","C","F","G"));
       //Predicate<String> p1 = s -> s.compareTo("C") > 0;
       //Predicate<String> p2 = s -> s.equals("B");
       //letters.removeIf(p1.negate().or(p2));
       //letters.sort((s1,s2) -> s1.compareTo(s2));
       //System.out.println(letters);
    	
		/*
		 * Integer i = 4000, j = 4000; System.out.println(i == j); Integer k = 50, n =
		 * 50; System.out.println(k == n);
		 */
    	
              // Locale locale = new Locale();
        Optional<Object> o = Optional.of(new ObjectDemo());
        System.out.println(o.get().toString());
    	//Supplier<String> i = () -> "Car";
      // Consumer<String> c = x -> System.out.print(x.toLowerCase());
      // Consumer<String> d = x -> System.out.print(x.toUpperCase());
       //c.andThen(d).accept(i.get());
       //System.out.println();
    	
		/*
		 * JAXBContext context = null; Unmarshaller umnmarshaller = null; try { context
		 * = JAXBContext.newInstance("data.customer"); } catch (JAXBException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * try { umnmarshaller = context.createUnmarshaller(); } catch (JAXBException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); } try { Person
		 * person = (Person)umnmarshaller.unmarshal(new FileInputStream("sello.xml")); }
		 * catch (JAXBException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
    	
    	System.out.println(calc(5));
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
	
	
    public static int calc(int x) {
    	
    	if(x == 0)
    		return 1;
    	else
    		return x * calc(x -1);
    		
    	
    }
    
public void meth(String[] arg) {
        System.out.println(arg);
        System.out.println(arg[1]);
    }

	
	
	
	/*
	 * static class Helper { private int data = 5; public void bump(int inc) {
	 * inc++; data = data + inc; } }
	 * 
	 * public static void main(String []args) { Helper h = new Helper(); int data =
	 * 2; h.bump(data); System.out.println(h.data + " " + data); }
	 * 
	 * 
	 */
	
	
	
	/*
	 * static String str; public void IKMTest() {
	 * System.out.println("In constructor"); str = "Hello World"; } public static
	 * void main(String [] args) { IKMTest c = new IKMTest();
	 * System.out.println(str); }
	 * 
	 * 
	 * 
	 * } class A { public void printName(){ System.out.println("Value-A"); } } class
	 * B extends A{ public void printName(){ System.out.println("Value-B"); } }
	 * 
	 * 
	 * class C extends A{ public void printName(){ System.out.println("Value-C"); }
	 */



































}




