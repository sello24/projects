
import java.util.Optional;
public class MethodTest {
   public static void main(String[] args) {
   String a = null;
        Optional<String> b = Optional.empty();
        try {
            System.out.print(a.length());
            System.out.print(b.orElse("").length());
        }
        catch (Exception ex) {
            System.out.print(a);
        }
        finally {
            a = "String";
            System.out.print(a.length());
            b = Optional.ofNullable("");
            System.out.println(b.get().length());
        }
   }
	Boolean b = new Boolean("false");
		Integer i = Integer.parseUnsignedInt(4);
		Float f = new Float(23.43);
		Double d = new Double("17.46d");
		Character c = new Character("C");