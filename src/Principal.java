public class Principal {
    public static void main(String[] args) {

        int opcionUsuario = 0;
        ConsultaMoneda consulta = new ConsultaMoneda();
        System.out.println("**********************************************************************************\n");
        System.out.println("*** Bienvenid@ al conversor de moneda ***\n");

        while (opcionUsuario != 3) {
            Menu menu = new Menu();
            menu.mostrarMenuPrincipal();
            opcionUsuario = menu.leerOpcionPrincipal();

            switch (opcionUsuario) {
                case 1:
                    menu.mostrarMenuMonedas("inicial");
                    String monedaBase = menu.leerOpcionMoneda();
                    menu.mostrarMenuMonedas("final");
                    String monedaFinal = menu.leerOpcionMoneda();
                    Double cantidadCambiar = menu.leerCantidadACambiar();
                    Conversor conversor = consulta.buscaMoneda(monedaBase);//que es lo que quiero cambiar. trae el objeto con todos los datos llenos desde la API.
                    Double tasaDeConversion = conversor.getConversionRate(monedaFinal.toUpperCase());
                    System.out.println(monedaBase + " / " + monedaFinal + " / " + cantidadCambiar);
                    System.out.println(conversor + " / " + tasaDeConversion);
                    Double cantidadObtenida = menu.cantidadObtenida(monedaBase, cantidadCambiar, tasaDeConversion, monedaFinal);
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el conversor de moneda");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
            }
        }

    }

}
