package aula07;

import java.util.Random;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateND extends Date {
    int datenow;
    long datend;
    Random rand = new Random();

    public DateND(int year, int month, int day) {
        LocalDate setdate = LocalDate.of(2000, 1, 1);
        LocalDate datenow = LocalDate.of(year, month, day);
        long datend = ChronoUnit.DAYS.between(setdate, datenow);
        this.datend = datend;
    }

    @Override
    public String toString() {
        return " " + Math.abs(datend) + " days";
    }

    public void Increment(int increment) {
        datend = datend + increment;
    }

    public void Decrement(int decrement) {
        datend = datend - decrement;
    }
}
