package PRACTICE1;

import java.util.Scanner;

public class Hard {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num =sc.nextInt();

        //qs21
//        System.out.println(Palindrome(num)?"this number is palindrome":"this number is not palindrome");

        //qs22
//        System.out.println(Armstrong(num)?"this number is Armstrong":"this number is not Armstrong");

        //qs23
//        System.out.println(Prime(num)?"Prime number ":"not Prime number");

        //qs24
//        Prime_In_Range(num);

        //qs25
//        System.out.println("enter the a");
//        int a= sc.nextInt();
//        System.out.println("enter the b");
//        int b= sc.nextInt();
//        System.out.println(GCD(a,b));

        //qs26
//        System.out.println("enter the a");
//        int a= sc.nextInt();
//        System.out.println("enter the b");
//        int b= sc.nextInt();
//        System.out.println(LCM(a, b));

        //qs27
//        System.out.println("enter the n");
//        int n= sc.nextInt();
//        Fibonacci(n);


        //qs29
//        System.out.println("enter the power");
//        int power= sc.nextInt();
//        System.out.println(twenty9(num,power));

        //qs30
//        thirty(num);

        //qs31
//        System.out.println(maxDigit(num));

        //qs32
//        System.out.println(minDigit(num));

        //qs33
//        N(num);

        //qs34
//        PERFECT(num);

        //qs35
//        Factor(num);

        //qs36
//        COUNT_FACTOR(num);

        //qs37
//        SUM_FACTOR(num);



    }




    //21. Check whether a number is a palindrome.
//    public static boolean Palindrome(int num){
//        if (num<0) return false;
//        int original=num,rev=0;
//        while (num>0){
//            rev=rev*10+num%10;
//            num/=10;
//        }
//        return original==rev;
//    }

    //22. Check whether a number is an Armstrong number.
//    public static boolean Armstrong(int num){
//        if (num < 0) return false;
//        int original=num,temp=num,digits=0,sum=0;
//        do{
//            digits++;
//            temp/=10;
//        }while (temp>0);
//        while (num>0){
//            int digit=num%10;
//            sum+=(int)Math.pow(digit,digits);
//            num/=10;
//        }
//        return sum==original;
//    }

    //23. Check whether a number is prime.
//    public static boolean Prime(int num){
//        if(num<=1) return false;
//        for (int i=2;i*i<=num;i++){
//            if (num%i==0) return false;
//        }
//        return true;
//    }

    //Print all prime numbers between 1 and N.
//    public static void Prime_In_Range(int num){
//        for (int i=2;i<=num;i++){
//            boolean prime= true;
//            for(int j =2 ;j*j<=i;j++){
//                if (i%j==0){
//                    prime=false;
//                    break;
//                }
//            }
//            if (prime){
//                System.out.println(i +" ");
//            }
//        }
//
//
//    }

    //25. Find the GCD of two numbers.
//    static int GCD(int a,int b){
//        while (b!=0){
//            int temp=b;
//            b=a%b;
//            a=temp;
//        }
//        return a;
//    }

    //26. Find the LCM of two numbers.
//    static  int LCM(int a , int b){
//        int original_A=a;
//        int original_B=b;
//        while(b!=0){
//            int temp=b;
//            b=a%b;
//            a=temp;
//        }
//        return (original_A * original_B) / a;
//    }

    //27. Print the Fibonacci series up to N terms.
//    static void Fibonacci(int n){
//        int a=0,b=1;
//        for (int i=1 ;i<=n;i++){
//            System.out.print(a+" ");
//            int next=a+b;
//            a=b;
//            b=next;
//        }
//    }
    //28. Find the Nth Fibonacci number.
//    static void Fibonacci(int n){
//        int a=0,b=1;
//        for (int i=1 ;i<=n;i++){
//            System.out.print(a+" ");
//            int next=a+b;
//            a=b;
//            b=next;
//        }
//    }

    //29. Calculate x^n without using Math.pow().
//    static int twenty9(int x, int n) {
//        int sum = 1;
//        for (int i = 1; i <= n; i++) {
//            sum *= x;
//        }
//        return sum;
//    }



    //30. Count how many even and odd digits are present in a number.
//    static void thirty(int num){
//        int countE=0,countO=0;
//        while (num>0){
//            int single_D=num%10;
//            num=num/10;
//            if (single_D%2==0){
//                countE+=1;
//            }
//            else {
//                countO+=1;
//            }
//        }
//        System.out.println("Even digits: " + countE);
//        System.out.println("Odd digits: " + countO);
//
//    }

    //31. Find the largest digit in an integer.
//    static int maxDigit(int n){
//        int max=0;
//        n=Math.abs(n);
//        while (n>0){
//            max=Math.max(max,n%10);
//            n/=10;
//        }
//        return max;
//    }

    //32. Find the smallest digit in an integer.
//    static int minDigit(int n){
//        int min=9;
//        n=Math.abs(n);
//        while (n>0){
//            min=Math.min(min,n%10);
//            n/=10;
//        }
//        return min;
//    }

    //33. Remove the last digit of a number repeatedly and print each intermediate value.
//    static void N(int num){
//        while (num>=0){
//            num/=10;
//            System.out.println(num);
//            if (num==0){
//                break;
//            }
//        }
//    }

    //34. Check whether a number is a perfect number.
//    static void PERFECT(int num) {
//        int original = num;
//        int sum = 0;
//        for (int i = 1; i < num; i++) {
//            if (num % i == 0) {
//                sum += i;
//            }
//        }
//        if (original == sum) {
//            System.out.println("This is a perfect number");
//        } else {
//            System.out.println("This is not a perfect number");
//        }
//    }

    //35. Print all factors of a number.
//    static void Factor(int num){
//        for (int i=1;i<num;i++){
//            if (num%i==0){
//                System.out.print(i+" ");
//            }
//        }
//    }

    //36. Count the number of factors of a number
//    static void COUNT_FACTOR(int num){
//        int count=0;
//        for (int i=1;i<num;i++){
//            if (num%i==0){
//                count+=1;
//            }
//        }
//        System.out.println(count);
//    }

    //37. Find the sum of all factors of a number.
//    static void SUM_FACTOR(int num){
//        int sum=0;
//        for (int i=1;i<num;i++){
//            if (num%i==0){
//                sum=i+sum;
//            }
//        }
//        System.out.println(sum);
//    }



}

