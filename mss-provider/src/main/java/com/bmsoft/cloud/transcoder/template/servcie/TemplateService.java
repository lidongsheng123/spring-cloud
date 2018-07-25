package com.bmsoft.cloud.transcoder.template.servcie;

import com.bmsoft.cloud.transcoder.common.entity.Result;
import com.bmsoft.cloud.transcoder.template.vo.TemplateVo;

/**
 * Created by Administrator on 2018/7/12.
 */
public interface TemplateService {
    Result getTemplates(TemplateVo templateVo, Integer pageSize, Integer pageNumber) throws  Exception;

    Result getTemplateSets(String templatesName, int currentPage, int pageSize)throws Exception;

    Result getTemplateSetDetail(int templateIds) throws Exception;

    Result getTemplateOfSet(int templateIds, int pageNumber, int pageSize) throws Exception;
}
