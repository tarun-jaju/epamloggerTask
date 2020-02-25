package loggerConstruction;


import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;





class Estimate
{
	public static final Logger LOGGER = LogManager.getLogger(Estimate.class);
	void estimation()throws IOException
	{
		LOGGER.info("this is estimate class");
		int totalCost=0;
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

			LOGGER.info(" select  the type of materials that you want to use for construction\n");
			
			LOGGER.info("1.standard materials\n2.above standard materials\n3.high standard material\n4.fully automated materials");
	;
			int choice=Integer.parseInt(input.readLine());
			LOGGER.info("enter the area of your house(in sq feet)\n");
			
			int area=Integer.parseInt(input.readLine());
				if(choice==1)
					totalCost=1200*area;
				else	if(choice==2)
					totalCost=1500*area;
				else	if(choice==3)
					totalCost=1800*area;
				else if(choice==4)
					totalCost=2500*area;
				else
				{
					LOGGER.info("INVALID CHOICE\n");
				
				}
				
				LOGGER.info("the total cost of construction as per your choice is"+totalCost+"rupees\n" );
			
	}
	
}
public class CostEstimation {
	public static final Logger LOGGER = LogManager.getLogger(CostEstimation.class);
public static void main(String[] args)throws IOException
{
	LOGGER.info("this is main class");
	Estimate cost=new Estimate();
	cost.estimation();
}
}
