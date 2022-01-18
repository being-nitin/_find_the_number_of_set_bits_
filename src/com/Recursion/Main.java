package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Number of set bits means count the number of '1' in this.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count=0;
    while (n>0){
        if((n&1)==1){
            count++;
        }
        n = n>>1;
    }
        System.out.println(count);
    }
}
