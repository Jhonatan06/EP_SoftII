
package pe.edu.ulima.visortexto;

public class ModoFactory {
    
    private static ModoFactory singleton = null;
    
    private static ModoFactory getIntance(){
        if(singleton == null){
            singleton = new ModoFactory();
        }
        return singleton;
    }

    public ModoFactory() {
    }        
        
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
