package com.kgc.kmall.managerweb.controller;

import com.kgc.kmall.bean.PmsBaseCatalog1;
import com.kgc.kmall.bean.PmsBaseCatalog2;
import com.kgc.kmall.bean.PmsBaseCatalog3;
import com.kgc.kmall.service.CatalogService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//跨域
@CrossOrigin
@RestController
public class CatalogController {
    @Reference
    CatalogService catalogService;
    @RequestMapping("getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1(){
        return catalogService.getCatalog1();
    }

    @RequestMapping("getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id){
        List<PmsBaseCatalog2> pmsBaseCatalog2s = catalogService.getCatalog2(catalog1Id);
        return pmsBaseCatalog2s;
    }


    @RequestMapping("getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(Long catalog2Id){
        List<PmsBaseCatalog3> catalog3 = catalogService.getCatalog3(catalog2Id);
        return catalog3;
    }
}
