package com.mindtree.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.mindtree.hibernateUtility;

public class TestGetAllMinds {

	@Test
	public void test() {
		Session session =hibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		Query q=session.createQuery("from Minds");
		List list=q.list();
		int size=list.size();
		assertEquals(7,size);

	}

}
