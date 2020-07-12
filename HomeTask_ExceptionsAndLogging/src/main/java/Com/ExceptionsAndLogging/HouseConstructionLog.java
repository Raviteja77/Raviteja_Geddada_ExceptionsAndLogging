package Com.ExceptionsAndLogging;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseConstructionLog {
	
	public static final Logger LOGGER = LogManager.getLogger(HouseConstructionLog.class);
	
			void constructionCost() { 
			 Scanner sc1 = new Scanner(System.in);
			 System.out.format("%s","Enter material quality:");
			 String material = sc1.nextLine();
			 System.out.format("%s","Enter area of house in square feets:");
			 float areaOfHouse = sc1.nextFloat();
			 System.out.format("%s","For fullyAutomated house enter 1 else 0:");
			 int fullyautomated=sc1.nextInt();
			 LOGGER.info("material: "+material);
			 LOGGER.info("areaOfHouse: "+areaOfHouse);
			 LOGGER.info("fullyautomated: "+fullyautomated);
			 float constructionCost=0;
			 sc1.close();
			 if (material.equalsIgnoreCase("standard")) 
				 constructionCost = 1200 * areaOfHouse;
			     
			 else if (material.equalsIgnoreCase("above standard")) 
				 constructionCost = 1500 * areaOfHouse;
			 
			 else if (material.equalsIgnoreCase("high standard") && fullyautomated==1) 
				 constructionCost = 2500 * areaOfHouse;
			 
			 else if (material.equalsIgnoreCase("high standard")) 
				 constructionCost = 1800 * areaOfHouse;	 
			 
			 else {
				 LOGGER.info("Invalid Input");
				 System.exit(0);
			 }
			 LOGGER.info("ConstructionCost: "+constructionCost); 
		}
		}





