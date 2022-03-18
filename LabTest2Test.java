package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class LabTest2Test {

    @Test
    public void check_equilibrium() {
            LabTest2 x = new LabTest2();
            int[][] array1 = { {3, -1, 7}, {-5, 2, -4}, {2, -1, -3} };
            assertEquals("Yes",1,x.check_equilibrium(array1));
        }

        @Test
        public void check_equilibrium1(){
            LabTest2 y = new LabTest2();
            int[][] array2 = { {4, 1, 7}, {-2, 4, -1}, {1, -5, -3} };
            assertEquals("No..",0,y.check_equilibrium(array2));
    }
}