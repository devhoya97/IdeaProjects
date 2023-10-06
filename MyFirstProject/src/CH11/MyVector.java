package CH11;

public class MyVector {
    Object[] data = null;
    int size = 0;
    int capacity = 0;
    public MyVector(int capacity){
        this.capacity = capacity;
        data = new Object[capacity];
    }
    public MyVector(){
        this(10);
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean add(Object o){
        if(size == capacity)
            makeCapacityDouble();
        data[size++] = o;
        return true;
    }
    public boolean remove(Object o){
        for(int i=0; i<size; i++){
            if (data[i].equals(o)){
                remove(i);
                return true;
            }
        }
        return false;
    }
    public Object remove(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        Object oldObj = data[index];
        System.arraycopy(data, index+1, data, index,size-index-1);
        data[size-1] = null;
        size--;
        return oldObj;
    }
    public void clear(){
        for (int i=0; i<size; i++){
            data[i] = null;
        }
        size = 0;
    }
    public Object[] toArray(){
        Object[] tmp = new Object[size];
        System.arraycopy(data, 0, tmp, 0, size);
        return tmp;
    }
    public void makeCapacityDouble(){
        capacity *= 2;
        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
    }
}
