public abstract class Impressora {
	private int papel, docsImpressos;

	public boolean imprimirDocumento(Documento documento) {
		// verifica se há papel suficiente (se não houver, não imprime)
		if (papel < documento.getQuantPaginas()) {
			return false;
		}

		// ToDo IMPLEMENT ME!!!
		// incrementa o número de documentos impressos
		else {
			docsImpressos++;
		}
		
		// ToDo IMPLEMENT ME!!!

		// para cada página, manda imprimir de fato
		for (int i = 1; i <= documento.getQuantPaginas(); i++) {
			executarImpressaoPagina(documento.getPagina(i));
			papel--;
		}

		return true;
	}

	public void carregarPapel(int numeroDeFolhas) {
		papel += numeroDeFolhas;
		// ToDo IMPLEMENT ME!!!
	}

	public int getQuantidadeFolhasRestantes() {
		return papel; // ToDo IMPLEMENT ME!!!
	}

	public int getQuantidadeDocumentosImpressos() {
		return docsImpressos; // ToDo IMPLEMENT ME!!!
	}

	public abstract void executarRotinaLimpeza();

	public abstract void executarImpressaoPagina(String pagina);
}
