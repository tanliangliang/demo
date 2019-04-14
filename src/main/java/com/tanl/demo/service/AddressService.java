package com.tanl.demo.service;

import com.tanl.demo.dao.AddressDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 七月.2019-04-14 15:36
 */
@Service
public class AddressService {

    @Autowired
    public   AddressDAO addressDAO;

//   public  List<Map>select(){
//        return  addressDAO.select();
//    }

    public List getList(){
       List<Map>list=addressDAO.select();
       for (Map map:list){
           System.out.println(map.get("a"));
           List list1=new ArrayList();
           list1.add(map.get("b"));
           System.out.println(list1);
           System.out.println("sss");
           System.out.println("aaa");

       }
       return  null;
    }
}
