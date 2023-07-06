package aula07;

public abstract class Date {
    private int year = 0, month = 0, day = 0;
    public abstract void Increment(int increment);

    public abstract void Decrement(int decrement);

    public static boolean ValidDate(int day, int month, int year) {
        if (ValidMonth(month) && day < GetDays(month, year) && year > 0)
            return true;
        else
            return false;
    }

    public static boolean ValidMonth(int month) {
        if (month <= 0 || month > 12)
            return true;
        else
            return false;
    }

    public static int GetDays(int month, int year) {
        int days;
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            days = 31;
        }
        return days;
    }

    public static boolean LeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else
            return false;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
}
