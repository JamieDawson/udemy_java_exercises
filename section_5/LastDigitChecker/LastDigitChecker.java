public class LastDigitChecker {
    static public boolean  isValid(int num) {
        if (num >= 10 && num <= 1000)
            return (true);
        else
            return (false);
    }
    static public boolean   hasSameLastDigit(int a, int b, int c){
        if ((isValid(a) == false) || (isValid(b) == false) || (isValid(c) == false))
            return (false);

        if (a >= 10)
            a = a % 10;
        if (b >= 10)
            b = b % 10;
        if (c >= 10)
            c = c % 10;
		//test prints for outputs.
       // System.out.println(a);
       // System.out.println(b);
       // System.out.println(c);
        if (a == b || a == c || b == c)
            return (true);
        else
            return (false);
    }
}

/*
Find the last digit of every number and see if two of them match. 
Example:  20 30 44 == true because 0 and 0 is found in 20 and 30.
Example:  11 22 33 == false because 1, 2, and 3 do not match.

must be between 10 and 1000.

*/
