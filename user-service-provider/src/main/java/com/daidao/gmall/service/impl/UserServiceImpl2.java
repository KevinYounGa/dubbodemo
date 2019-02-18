package com.daidao.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.daidao.gmall.bean.UserAddress;
import com.daidao.gmall.service.UserService;

public class UserServiceImpl2 implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.....new...");
        UserAddress address1 = new UserAddress(1, "北京市通州区科技园综合楼3层", "1", "mimi", "010-678566543", "Y");
        UserAddress address2 = new UserAddress(2, "广州市广州大厦B座3层）", "1", "mama", "010-9764333", "N");

        return Arrays.asList(address1, address2);
    }

}
