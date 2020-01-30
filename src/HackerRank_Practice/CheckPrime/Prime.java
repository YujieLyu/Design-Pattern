package HackerRank_Practice.CheckPrime;

import java.util.ArrayList;

public class Prime {
    public void checkPrime(Integer ... a){

        ArrayList<Integer> primes=new ArrayList<>();
        for(int e:a){
            if (isPrime(e)){
                primes.add(e);
            }
        }
        int len=primes.size();
        if (len==0){
            System.out.println(" ");
        }
        for (int p=0;p<len;p++){
            if (primes.get(p)!=0){
                System.out.print(primes.get(p)+" ");
                if (p==len-1){
                    System.out.print("\n");
                }
            }

        }
    }

    public boolean isPrime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if (num%i==0){
                count+=1;
            }
        }
        return count==2;
    }
}
