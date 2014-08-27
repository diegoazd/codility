package com.codility.min.absolute;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.Assert.*;

public class SolutionTest {

  @Test  
  public void shouldGetResult(){
    Solution solution = new Solution();
    int [] A = {2,-4,6,-3,9};
    int res = solution.solution(A);    
    org.junit.Assert.assertEquals(res, 1);
  }
}
