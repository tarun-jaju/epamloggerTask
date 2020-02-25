package loggerTask;


import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
  
    public class SimpleIntrest {
    	public static final Logger LOGGER = LogManager.getLogger(SimpleIntrest.class);

public void calculateSimpleIntrest() throws IOException
{
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	
	LOGGER.info("this is simple intrest class");
	LOGGER.info("enter the principal amount");
	
	double principal=Double.parseDouble(input.readLine());
	LOGGER.info("enter the tenure to calculate simple intrest(in years)");

	double term=Double.parseDouble(input.readLine());
	LOGGER.info("enter rate of intrest(in %)");

	double rateOfIntrest=Double.parseDouble(input.readLine());
	
	
	double simpleIntrest=(principal*term*rateOfIntrest)/100;
	LOGGER.info("the simple intrest of the principal amount is\n "  +simpleIntrest);
	
	double finalAmount=principal+simpleIntrest;
	LOGGER.info("the final amount after adding intrest is\n "    +finalAmount);
	
}
}