package com.cibertec.cl3.repositorie;

import com.cibertec.cl3.entity.ProductoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends IBaseRepository<ProductoEntity, Long>{
}
