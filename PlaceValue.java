import java.util.Scanner;

class PlaceValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int places[] = new int[5];
        int num, digitvalue;
        System.out.print("Enter your number : ");
        num = sc.nextInt();

        // Populate the places array with digits of the number
        for (int i = 0; i < places.length; i++) {
            places[i] = num % 10;
            num = num / 10;
        }

        System.out.print("Digit to be found : ");
        digitvalue = sc.nextInt();

        int place = 1;
        boolean found = false;

        // Reverse loop to find the digit and its place value
        for (int j = 0; j < places.length; j++) {
            if (places[j] == digitvalue) {
                System.out.println("Place value is " + place);
                found = true;
                break;
            }
            place *= 10;
        }

        if (!found) {
            System.out.println("Digit not found in the number.");
        }
    }
}
