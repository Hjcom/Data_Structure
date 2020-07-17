package com.Linear_List;
// 분기별 판매량 선형 리스트 구현 (1차원 배열)

public class One_Dimensional_Array {
    public static void main(String[] args) {
        int i;      // 반복 제어 변수
        int [] sale = {157, 209, 251, 312};

        for (i = 0; i<4; i++){
            System.out.println("sale[" + i + "] : " + sale[i]);
        }
    }
}
