class ExceptionDemo {
    static String message;
    public static void main(String[] args) {
    	
		/*
		 * Double d = new Double(17.64d); Boolean b = new Boolean(false); Float f = new
		 * Float(23.43); Character c= new Character("C");
		 */
        try {
            String message = getMessage();
            System.out.println(message);
        } catch (Exception e) {
            message+="F";
            System.out.print(message);
        } finally {
            System.out.println(message);
        }
    }
    public static String getMessage() throws Exception {
        String message = "A";
        try {
          throw new Exception();
        } catch (Exception e) {
          try {
            try {
              throw new Exception();
            } catch (Exception ex) {
              message += "B";
            }
            throw new Exception();
          } catch (Exception x) {
            message += "C";
          } finally {
            message += "D";
          }
        } finally {
          message += "E";
        }
        return message;
    }
}

