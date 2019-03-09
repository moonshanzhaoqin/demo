package com.dianrong.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.xml.ws.RequestWrapper;
import java.util.List;

@RestController
public class GirlController {
    @Autowired
    private GirlRespository girlRespository;

    @Autowired
    private GirlService girlService;

    /**
     * 查询所有女生列表
     * @return
     */

    @GetMapping(value = "/getGirls")
    public List<Girl> girlList(){
        return girlRespository.findAll();
    }

    /**
     * 添加一个女生
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/addGirl")
    public Girl addGirl(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRespository.save(girl);
    }


    //查询一个女生
    @GetMapping(value = "/girls/{id}")
    public  Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRespository.findById(id).get();
    }

    //更新一个女生
    @PutMapping(value = "/girls/{id}")
      public Girl girlUpdate(@PathVariable("id") Integer id,
                             @RequestParam("cupSize") String cupSize,
                             @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRespository.save(girl);

      }
    //删除
    @DeleteMapping(value = "/girls/{id}")
    public void deleteGirl(@PathVariable("id") Integer id){
         girlRespository.deleteById(id);
    }

    //通过年龄查询女生的列表
    @GetMapping(value = "girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRespository.findByAge(age) ;
    }

    @PostMapping(value = "/girls/two")
    public void addTwoGirl(){
        girlService.insertTwo();
    }
}


