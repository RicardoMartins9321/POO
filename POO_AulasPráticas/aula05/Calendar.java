package aula05;
import java.util.Scanner;
import Utils.UserInput;
import java.util.Arrays;

public class Calendar {
    public int year;
    public int firstWeekdayOfYear;
    private int[][] events;
    
    public Calendar(int year, int firstWeekdayOfYear) {
        this.year = year;
        this.firstWeekdayOfYear = firstWeekdayOfYear;
        this.events = new int[12][];
        for (int month = 0; month < 12; month++) {
            this.events[month] = new int[UserInput.getDaysInMonth(month + 1, year)];
            Arrays.fill(this.events[month], 0);
        }

    }

    public int year() {
        return this.year;
    }

    public int firstWeekdayOfYear() {
        return this.firstWeekdayOfYear;
    }

    public int firstWeekdayOfMonth(int month) {
        int firstDay = firstWeekdayOfYear;
        int daysPassed = 0;

        for (int i = 1; i < month; i++) {
            daysPassed += UserInput.getDaysInMonth(i, year);
        }
        return (firstDay + daysPassed - 1) % 7 + 1;
    }
    

    public void addEvent(DateYMD date) {
        if (date.getYear() == year) {
            events[date.getMonth() - 1][date.getDay() - 1] += 1;
        }
    }

    public void removeEvent(DateYMD date) {
        if (date.getYear() != this.year) {
            throw new IllegalArgumentException("Invalid year for calendar");
        }
        events[date.getMonth() - 1][date.getDay() - 1] -= 1;
    }

    public String printMonth(int month) {
        StringBuilder sb = new StringBuilder();

        
        System.out.println("\t" + UserInput.getMonthName(month) + " " + year);
        sb.append(" \tSu\tMo\tTu\tWe\tTh\tFr\tSa\n");
        int monthDays = UserInput.getDaysInMonth(month, year);
        int firstDay = firstWeekdayOfMonth(month);

        if (month == 1) {
            if(firstDay != 1) {
                for (int i = 1; i < firstDay; i++) {
                    sb.append("\t");
                }
            }
            // Print days of the month
            for (int day = 1; day <= monthDays; day++) {
                sb.append("\t");
                sb.append(day);
                if ((firstDay + day-1) % 7 == 0) {
                    sb.append("\n");
                }
            }
        }
        else {
            // Print leading spaces for first week
            if(firstDay != 7) {
                for (int i = 0; i < firstDay; i++) {
                    sb.append("\t");

                }
            }
            // Print days of the month
            for (int day = 1; day <= monthDays; day++) {
                sb.append("\t");
                sb.append(day);
                if ((firstDay + day) % 7 == 0) {
                    sb.append("\n");
                }
            }
        }
        
        // Print final newline if necessary
        if ((firstDay + monthDays) % 7 != 0) {
            sb.append("\n");
        }

        sb.append("\n");
        return sb.toString();

    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n\n");
        for (int i = 1; i <= 12; i++) {
            sb.append("Month: ");
            sb.append(UserInput.getMonthName(i));
            sb.append(" ");
            sb.append(year);
            sb.append("\n");
            sb.append(printMonth(i));
        }
        return sb.toString();
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calendar calendar = null;
        
        int choice;
        do {
            System.out.println("Calendar operations:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("4 - add event");
            System.out.println("5 - remove event");
            System.out.println("0 - exit");
            System.out.print("Option: ");
            
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                int year, month, dayOfWeek, day;
                do {
                    System.out.print("Enter a year: ");
                    year = input.nextInt();
                } while (year <= 0);
                
                do {
                    System.out.print("Enter day of the week (1-7): ");
                    dayOfWeek = input.nextInt();
                } while(dayOfWeek < 1 || dayOfWeek > 7);
                    
                    calendar = new Calendar(year, dayOfWeek);
                    System.out.println("Calendar created.");
                    break;
                case 2:
                    if (calendar == null) {
                        System.out.println("Calendar not created yet.");
                        break;
                    }
                    do {
                        System.out.print("Enter a month (1-12): ");
                        month = input.nextInt();
                    } while (month < 1 || month > 12);
            
                    System.out.println(calendar.printMonth(month));
                    break;
                case 3:
                    if (calendar == null) {
                        System.out.println("Calendar not created yet.");
                        break;
                    }
                    System.out.println(calendar.toString());
                    break;
                case 4:
                    do {
                        System.out.print("Enter a year: ");
                        year = input.nextInt();
                    } while (year <= 0);
                    do {
                        System.out.print("Enter a month (1-12): ");
                        month = input.nextInt();
                    } while (month < 1 || month > 12);
                    do {
                        System.out.print("Enter a day: ");
                        day = input.nextInt();
                    } while(day < 1 || day > UserInput.getDaysInMonth(month, year));
                    

                    DateYMD date = new DateYMD(day, month, year);
                    
                    if (calendar == null) {
                        System.out.println("Calendar not created yet.");
                    } else {
                        calendar.addEvent(date);
                        System.out.println("Event added to the calendar.");
                    }
                    System.out.println("Event added!");
                    break;
                case 5:
                    
                    do {
                        System.out.print("Enter a year: ");
                        year = input.nextInt();
                    } while (year <= 0);
                    do {
                        System.out.print("Enter a month (1-12): ");
                        month = input.nextInt();
                    } while (month < 1 || month > 12);
                    do {
                        System.out.print("Enter a day");
                        day = input.nextInt();
                    } while(day < 1 || day > UserInput.getDaysInMonth(month, year));

                    date = new DateYMD(day, month, year);

                    if (calendar == null) {
                        System.out.println("Calendar not created yet.");
                    } else {
                        calendar.removeEvent(date);
                        System.out.println("Event removed from the calendar.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            
        } while (choice != 0);
        
        input.close();
    }
}
