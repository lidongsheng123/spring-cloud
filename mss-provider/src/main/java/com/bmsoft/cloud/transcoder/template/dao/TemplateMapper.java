package com.bmsoft.cloud.transcoder.template.dao;

import com.bmsoft.cloud.transcoder.template.entity.Template;
import com.bmsoft.cloud.transcoder.template.entity.TemplateSetDetail;
import com.bmsoft.cloud.transcoder.template.entity.TemplateSets;
import com.bmsoft.cloud.transcoder.template.vo.TemplateVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TemplateMapper {
    List<Template> getTemplates( TemplateVo templateVo)throws Exception;
    List<TemplateSets> getTemplateSets(@Param("templates_name") String templatesName) throws Exception;
    TemplateSetDetail getTemplateSetDetail(@Param("templates_id") int templateIds) throws Exception;
    List<Template> getTemplateOfSet(int templateIds)throws Exception;
}
