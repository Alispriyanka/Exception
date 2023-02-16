public class Mfinally{
 static void procA(){
  try{
   System.out.println("inside procA");
   throw new NullPointerException("demo");
  }
   finally{
   System.out.println("procA family");
   }
 }
 static void procB(){
  try{
  System.out.println("inside procB");
  return;
  }
  finally{
   System.out.println("procB family");
  }
 }
 static void procC(){
 try{
  System.out.println("inside procC");
   }
  finally{
   System.out.println("procC family");
   }
  }
public static void main(String[]sss){
 try{
  procA();
   }
  catch(NullPointerException d){
   System.out.println("caught" +d);
 }
  procB();
  procC();
 }
}
