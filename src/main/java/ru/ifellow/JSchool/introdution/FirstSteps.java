package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return x * y;
    }

    public int div (int x, int y){
        return x / y;
    }

    public int mod (int x, int y){
        return x % y;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public int sum(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public int mul(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        if (array.length == 0) {
            return 0;
        }
        int mul = 1;
        for (int num : array) {
            mul *= num;
        }
        return mul;

    }

    public int min(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int max(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public double average(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        if (array.length == 0) {
            return 0;
        }
        return (double) sum(array) / array.length;

    }

    public boolean isSortedDescendant(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        if (array.length < 2) {
            return true;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;

    }

    public void cube(int[] array){
        if (array == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        for (int i = 0; i < array.length; i++) {
            int num = array[i];

            if (num > -1291 && num < 1291) { /* если возвести число, больше либо равное 1291 по модулю
                 то это превысит допустимые для int значения */
                array[i] = num * num * num;
            } else {
                throw new ArithmeticException(
                        String.format("Число %d слишком велико для безопасного возведения в куб.", num)
                );
            }
        }
    }

    public boolean find(int[]array, int value){
        if (array == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[]array){
        if (array == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        if (array.length > 1) {
            int temp;
            for (int i = 0; i < array.length / 2; i++) {
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
    }

    public boolean isPalindrome(int[]array){
        if (array == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        if (array.length == 0) {
            return true;
        }
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        int sum = 0;
        for (int[] row : matrix) {
            sum += sum(row);
        }
        return sum;
    }

    public int max(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            int rowMaximum = max(row);
            if (rowMaximum > max) {
                max = rowMaximum;
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        if (matrix == null) {
            throw new IllegalArgumentException("Передан null вместо массива.");
        }
        for (int[] row : matrix) {
            if (!isSortedDescendant(row)) {
                return false;
            }
        }
        return true;
    }

}
