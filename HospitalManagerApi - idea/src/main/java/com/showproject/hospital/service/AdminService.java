package com.showproject.hospital.service;

import com.showproject.hospital.pojo.Admin;

public interface AdminService {
    /**
     * 登录数据校验
     * */
    Admin login(int aId, String aPassword);
}
