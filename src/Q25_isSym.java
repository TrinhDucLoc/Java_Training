public class Q25_isSym {
    public static void main(String[] args) {
        System.out.println(isSym(new int[]{2,7,9,10,11,5,8}));
        System.out.println(isSym(new int[]{9,8,7,13,14,17}));
        System.out.println(isSym(new int[]{2,7,8,9,11,13,10}));
        System.out.println(isSym(new int[]{}));
    }

    static int isSym(int[] a){
        int flagIsSym = 1;
        if(a.length < 1) {
            flagIsSym = 0;
            return flagIsSym;
        }

        int left = 0;
        int right = a.length - 1;
        for(int i=0; i<a.length/2; i++) {
            if(a[left] % 2 == 0 && a[right] % 2 == 0 || a[left] % 2 != 0 && a[right] % 2 != 0) {
                left++;
                right--;
            } else {
                flagIsSym = 0;
                break;
            }
        }
        return flagIsSym;
    }
}
