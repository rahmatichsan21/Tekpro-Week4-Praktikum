public interface Sortable {
    public abstract int compare(Sortable b);
    public static void shell_sort(Sortable[] a, boolean ascending) {
        // Shell sort implementation
        int increment = a.length / 2;
        while (increment > 0) {
            for (int i = increment; i < a.length; i++) {
                int j = i;
                Sortable temp = a[i];
                while (j >= increment && (ascending ? a[j - increment].compare(temp) > 0 : a[j - increment].compare(temp) < 0)) {
                    a[j] = a[j - increment];
                    j = j - increment;
                }
                a[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }
}
