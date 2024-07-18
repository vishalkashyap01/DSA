public class Bubble {
    public static void main(String []args) {

        int [] arr = {38, 18, 25, 17, 12};

        /*
        arr[0] = 25;
        arr[1] = 10;
        arr[2] = 7;
        arr[3] = 2;
        arr[4] = 15; */

        System.out.println("Unsoted :- ");

        for (int x : arr)
            System.out.print("  " + x);

        System.out.println('\n');

        for (int i=0; i< arr.length-1; i++) {
            for (int j=0; j< arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;   }   }   }

        System.out.println("Sorted :- ");

        for (int u : arr)
            System.out.print("  " + u);
    }
}