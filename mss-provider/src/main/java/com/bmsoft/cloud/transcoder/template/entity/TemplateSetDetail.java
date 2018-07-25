package com.bmsoft.cloud.transcoder.template.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 模板集详情实体类
 */
@Data
public class TemplateSetDetail implements Serializable {
    private  int templatesId; //稿件id
    private  String templatesName;//
    private  String createUser;
    private String createTime;
    private  String updateTime;
    private int deleteFlg;
    private  String remark;

}
