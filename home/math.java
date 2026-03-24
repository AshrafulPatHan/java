public class math{
	// java math
	public static void main(String []args){

		// math oparation
		int x = 10;
		int y = 3;

		System.out.println(x + y); // 13
		System.out.println(x - y); // 7
		System.out.println(x * y); // 30
		System.out.println(x / y); // 3
		System.out.println(x % y); // 1

		/*
			+	Addition	Adds together two values	x + y	
			-	Subtraction	Subtracts one value from another	x - y	
			*	Multiplication	Multiplies two values	x * y	
			/	Division	Divides one value by another	x / y	
			%	Modulus	Returns the division remainder	x % y	
			++	Increment	Increases the value of a variable by 1	++x	
			--	Decrement	Decreases the value of a variable by 1	--x
		*/
		int z = 5;
		++z;
		System.out.println(z); // 6
		--z;
		System.out.println(z); // 5

		/*
			=	x = 5	x = 5	    
			+=	x += 3	x = x + 3	
			-=	x -= 3	x = x - 3	
			*=	x *= 3	x = x * 3	
			/=	x /= 3	x = x / 3	
			%=	x %= 3	x = x % 3	
			&=	x &= 3	x = x & 3	
			|=	x |= 3	x = x | 3	
			^=	x ^= 3	x = x ^ 3	
			>>=	x >>= 3	x = x >> 3	
			<<=	x <<= 3	x = x << 3  
		*/
		int savings = 100; 
		savings += 50; // add 50 to savings
		System.out.println("Total savings: " + savings);

		// math logic
		/*
			==	Equal to	x == y	
			!=	Not equal	x != y	
			>	Greater than	x > y	
			<	Less than	x < y	
			>=	Greater than or equal to	x >= y	
			<=	Less than or equal to	x <= y
		*/
		System.out.println(x > y);
	}
}