package com.kejia.ssm.service.impl;

import com.kejia.ssm.dao.IProdectDao;
import com.kejia.ssm.domin.Product;
import com.kejia.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 19:45 2019/9/16
 * @MODIFY:
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProdectDao productDao;
    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
