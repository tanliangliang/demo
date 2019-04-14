package com.tanl.demo.controller;

import com.tanl.demo.service.AddressService;
import com.tanl.demo.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 七月.2019-04-14 15:39
 */
@RestController
@Api(tags="测试接口")
public class AddressController {
    @Autowired
    public AddressService addressService;

    @GetMapping("/test")
    @ApiOperation("测试")
    @ResponseBody
    public R t(){
        return R.ok("测试一下");
    }


}
