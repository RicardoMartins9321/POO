package aula05;
import java.util.Objects;
import java.util.Scanner;
import Utils.*;

public class DateYMD {
        public int year;
        public int month;
        public int day;
    
        public DateYMD(int day, int month, int year) {
            set(day, month, year);
        }
    
        public void set(int day, int month, int year) {
            if (!valid(day, month, year)) {
                throw new IllegalArgumentException("Invalid date");
            }
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public static boolean validMonth(int month) {
            return month >= 1 && month <= 12;
        }

        public static boolean leapYear(int year) {
            return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        }
        
        public static boolean valid(int day, int month, int year) {
            if (!validMonth(month)) {
                return false;
            }
            int maxDay = UserInput.getDaysInMonth(month, year);
            return day >= 1 && day <= maxDay && year >= 1;
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

        public int daysSinceStartOfYear() {
            int days = 0;
            for (int i = 1; i < month; i++) {
                days += UserInput.getDaysInMonth(year, i);
            }
            days += day - 1;
            return days;
        }
    
        public void increment() {
            int daysInMonth = UserInput.getDaysInMonth(month, year);
            if (day < daysInMonth) {
                day++;
            } else {
                day = 1;
                if (month == 12) {
                    month = 1;
                    year++;
                } else {
                    month++;
                }
            }
        }
    
        public void decrement() {
            if (day > 1) {
                day--;
            } else {
                if (month == 1) {
                    month = 12;
                    year--;
                } else {
                    month--;
                }
                day = UserInput.getDaysInMonth(month, year);
            }
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
            DateYMD other = (DateYMD) obj;
            return year == other.year && month == other.month && day == other.day;
        }

        @Override
        public int hashCode() {
            return Objects.hash(year, month, day);
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DateYMD date = new DateYMD(1, 1, 2000);
        int option = 0;

        do {
            System.out.println("Date operations:");
            System.out.println("1 - Create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - Exit");
            System.out.print("Option: ");
            option = input.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Enter day: ");
                    int day = input.nextInt();
                    System.out.print("Enter month: ");
                    int month = input.nextInt();
                    System.out.print("Enter year: ");
                    int year = input.nextInt();
                    try {
                        date.set(day, month, year);
                        System.out.println("Date set to " + date);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid date");
                    }
                    break;
                
                case 2:
                    System.out.println("Current date: " + date);
                    break;

                case 3:
                    date.increment();
                    System.out.println("Date incremented to " + date);
                    break;
                
                case 4:
                    date.decrement();
                    System.out.println("Date decremented to " + date);
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }

        } while (option != 0);

        input.close();
    }
}
