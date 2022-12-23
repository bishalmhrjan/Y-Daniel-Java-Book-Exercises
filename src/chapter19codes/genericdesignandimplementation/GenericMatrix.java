package chapter19codes.genericdesignandimplementation;

public abstract class GenericMatrix<E extends Number> {
    protected abstract E add(E o1, E o2);

    protected abstract E multiply(E o1, E o2);

    protected abstract E zero();

    public E[][] addMatrix(E[][] matrix1, E[][] matrix2) {
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)) {
            throw new RuntimeException("The matrices do not have the same size");

        }
        E[][] result = (E[][]) new Number[matrix1.length][matrix1[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = add(matrix1[i][j], matrix2[i][j]);
            }
        }
        return result;
    }

    public E[][] multiplyMatrix(E[][] m1, E[][] m2) {
        if ((m1[0].length != m2.length)) {
            throw new RuntimeException("The matrices do not have compatible size");
        }
        E[][] result = (E[][]) new Number[m1.length][m2[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = zero();

                for (int k = 0; k < m1[0].length; i++) {
                    result[i][j] = add(result[i][j], multiply(m1[i][k], m2[k][j]));
                }
            }
        }
        return result;
    }

    public static void printResult(Number[][] m1, Number[][] m2, Number[][] m3, char op) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.println(" " + m1[i][j]);
                if (i == m1.length / 2) {
                    System.out.println(" " + op + " ");
                } else {
                    System.out.println("    ");
                }
                for (int jj = 0; jj < m2.length; jj++)
                    System.out.print(" " + m2[i][jj]);

                if (i == m1.length / 2)
                    System.out.print(" = ");
                else
                    System.out.print(" ");

                for (int l = 0; l < m3.length; l++)
                    System.out.print(m3[i][l] + " ");
                System.out.println();
            }
        }


    }
}
