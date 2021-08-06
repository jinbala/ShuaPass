package com.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.renren.common.utils.PageUtils;
import com.renren.modules.generator.entity.QmsQuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenjiajin
 * @email ciain@gmail.com
 * @date 2021-08-06 11:16:13
 */
public interface QmsQuestionService extends IService<QmsQuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

