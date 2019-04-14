package com.tanl.demo.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 七月.2019-04-14 15:31
 */
@Component
public interface AddressDAO {
    @Select("SELECT  a.name as a,b.name as b,c.name as c from address a " +
            "JOIN  address b on a.id=b.pid " +
            "join address c on b.id=c.pid")
    List<Map>select();
}
