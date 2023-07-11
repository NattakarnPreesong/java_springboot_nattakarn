package com.nattakarn.Hotel_Diploma.service;

import com.nattakarn.Hotel_Diploma.entity.Page;

import java.util.List;

public interface PageService {
    public List<Page> findAll();//show
    public Page findById(int id);//edit
    public void save(Page thePage);//add
    public void deleteById(int id);//delete

}
