package com.cibertec.cl3.controller;

import com.cibertec.cl3.entity.ProductoEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface IBaseController <E extends ProductoEntity, ID extends Serializable>{

    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getOne(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@RequestBody ID id, @RequestBody E entity);
    public ResponseEntity<?> delete(@PathVariable ID id);

}
