/*Methods.java is designed to demonstrate the use of user-defined methods in Java. 
 * It contains methods for basic arithmetic operations such as addition, subtraction, 
 * multiplication, division, and modulus, along with mathematical operations 
 * such as finding maximum, square, cube, power, and average.

The program also implements number-based methods to check even/odd, prime, palindrome, Armstrong, 
perfect, strong, and Harshad numbers, as well as methods for Fibonacci series, GCD, LCM, factorial, 
and swapping two numbers.

It demonstrates string and array operations, including string reversal, palindrome checking, vowel counting, 
finding elements, finding missing numbers, and calculating the sum of array elements.

The program further covers searching and sorting algorithms, including Linear Search, Binary Search, 
Insertion Sort, and Bubble Sort.

It also contains several star-pattern methods, including right triangle, 
inverted triangle, square, right-aligned triangle, and inverted right-aligned triangle patterns.

Finally, the program demonstrates Java's Math class, geometric calculations such as square and rectangle area, 
cube and cuboid CSA/TSA/volume, unit conversions, and ASCII character conversion. */
package com.vcubeprograms;

import java.util.Arrays;

public class Methods {
	static void add(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	static void sub(int a, int b) {
		System.out.println("Difference: " + (a - b));
	}

	static void product(int a, int b) {
		System.out.println("Product: " + (a * b));
	}

	static void divison(int a, int b) {
		System.out.println("Quoitent: " + (a / b));
	}

	static void modulo(int a, int b) {
		System.out.println("Remainder: " + (a % b));
	}

	static void max(int a, int b) {
		System.out.println("max: " + Math.max(a, b));
	}

	static void square(int a) {
		System.out.println("Square of an number: " + (a * a));
	}

	static void cube(int a) {
		System.out.println("Cube of a number: " + (a * a * a));
	}

	static void power(int a, int b) {
		System.out.println("Power of (a,b): " + Math.pow(a, b));
	}

	static void average(int a, int b) {
		System.out.println("Average: " + ((a + b) / 2));
	}

	static void isevenorodd(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even number");
		} else {
			System.out.println(a + " is odd number");
		}
	}

	// Check is prime or not
	static void isprime(int a) {
		if (a <= 0 || a == 1) {
			System.out.println("Prime number starts from 2");
		}
		boolean val = false;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				val = false;
			} else {
				val = true;
			}
		}
		if (val == true) {
			System.out.println("Is a prime");
		} else {
			System.out.println("is not prime");
		}
	}

//Swap two numbers
	static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swapped: " + a + " ," + b);
	}

//Check whether the number is palindrome or not
	static void palindrome(int a) {
		boolean ispalindrome = false;
		int org = a;
		int rev = 0;
		while (a > 0) {
			int temp = a % 10;
			rev = rev * 10 + temp;
			a = a / 10;
		}
		if (org == rev) {
			ispalindrome = true;
		}
		System.out.println("a is palindrome:" + ispalindrome);
	}

