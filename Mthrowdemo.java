public class Mthrowdemo{
 static void mech(int a){
  try{
   throw new NullPointerException("demo");
    }
   catch(NullPointerException n){
    System.out.println("caught");
     throw n;
  }
 }
public static void main(String[]args){
    try{
     mech();
     }
    catch(NullPointerException n){
      System.out.println("recaught" +n);
     }
   }
}
