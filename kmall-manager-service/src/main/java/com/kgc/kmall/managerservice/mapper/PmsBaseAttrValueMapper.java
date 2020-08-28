package com.kgc.kmall.managerservice.mapper;

import com.kgc.kmall.bean.PmsBaseAttrValue;
import com.kgc.kmall.bean.PmsBaseAttrValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBaseAttrValueMapper {
    int countByExample(PmsBaseAttrValueExample example);

    int deleteByExample(PmsBaseAttrValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseAttrValue record);

    int insertSelective(PmsBaseAttrValue record);

    List<PmsBaseAttrValue> selectByExample(PmsBaseAttrValueExample example);

    PmsBaseAttrValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsBaseAttrValue record, @Param("example") PmsBaseAttrValueExample example);

    int updateByExample(@Param("record") PmsBaseAttrValue record, @Param("example") PmsBaseAttrValueExample example);

    int updateByPrimaryKeySelective(PmsBaseAttrValue record);

    int updateByPrimaryKey(PmsBaseAttrValue record);
    //批量添加
    int insertBatch(@Param("attrId") Long attrId,@Param("valueList") List<PmsBaseAttrValue> valueList);
}