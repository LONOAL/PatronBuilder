package org.example;

public class Main {

    public static void main(String[] args) {

        Pizzas pizzaDefault = new Pizzas();
        Pizzas pizzaAMedida = new Pizzas(Pizzas.FINA,Pizzas.BIG,true,false,true,Pizzas.TIENDA);

        BuilderPizzas miBuilder = new BuilderPizzas();
        miBuilder.setCebolla(false);
        miBuilder.setSize(Pizzas.BIG);
        pizzaDefault = miBuilder.build();


        System.out.println(pizzaDefault.toString());



        // utilizamos el builder y en concreto el metodo build
        // para tener nuestra pizza
        /*
	    Pizzas creadaConBuilder = new BuilderPizzas().build();
	    Pizzas sintaxisEncadenada = new BuilderPizzas()
                .setCebolla(true)
                .setSize(Pizzas.BIG)
                .build();

	    // aunque el toSpring no está definida, nos valen estas lineas para poner
        // un punto de ruptura y hacer debug
        // asi podemos ver los objetos creados
        System.out.println(creadaConBuilder.toString());
        System.out.println(sintaxisEncadenada.toString());

         */
    }
}
