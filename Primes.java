public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] primeNums = new boolean[n+1];
        int p = 2;
        while(p <= n){
            primeNums[p] = true;
            p++;
        }
        p = 2;
        while(p <= Math.sqrt(n)){
            if(primeNums[p]){
                int k = p * p;
                while(k <= n){
                    primeNums[k] = false;
                    k += p;

                }
            }
            p++;
        }
        int i = 2;
        int count = 0;
        while (i < primeNums.length) {
            if(primeNums[i]){

                System.out.println(i);
                count ++;
            }
            i++; 
        }
        double precent = (count / (double)n) * 100;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + precent + "% are primes)");

    }
}