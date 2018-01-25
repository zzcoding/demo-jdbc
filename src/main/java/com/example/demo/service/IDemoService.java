package com.example.demo.service;

import com.example.demo.entity.TbCompidEntity;
import com.example.demo.entity.TbCompidEntityPK;
import com.example.demo.entity.TbResourceEntity;
import com.example.demo.entity.TbRoleEntity;

import java.util.List;
import java.util.Map;

/**
 * com.example.demo.service
 *
 * @author zhaoguang
 * @date 2018/1/11 15:35
 * @description
 */
public interface IDemoService {

    public List<Map<String, Object>> getResources(String username);

    public List<TbResourceEntity> getResourcesEntity();

    TbResourceEntity getResourcesEntityById(int id);

    //用主键获取表映射的实体
    TbCompidEntity getTbCompidEntityById(TbCompidEntityPK id);

    List<Map<String, Object>> getResourcesEntityWithoutSelfNameSpace();

    void updateUser();

    TbRoleEntity saveRole(TbRoleEntity roleEntity);
}
