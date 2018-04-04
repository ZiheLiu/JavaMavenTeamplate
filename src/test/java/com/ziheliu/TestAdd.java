package com.ziheliu;

import org.junit.Assert;
import org.junit.Test;

public class TestAdd {
  @Test
  public void testConstructorWithNum() {
    int num = 1;
    Add add = new Add(num);
    Assert.assertEquals(num, add.getNum());
  }

  @Test
  public void testDoAdd() {
    int num = 1;
    int num2 = 2;
    Add add = new Add(num);
    Assert.assertEquals(num + num2, add.doAdd(num2));
  }
}
