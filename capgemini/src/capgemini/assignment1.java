package capgemini;
import java.util.*;

/*
 //smallest sum of consecutive no in array
public class assignment1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the size of array");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.print("enter the elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int minsum=arr[0]+arr[1];
		for(int i=1;i<n;i++) {
			int sum =arr[i]+arr[i+1];
		    if(sum<minsum)
			   minsum=sum;
			   
		}
		System.out.print("Smallest sum of consecutive no is"+minsum);
}
}

*/

/*
//find power of number
public class assignment1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter base: ");
		int base=sc.nextInt();
		System.out.print("enter power: ");
		int power=sc.nextInt();
		
		int result=1;
		for(int i=1;i<=power;i++) {
			result=result*base;
		}
		System.out.print(result);
	}
}
*/

/*  // negative power 
public class assignment1 {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        double result = 1;
        power= -power;
        
        for(int i=1;i<=power;i++) {
        	result= result*base;
        }
        result=1/result;

        System.out.println("Result: " + result);
    }
}

*/

/* reverse string without recursion
public class assignment1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1 = sc.nextLine();      

        String rev = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }
        System.out.print(rev);
	}
}
*/

/*
//unique character
public class assignment1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Unique characters: ");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.print(ch + " ");
            }
        }
    }
}
*/

/*  //repeated characters
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Repeated characters: ");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch)
                && i == str.indexOf(ch)) {
                System.out.print(ch + " ");
            }
        }
    }
}

*/

/* count the character
public class assignment1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to count: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println( ch + " occurs " + count + " times");
    }
}
*/


/*
//Count number of VOWELS and CONSONANTS

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
*/

/*//string to integer
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numeric string: ");
        String str = sc.nextLine();

        int num = Integer.parseInt(str);

        System.out.println("Integer value: " + num);
    }
}
*/

/*
public class assignment1{
    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = new String ("Java");

        // memory Reference comparison
        System.out.println(s1 == s2);       

        // Content comparison
        System.out.println(s1.equals(s2));   
    }
}

*/

/*
//characters from name in ascending order
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine().toLowerCase();
        char[] ch = name.toCharArray();
        Arrays.sort(ch);

        System.out.print("Letters in ascending order: ");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

        }
    }
*/

/*
//digits in ascending order
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine(); 
        char[] digits = num.toCharArray();
        Arrays.sort(digits);

        System.out.print("Digits in ascending order: ");
        for (char d : digits) {
            System.out.print(d);
        }
    }
}

*/

/*
//avg of the 10 no
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++) {
        	int n=sc.nextInt();
            sum = sum + n;
        }

        double average = sum / 10.0;

        System.out.println("Average: " + average);
    }
}
*/

/*
//even n odd sum
public class assignment1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0, oddSum = 0;
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers:");
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum = evenSum + num;
            } else {
                oddSum = oddSum + num;
            }
        }

        System.out.println("Sum of Even nos: " + evenSum);
        System.out.println("Sum of Odd nos: " + oddSum);
    }
}
*/


/*
//PrimeFactors of a no

public class assignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Prime factors are: ");

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
    }
    
}

*/

/*
//strong no

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (sum == original)
            System.out.println("Strong number");
        else
            System.out.println("Not a strong number");
    }
}

*/

/*
//perfect no
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum = sum + i;
        }

        if (sum == num)
            System.out.println("Perfect number");
        else
            System.out.println("Not a perfect number");
    }
}
*/

/* sort array in descending order
public class assignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];   
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());

        for (int x : arr)
            System.out.print(x + " ");
    }
}
*/

/*
//sort array
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);   // sorting array

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/
/*
//diamond pattern
public class assignment1 {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i =1; i <= n; i++) {
            for (int k = 1; k<=i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

*/

/*public class demo2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a name: ");
    String name = sc.nextLine().toLowerCase();
    char[] ch = name.toCharArray();
    Arrays.sort(ch);

    System.out.print("sorted string: ");
    for (int i = 0; i < ch.length; i++) {
        System.out.print(ch[i]);
    }

    }
}
*/
/*
public class demo2 {
static boolean containsAll(String window, String[] patterns) {
    for (String p : patterns) {
        if (!window.contains(p)) {
            return false;
        }
    }
    return true;
}

public static void main(String[] args) {

    String S = "abdcabxycabca";
    String[] P = {"cab", "xy", "bca"};

    int minLen = Integer.MAX_VALUE;
    String answer = "";

    for (int i = 0; i < S.length(); i++) {
        for (int j = i + 1; j <= S.length(); j++) {

            String window = S.substring(i, j);

            if (containsAll(window, P)) {
                if (window.length() < minLen) {
                    minLen = window.length();
                    answer = window;
                }
            }
        }
    }

    System.out.println(answer.isEmpty() ? -1 : answer);
}
}
*/

/*
public class assignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  

        int term = 1;

        for (int i = 1; i <= N; i++) {

            int output = term;

            if (i % 2 == 0)     
                output = -output;

            System.out.print(output + " ");

            term = term + (i * i);   
        }
    }
}
*/

/*import java.util.* ;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   

        int a = 1, b = 5, c = 8;

        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");

        for (int i = 4; i <= N; i++) {
            int next = a + b + c;   
            System.out.print(next + " ");
            a = b;
            b = c;
            c = next;
        }
    }
}

*/
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = 1, b = 1;

        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}*/


public class assignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 

        int odd = 1;   
        int even = 2;  

        for (int i = 1; i <= N; i++) {

            if (i % 2 != 0) {  
                System.out.print(odd + " ");
                odd = odd + 3;         
            }
            else {                     
                System.out.print(-even + " ");
                even = even + 4;       
            }
        }
    }
}




