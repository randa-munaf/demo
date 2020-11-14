package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;

    public List<Model> getAllData(){
        return repository.findAll();
    }
    public Model AddModel(Model model){
        return repository.save(model);
    }
    public Model FindById(String id) {
        return repository.findModelById(id);
    }
}
