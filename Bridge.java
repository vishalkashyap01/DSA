import java.util.Scanner;

class Bridge{
    public static void main(String []vtl){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of bridge : ");
        int sizeOfBridge = sc.nextInt();
        
        char []blocks = new char[sizeOfbridge];
        Boolean safe = false;
        int bridgeBlock = 0;

        // Input/Get parts of bridge by user
        for(int counter=0; counter<blocks.length; counter++)
        {
            blocks[counter] = sc.next().charAt(0);
            //Conditionals defines which symbol is safe or unsafe & count the safe blocks
            if ('_' == blocks[counter])
            {
                bridgeBlock++;
                safe = true;
            }
            if ('x' == blocks[counter]){
                safe = false;
            }
        }
        System.out.println("Pull : ");

        //Read all the blocks for the Bridge have.
        for(char x : blocks)
        {
            System.out.print(x + " ");
        }

        // conditionals to check the bridge is Safe or not!
        if (safe)
        {
            System.out.println('\n' + "Bridge is Safe!");
        } else {
            System.out.println('\n' + "Bridge is Unsafe!");
        }

        //Read all data such as needed block or available blocks
        int neededBlock = blocks.length - bridgeBlock;
        System.out.println("Available block : " + bridgeBlock + '\n' + "Needed block : " + neededBlock);
    }
}
