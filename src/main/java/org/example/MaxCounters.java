package org.example;

import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int N,int[] A){
        int rememberMax=0;
        int[] result= new int[A.length];
        Arrays.fill(result,0);
        for(int i=0;i<A.length;i++){
            if(A[i]==A.length){
                A= maxCounter(A, rememberMax);
            }else{
                result[A[i]-1]++;   //-1 bcs data in array should be <1,N>
                rememberMax= (result[A[i]-1] >= rememberMax)? result[A[i]-1]: rememberMax;
            }
        }
        return new int[]{-1};
    }


    private int[] maxCounter(int[] A, int remMax){
        int[] temp= new int[A.length];
        for(int i=0;i<A.length;i++){
            temp[i]= remMax;
        }
        return temp;
    }
}
