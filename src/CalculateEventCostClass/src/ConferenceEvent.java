public class ConferenceEvent{
    
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private double conferenceEventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private CalculateEventCostClass calculateEventCostObject;
    private int totalParticipants;
    private int totalEventDays;
 
    public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays,
     double breakfastCost, double lunchCost, double dinnerCost) {

        this.calculateEventCostObject = new CalculateEventCostClass();

        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;
        this.breakfastCost = breakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
     }

     public double getBreakfastCost() {
         return breakfastCost;
     }

     public void setBreakfastCost(double breakfastCost) {
         this.breakfastCost = breakfastCost;
     }

     public double getLunchCost() {
         return lunchCost;
     }

     public void setLunchCost(double lunchCost) {
         this.lunchCost = lunchCost;
     }

     public double getDinnerCost() {
         return dinnerCost;
     }

     public void setDinnerCost(double dinnerCost) {
         this.dinnerCost = dinnerCost;
     }

     public double getConferenceEventCost() {
         return conferenceEventCost;
     }

     public void setConferenceEventCost(double conferenceEventCost) {
         this.conferenceEventCost = conferenceEventCost;
     }

     
     public void calculateEventCost() {
       conferenceEventCost = calculateEventCostObject.calculateEventCost() + ((breakfastCost + lunchCost + dinnerCost) * totalParticipants * totalEventDays);
     }
   
    @Override
    public String toString(){
        return "Conference Event details: " + "\n" +
        "Event ID: " + eventID + "\n" +
        "Event Name: " + eventName + "\n" +
        "Event Location: " + eventLocation + "\n" +    
        "Total Participants: " + totalParticipants + "\n" +
        "Total Conference Cost: " + conferenceEventCost;
    } 
}
