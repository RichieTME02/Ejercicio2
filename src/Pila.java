import java.util.Stack;

public class Pila {
    private Stack <Caja> almacenamiento;

    public Pila() {
        almacenamiento = new Stack<Caja>();
    }

    public boolean estaVaacia(){
        return almacenamiento.empty();
    }

    public void apilar(String numero, String empresa, String contenido){
        almacenamiento.push(new Caja(numero, empresa, contenido));
    }

    public Caja desapilar() throws Exception {
        if (estaVaacia())
            throw new Exception("No hay elementos");
        return almacenamiento.pop();
        //POP PARA SACAR ELEMENTOS
    }

    public Caja cima() throws Exception{
        if (estaVaacia())
            throw new Exception("No hay elementos");
        return almacenamiento.peek();
    }

    public int buscarElemento(String numero) throws Exception {
        if (estaVaacia())
            throw new Exception("No hay elementos");
        //for de coleccion
        //for (Caja c:almacenamiento)
        for (int i = almacenamiento.size() - 1; i >= 0; i--) {
            if (almacenamiento.get(i).getNumero().equals(numero)) {
                return i;
            }
        }
        throw new Exception("Caja no encontrada");
    }


    @Override
    public String toString(){
        String mensaje = "";
        for (int i = almacenamiento.size()-1; i>= 0; i--){
            mensaje += almacenamiento.get(i)+ "\n";
        }
        return mensaje;
    }

    public int getTamanio(){
        return almacenamiento.size();
    }

}
