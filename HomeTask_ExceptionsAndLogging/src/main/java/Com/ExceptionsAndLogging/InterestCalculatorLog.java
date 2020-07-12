package Com.ExceptionsAndLogging;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

	public class InterestCalculatorLog extends HouseConstructionLog{
		
		public static final Logger LOGGER = LogManager.getLogger(InterestCalculatorLog.class);
			 void Interest(){
			 Scanner sc = new Scanner(System.in);
			 System.out.format("%s","Enter si for Simple Interest or ci for Compound Interest or hc for "
			 		+ "House Construction: ");
			 
			 String choice = sc.nextLine();
			 LOGGER.info("choice: "+choice);
			 
			 if (choice.equalsIgnoreCase("hc")) {
		    	 HouseConstructionLog hc = new HouseConstructionLog();
		    	 hc.constructionCost();
		     }
			 else {
			 System.out.format("%s","Enter principle amount:");
			 float principle = sc.nextFloat();
			 System.out.format("%s","Enter time period of interest:");
			 float timePeriod = sc.nextFloat();
			 System.out.format("%s","Enter rate of interest for 1 year:");
			 int rateOfInterest = sc.nextInt();
			 sc.close();
			 float compoundInterest = 0;
			 float simpleInterest = 0;
			 LOGGER.info("principle: "+principle);
			 LOGGER.info("timeperiod: "+timePeriod);
			 LOGGER.info("rate of interest: "+rateOfInterest);
			     if (choice.equalsIgnoreCase("si")) {
			    	 simpleInterest = (principle*timePeriod*rateOfInterest)/100;
			    	 LOGGER.info("simpleInterest: "+simpleInterest);
			     }
			     else if (choice.equalsIgnoreCase("ci")) {
			    	float amount=0;
					while(timePeriod>=1) {
						compoundInterest+=(principle+amount)*rateOfInterest/100;
						amount = compoundInterest;
						timePeriod-=1;
					}
					if (timePeriod>0 && timePeriod<1) {
						compoundInterest += ((principle+amount)*rateOfInterest/100)*(timePeriod);
						
					}
					LOGGER.info("compoundInterest: "+compoundInterest);
				 }
			 }
			
		}
		}

