package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month== 1 ||month==3 || month == 5 || month == 12 || month == 10 || month == 7 || month == 8){
            System.out.println("January, March, May, July, August, October, December");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("April, June, September, November");
        } else if (month==2) {
            System.out.println("February");
        }
    }
}
