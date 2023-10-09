public class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    private Object[] array;
    private int length;

    public GenericStack(){
        array = new Object[1];
        length = 0;
    }

    public int getSize() {
        return length;
    }

    public E peek() {
        return (E) array[length - 1];
    }

    public void push(E o) {
        if(array.length == length){
            Object[] newArray = new Object[array.length * 2];
            for(int i = 0; i < length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[length] = (Object) o;
        length++;
    }

    public E pop() {
        Object temp = array[length - 1];
        array[length - 1] = null;
        length--;
        return (E) temp;
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);  
    }
}
