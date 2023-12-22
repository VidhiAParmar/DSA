class ProductOfArray{
    public static void main(String[] args) {
        int[] a ={1,2,3,4};
        int[] b = new int[4];
        int[] pre = new int[4];
        int[] suf = new int[4];
        int p=1, s=1;
        for (int i = 0; i < pre.length; i++) {
            pre[i]=p;
            p*=a[i];
        }
        for (int i = suf.length-1; i >= 0; i--) {
            suf[i]=s;
            s*=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            b[i]= pre[i]*suf[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+",");
        }

    }
}