import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args){
        int a[][] = new int[6] [6];
        int max = -63;
        int sum = 0;
        
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<6; i++){
            for (int j=0; j<6; j++){
                a[i][j] = scan.nextInt();
                
            }
        }
        
        for (int i = 0; i <4;i++){
            for (int j=0;j<4; j++){
                sum = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] +a[i+2][j] + a[i+2][j+1] + a[i+2][j+2]; 
                max = Math.max(max, sum);
            }
            
        }
        System.out.println(max);
    }
}
