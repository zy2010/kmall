package com.kgc.kmall.managerservice.mapper;

import com.kgc.kmall.bean.PmsBaseAttrInfo;
import com.kgc.kmall.bean.PmsBaseAttrInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBaseAttrInfoMapper {
    int countByExample(PmsBaseAttrInfoExample example);

    int deleteByExample(PmsBaseAttrInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseAttrInfo record);

    int insertSelective(PmsBaseAttrInfo record);

    List<PmsBaseAttrInfo> selectByExample(PmsBaseAttrInfoExample example);

    PmsBaseAttrInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsBaseAttrInfo record, @Param("example") PmsBaseAttrInfoExample example);

    int updateByExample(@Param("record") PmsBaseAttrInfo record, @Param("example") PmsBaseAttrInfoExample example);

    int updateByPrimaryKeySelective(PmsBaseAttrInfo record);

    int updateByPrimaryKey(PmsBaseAttrInfo record);
}