package com.bmsoft.cloud.transcoder.template.controller;


import com.bmsoft.cloud.transcoder.common.entity.Result;
import com.bmsoft.cloud.transcoder.template.servcie.TemplateService;
import com.bmsoft.cloud.transcoder.template.vo.TemplateVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 模板查询controller
 */
@RestController
@RequestMapping("/transcoder")
public class TemplateController {
    private static Logger logger = Logger.getLogger(TemplateController.class);

    @Autowired
    private TemplateService templateService;

    /**
     * 根据指定条件获取模板列表。
     * @param templateVo
     * @return
     */
    @GetMapping("/getTemplates")
    @CrossOrigin
    public Result getTemplates(TemplateVo templateVo,
                               @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
                               @RequestParam(name = "pageNumber", defaultValue = "1") Integer pageNumber) {
        Result result;
        try {
            result = templateService.getTemplates(templateVo, pageSize, pageNumber);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("getTemplates接口出现异常");
            return Result.build(500, "getTemplates接口出现异常");
        }
        return result;
    }


    /**
     * 可以依据名称、Id进行查询模板集。
     * @param templatesName
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping("/getTemplateSets")
    @CrossOrigin
    public Result getTemplateSets(@RequestParam(value = "templatesName") String templatesName,
                                  @RequestParam(value = "currentPage", defaultValue = "1") Integer currentPage,
                                  @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        Result result;
        try {
            result = templateService.getTemplateSets(templatesName, currentPage, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("getTemplateSets接口出现异常");
            return Result.build(500, "getTemplateSets接口出现异常");
        }
        return result;
    }


    /**
     * 模板集详情
     *
     * @param templateIds
     * @return
     */
    @GetMapping("/getTemplateSetDetail")
    @CrossOrigin
    public Result getTemplateSetDetail(@RequestParam(value = "templateIds") int templateIds) {
        Result result;
        try {
            result = templateService.getTemplateSetDetail(templateIds);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("getTemplateSetDetail接口出现异常");
            return Result.build(500, "getTemplateSetDetail接口出现异常");
        }
        return result;
    }

    /**
     * 根据模板集id获取对用模板列表
     *
     * @param templateIds
     * @param pageSize
     * @param pageNumber
     * @return
     */
    @GetMapping("/getTemplateOfSet")
    public Result getTemplateOfSet(@RequestParam(name = "templateIds") int templateIds,
                                   @RequestParam(name = "pageSize", defaultValue = "10") int pageSize,
                                   @RequestParam(value = "pageNumber", defaultValue = "1") int pageNumber) {
        Result result;
        try {
            result = templateService.getTemplateOfSet(templateIds, pageNumber, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("getTemplateOfSet接口出现异常");
            return Result.build(500, "getTemplateOfSet接口出现异常");
        }
        return result;

    }
}
