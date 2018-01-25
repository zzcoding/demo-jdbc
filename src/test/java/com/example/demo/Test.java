package com.example.demo;

import com.alibaba.druid.support.json.JSONUtils;
import com.example.demo.entity.TbRoleEntity;
import com.jmapper.core.util.JsonUtil;
import org.apache.commons.io.FileUtils;
import org.codehaus.jackson.JsonParser;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/**
 * com.example.demo
 *
 * @author zhaoguang
 * @date 2018/1/15 10:49
 * @description
 */
public class Test {
    public static void main(String[] args){
        Map<String, TbRoleEntity> map = new TreeMap<>();
        TbRoleEntity tbRoleEntity1 =new TbRoleEntity();
        TbRoleEntity tbRoleEntity2 =new TbRoleEntity();
        TbRoleEntity tbRoleEntity3 =new TbRoleEntity();
        tbRoleEntity1.setrName("a");
        tbRoleEntity2.setrName("ccccc");
        tbRoleEntity3.setrName("ddddd");
        System.out.println(tbRoleEntity1.hashCode());
        map.put("A",tbRoleEntity1);
        map.put("U",tbRoleEntity2);
        map.put("B",tbRoleEntity3);
    //    TbRoleEntity roleEntity = map.get("U".compareTo("a"));

    //    System.out.println(roleEntity);
        Object[] tab =new Object[16];

        int hash = hash("V");
        int i = (16 - 1) & hash;
        tab[i]="v";

        System.out.println(i);
        Object first = tab[(16 - 1) & hash];
        System.out.println(first);

        System.out.println(indexFor(21,16));
        System.out.println(indexFor(11,16));
        System.out.println(indexFor(22,16));
        System.out.println(indexFor(33,16));
        long a =10000l;
        Integer b=Integer.MAX_VALUE;
        int c=2147483647;

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>(20);
        for (int j = 0; j < 50; j++) {
            objectObjectHashMap.put(j,j+1);
        }
        System.out.println(objectObjectHashMap);
        int h = hash("V");
        int h1 = hash("S");
        int ii = (16 - 1) & h;
        int ii1 = (16 - 1) & h1;
        System.out.println(ii);
        System.out.println("***************************");
        for(int n = 0;n<39;n++){
            int hash1 = hash("V"+n);
            System.out.println(  (32 - 1) & hash1);
        }

        System.out.println((10-1)&hash(99));
        System.out.println((10-1)&hash(98));
        System.out.println((10-1)&hash(90));
    }
    public  static void fun(){
        new Test1().fun();
    }
    public static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    public static int indexFor(int h,int length){
         return h &(length -1 );
    }

}
