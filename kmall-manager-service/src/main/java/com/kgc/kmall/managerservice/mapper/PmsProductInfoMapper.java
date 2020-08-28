package com.kgc.kmall.managerservice.mapper;

import com.kgc.kmall.bean.PmsProductInfo;
import com.kgc.kmall.bean.PmsProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductInfoMapper {
    int countByExample(PmsProductInfoExample example);

    int deleteByExample(PmsProductInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductInfo record);

    int insertSelective(PmsProductInfo record);

    List<PmsProductInfo> selectByExample(PmsProductInfoExample example);

    PmsProductInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductInfo record, @Param("example") PmsProductInfoExample example);

    int updateByExample(@Param("record") PmsProductInfo record, @Param("example") PmsProductInfoExample example);

    int updateByPrimaryKeySelective(PmsProductInfo record);

    int updateByPrimaryKey(PmsProductInfo record);
}