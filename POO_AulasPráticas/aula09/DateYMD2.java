package aula09;

public class DateYMD2 implements Comparable<DateYMD2> {
    private int year;
    private int month;
    private int day;

    public DateYMD2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public int compareTo(DateYMD2 other) {
        if (this.year < other.year) {
            return -1;
        } else if (this.year > other.year) {
            return 1;
        } else {
            if (this.month < other.month) {
                return -1;
            } else if (this.month > other.month) {
                return 1;
            } else {
                if (this.day < other.day) {
                    return -1;
                } else if (this.day > other.day) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }
}
