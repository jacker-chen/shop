package com.bjfn.myshop.tiny.service.impl;

import com.bjfn.myshop.tiny.mbg.mapper.PmsBrandMapper;
import com.bjfn.myshop.tiny.mbg.model.PmsBrand;
import com.bjfn.myshop.tiny.mbg.model.PmsBrandExample;
import com.bjfn.myshop.tiny.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return pmsBrandMapper.insert(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return pmsBrandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }
}
