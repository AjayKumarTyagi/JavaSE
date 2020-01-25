/* Operator Challenge

Step number one is to create a double variable

with a value of 20.00.

Step two create a second variable of type double

with a value 80.00.

Step three is to add both numbers together

then multiply by 100.00.

Step 4 use the remainder operator

to figure out what the remainder

from the result of the operation in step three and 40.00 is.

Now we have used the modulus

or remainder operator on ints in this course

but I'm confirming here

you can also do the same for double

a variable of type double.

Step 5 create a boolean variable

that assigns the value true

if the remainder in step four is 0.00

or false if it's not zero.

Step 6 output the boolean variable

just to see what the result is

and step seven write an if-then statement

that displays a message 'got some remainder'

if the boolean in step five is not true. */

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
