package com.kgc.kmall.managerservice.service;

import com.kgc.kmall.bean.PmsBaseAttrInfo;
import com.kgc.kmall.bean.PmsBaseAttrInfoExample;
import com.kgc.kmall.bean.PmsBaseAttrValue;
import com.kgc.kmall.bean.PmsBaseAttrValueExample;
import com.kgc.kmall.managerservice.mapper.PmsBaseAttrInfoMapper;
import com.kgc.kmall.managerservice.mapper.PmsBaseAttrValueMapper;
import com.kgc.kmall.service.AttrService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {
    @Resource
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Resource
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;


    @Override
    public List<PmsBaseAttrInfo> select(Long catalog3Id) {
        PmsBaseAttrInfoExample example = new PmsBaseAttrInfoExample();
        PmsBaseAttrInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCatalog3IdEqualTo(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.selectByExample(example);
        return pmsBaseAttrInfos;
    }

    @Override
    public Integer add(PmsBaseAttrInfo attrInfo) {
        int i=0;;
        //判断添加还是修改
        if(attrInfo.getId()==null){
            //添加
            i = pmsBaseAttrInfoMapper.insert(attrInfo);
        }else{
            //修改
            i = pmsBaseAttrInfoMapper.updateByPrimaryKey(attrInfo);
        }
        //删除原有属性值
            PmsBaseAttrValueExample example = new PmsBaseAttrValueExample();
            PmsBaseAttrValueExample.Criteria criteria = example.createCriteria();
            criteria.andAttrIdEqualTo(attrInfo.getId());
            i = pmsBaseAttrValueMapper.deleteByExample(example);
            //添加新属性值
        if(attrInfo.getAttrValueList().size()>0){
            i = pmsBaseAttrValueMapper.insertBatch(attrInfo.getId(),attrInfo.getAttrValueList());
        }
        return i;
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(Long attrId) {
        PmsBaseAttrValueExample example = new PmsBaseAttrValueExample();
        PmsBaseAttrValueExample.Criteria criteria = example.createCriteria();
        criteria.andAttrIdEqualTo(attrId);
        List<PmsBaseAttrValue> pmsBaseAttrValues = pmsBaseAttrValueMapper.selectByExample(example);
        return pmsBaseAttrValues;
    }
}
