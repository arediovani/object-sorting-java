package pkg2d.array.sorting;

public class Sorting {

    public String[] text;
    public int[] numbers;
    public File[] ObjectArray;

    public Sorting() {
    }

    public Sorting(File[] ObjectArray) {
        this.ObjectArray = ObjectArray;
    }
    
    public static void SortName(File[] names) {
        if (names.length >= 2) {
            File[] left = new File[names.length / 2];
            File[] right = new File[names.length - names.length / 2];
            for (int i = 0; i < left.length; i++) {
                left[i] = names[i];
            }
            for (int i = 0; i < right.length; i++) {
                right[i] = names[i + names.length / 2];
            }
            SortName(left);
            SortName(right);
            mergeName(names, left, right);
        }
    }
    public static void mergeName(File[] names, File[] left, File[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < names.length; i++) {
            if (b >= right.length || (a < left.length && left[a].getName().compareToIgnoreCase(right[b].getName()) < 0)) {
                names[i] = left[a];
                a++;
            } else {
                names[i] = right[b];
                b++;
            }
        }
    }
    public static void SortType(File[] names) {
        if (names.length >= 2) {
            File[] left = new File[names.length / 2];
            File[] right = new File[names.length - names.length / 2];

            for (int i = 0; i < left.length; i++) {
                left[i] = names[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = names[i + names.length / 2];
            }

            SortType(left);
            SortType(right);
            mergeType(names, left, right);
        }
    }
    public static void mergeType(File[] names, File[] left, File[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < names.length; i++) {
            if (b >= right.length || (a < left.length && left[a].getType().compareToIgnoreCase(right[b].getType()) < 0)) {
                names[i] = left[a];
                a++;
            } else {
                names[i] = right[b];
                b++;
            }
        }
    }
    public static void SortDate(File[] names) {
        if (names.length >= 2) {
            File[] left = new File[names.length / 2];
            File[] right = new File[names.length - names.length / 2];

            for (int i = 0; i < left.length; i++) {
                left[i] = names[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = names[i + names.length / 2];
            }

            SortDate(left);
            SortDate(right);
            mergeDate(names, left, right);
        }
    }
    public static void mergeDate(File[] names, File[] left, File[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < names.length; i++) {
            if (b >= right.length || (a < left.length && left[a].getDate().compareToIgnoreCase(right[b].getDate()) < 0)) {
                names[i] = left[a];
                a++;
            } else {
                names[i] = right[b];
                b++;
            }
        }
    }
    public static void SortSize(File[] names) {
        if (names.length >= 2) {
            File[] left = new File[names.length / 2];
            File[] right = new File[names.length - names.length / 2];

            for (int i = 0; i < left.length; i++) {
                left[i] = names[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = names[i + names.length / 2];
            }

            SortSize(left);
            SortSize(right);
            mergeSize(names, left, right);
        }
    }
    public static void mergeSize(File[] names, File[] left, File[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < names.length; i++) {
           
            if (b>= right.length|| (a<left.length && left[a].getSize()<right[b].getSize())) {
                names[i] = left[a];
                a++;
            } else {
                names[i] = right[b];
                b++;
            }
        }
    }
} 