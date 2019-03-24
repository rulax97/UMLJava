

/**
 * Class Client
 */
public class Client {

  //
  // Fields
  //

  public char tipo;
  public String nombresensor;
  public String tiempo;
  public String fecha;
  public float datos;
  public int checksum;
  
  //
  // Constructors
  //
  public Client () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of tipo
   * @param newVar the new value of tipo
   */
  public void setTipo (char newVar) {
    tipo = newVar;
  }

  /**
   * Get the value of tipo
   * @return the value of tipo
   */
  public char getTipo () {
    return tipo;
  }

  /**
   * Set the value of nombresensor
   * @param newVar the new value of nombresensor
   */
  public void setNombresensor (String newVar) {
    nombresensor = newVar;
  }

  /**
   * Get the value of nombresensor
   * @return the value of nombresensor
   */
  public String getNombresensor () {
    return nombresensor;
  }

  /**
   * Set the value of tiempo
   * @param newVar the new value of tiempo
   */
  public void setTiempo (String newVar) {
    tiempo = newVar;
  }

  /**
   * Get the value of tiempo
   * @return the value of tiempo
   */
  public String getTiempo () {
    return tiempo;
  }

  /**
   * Set the value of fecha
   * @param newVar the new value of fecha
   */
  public void setFecha (String newVar) {
    fecha = newVar;
  }

  /**
   * Get the value of fecha
   * @return the value of fecha
   */
  public String getFecha () {
    return fecha;
  }

  /**
   * Set the value of datos
   * @param newVar the new value of datos
   */
  public void setDatos (float newVar) {
    datos = newVar;
  }

  /**
   * Get the value of datos
   * @return the value of datos
   */
  public float getDatos () {
    return datos;
  }

  /**
   * Set the value of checksum
   * @param newVar the new value of checksum
   */
  public void setChecksum (int newVar) {
    checksum = newVar;
  }

  /**
   * Get the value of checksum
   * @return the value of checksum
   */
  public int getChecksum () {
    return checksum;
  }

  //
  // Other methods
  //

  /**
   * @return       int
   * @param        argc
   * @param        argv
   */
  public int main(int argc, char argv)
  {
  }


  /**
   */
  public void menu()
  {
  }


  /**
   * @return       String
   * @param        mensaje
   */
  public String Update(String mensaje)
  {
  }


  /**
   * @return       String
   * @param        nombreobservador
   * @param        nombresensor
   */
  public String Request(String nombreobservador, String nombresensor)
  {
  }


  /**
   * @return       char
   * @param        msg
   */
  public char error(char msg)
  {
  }


}
