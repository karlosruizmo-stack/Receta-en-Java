import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PasoReceta {
    private final String descripcion;
    private final Recipiente recipiente;
    private final List<Ingrediente> ingredientes;
    private final long duracionMs;

    public PasoReceta(String descripcion, Recipiente recipiente, List<Ingrediente> ingredientes,
                      long duracionMs) {
        this.descripcion = descripcion;
        this.recipiente = recipiente;
        this.ingredientes = new ArrayList<>(ingredientes);
        this.duracionMs = duracionMs;
    }

    public String getDescripcion() { return descripcion; }
    public Recipiente getRecipiente() { return recipiente; }
    public List<Ingrediente> getIngredientes() { return Collections.unmodifiableList(ingredientes); }
    public List<String> getARetirar() { return Collections.unmodifiableList(aRetirar); }
    public long getDuracionMs() { return duracionMs; }
    public EstadoRecipiente getEstado() { return estado; }
}
