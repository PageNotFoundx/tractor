package issue.issue10;

/*
 * Creates on 2019/11/13.
 */

import com.alibaba.fastjson.JSONObject;
import org.jiakesimk.minipika.framework.utils.Methods;

/**
 * @author lts
 */
public class MethodTest {

  public static void main(String[] args) {
    String[] names = Methods.getMethodVariableName("issue.issue10.MethodTest", "test");
    System.out.println(JSONObject.toJSONString(names));
  }

  public String test(String a, String b, Object user) {
    return "hello";
  }

  public static String test2(String a, String b, Object user) {
    return "hello";
  }

  public static String test3(String p1, String p2, Object user) {
    return "hello";
  }

}
