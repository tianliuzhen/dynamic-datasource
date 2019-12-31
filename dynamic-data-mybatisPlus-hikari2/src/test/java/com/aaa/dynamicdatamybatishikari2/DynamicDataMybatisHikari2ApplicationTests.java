package com.aaa.dynamicdatamybatishikari2;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DynamicDataMybatisHikari2ApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void testLog(){
        log.info("name","ddd");
    }

}
