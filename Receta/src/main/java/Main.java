import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Recipiente olla = new Recipiente("Olla de agua");
        Recipiente sarten = new Recipiente("Sartén grande");
        Recipiente plato = new Recipiente("Plato llano");
        Ingrediente sagaua = new Ingrediente("Agua", 2000, "ml");
    }


    Ingrediente sal = new Ingrediente("salgruesa"10, "g");
    Ingrediente espaguetis = new Ingrediente("Espaguetis", 400, "g");
    Ingrediente cebolla = new Ingrediente("Ajo", 2, "dientes");
    Ingrediente aceite = new Ingrediente("Aceite de oliva", 300, "ml");
    Ingrediente carne = new Ingrediente("Carne picada", 300, "g");
    Ingrediente tomate = new Ingrediente("Tomate frito", 400, "ml");

    List<Ingrediente> ninguno = Collections.emptyList();
    List<String> nadaQueRetirar = Collections.emptyList();

}


