package com.shaoshao.mybatis_ch10.mapper;

import com.shaoshao.mybatis_ch10.model.Country;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CountryMapper {
    List<Country> selectAll();
}
