package cono;

/**
 * Clase que almacena y devuelve los datos un círculo
 */
public class Circulo {

    private float x, y;
    private float radio;

    /**
     * Constructor de la clase círculo
     * @param cX eje x del círculo
     * @param cY eje y del círculo
     * @param r radio del círculo
     */
    public Circulo (float cX, float cY, float r) { // constructor
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }

    /**
     * Función que devuelve el eje x del círculo
     * @return eje x del círculo
     */
    public float getX() { return x; }
    /**
      * Función para asignar el eje x al círculo
     * @param x eje x que pasamos a la función para asignárselo al círcul
     */
    public void setX(float x) { this.x = x; }
    /**
     * Función que devuelve el eje y del círculo
     * @return eje y del círculo
     */
    public float getY() { return y; }
    /**
     * Función para asignar el eje y al círculo
     * @param y eje y que pasamos a la función para asignárselo al círculo
     */
    public void setY(float y) { this.y = y; }
    /**
     * Función que devuelve el radio del círculo
     * @return radio del círculo
     */
    public float getRadio() { return radio; }
    /**
     * Función para asignar un radio al círculo
     * @param radio radio que pasamos a la función para asignárselo al círculo
     */
    public void setRadio(float radio) { this.radio = radio; }
    /**
     * Función que devuelve el área del círculo
     * @return área del círculo
     */
    public float area() { return (float)Math.PI*radio*radio; }

    /**
     * Función que imprime en pantalla los datos del círculo
     */
    public void imprimir () {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}


