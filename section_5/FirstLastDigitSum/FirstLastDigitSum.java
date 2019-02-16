public class FirstLastDigitSum {
    public static void main(String[] args){
        int num = 9;
        sumFirstAndLastDigit(num);
    }

    public static int sumFirstAndLastDigit(int number){
        int first = 0;
        int backup = number;
        if (number < 0)
            return (-1);
        if (number == 0)
            return (0);
        if (number >= 0 && number <= 9){
            return(number + number);
        }
        if (number >= 10){
            while (backup >= 10)
                backup /= 10;
            first = backup;
            int last = number % 10;
            return (first + last);
        }
        return (0);
    }
}
