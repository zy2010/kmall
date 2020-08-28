package com.kgc.kmall.service;

import com.kgc.kmall.bean.PmsBaseAttrInfo;
import com.kgc.kmall.bean.PmsBaseAttrValue;

import java.util.List;

public interface AttrService {
    //根据三级分类id查询属性
    List<PmsBaseAttrInfo> select(Long catalog3Id);
    //添加属性
    Integer add(PmsBaseAttrInfo attrInfo);
    //根据属性id查询属性值
    List<PmsBaseAttrValue> getAttrValueList(Long attrId);
}
