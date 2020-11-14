package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

interface Repository extends MongoRepository<Model,String> {
    Model findModelById(String id);

}
