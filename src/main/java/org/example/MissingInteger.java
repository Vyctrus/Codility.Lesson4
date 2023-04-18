package org.example;

import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] A){
        Boolean[] doesOccured=new Boolean[100000];
        Arrays.fill(doesOccured,false);
        Arrays.stream(A).forEach(v->{
            if(v>=0){
                doesOccured[v]=true;
            }
        });

        for(int i=1;i<doesOccured.length;i++){
             if(doesOccured[i]==false){
                 return i;
             }
        }
        return -1;
    }
}
