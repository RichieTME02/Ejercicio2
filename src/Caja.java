import java.awt.*;

public class Caja {
    String numero;
    String contenido;
    String empresa;

    public Caja(String numero, String empresa, String contenido) {

    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }


    @Override
    public String toString() {
        return  "Numero='" + numero +
                ", Empresa='" + empresa +
                ", Contenido='" + contenido +
                '}';
    }
}
