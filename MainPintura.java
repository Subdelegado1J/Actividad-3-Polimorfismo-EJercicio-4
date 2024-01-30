public class MainPintura {

    public static void main(String[] args) {

            Esfera esfera1 = new Esfera("Nombre aleatorio", 15);
            Cilindro cilindro1 = new Cilindro("Nombre Cilindro",10,30);
            Pintura pintura1 = new Pintura(250);
            Rectangulo rectangulo1 = new Rectangulo("Esto es un rectángulo",20,35);


        System.out.println("---Cilindro---");
        System.out.println(pintura1.pinturaNecesaria(cilindro1));
        System.out.println("");
        System.out.println("---Esfera---");
        System.out.println(pintura1.pinturaNecesaria(esfera1));
        System.out.println("");
        System.out.println("---Rectángulo---");
        System.out.println(pintura1.pinturaNecesaria(rectangulo1));
    }
}
