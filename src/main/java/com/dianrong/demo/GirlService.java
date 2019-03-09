package com.dianrong.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRespository girlRespository;
    @Transactional
    public void  insertTwo(){
        Girl girlA = new Girl();
        girlA.setAge(34);
        girlA.setCupSize("A");
        girlRespository.save(girlA);


        Girl girlB = new Girl();
        girlB.setAge(33);
        girlB.setCupSize("C");
        girlRespository.save(girlB);

    }
}
