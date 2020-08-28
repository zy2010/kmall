package com.kgc.kmall.managerservice.mapper;

import com.kgc.kmall.bean.PmsProductImage;
import com.kgc.kmall.bean.PmsProductImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductImageMapper {
    int countByExample(PmsProductImageExample example);

    int deleteByExample(PmsProductImageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductImage record);

    int insertSelective(PmsProductImage record);

    List<PmsProductImage> selectByExample(PmsProductImageExample example);

    PmsProductImage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductImage record, @Param("example") PmsProductImageExample example);

    int updateByExample(@Param("record") PmsProductImage record, @Param("example") PmsProductImageExample example);

    int updateByPrimaryKeySelective(PmsProductImage record);

    int updateByPrimaryKey(PmsProductImage record);
}