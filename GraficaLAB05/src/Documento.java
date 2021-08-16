import java.util.ArrayList;

public class Documento {
	private ArrayList<String> paginas;
	 private boolean emCores;
    public Documento(ArrayList<String> paginas, boolean emCores) {
        // ToDo IMPLEMENT ME!!!
    	this.paginas = paginas;
        this.emCores = emCores;	
    }

    public boolean isEmCores() {
       if (this.emCores == true){
    	   return true ; 
       }else {
    	   return false;
       }
    	 // ToDo IMPLEMENT ME!!!
    }

    public int getQuantPaginas() {
        return paginas.size();  // ToDo IMPLEMENT ME!!!
    }

    public String getPagina(int numeroDaPagina) {
    	
        return paginas.get(numeroDaPagina - 1);  // ToDo IMPLEMENT ME!!!
    }
}
