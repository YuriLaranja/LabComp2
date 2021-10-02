import java.util.Map;

public class DadosGenericos<T> implements Sorteador<T> {

    Map<T, Integer> frequenciaByResultado;

    public DadosGenericos(Map<T, Integer> frequenciaByResultado) {
        this.frequenciaByResultado = frequenciaByResultado;
    }

    @Override
    public T sortear() {
        // ToDo IMPLEMENT ME!!!!
        return null;
    }
}
