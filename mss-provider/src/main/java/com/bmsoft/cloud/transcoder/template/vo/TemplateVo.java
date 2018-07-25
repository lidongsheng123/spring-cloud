package com.bmsoft.cloud.transcoder.template.vo;

import lombok.Data;

import java.io.Serializable;

/**
 *模板查询参数类
 */
@Data
public class TemplateVo implements Serializable{
    private  String templateName;//模板名称
    private  Integer templateId;//模板ID
    private  String type; //模板类型
}
