package com.changgou.goods.dao;

import com.changgou.goods.pojo.Brand;
import tk.mybatis.mapper.common.Mapper;

/**
 * DAO使用通用mapper，dao接口需要继承tk.mybatis.mapper.common.Mapper
 *      增加数据，调用Mapper.insert()
 *      增加数据，调用Mapper.insertSelective()
 *
 *      修改数据：调用Mapper.update(T)
 *      修改数据：调用Mapper.updateByPrimaryKey(T)
 *
 *      修改数据：调用Mapper.select(T)
 *      修改数据：调用Mapper.selectByPrimaryKey(T)
 *
 */
public interface BrandMapper extends Mapper<Brand> {
}