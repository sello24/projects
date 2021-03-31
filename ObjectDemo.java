
		import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.Optional;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class ObjectDemo {
    @Override
    public String toString() {
        return "ObjectDemo";
    }

 
    
    
    
    
    
    
    
    

    public static void main(String[] args) throws IOException {
       
  

        Collector<String,?,AbstractMap<Integer,String>> myCollector =
                Collector.of(TreeMap::new, 
                          (s,t) -> s.put(t.length(),t.toLowerCase()),
                          (x,y) -> { x.putAll(y); return x;});
        AbstractMap<Integer,String> coll;
        
        
        coll = Stream.of("Bob","Carol","Ted","Bob","Alice")
                            .collect(myCollector);
        coll.forEach((k,v) -> System.out.println(k + ":" + v));
    	
    	
    	
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
    	
    	
    	 List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add(0,"3");
        list.add(1,"4");
        list.forEach(System.out::println);
    	
    	
       List<String> letters = new ArrayList(Arrays.asList("D","B","A","C","F","G"));
    	Predicate<String> p1 = s -> s.compareTo("C") > 0;
       Predicate<String> p2 = s -> s.equals("B");
       letters.removeIf(p1.negate().or(p2));
       letters.sort((s1,s2) -> s1.compareTo(s2));
       System.out.println(letters);
    	
    	
    	Runnable r = () -> System.out.println("HI");
new Thread(r).start();
    	
    	   String stringA = "A";
        String stringB = "B";
        String stringnull = null;
              StringBuilder bufferc = new StringBuilder("C");
        Formatter fmt = new Formatter(bufferc);

        fmt.format("%s%s", stringA, stringB);
        System.out.println("Line 1: "+ fmt);

        fmt.format("%-2s", stringB);
        System.out.println("Line 2: "+ fmt);

        fmt.format("%b", stringnull);
        System.out.println("Line 3: "+ fmt);
    	
    	
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
    	//TimeZone tz = TimeZone.getGMTTimeZone();
    	TimeZone tz = TimeZone.getTimeZone("GMT");
    	
    	  int j = 0;
        int a[]={2,4};
        do for (int i : a)
            System.out.print(i+" ");
        while (j++ < 1);
        
        
    	  Predicate<String> lengther = (s) -> s.length() < 2;
        Predicate<String> equalizer = Predicate.isEqual("car");
        Function<Boolean,String> booleaner = i -> Boolean.toString(i);
        Function<String,Boolean> stringer  = s -> Boolean.parseBoolean(s);
        
        System.out.println(booleaner.apply(true));
	    System.out.println(booleaner.compose(stringer).apply("true").substring(0,3));
		System.out.println(lengther.negate().or(equalizer).test("CAR"));
		//System.out.println(booleaner.andThen(stringer).apply("true"));
		System.out.println(stringer.compose(booleaner).apply(true));
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        
        
        
    	
    	Optional<Object> o = Optional.of(new ObjectDemo());
        System.out.println(o.get().toString());
        
        
        Integer number1 = new Integer(1);
Integer number2 = number1;
number1+=1;
System.out.println(number1);
System.out.println(number2);

Element e = new Element(2);


         System.out.println(Stream.of("green", "yellow", "blue")
          .max((s1,s2) -> s1.compareTo(s2))
               .filter(s -> s.endsWith("n"))
               .orElse("yellow"));  
         
          SortedSet<Element> s = new TreeSet<Element>();
        s.add(new Element(15));
        s.add(new Element(10));
        s.add(new Element(25));
        s.add(new Element(10));
        System.out.println(s.first() + " " + s.size());
        
        //ResourceBundle bundle = ResourceBundle.getBundle("Messages", new Locale("zh", "CN"));
            LocalDate localDate = LocalDate.of(2015,4,4);
            System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
            System.out.println(localDate.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy")));
         System.out.println(localDate.format(DateTimeFormatter.ofPattern("MM/dd/yy")));
         //BufferedReader inputStream = new BufferedReader(new InputStreamReader("input.dat"));
		//BufferedReader inputStream1 = new BufferedReader("input.dat");
		//FileReader inputStream2 = new FileReader("input.dat");
		//BufferedReader inputStream3 = new BufferedReader(new File("input.dat"));
		//BufferedReader inputStream4 = new BufferedReader(new FileReader("input.dat")); 
		/*
		 * int a = 9, b = 2; float f; f = a / b; System.out.println("f = " + f); f = f /
		 * 2; System.out.println("f = " + f); f = a + b / f; System.out.println("f = " +
		 * f);
		 */
        
  
        
        
        
        

    }
}

class Element implements Comparable {
    int id;
    
    private int j;
    
    public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	Element(int id) {
        this.id = id;
      
    }
    
    public int compareTo(Object obj) {
        Element e = (Element)obj;
        return  this.id - e.id;
    }
    
    public String toString() {
        return "" + this.id;
    }
}