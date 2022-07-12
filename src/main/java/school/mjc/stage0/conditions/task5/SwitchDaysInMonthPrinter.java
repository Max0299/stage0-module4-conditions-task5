package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {

        switch (month){
            case (1), (3), (5), (7), (8), (10), (12) -> System.out.println("number is between 1 and 5");
            case (4), (6), (9), (11) -> System.out.println("number is between 6 and 10");
            default -> System.out.println("28");
        }
    }
}
