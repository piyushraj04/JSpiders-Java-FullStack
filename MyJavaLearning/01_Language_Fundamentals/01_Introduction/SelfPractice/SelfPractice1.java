/*
This code is writetn to practice some question
These questions are given by ChatGPT
*/

/*
Questions::

*/

class SelfPractice1
{
	public static void main(String[] args)
	{
		/*
		Q1. Output this line exactly as shown, using only one println():
            Java + 10 + 20 = Java1020
		*/
		System.out.println("Java + 10 + 20 = " + "Java" + 10 + 20);
		
		/*
		Q2. Write a program that prints:
             Java + 10 + 20 = 30Java
            💡 Tip: Combine addition and strings wisely!
		*/
		System.out.println("Java + 10 + 20 = " + (10+20) + "Java");
		
		/*
		Q3. Print the following using only one print():
             Line1 Line2 Line3
             (All on one line, separated by space)
		*/
		System.out.print("Line1 Line2 Line3");
		  
		  
		// to print in next line I use System.out.println(); directly here
		System.out.println();
		/*
		 Q4. Print this with exact spacing and lines:
              * * *
              *   *
              * * *
            Use multiple println() statements smartly.
		*/
		System.out.println("* * *");
		System.out.println("*   *");
		System.out.println("* * *");
		
		/*
		Q5. Combine strings and numbers to produce this output:
            The product of 4 and 5 is 20.
		*/
		System.out.println("The product of 4 and 5 is " + 20);
		
		/*
		🤔 Q6. What’s the output?
               System.out.println("Answer: " + 10 + 5);
               System.out.println("Answer: " + (10 + 5));
               ✍ Write your answers as comments too.
			   
			   The answer are: 
			   Answer: 105
			   Answer: 15
		*/
		System.out.println("Answer: " + 10 + 5);
        System.out.println("Answer: " + (10 + 5));
		
		/*
		Q7. Output:
            Total = 40, Average = 20.0
            Hint: Use + operator and values like int total = 40; and double avg = 20.0;
		*/
		int total = 40;
		double avg = 20.0;
		System.out.println(total+avg); //60.0 which is wrong output according to question
		//The correct one should be:
		System.out.println("Total = " + total + ", Average = " + avg);
		/*
		Q8. Create a pattern using only println() and print():
		     1
             12
             123
		*/
		System.out.println(1);
		System.out.println(12);
		System.out.print(123);
		
		/*
		 Q9. Trick: Print this in one line:
             The sum of 10 + 20 is: 30
		*/
		System.out.println("The sum of 10 + 20 is: " + (10+20) );
		
		/*
		🧪 Q10. Experiment:
                Try writing a program that prints the data types you know so far and how you would represent them in print. Like:
                int = 10
                String = Hello
                double = 4.5
		*/
		System.out.println("int = 10");
		System.out.println("String = Hello");
		System.out.println("double = 4.5");
	}
}