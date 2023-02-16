public class Mexception{
 public static void main(String[]args){
  try{
    int a=0;
    int b=5/a;
    System.out.println("value"+b);    
  }
    catch(ArithmeticException P){
       System.out.println("division"+P);
   }
      System.out.println("hhh");
 }
}
