public class Nestedtry{
  static void meth(int a){
  try{
    if(a==1)a=a/(a-a);
    if(a==1){
    int c[]={1};
     c[1]=2;
   }
  }
    catch(ArrayIndexOutOfBoundsException v){
     System.out.println("Arraysindex:" +v);
   }
 }
      public static void main(String[]args){
       try{
        int a=1;
        int b=5/a;
        System.out.println(a);
        meth(a);
      }
       catch(ArithmeticException v){
        System.out.println("division " +v);
      }
    }
}
