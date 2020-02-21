package pageObjects;

public class DuplicateElements {


    public static void findDuplicatesElements() {
        int[] arr = new int[]{1, 51, 6, 7, 1, 164, 4, 8, 2, 1, 9, 1};

        int[] frequentElements = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    //To avoid counting same element again
                    frequentElements[j] = visited;
                }
            }
            if (frequentElements[i] != visited)
                frequentElements[i] = count;
        }
        System.out.println("---------------------------------------");
        System.out.println(" Element | Occurences");
        System.out.println("---------------------------------------");
        for (int i = 0; i < frequentElements.length; i++) {
            if (frequentElements[i] != visited && frequentElements[i] != 1)
                System.out.println("    " + arr[i] + "    |    " + frequentElements[i]);
        }
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        DuplicateElements.findDuplicatesElements();
    }
}
