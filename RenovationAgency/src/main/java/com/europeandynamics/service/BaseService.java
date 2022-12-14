package com.europeandynamics.service;

import com.europeandynamics.payload.PropertyOwnerRequest;

import java.util.List;
import java.util.Optional;

public interface BaseService<T> {

	List<?> findAll(Class<T> classType);

	Optional<T> findById(String id, Class<T> classType);

	T create(final T entity);

	void update(String id, PropertyOwnerRequest propertyOwnerRequest);

	void deleteById(String id, Class<T> classType);

	void delete(T entity);

}
