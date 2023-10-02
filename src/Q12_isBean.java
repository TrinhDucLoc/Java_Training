public class Q12_isBean {
    public static void main(String[] args) {
//        System.out.println(isBean(new int[]{4,9,8}));
        System.out.println(isBean(new int[]{2,2,5,11,23}));
        System.out.println(isBean(new int[]{7,7,3,6}));
        System.out.println(isBean(new int[]{0}));
        System.out.println(isBean(new int[]{3,8,4}));
    }

    public static int isBean(int[] array) {
        if(array.length == 1 && array[0] == 0) {
            return 1;
        }
        int bean = 0;
        for(int i=0; i<array.length - 1; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i] == 2*array[j] || array[i] == (2*array[j] + 1) || array[i] == array[j]/2){
                    bean = 1;
                }
            }
            return bean;
        }
        return bean;
    }
}
