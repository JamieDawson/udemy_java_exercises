public class PlayingCat {
    public static void  main(String[] args){
        boolean summer = true;
        int temperature = 10;
        isCatPlaying(summer, temperature);
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer == true){
            if (temperature >= 25 && temperature <= 45)
                return (true);
            return (false);
        }
        if (summer == false){
            if (temperature >= 25 && temperature <= 35)
                return (true);
            return (false);
        }
        return (false);
    }
}
