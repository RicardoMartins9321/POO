package aula13;

import java.time.LocalDate;

public class RainfallInfo {
   private LocalDate date;
   private String location;
   private double rainfall;

   public RainfallInfo(LocalDate date, String location, double rainfall) {
      this.date = date;
      this.location = location;
      this.rainfall = rainfall;
   }

   public LocalDate date() { return date; }
   public String location() { return location; }
   public double rainfall() { return rainfall; }


@Override
public String toString() {
   return "RainfallInfo [date=" + date + ", location=" + location + ", rainfall=" + rainfall + "]";

}

@Override
   public int hashCode() {
      return date.hashCode() | location.hashCode() | Double.hashCode(rainfall);
   }
}
