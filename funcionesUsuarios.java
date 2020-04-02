public class funcionesUsuario {


    public int calcularImpuestos(Usuario usuario){
        int discount = 0;
        if (usuario.getEdad() < 18){
            discount = 0;
        } else if (usuario.getEdad() > 18 && usuario.getEdad < 30){
            discount = 2000;
        } else if (usuario.getEdad() > 30 && usuario.getEdad < 65){
            discount = 7000;
        } else {
            discount = 2000;
        }
        discount = discount - (dicount * ( 0.03 * usuario.getCantHijos() ));
        if (dicount > (usuario.getSaldo() / 2) ){
            discount = usuario.getSaldo() / 2
        }
        return discount;
    }

    public void pagarSueldo(Usuario usuario, int sueldo){
        usuario.saldo = usuario.saldo + sueldo;
    }
}
