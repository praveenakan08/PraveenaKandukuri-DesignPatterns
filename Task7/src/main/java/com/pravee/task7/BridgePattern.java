package com.pravee.task7;

public class BridgePattern 
{
	BridgePattern()
	{
		System.out.println("Bridge Pattern");
	}
}

abstract class Mobile 
{ 
	abstract public void getCameraDetails(); 
	abstract public void getBatteryDetails(); 
} 

class SamsungMobile extends Mobile 
{ 
	ProduceSamsung produceSamsung;
	
	SamsungMobile(ProduceSamsung produceSamsung)
	{
		this.produceSamsung=produceSamsung;
		produceSamsung.produce();
	}
	
 	public void getCameraDetails() 
	{
		System.out.println("This phone has 15MP camera");
	} 
	public void getBatteryDetails() 
	{
		System.out.println("This phone has 4500mAh battery");		
	}	
} 

class IPhoneMobile extends Mobile 
{ 
	ProduceIPhone produceIPhone;
	
	IPhoneMobile(ProduceIPhone produceIPhone)
	{
		this.produceIPhone=produceIPhone;
		produceIPhone.produce();
	}
	
 	public void getCameraDetails() 
	{
		System.out.println("This phone has 20MP camera");
	} 
	public void getBatteryDetails() 
	{
		System.out.println("This phone has 5000mAh battery");		
	}	
} 

interface MobileProduction
{
	void produce();
}

class ProduceIPhone implements MobileProduction
{
	public void produce()
	{
		System.out.println("IPhone is produced");		
	}
}

class ProduceSamsung implements MobileProduction
{
	public void produce()
	{
		System.out.println("Samsung is produced");		
	}
}
