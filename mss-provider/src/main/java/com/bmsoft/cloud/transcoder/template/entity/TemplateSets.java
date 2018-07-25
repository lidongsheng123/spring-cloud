package com.bmsoft.cloud.transcoder.template.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 模板集实体类
 */
@Data
public class TemplateSets implements Serializable {

    private int templatesId; //模板集ID
    private String templatesName; //模板集名称
    private String createUser; //创建人员
    private String createTime; //创建时间
    private  String updateTime;//最后更新时间

}
