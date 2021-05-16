package com.atguigu.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author xiongsihao
 * @email xsh2668028614@qq.com
 * @date 2021-05-15 22:06:10
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

