public class BarkingDog {
    public static void  main(String[] args){
        boolean tf = true;
        int num = 1;

        if (shouldWakeup(tr, num) == true)
            System.out.println("this is true");
        else
            System.out.println("this is false");
    }
    
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (barking == false)
            return (false);

        if (hourOfDay >= 0 && hourOfDay <= 23){
            if (hourOfDay < 8)
                return (true);
            else if (hourOfDay > 22)
                return (true);
            else
                return (false);
        }
        else
            return (false);
    }
}

