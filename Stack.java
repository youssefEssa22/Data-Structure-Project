public class Stack {

    private int size;
    private int capacity = 5;
    private Object [] array;

    Stack () {
        this.array = new Object[capacity];
    }

    Stack (int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void push (Object data) {
        if (size > capacity) {
            System.out.println("OverFlow Error Is Occurred");
            System.out.println("----------------------------------------------");
            System.out.println();
            return;
        }
        array[size] = data;
        size ++ ;
    }

    public Object pop () {
        Object returning = -1;
        if (size > 0) {
            size -- ;
            returning = array[size];
            System.out.println("Element Is Deleted Successfully");
            System.out.println("----------------------------------------------");
            System.out.println();
            return returning;
        }
        else if (size <= 0) {
            System.out.println("UnderFlow Error");
            System.out.println("----------------------------------------------");
            System.out.println();
        }
        return array;
        
    }

    
    public void insert (int index , Object data) {
        if (size > capacity) {
            System.out.println("OverFlow Error Is Occurred");
            System.out.println("----------------------------------------------");
            System.out.println();
            return;
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size ++ ;
    }

    public void stackElement () {
        System.out.println("Number Of Stack Elements : " + size);
        System.out.println("Number Of Stack Space Available : " + (capacity - size));
        System.out.println("Maximam Space Of Stack : " + capacity);
        System.out.println("----------------------------------------------");
        System.out.println();
    }


    public int search (Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i ;
            }
        }
        return - 1;
    }

    public void isFull () {
        if (size == capacity) {
            System.out.println("Stack Is Full ");
            System.out.println("----------------------------------------------");
            System.out.println();
          }
          else {
            System.out.println("Stack Isn't Full");
            System.out.println("----------------------------------------------");
            System.out.println();
          }
    }

    public boolean isEmpty () {
        return size == 0;
    }

    public void clearStack () {
        size = 0;
        System.out.println("All Elements Have Been Deleted Successfully");
        System.out.println("----------------------------------------------");
        System.out.println();
    }
    

    public String toString () {
        String string = "";
        for (int i = 0; i < size; i++) {
            string += array[i] + ",";
        }
        if (string != "") {
            string 
            = "[" + string.substring(0, string.length() - 1) + "]";
        }
        else {
            return "[]";
        }
        return string;
    }

    public String reversed_toString () {
        String string = "";
        for (int i = 0; i < size; i++) {
            string += array[i] + ",";
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                Object temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
        if (string != "") {
            string 
            = "[" + string.substring(0, string.length() - 1) + "]";
        }
        else {
            return "[]";
        }
        return string;
    }

}
