package org.example;

import java.util.Arrays;

public class FrogRiverOne {
    public int solution(int X,int[] A){

        int[] leavesFirstTime=new int[X];
        Arrays.fill(leavesFirstTime, -1);
        for(int i=0;i<A.length;i++){
            if(leavesFirstTime[A[i]-1]==-1){
                leavesFirstTime[A[i]-1]=i;
            }
        }
        //System.out.println(Arrays.toString(leavesFirstTime));
        int minTimeNeeded=-1;
        for(int i=0;i< leavesFirstTime.length;i++){
            if(leavesFirstTime[i]==-1){
                return -1; //any leaf didnt appear in this place
            }
            minTimeNeeded=(leavesFirstTime[i]>minTimeNeeded)? leavesFirstTime[i] : minTimeNeeded;
        }
        return minTimeNeeded;
    }

    //Theory
    //do kazdego potrzebnego liscia przypisz pierwsze wystapienie
    //wyznacz max z tablicy do ktorej przypisuje tzn wystapienie ostatniego liscia,
    //pamietaj o tym ze moga sie nie pojawic wsyzstkie
}
