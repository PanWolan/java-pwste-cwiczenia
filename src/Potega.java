import java.io.*;
public class Potega
{
    public static long potega(int a, int n)
    {
        if(n == 0) return 1;
        else return a * potega(a,n-1);
    }
}
