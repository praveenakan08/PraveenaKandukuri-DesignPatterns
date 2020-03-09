package com.pravee.task7;

interface Listener
{
	void listen();
}

public class Bulb
{  
    void on()
    {  
    	System.out.println("Bulb is switched ON");  
    }
    
    void off()
    {  
    	System.out.println("Bulb is switched OFF");  
    }  
}

class On implements Listener
{
	Bulb bulb;
	
	On(Bulb bulb)
	{
		this.bulb=bulb;
	}
	
	public void listen()
	{
		bulb.on();
	}
}

class Off implements Listener
{
	Bulb bulb;
	
	Off(Bulb bulb)
	{
		this.bulb=bulb;
	}
	
	public void listen()
	{
		bulb.off();
	}
}

