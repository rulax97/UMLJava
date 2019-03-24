

/**
 * Class Server
 */
public class Server {

  //
  // Fields
  //

  public int cksum;
  public int n;
  public String sensormsg;
  public String mktemp;
  public String opcion;
  public Sensor Impl1;
  public Observer Impl2;
  
  //
  // Constructors
  //
  public Server () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of cksum
   * @param newVar the new value of cksum
   */
  public void setCksum (int newVar) {
    cksum = newVar;
  }

  /**
   * Get the value of cksum
   * @return the value of cksum
   */
  public int getCksum () {
    return cksum;
  }

  /**
   * Set the value of n
   * @param newVar the new value of n
   */
  public void setN (int newVar) {
    n = newVar;
  }

  /**
   * Get the value of n
   * @return the value of n
   */
  public int getN () {
    return n;
  }

  /**
   * Set the value of sensormsg
   * @param newVar the new value of sensormsg
   */
  public void setSensormsg (String newVar) {
    sensormsg = newVar;
  }

  /**
   * Get the value of sensormsg
   * @return the value of sensormsg
   */
  public String getSensormsg () {
    return sensormsg;
  }

  /**
   * Set the value of mktemp
   * @param newVar the new value of mktemp
   */
  public void setMktemp (String newVar) {
    mktemp = newVar;
  }

  /**
   * Get the value of mktemp
   * @return the value of mktemp
   */
  public String getMktemp () {
    return mktemp;
  }

  /**
   * Set the value of opcion
   * @param newVar the new value of opcion
   */
  public void setOpcion (String newVar) {
    opcion = newVar;
  }

  /**
   * Get the value of opcion
   * @return the value of opcion
   */
  public String getOpcion () {
    return opcion;
  }

  /**
   * Set the value of Impl1
   * @param newVar the new value of Impl1
   */
  public void setImpl1 (Sensor newVar) {
    Impl1 = newVar;
  }

  /**
   * Get the value of Impl1
   * @return the value of Impl1
   */
  public Sensor getImpl1 () {
    return Impl1;
  }

  /**
   * Set the value of Impl2
   * @param newVar the new value of Impl2
   */
  public void setImpl2 (Observer newVar) {
    Impl2 = newVar;
  }

  /**
   * Get the value of Impl2
   * @return the value of Impl2
   */
  public Observer getImpl2 () {
    return Impl2;
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
   * @return       boolean
   * @param        mensajecorrecto
   * @param        tam
   */
  public boolean validacion_mensaje(String mensajecorrecto, int tam)
  {
  }


  /**
   * @param        msgsave
   */
  public void Guardar_Mensaje(String msgsave)
  {
  }


  /**
   * @return       String
   * @param        messagereturn
   */
  public String Devolver_Mensaje(String messagereturn)
  {
  }


}
