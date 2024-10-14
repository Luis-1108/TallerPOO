public class maestro {
private String nombre;
private String materia;
private int aexperiencia;
public maestro (String nombre, String materia, int aexperiencia){
    this.nombre=nombre;
    this.materia=materia;
    this.aexperiencia=aexperiencia;
}
public void enseñar () {
    System.out.println(nombre+" esta enseñando "+materia+".");
}   
public void calificar(){
    System.out.println(nombre+" esta calificando examnenes");
}
public void descansar (){
    System.out.println(nombre+" esta descansando");
}
public void  mostrarinfo(){
    System.out.println("Nombre: "+nombre);
    System.out.println("Materia: "+materia);
    System.out.println("Años de experiencia: "+aexperiencia);
}
public static void main(String[] args) {
    maestro maestro1=new maestro("Juan","Matematicas",10);
    maestro maestro2=new maestro("carlos","español", 15);
    maestro1.enseñar();
    maestro1.descansar();
    maestro1.mostrarinfo();

    maestro2.mostrarinfo();
    maestro2.calificar();
    maestro2.enseñar();
}
}
