///**
// * 
// */
//package com.company.swagger.domain.access;
//
//import javax.ejb.Stateless;
//import javax.ejb.TransactionAttribute;
//import javax.ejb.TransactionAttributeType;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.PersistenceUnit;
//
//import org.jboss.annotation.ejb.LocalBinding;
//
//import com.company.swagger.domain.entity.User;
//
///**
// * @author joseph.phillips
// *
// */
//@Stateless
//@LocalBinding(jndiBinding="ejb/UserDAOImpl")
//public class UserDAOImpl implements UserDAO {
//
//	@PersistenceUnit(unitName="test")
//	private EntityManagerFactory emf;
//
//	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
//	public User getUserById(Long id) {
//		return emf.createEntityManager().find(User.class, id) ;
//	}
//
//	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
//	public User createUser(User newUser) {
//		emf.createEntityManager().persist(newUser) ;
//		return newUser ;
//	}
//}