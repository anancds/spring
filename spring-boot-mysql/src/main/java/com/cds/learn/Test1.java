/*
 * @ProjectName: MDP
 * @Copyright: 2017 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/2/23 16:40
 * @Description: 本内容仅限于杭州海康威视数字技术股份有限公司内部使用，禁止转发.
 */
package com.cds.learn;

/**
 * <p></p>
 * author chendongsheng5 2017/2/23 16:40
 * version V1.0
 * modificationHistory =========================逻辑或功能性重大变更记录
 * modify by user: chendongsheng5 2017/2/23 16:40
 * modify by reason:{方法名}:{原因}
 */
public class Test1 {

  private static int b = 0;
  static {
    b = test.a;
  }

  public static void printb() {
    System.out.println(b);
    System.out.println(Test1.class.getSimpleName());
    System.out.println(Boolean.parseBoolean("true") == true);
  }

}
