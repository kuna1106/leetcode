package array;

import java.util.Arrays;

@SuppressWarnings("Unchecked")
public class SimpleArray {

    private int[] array;
    private int length;
    private int capacity = 10;

    public SimpleArray(){
        array = new int[capacity]; 
    }

    // add data to array
    public void add(int indexes) {
        // add 6 indexes of the array
        for (int i = 0; i < indexes; i++) {
            array[length] = i;
            length++;
        }
    }
    // insert data

    public void insertDataToEndArray(int data) {
        array[length] = data;
        length++;
    }

    public void insertDataToStartArray(int data){
        for (int i = length; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = data;
        length++;
    }


    // deleting data


    // get size array
    public int size() {
        return length;
    }
    public  void printArray() {
        StringBuffer string = new StringBuffer();
        string.append("[");
        for (int i = 0; i < length; i++) {
            string.append(array[i]).append(",");
        }
        string.deleteCharAt(string.length()-1).append("]");
        System.out.println(string.toString());
    }

    public static void main(String[] args) {
       SimpleArray array = new SimpleArray();
       array.add(6);
       array.printArray();
    //    array.insertDataToEndArray(7);
       array.insertDataToStartArray(20);
       System.out.println(array.size());
       array.printArray();
    }
}
