//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

public record Task2() {

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { //NullPointerException
            for (int j = 0; j < 5; j++) { // ArrayIndexOutOfBoundsException
                int val = Integer.parseInt(arr[i][j]); //NumberFormatException
                sum += val;
            }
        }
        return sum;
    }
}
