package com.codility.min.absolute;


class Solution { 
  
  boolean isZero(int number){
    boolean verify = number == 0 ? true: false;
    return verify;
  }

  boolean findZeroInList(int[] A){
    for(int i = 0; i < A .length; i++){
      if(isZero(A[i])){
        return true;
      }
    }
    return false;
  }

  int solution(int[] A){
   int size = A.length;
   int minAbsSlice = 10000;
   
   if(findZeroInList(A)){
     return 0;
   }


   for(int i=0; i < size; i++){
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
           if(isZero(minAbsSlice)){
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
