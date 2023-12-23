package Recode_001;

public class Q14_occurringNumber_addLastArrayValue {
    public static void main(String[] args) {
        System.out.println(occurringNumber(new int[]{6,8,1,8,2}));
        System.out.println(occurringNumber(new int[]{6,8,1,8,6}));
        System.out.println(occurringNumber(new int[]{1,1,1,2,2,3}));
        System.out.println(occurringNumber(new int[]{1}));
    }

    static int occurringNumber(int[] a){
        int lengthArrayNoDuplicate = a.length;
        for(int i=0; i<a.length - 1; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[i] == a[j]) {
                    lengthArrayNoDuplicate--;
                }
            }
        }

        int[] arrayNoDuplicate = new int[lengthArrayNoDuplicate];
        int k = 0;
        for(int i=0; i<a.length - 1; i++) {
            int flagDuplicate = 0;
            for(int j=i+1; j<a.length; j++) {
                if(a[i] == a[j]) {
                    flagDuplicate = 1;
                    break;
                }
            }
            if(flagDuplicate == 0) {
                arrayNoDuplicate[k] = a[i];
                k++;
            }
        }
        arrayNoDuplicate[lengthArrayNoDuplicate - 1] = a[a.length - 1];

        int mostOccurringOfArray = 0;
        int mostOccurringValue = 0;
        for(int i=0; i<lengthArrayNoDuplicate; i++) {
            int count = 0;
            for(int j=0; j<a.length; j++) {
                if(arrayNoDuplicate[i] == a[j]) {
                    count++;
                }
            }
            if(count > mostOccurringOfArray) {
                mostOccurringOfArray = count;
                mostOccurringValue = arrayNoDuplicate[i];
            }
        }

        return mostOccurringValue;
    }
}
