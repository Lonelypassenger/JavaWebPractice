package com.kejia.ssm.dao;

import com.kejia.ssm.domin.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 19:39 2019/9/16
 * @MODIFY:
 */
public interface IProdectDao {
    @Select("select * from product")
    List<Product> findAll()throws Exception;
}
