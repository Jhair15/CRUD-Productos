package com.cibertec.cl3.controller;

import com.cibertec.cl3.entity.ProductoEntity;
import com.cibertec.cl3.service.IProductoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/producto")
public class ProductoCOntroller extends IBaseControllerImpl<ProductoEntity, IProductoServiceImpl>{
}
