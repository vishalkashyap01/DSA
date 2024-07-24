import java.util.Random;

public class Array {
    public static void main(String []ds) {

        Reverse rev = new Reverse();
        rev.printArray();
        rev.reverseArray();
        
    }
}

class Reverse {
    Random random = new Random();
    int []element = new int[5];

    //Assign value by using Random class
    Reverse(){
        for(int count=0; count<5; count++)
        {
            element[count] = random.nextInt(100)+1;
        }
    }
    void printArray() {
        for(int x=0; x<5; x++) {
            System.out.print(element[x] + " ");
        }
    }
    void reverseArray() {
        int []newElement = new int[5];
        int size = element.length-1;

        System.out.println();
        for(int x=0; x<5; x++) {
           newElement[x] = element[size];
            System.out.print(newElement[x] + " ");
            size--;
        }
        return;
    }

}
//System.out.println("hi, Vedika!");