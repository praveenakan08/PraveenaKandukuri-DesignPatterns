package com.pravee.task7;

public class PhoneProduction implements PhonePackaging
{
	String frontCamera;
	String rearCamera;
	String batterySize;
	String screenType;
	String packageType;
	String transportationMedium;
	String protectionType;
	
	public void setFrontCamera(String frontCamera)
	{
		this.frontCamera=frontCamera;
		System.out.println("front camera set "+frontCamera);
	}
	public void setRearCamera(String rearCamera)
	{
		this.rearCamera=rearCamera;
		System.out.println("rear camera set "+rearCamera);
		
	}
	public void setBattery(String batterySize)
	{
		this.batterySize=batterySize;
		System.out.println("battery size set "+batterySize);
		
	}
	public void setScreenType(String screenType)
	{
		this.screenType=screenType;
		System.out.println("screenType set "+screenType);
		
	}
	
	public void setPackageType(String packageType)
	{
		this.packageType=packageType;
		System.out.println("packageType set "+packageType);
		
	}
	public void setTransportationMedium(String transportationMedium) 
	{
		this.transportationMedium=transportationMedium;
		System.out.println("transportationMedium set "+transportationMedium);
		
	}
	public void setProtectionType(String protectionType)
	{
		this.protectionType=protectionType;
		System.out.println("protectionType set "+protectionType);
	}

}
