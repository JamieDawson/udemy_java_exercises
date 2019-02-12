public class LeapYear {
    public static void  main(String[] args){
        int year = 2000;
        if (isLeapYear(year) == true)
            System.out.println("this is true");
        else
            System.out.println("this is false");
    }

    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if (year % 4 == 0){
                if (year % 100 == 0) {
                    if (year % 1000 == 0) {
                        return (true);
                    }
                }
            }
        }
        return (false);
    }
}

/*
 returns true or false if year provided is leap year.

 */
