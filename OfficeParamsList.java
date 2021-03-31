
import java.util.*; 
  public class OfficeParamsList {
          public static void main(String []args) {
                 List<Map<List<Integer>, List<String>>> officeParametersList =
                          new ArrayList<>();     
                  Map<List<Integer>, List<String>> officeParamMap = new HashMap<>();
                  officeParametersList.add(null);        
                  officeParametersList.add(officeParamMap);
                 officeParametersList.add(new HashMap<List<Integer>,                      
                                                                            List<String>>()); 
                officeParametersList.forEach(e -> System.out.print(e + " "));
        }
 }