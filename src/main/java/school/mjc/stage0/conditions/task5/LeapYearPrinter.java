package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
            boolean leap = false;
            switch (year % 4) {
                case 0:
                    switch (year % 100) {
                        case 0:
                            leap = year % 400 == 0;
                            break;
                        default:
                            leap = true;
                            break;
                    }
                    break;
                default:
                    leap = false;
                    break;
            }
            System.out.println(leap ? "leap" : "not leap");
        }
    }

