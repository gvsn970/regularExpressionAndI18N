package interview;

public class BoolTest 
{
    
	
	
	public static void main(String [] args) 
    {
		 Object obj = new Object() 
		    {
		        public int hashCode() 
		        {
		            return 42;
		        }
		    }; 
		    System.out.println(obj.hashCode()); 
		  int x=20;
	        String sup = (x < 15) ? "small" : (x > 22)? "tiny" : "huge";
	        System.out.println(sup);
        int result = 0;

        Boolean b1 = new Boolean("TRUE");
        
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("tRuE");
        Boolean b4 = new Boolean("false");

        if (b1 == b2)  /* Line 10 */
            result = 1;
        if (b1.equals(b2) ) /* Line 12 */
            result = result + 10;
        if (b2 == b4)  /* Line 14 */
            result = result + 100;
        if (b2.equals(b4) ) /* Line 16 */
            result = result + 1000;
        if (b2.equals(b3) ) /* Line 18 */
            result = result + 10000;

        System.out.println("result = " + result);
        
        
        int x1 = 11 & 9;
        System.out.println(x1);
        int y = x ^ 3;
        System.out.println(y);
        System.out.println( y | 12 );
    }
}