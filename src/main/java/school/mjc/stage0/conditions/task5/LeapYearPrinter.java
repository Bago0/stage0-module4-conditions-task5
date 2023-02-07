package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
            boolean tr = false;
            switch (year % 4) {
                case 0:
                    switch (year % 100) {
                        case 0:
                            tr = (year % 400 == 0);
                            break;
                        default:
                            tr = true;
                            break;
                    }
                    break;
                default:
                    tr = false;
                    break;
            }
            System.out.println(tr ? "leap" : "not leap");
        }
    }

