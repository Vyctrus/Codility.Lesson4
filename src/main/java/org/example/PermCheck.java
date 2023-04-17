package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class PermCheck {
    public int solution(int[] A){
        Boolean[] numberOccured=new Boolean[A.length];
        for(int i=0;i<A.length;i++){
            if(A[i]-1 <0 || A[i]-1 >= A.length){
                return 0;
            }
            numberOccured[A[i]-1]=true;
        }
        return (Arrays.stream(numberOccured).anyMatch(v-> v==false))? 0: 1;
    }
}
