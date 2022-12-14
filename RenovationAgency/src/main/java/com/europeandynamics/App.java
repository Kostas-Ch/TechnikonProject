package com.europeandynamics;

import com.europeandynamics.model.PropertyOwner;
import com.europeandynamics.model.enums.Role;
import com.europeandynamics.repository.Impl.PropertyOwnerRepositoryImpl;
import com.europeandynamics.service.PropertyOwnerService;
import com.europeandynamics.service.Impl.PropertyOwnerServiceImpl;

public class App {

	public static void main(String[] args) {

		/*
		 * PropertyOwnerRepository prop = new PropertyOwnerRepositoryImpl();
		 * System.out.println(prop.findAll(PropertyOwner.class));
		 */

//		System.out.println(PropertyOwner.class.getSimpleName());

		PropertyOwnerService propertyOwnerService = new PropertyOwnerServiceImpl(new PropertyOwnerRepositoryImpl());

		propertyOwnerService.create(new PropertyOwner("111111111", "Kostas", "Chatzifotiadis", "Thessaloniki",
				"6999999991", "email1email.com", "username1", "pass1", Role.ADMIN));

//		PropertyOwnerRepository prop = new PropertyOwnerRepositoryImpl();
//		System.out.println(prop.findAll(PropertyOwner.class));
//
//		prop = new PropertyOwnerRepositoryImpl();
//		System.out.println(prop.findAll(PropertyOwner.class));

//		EntityManagerFactory emf = EntityManagerFactoryUtils.getEntityManagerFactory();
//		EntityManager em = emf.createEntityManager();

//		PropertyOwnerRepository prop = new PropertyOwnerRepositoryImpl();

//		System.out.println(PropertyOwner.class.getSimpleName());

		// CREATE
//		em.getTransaction().begin();
//		Property property = new Property("23456790", "address2", LocalDate.of(2022, 9, 22), Type.APARTMENT);
////
//		PropertyOwner propertyOwner = new PropertyOwner("121", "John3", "Johnson3", "address125", "phone3", "email3",
//				"username3", "pass3");
////
//		propertyOwner.addProperty(property);
//
//		em.persist(propertyOwner);
//		em.getTransaction().commit();
//		em.close();

		// READ
//		em.getTransaction().begin();

//		Property foundProperty = em.find(Property.class, "23456790");
//		System.out.println(foundProperty);

		// UPDATE
//		em.getTransaction().begin();
//		Property foundProperty2 = em.find(Property.class, "23456790");
//		foundProperty2.setType(Type.DETACHED);
//
//		em.merge(foundProperty2);
//		em.getTransaction().commit();
//		em.close();

		// READ ALL
//		List<Property> properties = em.createQuery("SELECT property from Property property").getResultList();
//
//		System.out.println(properties);

//			      .setParameter(1, "English")

	}

}
