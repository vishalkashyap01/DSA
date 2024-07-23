import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner accept = new Scanner(System.in);
        int n, position, operation;

        System.out.print("Enter value: ");
        n = accept.nextInt();
        System.out.print("Enter position: ");
        position = accept.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1. Get Bit");
        System.out.println("2. Set Bit");
        System.out.println("3. Clear Bit");
        System.out.println("4. Update Bit");
        System.out.print("Enter your choice: ");
        operation = accept.nextInt();

        switch (operation) {
            case 1:
                getBit(n, position);
                break;
            case 2:
                setBit(n, position);
                break;
            case 3:
                clearBit(n, position);
                break;
            case 4:
                updateBit(n, position);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
        }

        accept.close();
    }

    public static void getBit(int value, int position) {
        int bitMask = 1 << position;
        if ((bitMask & value) == 0) {
            System.out.println("Bit is Zero");
        } else {
            System.out.println("Bit is One");
        }
    }

    public static void setBit(int value, int position) {
        int bitMask = 1 << position;
        int newValue = value | bitMask;
        System.out.println("Value after setting bit: " + newValue);
    }

    public static void clearBit(int value, int position) {
        int bitMask = 1 << position;
        int newValue = value & ~bitMask;
        System.out.println("Value after clearing bit: " + newValue);
    }

    public static void updateBit(int value, int position) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operation (1 to set, 0 to clear): ");
        int operation = sc.nextInt();

        int bitMask = 1 << position;
        int newValue;

        if (operation == 1) {
            newValue = value | bitMask;
            System.out.println("Value after setting bit: " + newValue);
        } else if (operation == 0) {
            newValue = value & ~bitMask;
            System.out.println("Value after clearing bit: " + newValue);
        } else {
            System.out.println("Invalid operation. Please enter 1 to set or 0 to clear.");
            return;
        }
    }
}
