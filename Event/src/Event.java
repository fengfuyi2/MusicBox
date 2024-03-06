import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private LocalDate eventDate;
    private ArrayList<String> eventAttendees;

    public Event(String eventID, String eventName, String eventVenue, LocalDate eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.eventAttendees = new ArrayList<>();
    }

    public String getEventID() {
        return eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", eventName='" + eventName + '\'' +
                ", eventVenue='" + eventVenue + '\'' +
                ", eventDate=" + eventDate +
                ", eventAttendees=" + eventAttendees +
                '}';
    }

    public void organizeEvent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation (add, remove, update, find, display, exit):");
        String operation = scanner.nextLine();

        while (!operation.equals("exit")) {
            switch (operation) {
                case "add":
                    System.out.println("Enter attendee name to add:");
                    String attendeeToAdd = scanner.nextLine();
                    eventAttendees.add(attendeeToAdd);
                    break;
                case "remove":
                    System.out.println("Enter attendee name to remove:");
                    String attendeeToRemove = scanner.nextLine();
                    eventAttendees.remove(attendeeToRemove);
                    break;
                case "update":
                    System.out.println("Enter old attendee name:");
                    String oldAttendee = scanner.nextLine();
                    System.out.println("Enter new attendee name:");
                    String newAttendee = scanner.nextLine();
                    int index = eventAttendees.indexOf(oldAttendee);
                    if (index != -1) {
                        eventAttendees.set(index, newAttendee);
                    } else {
                        System.out.println("Attendee not found.");
                    }
                    break;
                case "find":
                    System.out.println("Enter attendee name to find:");
                    String attendeeToFind = scanner.nextLine();
                    if (eventAttendees.contains(attendeeToFind)) {
                        System.out.println(attendeeToFind + " is attending.");
                    } else {
                        System.out.println(attendeeToFind + " is not attending.");
                    }
                    break;
                case "display":
                    System.out.println(this);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
            System.out.println("Enter operation (add, remove, update, find, display, exit):");
            operation = scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Event event = new Event("E001", "Tech Conference", "Convention Center", LocalDate.of(2023, 10, 15));
        event.organizeEvent();
    }
}
