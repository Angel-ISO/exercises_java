import java.util.Scanner;

public class totalpagar {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("ingrese categoria del procducto" +
                "tenemos" +
                "electronicos, ropa, hogar y jugueteria");
        String categoria = miScanner.next();

        String[][] categoriasRebaja = {
                {"electrónicos", "10"},
                {"ropa", "20"},
                {"hogar", "15"},
                {"jugueteria", "30"}
        };

        boolean categoriaValida = false;
        Double rebaja = 0.0;

        for (String[] descripcion : categoriasRebaja){
            if(categoria.equals(descripcion[0])){
                categoriaValida= true;
                rebaja = Double.parseDouble(descripcion[1]);
                break;
            }
        }

        if(categoriaValida == true){
            System.out.print("cuanto desea comprar: ");
            int cantidad = miScanner.nextInt();

            System.out.print("Cuanto cuesta el producto comprado: ");
            double precio = miScanner.nextDouble();


            double precioTotalConDescuento = cantidad * precio - (cantidad * precio * (rebaja / 100));

            System.out.printf("Descuento aplicado: %.2f%%\n", rebaja);
            System.out.printf("Precio total con descuento: %.2f\n", precioTotalConDescuento);
        }else {
            System.out.println("Categoría no válida. No se aplica descuento.");
        }


    }
}
