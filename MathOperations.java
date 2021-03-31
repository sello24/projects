import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MathOperations {
	
	MathOperations mrc = new MathOperations();
	
	static void populate(Supplier<List> s,String... stuff) {
        List l = s.get();
        for (int i=0; i< stuff.length;++i)
            l.add(stuff[i]);
        System.out.println(l);
    }
	
	
static int number2=getValue();
    static int number1=10;
    static int getValue()
    {
        return number1;
    }
    static int doSum(){ return number1+number2;}
    static int doMinus(){ return number1-number2;}
    public static void main(String[] args) 
    {
        System.out.println("Number1 + Number2 = "+ doSum());
        System.out.println("Number1 - Number2 = "+ doMinus());
        
        
        
        
        
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        try {
            engine.eval(
               "var i=0;"
             + "i++;"
             + "var String = Java.type(\"java.lang.String\");"
             + "var str = new String(\"Java\");"
             + "print(str);"
             + "print(i);"
            );
        } catch (ScriptException se) { System.out.println("Script Exception"); }
        
        
        
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileWriter("tt"));
            inputStream = new BufferedReader(new FileReader("tt"));

            Stream.of("RED","GREEN","BLUE").forEach(outputStream::println);
            outputStream.flush();
List<String> l=inputStream.lines().collect(Collectors.toList());
l.stream().forEach(System.out::println);
                       

        } catch (IOException e) {
            e.printStackTrace();
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        //populate(ArrayList::new,"Red","Green","Blue");
        
        
        
    }
        
    	
        
 
 
}
