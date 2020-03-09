package com.pravee.task7;

interface Car 
{  
    void start();  
    void stop();  
}

class Duster implements Car
{
	public void start()
	{
		System.out.println("Duster car starts");
	}
	public void stop()
	{
		System.out.println("Duster car stops");	
	}
}

class Wagonr implements Car
{
	public void start()
	{
		System.out.println("Wagonr car starts");
	}
	public void stop()
	{
		System.out.println("Wagonr car stops");	
	}
}

public class CarController
{
	Duster duster;
	Wagonr wagonr;
	
	Car car;
	
	CarController()
	{
		duster=new Duster();
		wagonr=new Wagonr();		
	}
	
	void setDusterController()
	{
		car=duster;
	}
	
	void setWagonrController()
	{
		car=wagonr;		
	}
	public void start()
	{
		car.start();
	}
	
	public void stop()
	{
		car.stop();
	}
}	