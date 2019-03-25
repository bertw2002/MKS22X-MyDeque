import java.util.*;
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public void resize() {
    E[] data1 = (E[]) new Object[2 * (data.length - 1)];
    int index = size - start;
    //if start < end, loop thru and set new data values to old.
    if (start <= end) {
      for (int x = start; x <= end; x++) {
        data1[x] = data[x];
      }
    }

    else {
      for (int x = 0; x < size; x++) {
        if (start + x >= data.length) {
          data1[x - data.length + start] = data[x + start - data.length];
          data1[data1.length - index] = data[start + x];
          index--;
        }
        else {
        data1[data1.length - index] = data[start + x];
        //TEST minus and plus..
        index--;
        }
      }
      //remember to minus index
      start = data1.length - index;
    }

    data = data1;
  }


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
    String str = "{";
    if (size == 0) return "{}";
    else if (start < end){
      for (int x = start; x < end; x++){
        str += data[x];
        str += " ";
      }
      str += "}";
    }else{
      for (int y = 0; y < end; y++){
        str += data[y];
        str += " ";
      }
      for (int x = start; x < data.length; x++){
        str += data[x];
        str += " ";
      }
      str += "}";
    }

    return str;
  }


  public void addFirst(E element){
    if (element == null) {
      throw new NullPointerException("Cannot add null");
    }
    if (data[0] == null) {
      end = 0;
      data[end] = element;
      start = 0;
    }
    else if (start - 1 == end) {
      resize();
      start = data.length - 1;
      data[start] = element;
    }
    else if (start == 0) {
      start = data.length - 1;
      data[start] = element;
    }
    else{
      start--;
      data[start] = element;
    }
    size++;
  }

  public void addLast(E element){
    if (element == null) {
      throw new NullPointerException("Cannot add null");
    }
    if (data[0] == null) {
      end = 0;
      data[end] = element;
      start = 0;
    }
    //full list, resize.
    else if (end + 1 == data.length){
      resize();
      end++;
      data[end] = element;
    }
    else if (end + 1 == start) {
      resize();
      end++;
      data[end] = element;
    }
    else if (end == 0) {
      end = 1;
      data[end] = element;
    }

    else {
      end++;
      data[end] = element;
    }
    size++;
  }
  public E removeFirst(){
    if (size == 0) throw new NoSuchElementException();
    E first = data[start++];
    data[start - 1] = null;
    if (start == data.length){
      start = 0;
    }
    size--;
    return first;
  }
  public E removeLast(){
    if (size == 0) throw new NoSuchElementException();
    E last = data[end--];
    data[end + 1] = null;
    if (end == -1){
      end = data.length - 1;
    }
    size--;
    return last;
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
