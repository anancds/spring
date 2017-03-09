/*
 * @ProjectName: MDP
 * @Copyright: 2017 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017/2/23 16:36
 * @Description: 本内容仅限于杭州海康威视数字技术股份有限公司内部使用，禁止转发.
 */
package com.cds.learn;

import java.math.BigDecimal;

/**
 * <p></p>
 * author chendongsheng5 2017/2/23 16:36
 * version V1.0
 * modificationHistory =========================逻辑或功能性重大变更记录
 * modify by user: chendongsheng5 2017/2/23 16:36
 * modify by reason:{方法名}:{原因}
 */
public class Main {

  public static String captureName(String name) {
//        name = name.substring(0, 1).toUpperCase() + name.substring(1);
//        return  name;
    char[] cs = name.toCharArray();
    cs[0] -= 32;
    return String.valueOf(cs);

  }

  public static void main(String[] args) {

    test.a = 2;

    Test1.printb();

    System.out.println(captureName(" "));

  }

}
