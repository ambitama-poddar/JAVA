// Develop an interface with two methods namely, add and multiply for addition and multiplication of
// mathematical objects such as vectors and matrices. Develop a class Vector that implements the
// interface with necessary data members. Develop another class Matrix that implements the interface
// with necessary data members. Develop a class containing the main method and show the computation
// of the sum of two vectors and their scalar product and the sum of two matrices and the product of the
// matrices.

interface IMathFunctions {
    public Object add(Object other);
    public Object multiply(Object other);
}

class Vector implements IMathFunctions {
    double x, y, z;

    public Vector() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public Object add(Object other) {
        Vector ob = (Vector) other;
        double x = this.x + ob.x;
        double y = this.y + ob.y;
        double z = this.z + ob.z;
        return new Vector(x, y, z);
    }
    
    @Override
    public Object multiply(Object other) {
        Vector ob = (Vector) other;
        double x = this.x * ob.x;
        double y = this.y * ob.y;
        double z = this.z * ob.z;
        return new Vector(x, y, z);
    }

    public void printVector() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}

class Matrix implements IMathFunctions {
    int[][] a;

    public Matrix(int[][] matrix) {
        this.a = matrix;
    }

    @Override
    public Object add(Object other) {
        Matrix ob = (Matrix) other;
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = this.a[i][j] + ob.a[i][j];
            }
        }
        return new Matrix(sum);
    }

    @Override
    public Object multiply(Object other) {
        Matrix ob = (Matrix) other;
        int[][] product = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    product[i][j] += this.a[i][k] * ob.a[k][j];
                }
            }
        }
        return new Matrix(product);
    }

    public void printMatrix() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class MathOperations {
    public static void main(String[] args) {
        Vector v1 = new Vector(1.0, 2.0, 3.0);
        Vector v2 = new Vector(4.0, 5.0, 6.0);
        Matrix m1 = new Matrix(new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, {
        3, 3, 3 } });
        Matrix m2 = new Matrix(new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, {
        3, 3, 3 } });

        Vector sum1 = (Vector) v1.add(v2);
        Vector product1 = (Vector) v1.multiply(v2);

        System.out.println("Vector sum: ");
        sum1.printVector();
        System.out.println("Vector product: ");
        product1.printVector();

        Matrix sum2 = (Matrix) m1.add(m2);
        Matrix product2 = (Matrix) m1.multiply(m2);

        System.out.println("Matrix sum: ");
        sum2.printMatrix();
        System.out.println("Matrix product: ");
        product2.printMatrix();
    }
}
