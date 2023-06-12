package com.rapizza.rapizza.service;


import com.rapizza.rapizza.model.Size;
import com.rapizza.rapizza.repository.SizeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class SizeService {

    @Autowired
    private SizeRepository sizeRepository;

    public Iterable<Size> getAllSize(){
        return  sizeRepository.findAll();
    }
}
