package com.multi.b_app01;

public class ex07 {
    public static void main(String[] args) {
        int[] num = {55, 11, 22, 99, 33};
        int min = num[0];
        for(int i=0; i<num.length; i++){
            if(num[i]<min){  //배열중 최소값찾기
                min = num[i];
            }
        }
        System.out.println(min);
        for(int i=0; i<num.length; i++){
            if(num[i]==min){  //최소값의 index값 찾기(몇번째인지)
                System.out.println(i + "번째");
            }
        }
    }
}
//int[] num = {1,2,0,4,3};
//Arrays.sort(num); 오름차순 메소드  {0,1,2,3,4)
//num[0]; 최소값                -->0
//num[(num.length)-1]; 최대값  -->4
