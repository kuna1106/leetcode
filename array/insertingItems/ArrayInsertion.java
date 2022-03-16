package array.insertingItems;
/*
* inserting
*/
public class ArrayInsertion {
    public static void insertingToEnd(int[] array) {
        int length = 0;
        for (int i = 0; i < 3; i++) {
            array[length] = i;
            length++;
        }

        array[length] = 10;
        length++;
    }

    public static void insertingToStart(int[] array) {
        // inserting to start of array
        for (int i = 3; i >= 0; i--) {
            array[i+1] = array[i];
        }
        array[0] = 20;
    }

    public static void insertingToIndex(int[] array) {
        // inserting anywhere in the array
        for (int i = 4; i >= 2 ; i--) {
            // shift each element one position to the right
            array[i + 1] = array[i];
        }

        // insert it at the required index
        array[2] = 30;
    }
    
    public static void main(String[] args) {
        int[] array = new int[6];
        insertingToEnd(array);
        insertingToStart(array);
        insertingToIndex(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("index " + i + " contains " + array[i]);
        }
    }
}
