import java.util.Scanner;

class Two
{
    int num;
    void getVal()
     {
		  Scanner s = new Scanner(System.in);
          System.out.println("Decimal to HexaDecimal,Octal and Binary");
          
          System.out.println("\nEnter the number :");
          num = Integer.parseInt(s.nextLine());
     }
    void convert()
      {
           String hexa = Integer.toHexString(num);
           System.out.println("HexaDecimal Value is : " + hexa);
           
		   String octal = Integer.toOctalString(num);
           System.out.println("Octal Value is : " + octal);
           
		   String binary = Integer.toBinaryString(num);
           System.out.println("Binary Value is : " + binary);
       }

   public static void main(String args[])
    {
        Two t1 = new Two();
         t1.getVal();
         t1.convert();
    }
}
