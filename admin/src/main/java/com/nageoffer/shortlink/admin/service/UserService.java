package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
import com.nageoffer.shortlink.admin.dto.resp.UserActualRespDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import com.nageoffer.shortlink.admin.dto.resq.UserLoginReqDTO;
import com.nageoffer.shortlink.admin.dto.resq.UserRegisterReqDTO;
import com.nageoffer.shortlink.admin.dto.resq.UserUpdateReqDTO;

public interface UserService extends IService<UserDO> {
    UserRespDTO getUserByUserName(String username);

    UserActualRespDTO getActualUserByUsername(String username);

    Boolean hasUserName(String username);

    void register(UserRegisterReqDTO requestParam);

    void update(UserUpdateReqDTO requestParam);

    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    Boolean checkLogin(String username, String token);

    void logout(String username, String token);
}
