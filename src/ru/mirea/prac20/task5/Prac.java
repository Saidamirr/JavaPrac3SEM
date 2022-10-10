package ru.mirea.prac20.task5;


public class Prac {
    public static void main(String[] args) {
        Matrix<Double> matrix1 = new Matrix<>(new Double[][]{{12.0, 12.0, 12.0, 12.0}, {12.0, 12.0, 12.0, 12.0}, {12.0, 12.0, 12.0, 12.0}});
        Matrix<Double> matrix2 = new Matrix<>(new Double[][]{{16.0, 16.0, 16.0, 16.0}, {16.0, 16.0, 16.0, 16.0}, {16.0, 16.0, 16.0, 16.0}});
        Matrix<Double> matrix3 = new Matrix<>(new Double[][]{{2.0, 2.0, 2.0}, {2.0, 2.0, 2.0}, {2.0, 2.0, 2.0},{2.0, 2.0, 2.0}});
        Matrix<Integer> matrix4 = new Matrix<>(new Integer[][]{{2, 2}, {2, 2}, {2, 2},{2, 2}});

        System.out.println(matrix1);
        System.out.println(matrix2);
        System.out.println(matrix4);
        matrix1.add(matrix2);
        System.out.println(matrix1.multiply(matrix4));

        System.out.println(matrix1.multiply(matrix3).negate());

    }
}

class Matrix<E extends Number> {
    private final E[][] matrix;
    private final int rows;
    private final int columns;

    Matrix(E[][] matrix) {
        this.matrix = matrix;
        rows = matrix.length;
        columns = matrix[0].length;
    }

    E getMatrixElement(int i, int j) {
        return matrix[i][j];
    }

    public E[][] getMatrix() {
        return matrix;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    Matrix add(Matrix matrix) {
        if (rows != matrix.rows || columns != matrix.columns) return null;
        Double[][] doubleMatrix = new Double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                doubleMatrix[i][j] = this.matrix[i][j].doubleValue() + matrix.matrix[i][j].doubleValue();
            }
        }
        return new Matrix(doubleMatrix);
    }

    <E extends Number> Matrix multiplyByNumber(E e) {
        Double[][] doubleMatrix = new Double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                doubleMatrix[i][j] = this.matrix[i][j].doubleValue() * e.doubleValue();
            }
        }
        return new Matrix(doubleMatrix);
    }

    <E extends Number> Matrix  multiply(Matrix matrix) {
        if (columns != matrix.rows) return null;
        Double[][] doubleMatrix = new Double[rows][matrix.columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {
                doubleMatrix[i][j] = 0.0;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {
                for (int k = 0; k < columns; k++) {
                    doubleMatrix[i][j] = doubleMatrix[i][j] + matrix.matrix[k][j].doubleValue() * this.matrix[i][k].doubleValue();
                }
            }
        }
        return new Matrix(doubleMatrix);
    }

    Matrix negate() {
        return multiplyByNumber(-1);
    }


    Matrix subtraction(Matrix matrix) {
        return this.add(matrix.multiplyByNumber(-1));
    }

    @Override
    public String toString() {
        String matrix="";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix+=this.matrix[i][j].toString()+" ";
            }
            matrix+='\n';
        }
        return "Matrix"+'\n'+matrix;
    }
}