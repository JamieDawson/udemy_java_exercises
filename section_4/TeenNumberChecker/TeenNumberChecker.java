public class TeenNumberChecker {
    public static void  main(String[] args){
        int one = 20;
        if (isTeen(one) == true)
            System.out.println("this is true");
        else
            System.out.println("this is false");
    }

    public static boolean hasTeen(int one, int two, int three)
    {
        if (one >= 13 && one <= 19)
            return (true);
        else if (two >= 13 && two <= 19)
            return (true);
        else if (three >= 13 && three <= 19)
            return (true);
        else
            return (false);
    }
    public static boolean isTeen(int one)
    {
        if (one >= 13 && one <= 19)
            return (true);
        else
            return (false);
    }
}

