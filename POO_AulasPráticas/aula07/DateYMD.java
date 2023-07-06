package aula07;

import java.util.Random;

public class DateYMD extends Date {
    Random rand = new Random();

    public DateYMD(int year, int month, int day ) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    @Override
    public String toString() {
        return getYear() + "-" + getMonth() + "-" + getDay();
    }

    public void Increment(int increment) {
        for (int count = 1; count <= increment; count++) {
            if (getDay() + 1 > GetDays(getMonth(), getYear()) && getMonth() == 12) {
                setYear(getYear()+1);
                setMonth(1);
                setDay(1);
                count++;
            } else if (getMonth() != 12 && getDay() + 1 > GetDays(getMonth(), getYear())) {
                setDay(1);
                setMonth(getMonth()+1);
                count++;
            } else
                setDay(getDay()+1);
        }
    }

    public void Decrement(int decrement) {
        for (int count = 1; count <= decrement; count++) {
            if (getDay() - 1 <= 0 && getMonth() == 1) {
                setYear(getYear()-1);
                setMonth(12);
                setDay(GetDays(getMonth(), getYear()));
                count++;
            } else if (getMonth() != 1 && getDay() - 1 <= 0) {
                setDay(GetDays(getMonth() - 1, getYear()));
                setMonth(getMonth()-1);
                count++;
            } else
                setDay(getDay()-1);
        }
    }
}
