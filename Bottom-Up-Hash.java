import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(solve(sc.nextInt()));
    }
    
    static final long BIG_NUM = 1_000_000_009;
    public static long solve(int n) {
        int[] bricks = {2,3,6,7,8};

        HashMap<Integer, Long> memo = new HashMap<>();
        memo.put(0, 1L);
        for (int i = 1; i <= n; i++) {
            long retVal = 0;
            for (int brick: bricks) {
                if (i - brick >= 0) {
                    retVal = (retVal + memo.get(i - brick)) % BIG_NUM;
                }
            }
            memo.put(i, retVal);
        }
        return memo.get(n);
    }
}  
