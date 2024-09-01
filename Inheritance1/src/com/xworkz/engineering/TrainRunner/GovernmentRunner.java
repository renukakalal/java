package com.xworkz.engineering.TrainRunner;

import com.xworkz.engineering.toothpaste.CentrlGovernmnet;
import com.xworkz.engineering.toothpaste.StateGovernment;

public class GovernmentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateGovernment stateGovernment=new StateGovernment("karnatka");
		CentrlGovernmnet  centrlGovernmnet=new CentrlGovernmnet(224,"kharge","g.parmeswar");
		stateGovernment.display();
		centrlGovernmnet.display();
		 
	}

}
