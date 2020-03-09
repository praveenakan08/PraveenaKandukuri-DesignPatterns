package com.pravee.task7;

public class TypeCToUSBTypeAdapter implements TypeC
{
	USBCLass usbType;
	
    public TypeCToUSBTypeAdapter(USBCLass usbType) 
    { 
    	this.usbType=usbType;
    } 
  
    public void receiveData() 
    { 
    	System.out.println("Converting Type C to USB Type");
    	usbType.receiveData();
    } 
	
    public void transferData() 
    { 
    	System.out.println("Converting Type C to USB Type");
        usbType.transferData(); 
    }
}
