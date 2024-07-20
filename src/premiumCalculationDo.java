
public class premiumCalculationDo {
	
	static double premiumCalTermIns(Double sumassured)
	{
		return 0.0001*sumassured;
	}

	static double premiumCalTermHealthIns(Double sumassured)
	{
		return 0.0001*sumassured*0.125;
	}

}
