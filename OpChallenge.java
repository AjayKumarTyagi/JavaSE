class OpChallenge{
	public static void main(String args[]){
		double var1=20.00; // declaring var1
		double var2=80.00; // declaring var2
		double var3=(var1+var2)*100.00;
		System.out.println("total= "+var3); // printing var3
		double rem=var3%40.00;
		System.out.println("remainder= "+rem); // printing remainder
		boolean var4; // declaring boolean variable
		if(rem==0)
			var4=true;
		else
			var4=false;
		System.out.println("boolean var= "+var4); // printing var4
		if(var4!=true)
			System.out.println("Got some remainder"); // this should not print
	}
}
