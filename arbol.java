public class arbol{
    public static void main(String args[]){
        int columna = 3;
        int filas = 8;
        int indent = 7; 

        System.out.println("        *        ");
        System.out.println("        0        ");
        for(int i = 0; i < filas; i++){
            for(int k = 0; k < indent; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < columna; j++){
                System.out.print("0");
            }
            System.out.println();
            columna = columna + 2;
            indent = indent - 1;
        }
    }
}