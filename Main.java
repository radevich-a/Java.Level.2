public class Main {

    public static void main(String[] args) {
        String[][] array = {{"1","2","3","4"},
                            {"1","2","3","4"},
                            {"1","2","3","4"},
                            {"1","2","3","4"}};

        verifyLengthArray(array);
        System.out.println(sumArray(array));


    }
    static int sumArray(String[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum+=Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(String.format("Value is not a digit: %s", array[i][j]), e);
                }
            }
        }

        return sum;
    }

    static void verifyLengthArray(String array [][]){
            if (array.length != 4)
                throw new MyArraySizeException(String.format("Wrong! Array size %s instead 4", array.length));

        for (int i = 0; i < array.length; i++) {
            if (array[i].length !=4){
                throw new MyArraySizeException(String.format("Wrong! Array[%s] size %s instead 4", i, array[i].length));
            }
        }
    }
}
