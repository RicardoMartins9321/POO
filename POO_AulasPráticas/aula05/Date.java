package aula05;

import java.util.Objects;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDate(day, month, year);
    }

    public void setDate(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            throw new IllegalArgumentException("Invalid date");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Date other = (Date) obj;
        return year == other.year && month == other.month && day == other.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
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

    public static boolean isValidDate(int day, int month, int year) {
        return (day >= 1 && day <= getDaysInMonth(month, year)) && (month >= 1 && month <= 12) && (year > 0);
    }
    
    public static Date incrementDate(Date date) {
        int daysInMonth = getDaysInMonth(date.month, date.year);
        
        if (date.day < daysInMonth) {
            date.day++;
        } else {
            date.day = 1;
            if (date.month == 12) {
                date.month = 1;
                date.year++;
            } else {
                date.month++;
            }
        }
        return date;
    } 
        
    public static Date decrementDate(Date date) {
        if (date.day > 1) {
            date.day--;
        } else {
            if (date.month == 1) {
                date.month = 12;
                date.year--;
            } else {
                date.month--;
            }
            date.day = getDaysInMonth(date.month, date.year);
        }
        return date;
    }

    public static void showDate(Date date) {
        System.out.println(date.toString());
    }

}
