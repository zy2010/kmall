package com.kgc.kmall.service;

import com.kgc.kmall.bean.PmsBaseCatalog1;
import com.kgc.kmall.bean.PmsBaseCatalog2;
import com.kgc.kmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {
    //展示一级菜单
    public List<PmsBaseCatalog1> getCatalog1();
    //展示二级菜单
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id);
    //展示三级菜单
    public List<PmsBaseCatalog3> getCatalog3(Long catalog2Id);
}
