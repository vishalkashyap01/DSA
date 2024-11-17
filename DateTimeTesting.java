import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTesting {
    public static void main(String[] args) {
        // Create a Date object to get the current date and time
        Date currentDate = new Date();
        
        // Define the format of the date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        // Print the formatted date and time
        System.out.println("Current Date and Time: " + dateFormat.format(currentDate));
    }
}
