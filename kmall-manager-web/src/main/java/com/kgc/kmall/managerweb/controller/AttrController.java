package com.kgc.kmall.managerweb.controller;

import com.kgc.kmall.bean.PmsBaseAttrInfo;
import com.kgc.kmall.bean.PmsBaseAttrValue;
import com.kgc.kmall.service.AttrService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AttrController {
    @Reference
    AttrService attrService;

    @RequestMapping("attrInfoList")
    public List<PmsBaseAttrInfo> attrInfoList(Long catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = attrService.select(catalog3Id);
        return pmsBaseAttrInfos;
    }

    @RequestMapping("saveAttrInfo")
    public Integer saveAttrInfo(@RequestBody PmsBaseAttrInfo attrInfo){
        Integer i = attrService.add(attrInfo);
        return i;
    }

    @RequestMapping("getAttrValueList")
    public List<PmsBaseAttrValue> getAttrValueList(Long attrId){
        List<PmsBaseAttrValue> values = attrService.getAttrValueList(attrId);
        return values;
    }
}
