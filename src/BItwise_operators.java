public class BItwise_operators {



    static void main(String[] args) {
        //Bitwise AND (&)
        int a =5,b=3;

        System.out.println(a&b);
        //2) Bitwise OR (|)
        System.out.println(a|b);

        //3) Bitwise XOR (^)
        System.out.println(a^b);

        //XOR speacial XOR Properties
//        Property 1
//        a ^ a = 0
//        Property 2
//        a ^ 0 = a
//        Property 2
//        a ^ b ^ a = b

//        Use Case: Swap Without Temp
        int x=5;
        int y=2;
        x=x^y;
        y=x^y;
        x=x^b;
        System.out.println(x+"  "+y);

        int m = 8;
        System.out.println(m >> 1);


        //Example 1: Check Even or Odd
        int n=31;
        if((n&1)==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        //Example 2: Multiply by 2
        System.out.println(n<<1);
        //Example 3: Divide by 2
        System.out.println(n>>1);
        //Example 4: Check Power of 2
//        if ((n &(n-1))==0){
//            System.out.println("yes in two ki power");
//        }

        int[] arr = {2, 3, 5, 3, 2};
        int unique=0;
        for (int num:arr){
            unique=unique^num;
        }
        System.out.println(unique);




    }


}
