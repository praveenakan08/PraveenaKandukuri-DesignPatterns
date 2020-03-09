package com.pravee.task7;

import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char c='Y';
		
		while(c!='N')
		{
			System.out.println("	DESIGN PATTERNS	");
			System.out.println("1.Creational Design Patterns");
			System.out.println("2.Structural Design Patterns");
			System.out.println("3.Behavioral Design Patterns");
			System.out.println("Enter your choice (1 or 2 or 3)");
			int choice=sc.nextInt();
			
		switch(choice)
		{
		
		
			case 1:
			{
				System.out.println("a.Factory Method Pattern");
				System.out.println("b.Builder Pattern");
				System.out.println("Enter your choice (a or b)");
				char ch=sc.next().charAt(0);
				
				if(ch=='a')
				{
					System.out.println("Factory Method Pattern");
					System.out.println("IPhone Details");
					IPhone iphone=new IPhone();
					iphone.getCameraDetails();
					iphone.getBatteryDetails();
					iphone.getModel();
					System.out.println("\n");
					System.out.println("Samsung Details");
					Samsung samsung=new Samsung();
					samsung.getCameraDetails();
					samsung.getBatteryDetails();
					samsung.getModel();
				}
				
				if(ch=='b')
				{
					System.out.println("Builder Pattern");
					PhoneProduction phone=new PhoneProduction();
					phone.setBattery("5000mAh");
					phone.setFrontCamera("12MP");
					phone.setRearCamera("40MP");
					phone.setScreenType("Glass");
					phone.setPackageType("CardBoardType");
					phone.setTransportationMedium("By Air");
					phone.setTransportationMedium("By Air");
					phone.setProtectionType("Polythene Package");
				}
				
				break;
			}
		
			case 2:
			{
				System.out.println("a.Adapter Pattern");
				System.out.println("b.Bridge Pattern");
				System.out.println("Enter your choice (a or b)");
				char ch=sc.next().charAt(0);
				
				if(ch=='a')
				{
					System.out.println("Adapter Pattern");	
					System.out.println("Type C To USB Type Adapter functionality");
					USBCLass usbtype=new USBCLass();
					TypeCToUSBTypeAdapter typeCToUSBTypeAdapter=new TypeCToUSBTypeAdapter(usbtype);
					typeCToUSBTypeAdapter.transferData();
					typeCToUSBTypeAdapter.receiveData();
				}
				
				if(ch=='b')
				{
					new BridgePattern();
					ProduceSamsung produceSamsung=new ProduceSamsung();
					new SamsungMobile(produceSamsung);
					ProduceIPhone produceIPhone=new ProduceIPhone();
					new IPhoneMobile(produceIPhone);
				}
				break;
				
			}
			
			case 3:
			{
				System.out.println("a.State Pattern");
				System.out.println("b.Command Pattern");
				System.out.println("Enter your choice (a or b)");
				char ch=sc.next().charAt(0);
				
				if(ch=='a')
				{
					System.out.println("State Pattern");	
					CarController carController=new CarController();
					System.out.println("Choose b/w Wagonr and Duster");
					String car=sc.next();
					if(car.equalsIgnoreCase("Wagonr"))
					{
						carController.setWagonrController();
						carController.start();
						carController.stop();	
					}
					
					else if(car.equalsIgnoreCase("Duster"))
					{
						carController.setDusterController();
						carController.start();
						carController.stop();	
					}
				}
					
				
				if(ch=='b')
				{
					System.out.println("Command Pattern");
					Bulb bulb=new Bulb();
					
					On on = new On(bulb);
					on.listen();
					Off off = new Off(bulb);
					off.listen();
				}
				break;
			}
		}
		
		System.out.println("Would you like to continue? (Y/N)");
		c=sc.next().charAt(0);
		
		if(c=='N')
			break;
		continue;
		
		}
		sc.close();
	}
		

}
