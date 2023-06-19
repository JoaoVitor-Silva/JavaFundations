public class App {
    public static void main(String[] args) throws Exception {
        // createdRectangle(10, 10);
        createdTriangle(100, 100);
    }

    static void createdRectangle(int linha, int coluna) {
        String[][] Quadrado = new String[linha][coluna];

        for (int indexLine = 0; indexLine < linha; indexLine++) {
            for (int indexColum = 0; indexColum < coluna; indexColum++) {

                Quadrado[indexLine][indexColum] = " ";
                Quadrado[indexLine][0] = "#";
                Quadrado[0][indexColum] = "#";
                Quadrado[linha - 1][indexColum] = "#";

            }

            Quadrado[indexLine][coluna - 1] = "#";
        }

        for (int indexLine = 0; indexLine < Quadrado[0].length; indexLine++) {
            for (int indexColum = 0; indexColum < Quadrado[1].length; indexColum++) {
                System.out.print(Quadrado[indexLine][indexColum]);
            }
            System.out.println();
        }
    }

    static void createdTriangle(int linha, int coluna) {
        String[][] Triangulo = new String[linha][coluna];

        for (int indexLine = 0; indexLine < linha; indexLine++) {
            for (int indexColum = 0; indexColum < coluna; indexColum++) {

                Triangulo[indexLine][indexColum] = " ";

                if (indexLine == indexColum) {
                    Triangulo[indexLine][indexColum] = "#";
                }

                Triangulo[indexLine][0] = "#";
                Triangulo[linha - 1][indexColum] = "#";

            }
        }

        for (int indexLine = 0; indexLine < Triangulo[0].length; indexLine++) {
            for (int indexColum = 0; indexColum < Triangulo[1].length; indexColum++) {
                System.out.print(Triangulo[indexLine][indexColum]);
            }
            System.out.println();
        }
    }
}
