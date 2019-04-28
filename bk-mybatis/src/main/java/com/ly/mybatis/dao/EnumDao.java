package com.ly.mybatis.dao;

/**
 * @author Administrator
 * @date 2019/1/4 16:56
 */
public class EnumDao {


    /**
     * mapper里字段到枚举类的映射。
     * 用法一:
     * 入库：#{enumDataField, typeHandler=com.adu.spring_test.mybatis.typehandler.EnumTypeHandler}
     * 出库：
     * <resultMap>
     * <result property="enumDataField" column="enum_data_field" javaType="com.xxx.MyEnum" typeHandler="com.adu.spring_test.mybatis.typehandler.EnumTypeHandler"/>
     * </resultMap>
     *
     * 用法二：
     * 1）在mybatis-config.xml中指定handler:
     *      <typeHandlers>
     *              <typeHandler handler="com.adu.spring_test.mybatis.typehandler.EnumTypeHandler" javaType="com.xxx.MyEnum"/>
     *      </typeHandlers>
     * 2)在MyClassMapper.xml里直接select/update/insert。
     */
    public static void main(String[] args) {

        //com.adu.spring_test.mybatis.typehandler.EnumTypeHandler
        //com.adu.spring_test.mybatis.typehandler.EnumTypeHandler
    }
}
