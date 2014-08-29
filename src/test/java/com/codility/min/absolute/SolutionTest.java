package com.codility.min.absolute;

import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  @Test  
  public void shouldGetResult(){
    Solution solution = new Solution();
    int [] A = {2,-4,6,-3,9};
    int res = solution.solution(A);    
    org.junit.Assert.assertEquals(res, 1);
  }

  @Test
  public void shouldPassWithOneResult(){
    Solution solution = new Solution();
    int[] A = {2};
    int res = solution.solution(A);
    assertEquals(res,2);
  }

  @Test
  public void shouldPassWithWorstCaseIsZero(){
  int[] A = new int[100000];
  for(int i = 0; i < A.length; i++){
    A[i] = 2;
  }
  A[99999] = 0;
  Solution solution = new Solution();
  int res = solution.solution(A);
  assertEquals(res,0);
  }
  
  @Test
  public void shouldPassWithWorstCase(){
  int[] A = new int[100000];
  for(int i = 0; i < A.length; i++){
    A[i] = 2;
  }
  A[99999] = 1;
  Solution solution = new Solution();
  int res = solution.solution(A);
  assertEquals(res,0);
  }
}
