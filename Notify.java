import java.util.Scanner;

class Notify {

    public static void getNotify(String start, String end, float time, int slot, int distance, int speed)
    {
        //time = (int)time;
        int afterOneHour = speed * slot;
        int distRemain = distance - afterOneHour;
        float updatedTime = (float)distRemain / (time - slot);

        System.out.println("  from " + start + "- - - - - to " + end);

        //if conditional is run when the traveller reached the location/destination,although else is executed
        //speed/2 to calculate half of speed's distance by get better result
        if (distRemain <= speed)
        {
            System.out.println("You jouney have been completed!");
            System.out.println('\t' + "Have a good day!");
        } else {
            System.out.println("Distance remaining to reach " + end + " is " + distRemain);
            System.out.println("Approximately time reamaining " + (time - slot) + " Hours");
            System.out.println("Covered Distance : " + afterOneHour + " kilometers");
            System.out.println('\n');
        }
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println('\t' + "Welcome to Notify!");
        //create 2 var to hold the current city & destination city name
        String location;
        String destination;

        //get the location & destination from the user @runtime
        System.out.print("Location : ");
        location = sc.next();
        System.out.print("Destination : ");
        destination = sc.next();

        //seprate input from above code so look code clean
        System.out.println('\n');

        //intialize 2 var
        int dist, speed;

        System.out.println('\t' + "Additional info. needed!");
        System.out.print("Distance (km): ");
        dist = sc.nextInt();
        System.out.print('\n' + "Speed (km/h): ");
        speed = sc.nextInt();

        float timeTaken = dist / speed;
        System.out.println('\t' + "it will take approximately " + timeTaken + " hours to reach " + destination + " from " + location + " at average speed of " + speed + " kilometers/hour." + '\n');

        //code scope for notication of dist. & time after @1 hour journey
        int timeSlot = (int)timeTaken;
        timeTaken = (int)timeTaken;

        for (int timer=1; timer<=timeSlot; timer++)
        {
            //method call to calculate the covered, remainning & time to complete journey...
            getNotify(location, destination, timeTaken, timer, dist, speed);

        }
    }
}