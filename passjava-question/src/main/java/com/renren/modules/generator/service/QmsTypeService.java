package com.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.renren.common.utils.PageUtils;
import com.renren.modules.generator.entity.QmsTypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author chenjiajin
 * @email ciain@gmail.com
 * @date 2021-08-06 11:16:13
 */
public interface QmsTypeService extends IService<QmsTypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

