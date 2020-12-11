package lt.sdacademy.fundamentals.control_flow.statements;

public class LogicalStatements {
    public static void main(String[] args) {
        boolean todaySunday = true;

        if (todaySunday == true) {
            System.out.println("Today is Sunday");
        } else {
            System.out.println("Today is not Sunday");
        }

        String weekDay = "Friday";
        switch (weekDay) {
            case ("Monday"): {
                System.out.println("I hate Monday");
                break;
            }
            case ("Tuesday"): {
                System.out.println(2);
                break;
            }
            case ("Wednesday"): {
                System.out.println("Middle of the week");
                break;
            }
            case ("Friday"): {
                System.out.println("Party day!");
                break;
            }
            case ("Saturday"): {
                System.out.println("Let's go to SDA");
                break;
            }
            case ("Sunday"): {
                System.out.println("End of the week");
                break;
            }
        }

        String[] weekDays = new String[7];
        weekDays[0] = "Monday";
        weekDays[1] = "Tuesday";
        weekDays[2] = "Friday";

        for (int i = 0; i < weekDays.length; i = i + 1) {
            try {
                String day = weekDays[i];
                switch (day) {
                    case ("Monday"): {
                        System.out.println("I hate Monday");
                        break;
                    }
                    case ("Tuesday"): {
                        System.out.println(2);
                        break;
                    }
                    case ("Wednesday"): {
                        System.out.println("Middle of the week");
                        break;
                    }
                    case ("Friday"): {
                        System.out.println("Party day!");
                        break;
                    }
                    case ("Saturday"): {
                        System.out.println("Let's go to SDA");
                        break;
                    }
                    case ("Sunday"): {
                        System.out.println("End of the week");
                        break;
                    }
                }
            } catch (NullPointerException e) {
                System.out.println("ERROR !");
            }
        }
    }
}
