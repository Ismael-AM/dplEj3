package cono;

/**
 * Clase que almacena y devuelve los datos un cono
 */
public class Cono {

    private Circulo base;
    private float altura;
    private String color;

    /**
     * 
     * @param cX eje X del Circulo (base)
     * @param cY eje Y del Circulo (base)
     * @param r radio del Circulo (base)
     * @param h altura del cono
     * @param color string con el color del cono
     */
    public Cono (float cX, float cY, float r, float h, String color) { // constructor
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }

    /**
     *  * Función que devuelve la base del cono
     * @return base del cono
     */
    public Circulo getBase() {
        return base;
    }

    /**
     * Función para asignarle una base al cono
     * @param base pasamos una base de clase Circulo para asignársela al cono
     */
    public void setBase(Circulo base) {
        this.base = base;
    }

    /**
     * Función que devuelve el color del cono
     * @return altura del cono
     */
    public float getAltura() {
        return altura;
    }
    
    /**
     * Función para darle una altura al cono
     * @param altura altura que pasamos a la función para asignárselo al cono
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Función que devuelve el color del cono
     * @return color del cono
     */
    public String getColor() {
        return color;
    }

    /**
     * Función para darle un color al cono
     * @param color color que pasamos a la función para asignárselo al cono
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Función que imprime en pantalla la altura y el color del cono
     */
    public void imprimir () {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }
}