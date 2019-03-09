package com.dianrong.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRespository extends JpaRepository<Girl,Integer> {
    //通过年龄字段来查
    public List<Girl> findByAge(Integer age);
}
