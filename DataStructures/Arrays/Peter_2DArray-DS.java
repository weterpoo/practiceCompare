import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[6][6];
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                grid[j][i] = sc.nextInt();
            }
        }
        int max = 0;
        int sum = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                sum = grid[j][i] + grid[j+1][i] + grid[j+2][i] + grid[j+1][i+1] + grid[j][i+2] + grid[j+1][i+2] + grid[j+2][i+2];
                if(sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}