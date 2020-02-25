package loggerTask;


import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.Math;

public class CompoundIntrest {
	public static final Logger LOGGER = LogManager.getLogger(CompoundIntrest.class);
public void calculateCompoundIntrest()throws IOException
{
	LOGGER.info("this is compound intrest class");
	BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
	LOGGER.info("this is compound intrest class");
	
	LOGGER.info("\nenter the principal amount\n");
	
	double principal=Double.parseDouble(read.readLine());
	LOGGER.info("enter the tenure to calculate compound intrest(in years)\n");
	
	double term=Double.parseDouble(read.readLine());
	LOGGER.info("enter the rate of intrest(in %)\n");
	
	double rateOfIntrest=Double.parseDouble(read.readLine());
	rateOfIntrest/=100;
	LOGGER.info("enter the times the intrest is coumpounded in a year\n");
	
	int timesCompounded=Integer.parseInt(read.readLine());
	
	double finalAmount=principal*(Math.pow(1+(rateOfIntrest/timesCompounded),term*timesCompounded));
	double compoundIntrest=finalAmount-principal;
	LOGGER.info("the amount of intrest is\n"   +compoundIntrest);
	
	LOGGER.info("the final amount after adding intrest is \n"   +finalAmount);
	
}
}
