import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static final long BIG_NUM = 1_000_000_009;
    static HashMap<Integer, Long> memo = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(solve(sc.nextInt()));
    }
    
    public static long solve(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (memo.containsKey(n)) return memo.get(n);
        
        long retVal = solve(n - 8);
        retVal = (retVal + solve(n-7)) % BIG_NUM;
        retVal = (retVal + solve(n-6)) % BIG_NUM;
        retVal = (retVal + solve(n-3)) % BIG_NUM;
        retVal = (retVal + solve(n-2)) % BIG_NUM;
        
        memo.put(n, retVal);
        
        return retVal;
    }
} 
