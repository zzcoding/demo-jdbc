package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.service.IDemoCallService;
import com.example.demo.service.IDemoService;
import com.jmapper.core.BaseRepository;
import com.jmapper.core.util.PageModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.asm.util.ASMifierAnnotationVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.security.krb5.internal.PAData;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoJdbcApplicationTests {

    @Autowired
    BaseRepository repository;
    @Autowired
    IDemoService demoService;
    @Autowired
    IDemoCallService demoCallService;

    @Test
    public void contextLoads() {
//        List<Map<String, Object>> maps = repository.queryForListMapByMapper("sql.mapper.repay.select");
//        List<TbRoleUserEntity> allEntity = repository.getAllEntity(TbRoleUserEntity.class);

//        String templateSql = repository.getTemplateSql("sql.mapper.repay.select");
//        System.out.println(templateSql);
//        PageModel pageModel =new PageModel();
//        pageModel.setPageIndex(2);
//        List<TbRoleUserEntity> tbRoleUserEntities = repository.queryForEntityListByMapper("sql.mapper.repay.select", TbRoleUserEntity.class);
//        System.out.println(tbRoleUserEntities);
//        List<TbUserEntity> tbUserEntities = repository.queryForEntityListByMapper("sql.mapper.repay.select.tb_user", TbUserEntity.class);
//        System.out.println(tbUserEntities);
//        tbUserEntities.forEach(tbUserEntity -> System.out.println(tbUserEntity));
//
//        List<TbUserEntity> tbUserEntities1 = repository.queryForPageEntityListByMapper("sql.mapper.repay.select.tb_user", TbUserEntity.class, pageModel);
//        for (TbUserEntity tbUserEntity : tbUserEntities1) {
//            System.out.println(tbUserEntity);
//        }
//        Map<String, Object> stringObjectMap = repository.queryForMap("select u_name from tb_user where u_id=?", 9);
//        System.out.println(stringObjectMap);
//        Map<String, Object> stringObjectMap1 = repository.queryForMapByMapper("sql.mapper.repay.select.map.tb_user");
//        System.out.println(stringObjectMap1);
//        Map<String,Object> params =new HashMap<String,Object>();
//        params.put("id",9);
//        Map<String, Object> stringObjectMap2 = repository.queryForMapNamedParameterByMapper("sql.mapper.repay.select.map.n.tb_user", params);
//        System.out.println(stringObjectMap2);
//        List<TbLoginInfoEntity> allEntity = repository.getAllEntity(TbLoginInfoEntity.class);
//        System.out.println(allEntity);
        //demoService.updateUser();
        TbCompidEntityPK pk =new TbCompidEntityPK();
        pk.setComidA1A("cc");
        pk.setComidB1B("aa");
        TbCompidEntity tbCompidEntity = repository.queryForEntity("select comid_a1a as comida1a,comid_b1b as comidb1b,name,c_time from tb_compid where comid_a1a='cc' and comid_b1b='aa'", TbCompidEntity.class);
        TbCompidEntity tbCompidEntityById = demoService.getTbCompidEntityById(pk);
        TbResourceEntity resourcesEntityById = demoService.getResourcesEntityById(20);
        demoCallService.call();
        TbRoleEntity roleEntity = new TbRoleEntity();
        roleEntity.setrCreateTime(new Timestamp(new Date().getTime()));
        roleEntity.setrDescription("EEEEEEE");
        roleEntity.setrName("哈哈哈");
        roleEntity.setrKey("xxxxx");
        demoService.saveRole(roleEntity);
        List<Map<String, Object>> resources = demoService.getResources("高刚");
        System.out.println(resources);
        List<Map<String, Object>> entityWithoutSelfNameSpace = demoService.getResourcesEntityWithoutSelfNameSpace();
        System.out.println(entityWithoutSelfNameSpace);


    }


}
