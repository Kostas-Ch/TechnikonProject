package com.europeandynamics.repository.Impl;

import java.util.Optional;

import com.europeandynamics.model.PropertyOwner;
import com.europeandynamics.repository.AbstractRepository;
import com.europeandynamics.repository.PropertyOwnerRepository;

public class PropertyOwnerRepositoryImpl extends AbstractRepository<PropertyOwner> implements PropertyOwnerRepository {

	@Override
	public Optional<PropertyOwner> findByEmail(String email) {
		return Optional.ofNullable((PropertyOwner) em
				.createQuery(
						"SELECT propertyOwner from PropertyOwner propertyOwner where " + "propertyOwner.email = email")
				.getSingleResult());
	}
}
