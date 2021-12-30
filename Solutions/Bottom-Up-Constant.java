import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

/*Idea: I really only need to store the previous 8 values and have a spot to store the next value. In the approach below, I use a circular array of size 10. 
When attempting to store a value in index x in the large array of the previous solution, I simply use the index at x mod 10.*/
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(solve(sc.nextInt()));
    }
    
    static final long BIG_NUM = 1_000_000_009;
    public static long solve(int n) {
        int[] bricks = {2,3,6,7,8};

        long[] memo = new long[10];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) {
            long retVal = 0;
            for (int brick: bricks) {
                if (i - brick >= 0) {
                    retVal = (retVal + memo[(i-brick) % 10]) % BIG_NUM;
                }
            }
            memo[i % 10] = retVal;
        }
        return memo[n % 10];
    }
}  
