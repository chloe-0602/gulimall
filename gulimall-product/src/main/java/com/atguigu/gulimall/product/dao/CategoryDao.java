package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xuluqin
 * @email 13262816312@163.com
 * @date 2024-03-27 13:46:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
