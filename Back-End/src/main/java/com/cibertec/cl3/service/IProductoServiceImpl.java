package com.cibertec.cl3.service;

import com.cibertec.cl3.entity.ProductoEntity;
import com.cibertec.cl3.repositorie.IBaseRepository;
import com.cibertec.cl3.repositorie.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IProductoServiceImpl extends IBaseServiceImpl<ProductoEntity, Long> implements IProductoService {

    @Autowired
    private IProductoRepository productoRepository;

    public IProductoServiceImpl(IBaseRepository<ProductoEntity, Long> baseRepository) {
        super(baseRepository);
    }

}
