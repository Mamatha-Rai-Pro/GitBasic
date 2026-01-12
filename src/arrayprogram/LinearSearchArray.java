package arrayprogram;

public class LinearSearchArray {

        public static void main(String[] args) {

            int[] arr = {10, 20, 30};
            int key = 60;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    System.out.println("Found");
                }else{
                    System.out.println(" Not Found");
                    break;

                }
            }
        }
    }


