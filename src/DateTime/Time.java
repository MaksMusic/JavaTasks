package DateTime;


    import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.Scanner;

    public class Time {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter date and time (yyyy-MM-dd HH:mm:ss): ");
            String input = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime enteredDateTime = LocalDateTime.parse(input, formatter);
            LocalDateTime currentDateTime = LocalDateTime.now();
            Duration duration = Duration.between(currentDateTime, enteredDateTime);
            long days = duration.toDays();
            long hours = duration.toHours() % 24;
            long minutes = duration.toMinutes() % 60;
            System.out.println("Time remaining: " + days + " days " + hours + " hours " + minutes + " minutes");
        }
    }





