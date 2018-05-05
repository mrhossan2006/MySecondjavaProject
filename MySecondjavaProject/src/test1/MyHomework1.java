package test1;

public class MyHomework1 {
	public  static void main(String[]args){

	char ch;

	for(ch='a'; ch<='z'; ch++ )
		
		System.out.print(ch);
	System.out.println(".................");
	char ch1;
	for (ch1='z';ch1>='a';ch1--)
		System.out.println(ch1);
	}

		//homework #2 Switch case statement

		public void SwitchStatement(){
			char input='A';
			switch(input){
			
			case 'A':System.out.println("Bangladesh");
			break;
			case 'B':System.out.println("Canada");
			break;
			case 'C':System.out.println("Denmark");
			break;
			case 'D':System.out.println("England");
			break;
			 
			default:System.out.println("Invalid Input");

			}
			System.out.println("Your input is:"+input);
		}
		//Homework #3 print the number 0 to 50 and also print true or false if the number is divisible
		public void forLoop(){
			
			for (int x=0;x<=50;x++){
				System.out.println("value of x "+x);
			
			}
	}
		
		public void  NestedStatements()
		{
			int x=0;
			int y=3;
			for(x=0;x<=50;x++){
				if(x%3==0)
					
				System.out.println("value of x is true: "+x);
				else
				{
					System.out.println("value of x is false: "+x);
				}
				
			
		}
}
		}



