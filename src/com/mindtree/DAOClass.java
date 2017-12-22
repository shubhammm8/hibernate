package com.mindtree;

public interface DAOClass {

	public  void Insert();
	public  void RetrieveDetails();
	public  void UpdateDetails(int id,String name1);
	public  void DeleteDetails(int id);
	public  void getMindById(int i); 
	public  void getLeadById(int i); 
	public  void getAllLead();
	public  void getAllMinds();
	public  void getAllTracks();
	public  void InsertMinds(String z,String x,String c,int q,int w,int e);
}
