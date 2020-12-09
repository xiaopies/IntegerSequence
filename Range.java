import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int hello,  int byebye){
    start = hello;
    end = byebye;
    current = hello;
  }
  public void reset(){
    current = start;
  }
  public int length(){
    return end - start + 1;
  }
  public boolean hasNext(){
    return current != end+1;
  }

  //@throws NoSuchElementException
  public int next(){
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    else{
      current ++;
      return current-1;
    }
  }

}
