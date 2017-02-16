package com.cds.learn.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 * author chendongsheng5 2017/2/16 15:48
 * version V1.0
 * modificationHistory =========================逻辑或功能性重大变更记录
 * modify by user: chendongsheng5 2017/2/16 15:48
 * modify by reason:{方法名}:{原因}
 */
@RestController
@RequestMapping(value = "/phone")
public class PhoneController {

  @RequestMapping
  public String index() {
    return "Hello World!";
  }

  @RequestMapping(value = "/getmap")
  public Map<String, String> getMap() {
    Map<String, String> phoneMap = new HashMap<String, String>();
    phoneMap.put("name", "apple phone");
    phoneMap.put("money", "5000");
    return phoneMap;
  }
}
