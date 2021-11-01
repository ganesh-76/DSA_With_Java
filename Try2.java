package com.example.test;

public class Try2 {
    /*
    public static int sumOfDigits(int n){
        if (n<=0){
            return 0;
        }
        return (n%10)+(sumOfDigits(n/10));
    }

    public static int countDigits(int n){
        int count = 1;
        if (n<10){
            return 1;
        }
        return countDigits(n/10)+count;
    }

    public static int digitalRoot(int n){
        if (n<=0) {
            return 0;
        }
        n = (n % 10) + digitalRoot(n / 10);
        if (n>=10){
           n = (n % 10) + digitalRoot(n / 10);
        }
        return n;
    }


    static int fibonacci(int n){
        if (n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }


    public static long toh(int N, int from, int to, int aux){
        if(N==1){
            System.out.println("Move disc " + 1 + " from "+ from + " to "+ to);
            return 0;
        }
        toh(N-1, from, to, aux);
        System.out.println("Move disc "+N+" from "+from+" to "+to);
        toh(N-1, aux, from, to);
        return 0;
    }

    public static int josephus(int n, int k){
        if (n==1){
            return n;
        }
        return (josephus(n - 1, k) + k-1) % n + 1;
    }


    static int RecursivePower(int n,int p)
    {
        // add your code here
        if(p==0){
            return 1;
        }
        return n*(RecursivePower(n, p-1));
    }

    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> roots = new ArrayList<Integer>();
        int root1 = 0, root2 = 0;
        // value of b^2-4ac
        int temp = (int)(Math.pow(b, 2) - 4 * a * c);

        // if b^2-4ac is less then zero then roots are imaginary
        if (temp < 0)
            roots.add(-1);
        else {
            // calculate root1 and root2 using fomula
            // Math.floor method returns greatest integer below ( -b + sqrt(temp) )
            // Math.sqrt method returns square root of temp
            // (int) converts returned value type to integer
            root1 = (int)Math.floor((-1 * b + Math.sqrt(temp)) / (2 * a));
            root2 = (int)Math.floor((-1 * b - Math.sqrt(temp)) / (2 * a));
            // store both roots calculated in List
            // Math.max method returns greater value between root1 and root2
            // Math.min method returns smaller value between root1 and root2
            roots.add(Math.max(root1, root2));
            roots.add(Math.min(root1, root2));
        }
        return roots;
    }

    public static int digitsInFactorial(int N){
        // code here
        double sum = 0.0;
        for (int i=1;i<=N;i++){
            sum = sum+Math.log10(i);
        }
        return (int)(1+Math.floor(sum));
    }

    public static double termOfGP(int A,int B,int N)
    {
        //Your code here
        double r = ((double)B)/A;   // Common ratio is find by r = (n+1)term/(n)term
        return A*Math.pow(r,N-1);   // Formula fot nth term is = a*r_power_(n-1)
    }

    public static boolean isprime(int n){
        if (n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int exactly3Divisors(int N)
    {
        //Your code here
        int counter=0;
        N = (int)Math.sqrt(N);
        for (int i=1;i<=N;i++){
            if (isprime(i)){
                counter++;
            }
        }
        return counter;
    }

    public static int countSetBits(int n)
    {
        //Ignoring 0 as all the bits are unset.
        n+=1;
        int count=0;

        //Counting set bits from 1 to n.
        for( int x=2 ; x/2<n ; x=x*2 )
        {
            //Total count of pairs of 0s and 1s.
            int quotient = n/x;
            //quotient gives the complete count of pairs of 1s.
            //Multiplying it with the (current power of 2)/2 will give
            //the count of 1s in the current bit.
            count += quotient * x / 2;

            int remainder = n%x;
            //If the count of pairs is odd then we add the remaining 1s
            //which could not be grouped together.
            if(remainder > x/2)
                count += remainder - x/2;
        }

        //returning count of set bits.
        return count;
    }

    public static int countSetBits1(int n){
        int count = 0;
        while(n>0){
            count = count + (n&1);
            n = n>>1;
        }
        return count;
    }
    public static int countBitsFlip(int a, int b){

        // Your code here
        int n = a^b;
        return countSetBits1(n);

    }

    public static boolean isSparse(int n)
    {
        // Your code here
       return (n&(n>>1))==0;
    }

    public static int maxConsecutiveOnes(int N) {
        // Your code here
        int count = 0;
        while(N>0){
            N = (N&(N<<1));
            //  N = (N&(N>>1));
            count++;
        }
        return count;
    }

    public static int grayToBinary(int n) {
        // Your code here
        int ans = 0;
        for (int i=n;n>0;n=n>>1){
            ans^=n;
        }
        return ans;
    }

    public static int swapBits(int n)
    {
        //0xAAAAAAAA means 10101010101010101010101010101010 in binary
        //we get all even bits of n.
        int even=n & 0xAAAAAAAA;
        //0x55555555 means 01010101010101010101010101010101 in binary.
        //we get all odd bits of n.
        int odd=n & 0x55555555;

        //right Shifting the even bits obtained previously.
        even>>=1;
        //left Shifting the even bits obtained previously.
        odd<<=1;

        //doing bitwise OR of even and odd bits obtained and
        //returning the final result.
        return (even | odd);

    }

     */
    public static int maxAND (int arr[], int N) {
        // Your code here
        // You can add extra function (if required)

    }
    public static void main(String[] args) {
        //  System.out.println(sumOfDigits(99999));
        //  System.out.println(countDigits(99999));
        //  System.out.println(digitalRoot(27640));
        //  System.out.println(fibonacci(20));
        //  int N = 3;
        //  int from = 1;
        //  int to = N;
        //  int aux = N-1;
        //  System.out.println(toh(3, from, to, aux));
        //  System.out.println(josephus(3, 2));
        //  System.out.println(RecursivePower(2, 9));
        //  System.out.println(quadraticRoots(1, -2, 1));
        //  System.out.println(quadraticRoots(1, -7, 12));
        //  System.out.println(quadraticRoots(5, 1, 4));
        //  System.out.println(quadraticRoots(752, 904, 164));
        //  System.out.println(digitsInFactorial(7)+" Digits");
        //  System.out.println(digitsInFactorial(0)+" Digit");
        //  System.out.println(digitsInFactorial(120)+" Digits");
        //  System.out.println(termOfGP(1,2,1));
        //  System.out.println(termOfGP(1,2,2));
        //  System.out.println(termOfGP(1,2,3));
        //  System.out.println(termOfGP(1,2,4));
        //  System.out.println(" ");
        //  System.out.println(termOfGP(2,3,1));
        //  System.out.println(termOfGP(2,3,2));
        //  System.out.println(termOfGP(2,3,3));
        //  System.out.println(termOfGP(2,3,4));
        //  System.out.println(exactly3Divisors(6));
        //  System.out.println(exactly3Divisors(67));
        //  System.out.println(countSetBits(4));
        //  System.out.println(countSetBits(1));
        //  System.out.println(countSetBits(17));
        //  System.out.println(countBitsFlip(10,20));
        //  System.out.println(isSparse(3));
        //  System.out.println(isSparse(4));
        //  System.out.println(maxConsecutiveOnes(14));
        //  System.out.println(maxConsecutiveOnes(222));
        //  System.out.println(grayToBinary(4));
        //  System.out.println(grayToBinary(15));
        //  System.out.println(swapBits(23));
        //  System.out.println(swapBits(2));
        //  System.out.println(maxAND(4,2,4,8,16));
    }
}