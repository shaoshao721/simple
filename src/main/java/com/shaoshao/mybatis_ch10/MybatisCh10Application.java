package com.shaoshao.mybatis_ch10;

import com.shaoshao.mybatis_ch10.mapper.CountryMapper;
import com.shaoshao.mybatis_ch10.model.Country;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@MapperScan(value = {"ss.mybatis.simple.mapper", "com.shaoshao.mybatis_ch10.mapper"}, nameGenerator = MapperNameGenerator.class)
public class MybatisCh10Application implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(MybatisCh10Application.class);

    @Autowired
    private CountryMapper countryMapper;

    public static void main(String[] args) {
        SpringApplication.run(MybatisCh10Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<Country> countryList = countryMapper.selectAll();
        logger.info("get result count {}", countryList.size());

    }
}
