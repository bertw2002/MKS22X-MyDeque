import java.util.*;
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[10];
    data = d;
    start = -1;
    size = 0;
    end = -1;
  }
  public MyDeque(int initialCapacity){
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[initialCapacity];
    data = d;
    size = 0;
    start = -1;
    end = -1;
  }
  public int size(){
    return size;
  }
  public String toString(){
    String str = "{ ";
    if (size == 0) return "{ }";
    else if (start < end){
      for (int x = start; x < end; x++){
        str += data[x];
        str += " ";
      }
    }else{
      for (int y = 0; y <= end; y++){
        str += data[y];
        str += " ";
      }
      for (int x = start; x < data.length; x++){
        str += data [x] + " ";
        str += " ";
      }
    }
    return str;
  }
  public void addFirst(E element){
    if (element == null) throw new NullPointerException("Parameter can't be null");

    if (size() != 0){
      if (end == -1){
        data[0] = element;
        start = 0;
        end = 0;
      }
      else if (end != -1){

      }
    }else{
      //resize();
    }
  }
  public void addLast(E element){

  }
  public E removeFirst(){
    if (size == 0) throw new NoSuchElementException();

  }
  public E removeLast(){
    if (size == 0) throw new NoSuchElementException();
    
  }
  public E getFirst(){
    if (size == 0) throw new NoSuchElementException("empty data");
    return data[start];
  }
  public E getLast(){
    if (size == 0) throw new NoSuchElementException("empty data");
    return data[end];
  }
}
