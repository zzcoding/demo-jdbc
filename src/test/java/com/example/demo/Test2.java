package com.example.demo;

import com.example.demo.entity.TbCompidEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.util.StringUtils;

import java.beans.PropertyDescriptor;
import java.util.*;

/**
 * com.example.demo
 *
 * @author zhaoguang
 * @date 2018/1/23 18:45
 * @description
 */
public class Test2 {
    private Class mappedClass;
    private boolean checkFullyPopulated = false;
    private boolean primitivesDefaultedForNullValue = false;
    private ConversionService conversionService = DefaultConversionService.getSharedInstance();
    private Map<String, PropertyDescriptor> mappedFields;
    private Set<String> mappedProperties;
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.initialize(TbCompidEntity.class);
        System.out.println(test2.mappedFields);
        System.out.println(test2.lowerCaseName("123"));
    }
    protected void initialize(Class mappedClass) {
        this.mappedClass = mappedClass;
        this.mappedFields = new HashMap();
        this.mappedProperties = new HashSet();
        PropertyDescriptor[] pds = BeanUtils.getPropertyDescriptors(mappedClass);
        PropertyDescriptor[] var3 = pds;
        int var4 = pds.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            PropertyDescriptor pd = var3[var5];
            if(pd.getWriteMethod() != null) {
                this.mappedFields.put(this.lowerCaseName(pd.getName()), pd);
                String underscoredName = this.underscoreName(pd.getName());
                if(!this.lowerCaseName(pd.getName()).equals(underscoredName)) {
                    this.mappedFields.put(underscoredName, pd);
                }

                this.mappedProperties.add(pd.getName());
            }
        }

    }
    protected String lowerCaseName(String name) {
        return name.toLowerCase(Locale.US);
    }

    protected String underscoreName(String name) {
        if (!StringUtils.hasLength(name)) {
            return "";
        } else {
            StringBuilder result = new StringBuilder();
            result.append(this.lowerCaseName(name.substring(0, 1)));

            for (int i = 1; i < name.length(); ++i) {
                String s = name.substring(i, i + 1);
                String slc = this.lowerCaseName(s);
                if (!s.equals(slc)) {
                    result.append("_").append(slc);
                } else {
                    result.append(s);
                }
            }

            return result.toString();
        }
    }
}
