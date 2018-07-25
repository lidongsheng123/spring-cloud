package com.bmsoft.cloud.transcoder.template.servcie.impl;

import com.bmsoft.cloud.transcoder.common.entity.Result;
import com.bmsoft.cloud.transcoder.template.dao.TemplateMapper;
import com.bmsoft.cloud.transcoder.template.entity.Template;
import com.bmsoft.cloud.transcoder.template.entity.TemplateSetDetail;
import com.bmsoft.cloud.transcoder.template.entity.TemplateSets;
import com.bmsoft.cloud.transcoder.template.servcie.TemplateService;
import com.bmsoft.cloud.transcoder.template.vo.TemplateVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TemplateServiceImpl implements TemplateService {

    @Autowired
    private TemplateMapper templateMapper;

    @Override
    public Result getTemplates(TemplateVo templateVo, Integer pageSize, Integer pageNumber) throws Exception {
        //分页处理
        PageHelper.startPage(pageNumber, pageSize);
        List<Template> templates = templateMapper.getTemplates(templateVo);
        PageInfo<Template> pageInfo = new PageInfo<>(templates);
        return Result.ok(templates, pageInfo.getTotal());
    }

    @Override
    public Result getTemplateSets(String templatesName, int currentPage, int pageSize) throws Exception {
        PageHelper.startPage(currentPage, pageSize);
        List<TemplateSets> templateSetss = templateMapper.getTemplateSets(templatesName);
        PageInfo<TemplateSets> pageInfo = new PageInfo<>(templateSetss);
        return Result.ok(templateSetss, pageInfo.getTotal());
    }

    @Override
    public Result getTemplateSetDetail(int templateIds) throws Exception {
        TemplateSetDetail templateSetDetail = templateMapper.getTemplateSetDetail(templateIds);
        return Result.ok(templateSetDetail);
    }

    @Override
    public Result getTemplateOfSet(int templateIds, int pageNumber, int pageSize) throws Exception {
        PageHelper.startPage(pageNumber, pageSize);
        List<Template> templates = templateMapper.getTemplateOfSet(templateIds);
        PageInfo<Template> pageInfo = new PageInfo<>(templates);
        return Result.ok(templates, pageInfo.getTotal());
    }
}
