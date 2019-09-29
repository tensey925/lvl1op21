class MainClass {
    public static void main(String[] args) {
        String[] a1 = new String[] {"Alex", "Dima", "Kate", "Galina", "Ivan"} ;
        String[] a2 = new String[] {"Dima", "Ivan", "Kate"};
        int counter = 0;

        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a1.length; j++) {
                if (a1[j] == a2[i]) {
                    a1[j] = null;
                    counter++;
                }
            }
        }

        String[] lastArr = new String[a1.length - counter];
        int lastArrCounter = 0;
            for (int i = 0; a1.length > i; i++) {
                if (a1[i] != null) {
                    lastArr[lastArrCounter] = a1[i];
                    lastArrCounter++;
                }
            }

                System.out.println("The elements which exists in the first array, but not exist in the second one:");
                output(lastArr);

    }

    static void output(String[] a){
        for (int i = 0; i < a.length; i++){
        System.out.println(a[i]);
        }
    }
}
