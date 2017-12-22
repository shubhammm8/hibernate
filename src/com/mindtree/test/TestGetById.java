package com.mindtree.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.mindtree.DAOClassImpl;
import com.mindtree.Minds;
import com.mindtree.hibernateUtility;

public class TestGetById {

	@Test
	public void test() {
		DAOClassImpl dao=new DAOClassImpl();
		Session session =hibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		Query q=session.createQuery("from Minds");
		List list=q.list();
		Minds m=(Minds) list.get(2);
		String name="sachin";
		String res=m.getMname();
		assertEquals(name,res);
		
	}

}
