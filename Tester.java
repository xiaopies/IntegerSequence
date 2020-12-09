public class Tester{
  public static void main(String[] args){
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence r = new ArraySequence(nums);
    // IntegerSequence r = new Range(10,20);
   while(r.hasNext()){
     System.out.print(r.next());
      if( r.hasNext() ){

         System.out.print( ", " );
       }
        System.out.println();
      }
  }
}
