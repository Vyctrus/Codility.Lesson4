package org.example;

import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int N,int[] A){
        int rememberMax=0;
        int[] result= new int[N];
        Arrays.fill(result,0);

        for(int i=0;i<A.length;i++){
            if(A[i]==N+1){
                result= maxCounter(result, rememberMax);
            }else{
                result[A[i]-1]++;   //-1 bcs data in array should be <1,N>
                rememberMax= (result[A[i]-1] >= rememberMax)? result[A[i]-1]: rememberMax;
            }
        }
        return result;
    }


    private int[] maxCounter(int[] result, int remMax){
        int[] temp= new int[result.length];
        for(int i=0;i<temp.length;i++){
            temp[i]= remMax;
        }
        return temp;
    }
}
