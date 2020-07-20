package com.Linear_List;
// 2차원 배열 선형리스트로 구현

public class Two_Dimensional_Array {
    public static void main(String[] args) {
        int [][] sale = {
                {63, 84, 140, 130},
                {157, 209, 251, 312}
        };

        for (int row=0; row<2; row++){
            for (int col=0; col<4; col++)
                System.out.print(" sale [" + row + "][" + col + "] = " + sale[row][col]);
            System.out.println();
        }
    }
}

