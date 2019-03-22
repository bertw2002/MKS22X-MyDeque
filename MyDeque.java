public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[10];
    data = d;
    start = -1;
    size = 10;
    end = -1;
  }
  public MyDeque(int initialCapacity){
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[initialCapacity];
    data = d;
    size = initialCapacity
    start = -1;
    end = -1;
  }
  public int size(){
    return data.length;
  }
  public String toString(){
    String str = "{ ";
    for (int x = 0; x < size(); x++){
      str += data[x];
      str += " ";
    }
    return str;
  }
  public void addFirst(E element){
    if (size() != 0){
      if (end == -1){
        data[0] = element;
        start = 0;
        end = 0;
      }
      else if (end != -1){

      }
    }
  }
  public void addLast(E element){

  }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }
}
