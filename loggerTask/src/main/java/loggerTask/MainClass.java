package loggerTask;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MainClass {
	public static final Logger LOGGER = LogManager.getLogger(CompoundIntrest.class);
	
public static void main(String[] args)throws IOException 
{
	LOGGER.info("this is main class");
	SimpleIntrest simpleIntrestObj=new SimpleIntrest();
	simpleIntrestObj.calculateSimpleIntrest();
	CompoundIntrest  CompoundIntrestObj=new 	CompoundIntrest();
	CompoundIntrestObj.calculateCompoundIntrest();
}
}
