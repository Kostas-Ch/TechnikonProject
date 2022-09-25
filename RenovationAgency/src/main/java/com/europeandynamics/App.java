package com.europeandynamics;

import com.europeandynamics.model.PropertyOwner;
import com.europeandynamics.model.enums.Role;
import com.europeandynamics.repository.PropertyOwnerRepository;
import com.europeandynamics.repository.Impl.PropertyOwnerRepositoryImpl;

public class App {

	public static void main(String[] args) {

		PropertyOwnerRepository prop = new PropertyOwnerRepositoryImpl();
		System.out.println(prop.findAll(PropertyOwner.class));

		prop.create(new PropertyOwner("111111116", "John", "Johnson", "Athens", "6999999996", "john@email.com",
				"username6", "pass6", Role.PROPERTY_OWNER));

		prop = new PropertyOwnerRepositoryImpl();
		System.out.println(prop.findAll(PropertyOwner.class));

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
