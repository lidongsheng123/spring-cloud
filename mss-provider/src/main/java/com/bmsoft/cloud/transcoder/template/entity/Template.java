package com.bmsoft.cloud.transcoder.template.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 模板信息实体类
 */
@Data
public class Template implements Serializable {
    private int templateId; //模板id
    private String templateName; //模板名称
    private String videoCoding; //视频编码
    private String videoEncap; //视频封装
    private String resolution;//分辨率
    private float frameRate; //帧率
    private int videoBitrate;//码率
    private String audioCoding; //音频编码
    private int audioSamplerate;//音频采样率
    private int audioBitrate;//音频码率
    private String createUser;//创建人员
    private String createTime;//创建时间
    private String editTime;//最后更新时间
    private int state;//状态: 模板状态（0未测试，1测试中，2已测试）
    private int type;//转码类型：0:视频,1:音频,2:图片
}
