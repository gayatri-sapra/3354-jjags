public class Event {
    private int startTime;
    private int endTime;
    private String date;
    private String name;
    private String location;
    private String details;
    // private Color color;
    private String recurrence;

    public Event(int startTime, int endTime, String date, String name, String location,
                 String details, /**Color color, */String recurrence) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.name = name;
        this.location = location;
        this.details = details;
        //this.color = color;
        this.recurrence = recurrence;
    }

    public int getStartTime() {
        return startTime;
    }

    public String getName() {
        return name;
    }

    /**public Color getColor() {
        return color;
    }*/

    public int getEndTime() {
        return endTime;
    }

    public String getDate() {
        return date;
    }

    public String getDetails() {
        return details;
    }

    public String getLocation() {
        return location;
    }

    public String getRecurrence() {
        return recurrence;
    }

    /**public void setColor(Color color) {
        this.color = color;
    }*/

    public void setDate(String date) {
        this.date = date;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }
}