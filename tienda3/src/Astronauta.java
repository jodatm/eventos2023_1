public class Astronauta <t,z> {
    
    t edad;
    String nombre;
    z nacionalidad;

    public Astronauta (t edad, z nacionalidad) {
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public T getEdad() {
        return edad;
    }

    public void setEdad(T edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Z getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Z nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    

}
