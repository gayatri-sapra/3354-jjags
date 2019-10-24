public class Birthday {

    private int month;
    private int day;
    private int year;

    public Birthday(int month, int day, int year) {
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        String date = this.month + "-" + this.day + "-" + this.year;
        return date;
    }
}