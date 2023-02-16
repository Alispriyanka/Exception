class Mmultiplecatch{
 public static void main(String []args){
    try{
    int a=1;
    int b=5/a;
    System.out.println("The value" +b);
    int c[]={1};
     c[1]=2;
  }
     catch(ArithmeticException m){
   System.out.println("division" +m); 
   }
       catch(ArrayIndexOutOfBoundsException m){
       System.out.println("Array index" +m);
    }
 }
}
