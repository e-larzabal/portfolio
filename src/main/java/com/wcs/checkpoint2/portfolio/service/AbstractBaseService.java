package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.model.BaseModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public abstract class AbstractBaseService<T extends BaseModel> implements BaseService<T> {

    @Override
    public Optional<T> find(UUID uuid) {
        return getDao().findById(uuid);
    }
    @Override
    public List<T> list() {
        return getDao().findAll();
    }
    @Override
    public T create(T model) {


        // generate uuids when needed
        if (model.getUuid() == null) {
            model.setUuid(UUID.randomUUID());
        }

        // when conflict
        if (getDao().existsById(model.getUuid())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "could not create model (conflict) for uuid> " + model.getUuid());
        }

        // create
        else return getDao().save(model);
    }
    @Override
    public T update(T model) {

        // check that model can be updated
        if (!getDao().existsById(model.getUuid())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "could not update model (not found) for uuid> " + model.getUuid());
        }

        // update
        else {
            T savedModel = getDao().save(model);
            return savedModel;
        }
    }

    @Override
    public boolean delete(UUID uuid) {

        // check that model can be deleted
        if (!getDao().existsById(uuid)) {
           return false;
        }

        // delete
        else {
            getDao().deleteById(uuid);
            return true;
        }
    }

    public abstract BaseDao<T> getDao();

}
