public class Usuario {
    String name;
    String cedula;
    String contrasenia;
    int edad;
    int cantHijos;
    int saldo;

    public String getName() {
        return name;
    }

    public String getCedula() {
        return cedula;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public int getEdad() {
        return edad;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
