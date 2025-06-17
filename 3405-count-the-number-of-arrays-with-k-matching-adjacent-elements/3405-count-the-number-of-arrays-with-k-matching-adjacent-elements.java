class Solution {
    // Modulo for all calculations
    int mod = 1_000_000_007;

 
    static long[] revs = new long[100001]; 
    static int[] f = new int[100001];     

    
    public int countGoodArrays(int n, int m, int k) {
       
        if (f[0] == 0)
            f[0] = 1;

       
        long res = m * pow(m - 1, n - 1 - k) % mod * C(n - 1, n - 1 - k) % mod;
        
        return (int) res;
    }


    public long pow(int a, int b) {
        long res = 1;
        long base = a;
        while (b > 0) {
            if ((b & 1) == 1)
                res = res * base % mod;
            base = base * base % mod;
            b /= 2;
        }
        return res;
    }

    public long C(int a, int b) {
        return (long) get(a) * rev(get(a - b)) % mod * rev(get(b)) % mod;
    }

    public long get(int a) {
        if (f[a] != 0)
            return f[a];
        return f[a] = (int) (get(a - 1) * a % mod);
    }

   
    public long rev(long a) {
        if (a == 1)
            return a;
        return mod - mod / a * rev(mod % a) % mod;
    }
}