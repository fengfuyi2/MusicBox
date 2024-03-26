public class MusicConcertEvent extends Event{
    
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double musicConcertEventCost;

  
    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays, double merchandiseCost) {
        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays);
        this.merchandiseCost = merchandiseCost;
    }


    public boolean isMerchandiseRequired() {
        return merchandiseRequired;
    }

    public void setMerchandiseRequired(boolean merchandiseRequired) {
        this.merchandiseRequired = merchandiseRequired;
    }

    public double getmerchandiseCost() {
        return merchandiseCost;
    }

    public void setmerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }

    public double getMusicConcertEventCost() {
        return musicConcertEventCost;
    }

    public void setMusicConcertEventCost(double musicConcertEventCost) {
        this.musicConcertEventCost = musicConcertEventCost;
    }

    @Override
    public void calculateEventCost() {
         musicConcertEventCost = getEventCost() + (getmerchandiseCost() *  getTotalParticipants() * getTotalEventDays());
    }

  
    @Override
    public String toString() {
        return  "Event ID: " + getEventID() + "\n" +
                "Event Name: " + getEventName() + "\n" +
                "Event Location: " + getEventLocation() + "\n" +    
                "Total Participants: " + getTotalParticipants() + "\n" +
                "Total MusicConcert q Cost: " + musicConcertEventCost;
    }
}