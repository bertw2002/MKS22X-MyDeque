import java.util.*;
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[10];
    data = d;
    start = 0;
    size = 0;
    end = 0;
  }
  public MyDeque(int initialCapacity){
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[initialCapacity];
    data = d;
    size = 0;
    start = 0;
    end = 0;
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
      str += "}";
    }else{
      for (int y = 0; y <= end; y++){
        str += data[y];
        str += " ";
      }
      for (int x = start; x < data.length; x++){
        str += data [x] + " ";
        str += " ";
      }
      str += "}";
    }
    return str;
  }
  public void addFirst(E element){
    if (element == null) throw new NullPointerException("Parameter can't be null");
    if (start == 0){
      if (size >= data.length - 1){
        //resize();
      }else{
        start = data.length-1;
        data[data.length-1] = element;
      }
    }
    else{
      start--;
      data[start] = element;
    }
    start++;
  }
  public void addLast(E element){
    if (element == null) throw new NullPointerException("Parameter can't be null");
    if (size == 0) {
      data[end] = element;
    }
    else if (start > end) {
     end++;
     data[end] = element;
    }
     else if (size == data.length){
      //  resize();
      data[end++] = element;
    }
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
