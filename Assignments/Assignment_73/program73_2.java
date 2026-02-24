import java.util.*;

class Matrix {
    public int Arr[][];
    public int iRow, iCol;

    public Matrix(int A, int B) {
        iRow = A;
        iCol = B;
        Arr = new int[iRow][iCol];
    }

    public void Accept() {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display() {
        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void ReverseRows() {
        int i = 0, j = 0;

        for (i = 0; i < iRow; i++) {
            for (j = 0; j < iCol / 2; j++) {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[i][iCol - 1 - j];
                Arr[i][iCol - 1 - j] = temp;
            }
        }
    }
}

class program73_1 {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = sobj.nextInt();

        System.out.println("Enter number of columns:");
        int col = sobj.nextInt();

        Matrix mobj = new Matrix(row, col);

        mobj.Accept();

        System.out.println("Original Matrix:");
        mobj.Display();

        mobj.ReverseRows();

        System.out.println("Matrix after reversing rows:");
        mobj.Display();
    }
}