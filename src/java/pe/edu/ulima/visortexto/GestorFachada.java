
package pe.edu.ulima.visortexto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GestorFachada {
    
    private static GestorFachada singleton = null;
    
    private static GestorFachada getIntance(){
        if(singleton == null){
            singleton = new GestorFachada();
        }
        
        return singleton;
    }
    
    public ByteArrayOutputStream metRenderizar(String titulo, String contenido, String tipo) throws IOException{
        ModoFactory factory = new ModoFactory();
        ModoAdapter adapter = factory.obtenerAdapter(tipo);
        ByteArrayOutputStream baos = adapter.renderizar(titulo, contenido);
        return  baos;
    }
}
