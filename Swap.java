// import java.util.*;
public class Swap {
    static void swapValue(int m,int n) {
        m = m - n;
        n = m + n;
        m = n - m;
        System.out.println("Value of m is " + m + "\n Value of n is " + n);
    }

    public static void main(String[] args)
    {   int m=9, n=5;
        swapValue(m,n);
    }

}
