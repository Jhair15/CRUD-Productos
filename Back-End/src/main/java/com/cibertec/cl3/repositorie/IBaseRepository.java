package com.cibertec.cl3.repositorie;

import com.cibertec.cl3.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface IBaseRepository <E extends ProductoEntity, ID extends Serializable> extends JpaRepository<E, ID> {
}
