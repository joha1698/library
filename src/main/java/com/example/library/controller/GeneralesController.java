@RestController
@RequestMapping({"generales"})
public class GeneralesController {

    private Libreria libreria;

    public GeneralesController(){
        libreria = new Libreria;
        libreria.setNombre("Libreria del Carmen");
        libreria.setDireccion("Cra 2 # 27");
        libreria.setTelefono(2332);
        libreria.serHorario(8-5);
    }

    @GetMapping("/")
    public String nombre(){
        return libreria;
    };
    
    @GetMapping("nombre")
    public String nombre(){
        return libreria.getNombre();
    };

    @GetMapping("direccion")
    public String direccion(){
        return libreria.getDireccion();
    };
}

