 public class Automovil {   
        String marca;
        String modelo;
        int a;
        public Automovil(String marca, String modelo, int a) {
            this.marca = marca;
            this.modelo = modelo;
            this.a = a;
        }
        public void mostrarInfo() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Año: " + a);
        }
        public void arrancar() {
            System.out.println("El automóvil " + marca + " " + modelo + " ha arrancado.");
        }
        public void avanzar(int distancia) {
            System.out.println("El automóvil " + marca + " ha avanzado " + distancia + " kilómetros.");
        }
        public static void main(String[] args) {
            Automovil auto1 = new Automovil("Toyota", "Corolla", 2020);
            Automovil auto2 = new Automovil("Chevrolet", "Spark", 2018);
            auto1.mostrarInfo();
            auto1.arrancar();
            auto1.avanzar(50);
    
            auto2.mostrarInfo();
            auto2.arrancar();
            auto2.avanzar(30);
        }
    }
