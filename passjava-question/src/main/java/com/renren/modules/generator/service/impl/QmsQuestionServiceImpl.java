package com.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.renren.common.utils.PageUtils;
import com.renren.common.utils.Query;

import com.renren.modules.generator.dao.QmsQuestionDao;
import com.renren.modules.generator.entity.QmsQuestionEntity;
import com.renren.modules.generator.service.QmsQuestionService;


@Service("qmsQuestionService")
public class QmsQuestionServiceImpl extends ServiceImpl<QmsQuestionDao, QmsQuestionEntity> implements QmsQuestionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QmsQuestionEntity> page = this.page(
                new Query<QmsQuestionEntity>().getPage(params),
                new QueryWrapper<QmsQuestionEntity>()
        );

        return new PageUtils(page);
    }

}