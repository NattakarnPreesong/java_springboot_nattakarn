package com.nattakarn.Hotel_Diploma.service;

import com.nattakarn.Hotel_Diploma.entity.Page;
import com.nattakarn.Hotel_Diploma.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageServiceImplement implements PageService{
    @Autowired
    private PageRepository pageRepository;

    public PageServiceImplement(PageRepository pageRepository) {
        this.pageRepository = pageRepository;

    }
    @Override
    public List<Page> findAll(){
        return pageRepository.findAll();
    } //show
    @Override
    public Page findById(int id){
        return pageRepository.findById(id).get();
    } //edit
    @Override
    public void save(Page thePage){
        pageRepository.save(thePage);
    } //add
    @Override
    public void deleteById(int id){
        pageRepository.deleteById(id);
    } //delete
}
