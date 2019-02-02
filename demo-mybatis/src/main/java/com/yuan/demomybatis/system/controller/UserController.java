package com.yuan.demomybatis.system.controller;

import com.yuan.demomybatis.commons.controller.BaseController;
import com.yuan.demomybatis.system.dto.SysUserDto;
import com.yuan.demomybatis.system.pojo.SysUser;
import com.yuan.demomybatis.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController extends BaseController {
    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("index")
    @ResponseBody
    public DeferredResult index() {
        return result("user/index");
    }

    @RequestMapping("data")
    public DeferredResult data(SysUserDto dto) {
        return result(userService.findAllByDtoPage(dto));
    }

    @RequestMapping("add")
    public DeferredResult add() {
        return result("user/add");
    }

    @RequestMapping("edit")
    public DeferredResult edit(String id) {
        Map<String, Object> map = new HashMap<>();
        map.put("user", userService.get(id));
        return result("user/edit", map);
    }

    @SuppressWarnings("ConstantConditions")
    @RequestMapping("insert")
    @ResponseBody
    public DeferredResult insert(@RequestBody @Valid SysUser user, BindingResult result) {
        if (result.hasErrors()) {
            return result(result.getFieldError().getDefaultMessage());
        } else if (userService.check(user) > 0) {
            return result("此用户已存在");
        } else {
            return result(userService.insert(user) > 0);
        }
    }

    @SuppressWarnings("ConstantConditions")
    @RequestMapping("update")
    @ResponseBody
    public DeferredResult update(@RequestBody @Valid SysUser user, BindingResult result) {
        if (result.hasErrors()) {
            return result(result.getFieldError().getDefaultMessage());
        } else {
            return result(userService.update(user) > 0);
        }
    }

    @RequestMapping("count")
    @ResponseBody
    public DeferredResult count(SysUser user) {
        return result(userService.count(user));
    }

    @RequestMapping("delete")
    @ResponseBody
    public DeferredResult delete(String id) {
        return result(userService.delete(id.split(",")) > 0);
    }


    @RequestMapping("get")
    @ResponseBody
    public DeferredResult get(SysUser user) {
        return result(userService.get(user));
    }

    @RequestMapping("list")
    @ResponseBody
    public DeferredResult list(SysUser user) {
        return result(userService.selectList(user));
    }


}
