import java.util.Random;

public class Array {
    public static void main(String []ds) {

        //for reverse classs object & methods
        /*Reverse rev = new Reverse();
        rev.printArray();
        rev.reverseArray();
        */
        
        //max. & min. element in array
        MaxMinElement mm = new MaxMinElement();
        int max = mm.getMax();
        int min = mm.getMin();
        System.out.println("Maximum element is  " + max);
        System.out.println("Minimun value is  " + min);
        mm.printArray();

    }
}

class MaxMinElement {
    Random random = new Random();
    int []element = new int[5];
    private int max, min;


    MaxMinElement() {
        for(int count=0; count<5; count++)
        {
            element[count] = random.nextInt(10)+1;
        }
        //max = element[0];
        //min = element[0];
        for (int i=0; i< element.length-1; i++) {
            for (int j=0; j< element.length-i-1; j++) {
                if (element[j] > element[j+1]) {
                    int temp = element[j];
                    element[j] = element[j+1];
                    element[j+1] = temp;
                }
            }
        }
    }
    void printArray() {
        for (int counter=0; counter<element.length; counter++)
        {
            System.out.print("  " + element[counter]);
        }
    }
    int getMax() {
       max = element[element.length-1];
       return max;
    }
    int getMin() {
        min = element[0];
        return min;
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
