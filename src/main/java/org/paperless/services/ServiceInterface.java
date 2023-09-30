package org.paperless.services;

import org.paperless.services.dtos.CorrespondentDTO;

import java.util.List;

public interface ServiceInterface<T>{
    void save(T t);
    List<T> getList();
    void update(T t);
    void delete(T t);
}
