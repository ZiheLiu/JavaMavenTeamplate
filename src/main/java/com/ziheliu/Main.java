package com.ziheliu;

public class Main {
  /**
   * The entry of project.
   * @param args String[].
   */
  public static void main(String[] args) {
    int num = 1;
    int num2 = 2;
    Add add = new Add(num);
    System.out.printf("%d + %d = %d", num, num2, add.doAdd(num2));
  }
}
