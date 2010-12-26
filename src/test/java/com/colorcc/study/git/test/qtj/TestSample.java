
package com.colorcc.study.git.test.qtj;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSample {
  
  private int count;
  private boolean isSample;

  @Before
  public void init() {
    count = 2;
    isSample = true;
  }
  
  @Test
  public void testIntValue() {
    Assert.assertEquals(count, 2);
  }
  
  public  void testBooleanValue() {
    Assert.assertTrue(isSample);
    
    isSample = false;
    Assert.assertFalse(isSample);
  }

}
