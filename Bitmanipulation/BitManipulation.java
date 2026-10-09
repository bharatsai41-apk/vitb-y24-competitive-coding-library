class BitManipulation {
    public static long getBit(long n, int k) {
        return ((n >> k) & 1L);
    }

    public static long setBit(long n, int k) {
        n = ((1L << k) | n);
        return n;
    }

    public static long clearBit(long n, int k) {
        n = (n & ~(1L << k));
        return n;
    }

    public static long toggleBit(long n, int k) {
        n = (n ^ (1L << k));
        return n;
    }

    public static int countSetBits(long n) {
      int count_set_bits=0;
      while(n>0){
        long bit=(n&1L);
        if(bit==1)count_set_bits++;
        n>>=1;
      }
      return count_set_bits;
    }

    public static boolean isPowerOfTwo(long n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public long countSetBits(long n) {
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}