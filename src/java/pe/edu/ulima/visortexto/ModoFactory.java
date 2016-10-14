
package pe.edu.ulima.visortexto;

public class ModoFactory {
    
    public ModoAdapter obtenerAdapter(String tipo){
        if (tipo.equals("pdf")){
            return new AdapterPDF();
        }else if (tipo.equals("html")){
            return new AdapaterHTML();
        }else{
            return null;
        }    
    }
}
