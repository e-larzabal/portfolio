package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.model.BaseModel;

import java.util.List;
import java.util.Optional;

public interface BaseService<T extends BaseModel> {

    public Optional<T> find(Long id);
    public List<T> list();
    public T create(T model);
    public T update(T model);
    public boolean delete(Long id);

}
