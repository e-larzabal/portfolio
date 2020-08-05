package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.model.BaseModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public abstract class AbstractBaseService<T extends BaseModel> implements BaseService<T> {

    @Override
    public Optional<T> find(Long id) { return getDao().findById(id); }

    @Override
    public List<T> list() {
        return getDao().findAll();
    }

    @Override
    public T create(T model) {

        // generate id when needed
        if (model.getId() == null) {
            Random rd = new Random(); // creating Random object
            Long id = rd.nextLong();
            model.setId(id);
        }

        // when conflict
        if (getDao().existsById(model.getId())) {
            // error message
            throw new ResponseStatusException(HttpStatus.CONFLICT, "could not create model (conflict) for id> "
                    + model.getId());
        } else {
            // create
            return getDao().save(model);
        }
    }

    @Override
    public T update(T model) {

        // check that model can be updated
        if (!getDao().existsById(model.getId())) {
            // error message
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "could not update model (not found) for id> "
                    + model.getId());
        } else {
            // update
            T savedModel = getDao().save(model);
            return savedModel;
        }
    }

    @Override
    public boolean delete(Long id) {

        // check that model can be deleted
        if (!getDao().existsById(id)) {
           return false;
        }

        // delete
        else {
            getDao().deleteById(id);
            return true;
        }
    }

    public abstract BaseDao<T> getDao();


}
