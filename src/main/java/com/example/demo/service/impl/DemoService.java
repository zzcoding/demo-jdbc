package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.service.IDemoService;
import com.jmapper.core.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * com.example.demo.service.impl
 *
 * @author zhaoguang
 * @date 2018/1/11 15:36
 * @description
 */

@Service
public class DemoService implements IDemoService {

    @Autowired
    BaseRepository baseRepository;

    @Override
    @Transactional(readOnly = true)
    //默认为该类命名空间下sql文件中的id "select.complex.condition"
    public List<Map<String, Object>> getResources(String username) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("username", username);
        return baseRepository.queryForListMapNamedParameterByMapper("select.complex.condition", params);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TbResourceEntity> getResourcesEntity() {
        return baseRepository.getAllEntity(TbResourceEntity.class);
    }

    @Override
    @Transactional(readOnly = true)
    //用主键获取表映射的实体
    public TbResourceEntity getResourcesEntityById(int id) {
        return baseRepository.getEntity(TbResourceEntity.class, id);
    }

    @Override
    @Transactional(readOnly = true)
    //用联合主键获取表映射的实体
    public TbCompidEntity getTbCompidEntityById(TbCompidEntityPK id) {
        return baseRepository.getEntity(TbCompidEntity.class, id);
    }

    @Override
    @Transactional(readOnly = true)
    //取其他命名空间中的sqlmapper -> namespace.id 这样的格式，方法名后缀加WithoutSelfNameSpace
    public List<Map<String, Object>> getResourcesEntityWithoutSelfNameSpace() {
        return baseRepository.queryForListMapByMapper("com.example.demo.service.impl.DemoService.select");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    //执行更新语句
    public void updateUser() {
        baseRepository.executeUpdateByMapper("update.tb_user", "好大声大声" + new Date().getTime(), 19);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    //orm 类似hibernate方式持久化对象到数据库
    public TbRoleEntity saveRole(TbRoleEntity roleEntity) {
        TbRoleEntity save = baseRepository.save(roleEntity);
        TbUserEntity tbUserEntity = new TbUserEntity();
        tbUserEntity.setuAccountName("AAAAAA");
        tbUserEntity.setuCreateTime(new Timestamp(new Date().getTime()));
        tbUserEntity.setuCreatorName("admin");
        tbUserEntity.setuName("CCCCCCCC");
        tbUserEntity.setuUpdateTime(new Timestamp(new Date().getTime()));
        tbUserEntity.setuPassword(save.getrId() + "");
        tbUserEntity.setuCredentialsSalt("sssss");
        tbUserEntity.setuId(99988);
        baseRepository.save(tbUserEntity);
        return roleEntity;
    }

}
