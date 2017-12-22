package com.mindtree.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.mindtree.DAOClassImpl;
import com.mindtree.Minds;
import com.mindtree.hibernateUtility;

public class TestRetrieve {

	@Test
	public void test() {
			DAOClassImpl dao=new DAOClassImpl();
			Session session= hibernateUtility.getSessionFactory().openSession();
			session.beginTransaction();
			Query q3=session.createQuery("from Minds");
			List li=q3.list();
			Minds fl=(Minds) li.get(0);
			assertEquals(1,fl.getLe().getTr().getTid());
	}

}
