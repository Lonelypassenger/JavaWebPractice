package com.kejia.ssm.service;

import com.kejia.ssm.domin.Product;

import java.util.List;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 19:43 2019/9/16
 * @MODIFY:
 */
public interface IProductService {
    public List<Product> findAll() throws Exception;
}
