package com.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.renren.modules.generator.entity.QmsQuestionEntity;
import com.renren.modules.generator.service.QmsQuestionService;
import com.renren.common.utils.PageUtils;
import com.renren.common.utils.R;



/**
 * 
 *
 * @author chenjiajin
 * @email ciain@gmail.com
 * @date 2021-08-06 11:16:13
 */
@RestController
@RequestMapping("generator/qmsquestion")
public class QmsQuestionController {
    @Autowired
    private QmsQuestionService qmsQuestionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:qmsquestion:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qmsQuestionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:qmsquestion:info")
    public R info(@PathVariable("id") Long id){
		QmsQuestionEntity qmsQuestion = qmsQuestionService.getById(id);

        return R.ok().put("qmsQuestion", qmsQuestion);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:qmsquestion:save")
    public R save(@RequestBody QmsQuestionEntity qmsQuestion){
		qmsQuestionService.save(qmsQuestion);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:qmsquestion:update")
    public R update(@RequestBody QmsQuestionEntity qmsQuestion){
		qmsQuestionService.updateById(qmsQuestion);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:qmsquestion:delete")
    public R delete(@RequestBody Long[] ids){
		qmsQuestionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
