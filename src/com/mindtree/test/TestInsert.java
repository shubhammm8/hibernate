package com.mindtree.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.mindtree.hibernateUtility;

public class TestInsert {

	@Test
	public void test() {
		Session session= hibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
	}

}
