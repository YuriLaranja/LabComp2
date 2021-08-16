import java.util.ArrayList;

public class Grafica {
	 private ArrayList<Impressora> impressoras =  new ArrayList<>();
	 private int revezamento;
	 private float precoCO,precoPB;
    public void imprimirDocumento(Documento documento) {
    	
    	if(revezamento >= impressoras.size()) {
    		revezamento = 0;
    	}
    	for( int i =0; i < impressoras.size(); i++) {
    	 if (revezamento < impressoras.size()){
    		 impressoras.get(revezamento).imprimirDocumento(documento);
    		 
    		 revezamento++; 
    		 break;
    	}
    	revezamento++; 
    	}
    	
    	
        // ToDo IMPLEMENT ME!!!
    }

    public float orcarImpressao(Documento documento) {
    	float orcamento;
        if( documento.isEmCores() == true) {
        	orcamento = (float) (documento.getQuantPaginas() * precoCO);
        	return orcamento;
        }else {
        	orcamento = (float) (documento.getQuantPaginas() * precoPB);
        	return orcamento;
        }
    	
    	  // ToDo IMPLEMENT ME!!!
    }

    public void adicionarImpressora(Impressora impressora) {
    	impressoras.add(impressora);
        // ToDo IMPLEMENT ME!!!
    }

    public void setPrecoPorPagina(float precoPorPagina, boolean emCores) {
    	if (emCores == true){
    		this.precoCO = precoPorPagina;
    	}
    	else {
    		this.precoPB = precoPorPagina;
    	}
        // ToDo IMPLEMENT ME!!!
    }
}
