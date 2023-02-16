class Mthrows{
 static void meth()throws IllegalAccessException{
 System.out.println("Exception caught");
 throw new IllegalAccessException("demo");
 }
 public static void main(String[]args){
  try{
   meth(); 
    }
   catch(IllegalAccessException n){
     System.out.println("caught"+n);
    }
  }
}
