package com.mindtree.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.mindtree.DAOClassImpl;
import com.mindtree.Lead;
import com.mindtree.Minds;
import com.mindtree.hibernateUtility;

public class GetLeadById {

	@Test
	public void test() {

		DAOClassImpl dao=new DAOClassImpl();
		Session session= hibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		Query q3=session.createQuery("from Lead");
		List li=q3.list();
		Lead fl=(Lead) li.get(0);
		assertEquals(1,fl.getLid());
	}

}
