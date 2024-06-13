import java.util.Scanner;

class Cliente{
    private String nombre;
    private int numeroPedido;

    public Cliente (String nombre, int numeroPedido){
        this.nombre = nombre;
        this.numeroPedido= numeroPedido;
    }

    public void hacerPedido{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, dime como quieres tu hamburguesa: ");
        System.out.println(menu);
        String entrada = scanner.nextLine();

    }

    public static void main(String[] args) {

        Cliente cliente = Cliente("Manuel", 207);

        cliente.hacerPedido();
        pedido.mostrar();
    }
}