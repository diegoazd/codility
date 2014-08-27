package com.codility.min.absolute;

class Solution {

  int solution(int[] A){
   int size = A.length;
   int minAbsSlice = 10000;
   for(int i=0; i < size; i++){
     if(A[i] == 0){
       return 0;
     }
     int limit = i;
     int looping = i;
     boolean flag = true;   
     int sumAbsSlice = 0;
     while(flag){
       sumAbsSlice += A[looping];      
       looping++;
       if(looping > limit ){
         if(Math.abs(sumAbsSlice) < minAbsSlice){
           minAbsSlice = Math.abs(sumAbsSlice);
           System.out.println(minAbsSlice);
           if(minAbsSlice == 0){
             return minAbsSlice;
            }
         }
         sumAbsSlice = 0;  
         limit++;
         looping = i;
         if(limit >= size){
           flag = false;  
         }
       }
           
     }
   }   
   return minAbsSlice;
  }
}