//Check whether the number is armstrong or not
	static boolean isarmstrong(int a) {
		int org = a;
		int sum = 0;
		int l = String.valueOf(a).length();
		while (a > 0) {
			int temp = a % 10;
			sum += Math.pow(temp, l);
			a = a / 10;
		}
		return org == sum;
	}

	static boolean isperfect(int a) {
		int sum = 0;
		for (int i = 1; i <= (a / 2); i++) {
			if (a % i == 0) {
				sum += i;
			}
		}
		return a == sum;
	}

	static boolean isstrong(int a) {
		int sum = 0;
		int org = a;
		while (a > 0) {
			int temp = a % 10;
			int product = 1;
			for (int i = 1; i <= temp; i++) {
				product *= i;
			}
			sum += product;
			a = a / 10;
		}
		return org == sum;
	}

	static boolean isharshad(int a) {
		int sum = 0;
		int org = a;
		while (a > 0) {
			int temp = a % 10;
			sum += temp;
			a = a / 10;
		}
		return org % sum == 0;
	}

	static void fibonacci(int n) {
		int b = 0;
		int c = 1;
		System.out.println("Fibonacci Series: ");
		for (int i = 0; i < n; i++) {
			System.out.print(b + " ");
			int d = b + c;
			b = c;
			c = d;
		}
		System.out.println();
	}

	static int lcm(int a, int b) {
		int max = Math.max(a, b);
		while (true) {
			if (max % a == 0 && max % b == 0) {
				return max;
			}
			max++;
		}

	}

	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % temp;
			a = temp;
		}
		return a;
	}

	static int sum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	static void reverse(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			rev += ch;
		}
		System.out.println(rev);
	}

	static void pali(String s) {
		String rev = new StringBuilder(s).reverse().toString();
		if (s.equals(rev)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	static int missing(int[] arr) {
		int n = arr.length + 1;
		int total = (n * (n + 1)) / 2;
		int missing = total - sum(arr);
		return missing;
	}

	static void countVowels(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
					|| c == 'u') {
				count += 1;
			}
		}
		System.out.println("Count: " + count);
	}

	static void show(String s) {
		System.out.println(s);
	}

	static boolean find(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;
	}

	static int binarysearch(int[] arr, int key) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (key < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	static int linearsearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		return arr;
	}

	static void righttriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void invertedrighttriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void rightalignedtriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void irightalignedtriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * (i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void triangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void squares(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void random() {
		System.out.println("Random value: " + Math.random());
	}

	static void trigo(int x) {
		System.out.println("Sine value: " + Math.sin(x));
		System.out.println("Cosine value: " + Math.cos(x));
		System.out.println("Tangent value: " + Math.tan(x));
		System.out.println("Sin Inverse value: " + Math.asin(x));
		System.out.println("Cos Inverse value: " + Math.acos(x));
		System.out.println("Tan Inverse: " + Math.atan(x));

	}

	static void log(int x) {
		System.out.println("Logaritm value: " + Math.log(x));
		System.out.println("Logarithm base 10 value: " + Math.log10(x));
		System.out.println("Another log value: " + Math.log1p(x));

	}

	static void rounding(int x) {
		System.out.println("Ceil: " + Math.ceil(x));
		System.out.println("Round off: " + Math.round(x));
		System.out.println("Ceil: " + Math.floor(x));
	}

	static void constants() {
		System.out.println("PI value: " + Math.PI);
		System.out.println("E value: " + Math.E);
		System.out.println("TAU Value" + Math.TAU);
	}

	static void area_of_square(int s) {
		int area = s * s;
		System.out.println("Area of a square: " + area);
	}

	static void area_of_rectangle(int l, int b) {
		int area = l * b;
		System.out.println("Area of rectangle: " + area);
	}

	static void cubecal(int a) {
		int csa = 4 * (a * a);
		int tsa = 6 * (a * a);
		int vol = a * a * a;
		System.out.println("Curved surface area of cube: " + csa);
		System.out.println("Total surface area of cube: " + tsa);
		System.out.println("Volume of a cube: " + vol);
	}

	static void cuboidcal(int l, int b, int h) {
		int csa = 2 * h * (l + b);
		int tsa = 2 * (l * b + b * h + h * l);
		int vol = l * b * h;
		System.out.println("Curved surface area of cuboid: " + csa);
		System.out.println("Total surface area cuboid: " + tsa);
		System.out.println("Volume of a cuboid: " + vol);
	}

	static void details(String name) {
		System.out.println("Name of the person done: " + name);
		System.out.println("Done to learn more on methods");
		System.out.println("Helped me a lot of understanding");
	}

	static void conversions(int km) {
		int celsius = 10;
		int farenheit = (celsius * 9 / 5) + 32;
		System.out.println("Celsius to farenheit: " + farenheit);
		System.out.println("Km to meters: " + km * 1000 + " m");
		System.out.println("Km to centimeters: " + km * 100000 + " cm");
	}

	static void getasciivalue(int c) {
		System.out.println("ASCII value: " + c);
	}

	static void getcharacter(int c) {
		char ch = (char) c;
		System.out.println("AsCII character: " + ch);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		int[] arr = { 1, 2, 66, 444, 5, 7, 6, 9 };
		int key = 8;
		int x = 60;
		int s = 5;
		int l = 12, h = 9;
		// Basic operations
		add(a, b);
		sub(a, b);
		product(a, b);
		divison(a, b);
		modulo(a, b);
		max(a, b);
		square(a);
		cube(a);
		power(a, b);
		average(a, b);
		System.out.println();
		// Medium problems
		isevenorodd(a);
		isprime(a);
		swap(a, b);
		palindrome(a);
		System.out.println("Is armstrong: " + isarmstrong(a));
		System.out.println("Is a perfect number: " + isperfect(a));
		System.out.println("Is a Strong number: " + isstrong(a));
		System.out.println("Is a Harshad Number: " + isharshad(a));
		fibonacci(a);
		System.out.println("lcm : " + lcm(a, b));
		System.out.println("GCD: " + gcd(a, b));
		reverse("SAI MANOJ");
		pali("aasa");
		System.out.println(sum(arr));
		System.out.println("Factorial of a number: " + factorial(a));
		System.out.println("Missing number: " + missing(arr));
		countVowels("SAI MANOJ");
		show("This is the most popular programming language done with the most intention");
		System.out.println(find(arr, key));
		System.out.println(binarysearch(arr, 7));
		System.out.println("Number found at position: " + linearsearch(arr, 5));
		int[] res = insertionSort(arr);
		System.out.println("Sorted using Insertion Sort:" + Arrays.toString(res));
		int[] resu = bubbleSort(arr);
		System.out.println("Sorted using bubble sort: " + Arrays.toString(resu));
		righttriangle(b);
		System.out.println();
		invertedrighttriangle(b);
		System.out.println();
		squares(b);
		System.out.println();
		triangle(b);
		System.out.println();
		rightalignedtriangle(b);
		System.out.println();
		irightalignedtriangle(b);
		System.out.println();
		random();
		trigo(x);
		log(x);
		rounding(x);
		constants();
		System.out.println();
		area_of_square(s);
		area_of_rectangle(l, b);
		cubecal(a);
		cuboidcal(l, b, h);
		System.out.println();
		conversions(b);
		char c = 'a';
		getasciivalue(c);
		getcharacter(100);

	}

}
