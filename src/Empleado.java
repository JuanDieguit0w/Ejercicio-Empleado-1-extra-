public class Empleado {
    //Atributos
    private String nombre;
    private String cedula;
    private int horasTrabajadas;
    private double valorHorasTrabajadas;
    private double porcentajeRetencionFuente;
    //Constructores
    public Empleado(){}
    public Empleado(String nombre, String cedula, int horasTrabajadas, double valorHorasTrabajadas, double porcentajeRetencionFuente) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHorasTrabajadas = valorHorasTrabajadas;
        this.porcentajeRetencionFuente = porcentajeRetencionFuente;
    }

    //Metodos
    public double calcularSalarioBruto(){
        return valorHorasTrabajadas*horasTrabajadas;
    }
    public double calcularMontoRetencion(){
        return calcularSalarioBruto()*porcentajeRetencionFuente;
    }
    public double calcularSalarioNeto(){
        return calcularSalarioBruto()-calcularMontoRetencion();
    }
    public void adicionarHorasTrabajadas(int horasExtras){
        horasTrabajadas += horasExtras;
    }
    /*Metodos para ingresar datos "set"
    Siempre son void y siempre reciben parametro del mismo tipo del atributo
    se pone this para diferenciar el nombre del parametro con el del atributo*/

    public void setNombre(String nombre){

        this.nombre=nombre;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas=horasTrabajadas;
    }
    public void setValorHorasTrabajadas(double valorHorasTrabajadas){
        this.valorHorasTrabajadas=valorHorasTrabajadas;
    }
    public void setPorcentajeRetencionFuente(double porcentajeRetencionFuente){
        this.porcentajeRetencionFuente=porcentajeRetencionFuente;
    }

    /*Metodos que permiten sacar información "get"
    Mismo tipo del atributo y no usa parametro*/

    public String getNombre(){
        return nombre;
    }
    public String getCedula(){
        return cedula;
    }
    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }
    public double getValorHorasTrabajadas(){
        return valorHorasTrabajadas;
    }
    public double getPorcentajeRetencionFuente(){
        return porcentajeRetencionFuente;
    }

}