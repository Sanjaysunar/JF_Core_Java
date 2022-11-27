package jf_01basic;

import java.util.Scanner;

public class sum_of_n_num {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0;

        for (int i = 0; i <= n; i++){
            ans = ans + i;
        }
        System.out.println(ans);
    }
}
