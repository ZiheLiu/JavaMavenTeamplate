package com.ziheliu;

public class Add {
  private int num;

  /**
   * <code>Add</code> will store the first number.
   * And use <code>doAdd</code> to add the first number, and the second number.
   * @param num The first number.
   */
  public Add(int num) {
    this.num = num;
  }

  public int doAdd(int num2) {
    return this.num + num2;
  }

  public int getNum() {
    return num;
  }
}
