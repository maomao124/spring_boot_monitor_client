package mao.spring_boot_monitor_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Project name(项目名称)：spring_boot_monitor_client
 * Package(包名): mao.spring_boot_monitor_client.controller
 * Class(类名): MyController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/12
 * Time(创建时间)： 18:23
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@RestController
public class MyController
{

    @GetMapping("/test")
    public String test()
    {
        return "OK";
    }

}
