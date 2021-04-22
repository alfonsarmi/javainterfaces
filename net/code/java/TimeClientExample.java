package net.code.java;

import java.time.LocalDateTime;

public class TimeClientExample
{
	public void main()
	{
		TimeClient timeClient = new TimeClientImplementation();
		timeClient.setTime(1,1,1);	
		
		TimeClient.MethodInsideInterface();
	}
	
}
