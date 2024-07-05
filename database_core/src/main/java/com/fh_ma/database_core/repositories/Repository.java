package com.fh_ma.database_core.repositories;

import com.fh_ma.database_core.entities.Entity;

import java.util.Collection;
import java.util.UUID;

public interface Repository<T extends Entity> {
    T getById(UUID id);
    Collection<T> getByIds(Collection<UUID> id);
    void add(T entity);
    void remove(T entity);
    void update(T entity);
}
