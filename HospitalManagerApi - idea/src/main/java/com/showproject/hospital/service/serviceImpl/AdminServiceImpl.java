package com.showproject.hospital.service.serviceImpl;

import com.showproject.hospital.mapper.AdminMapper;
import com.showproject.hospital.pojo.Admin;
import com.showproject.hospital.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    /**
     * 登录数据校验
     * */
    @Override
    public Admin login(int aId, String aPassword){
        Admin admin = this.adminMapper.selectById(aId);
        if (admin == null) {
            return null;
        } else {
            if ((admin.getAPassword()).equals(aPassword)) {
                return admin;
            }
        }
        return null;
    }



}
