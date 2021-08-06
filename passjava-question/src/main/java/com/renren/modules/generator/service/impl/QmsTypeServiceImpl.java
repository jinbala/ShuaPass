package com.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.renren.common.utils.PageUtils;
import com.renren.common.utils.Query;

import com.renren.modules.generator.dao.QmsTypeDao;
import com.renren.modules.generator.entity.QmsTypeEntity;
import com.renren.modules.generator.service.QmsTypeService;


@Service("qmsTypeService")
public class QmsTypeServiceImpl extends ServiceImpl<QmsTypeDao, QmsTypeEntity> implements QmsTypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QmsTypeEntity> page = this.page(
                new Query<QmsTypeEntity>().getPage(params),
                new QueryWrapper<QmsTypeEntity>()
        );

        return new PageUtils(page);
    }

}