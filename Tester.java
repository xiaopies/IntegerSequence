public class Tester{
  public static void main(String[] args){
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence r = new ArraySequence(nums);

    // IntegerSequence r = ArraySequence(a);
    // IntegerSequence r = new Range(10,20);
   while(r.hasNext()){
     System.out.print(r.next());
      if( r.hasNext() ){

         System.out.print( ", " );
       }
     }
     System.out.println();

     IntegerSequence b = new Range(10,20);
     while(b.hasNext()){
       System.out.print(b.next());
        if( b.hasNext() ){

           System.out.print( ", " );
         }
       }
       System.out.println();

     IntegerSequence as = new ArraySequence(b);
     System.out.println("ArraySequence(seq):");
   while(as.hasNext()){
     System.out.print(as.next()+", ");
   }
   System.out.println();

  }
}
