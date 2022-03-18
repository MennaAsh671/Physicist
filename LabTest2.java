package com.company;

public class LabTest2 {


        public static int check_equilibrium(int[][] arr1) {
            int[] arr2 = new int[3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int x = arr1[i][j];
                    arr2[j] += x;
                }
            }

            if (arr2[0] == 0 && arr2[1] == 0 && arr2[2] == 0) {
                System.out.println("Yes");
                return 1;
            }
            else {
                System.out.println("No.....");
                return 0;
            }
        }
    }
