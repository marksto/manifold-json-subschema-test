package abc;

import abc.res.*;
import abc.res.sub.*;

public class RunMe {
  public static void main(String[] args) {
    // NOTE: See "$comment" in 'Test1.json'.
    test1_1();
    test1_2();

    // NOTE: See "$comment" in 'Test2.json'.
    test2_1();
    test2_2();
  }

  private static void test1_1() {
    Test1 test = Test1.create();
    System.out.println(test.write().toJson());
  }

  private static void test1_2() {
    Test1 test = Test1.create();
    System.out.println(test.getSubTest().write().toJson());
  }

  private static void test2_1() {
    Test2 test = Test2.create();
    System.out.println(test.write().toJson());
  }
  private static void test2_2() {
    SubTest2 subtest = SubTest2.create();
    System.out.println(subtest.getTest2().write().toJson());
  }
}
