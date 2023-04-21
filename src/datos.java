import java.util.Scanner;

public class datos {
    public static void main(String[] args) {
        Empleado e1= new Empleado();
        Scanner sc = new Scanner(System.in);
        String nombre;
        String cedula;
        double valorHorasTrabajadas;
        double porcentajeRetencionFuente;
        int horasTrabajadas;
        int horasExtras;

        System.out.print("Ingrese un nombre: ");
        nombre = sc.next();
        e1.setNombre(nombre);

        System.out.print("Ingrese su cedula: ");
        cedula = sc.next();
        e1.setCedula(cedula);

        System.out.print("Ingrese el total de horas trabajadas: ");
        horasTrabajadas = Integer.parseInt(sc.next());
        e1.setHorasTrabajadas(horasTrabajadas);

        System.out.println("Ingrese el valor por horas trabajadas: ");
        valorHorasTrabajadas= Double.parseDouble(sc.next());
        e1.setValorHorasTrabajadas(valorHorasTrabajadas);

        System.out.println("Ingrese el porcentaje de retencion fuente: ");
        porcentajeRetencionFuente = Double.parseDouble(sc.next());
        e1.setPorcentajeRetencionFuente(porcentajeRetencionFuente);


        System.out.println("Nombre del empleado: "+ e1.getNombre());
        System.out.println("Cdeula del empleado: "+ e1.getCedula());
        System.out.println("El valor por horas trabajadas es: "+ e1.getValorHorasTrabajadas());
        System.out.println("Las horas trabajadas son: " + e1.getHorasTrabajadas());
        System.out.println("El porcentaje retencion fuente es: "+ e1.getPorcentajeRetencionFuente());
        System.out.println("El salario bruto de es: $" +  e1.calcularSalarioBruto());
        System.out.println("El monto de retencion de es: $" + e1.calcularMontoRetencion());
        System.out.println("El salario neto de es: $" + e1.calcularSalarioNeto());

        System.out.println("Ingrese las horas extras del empleado: ");
        horasExtras=Integer.parseInt(sc.next());
        e1.adicionarHorasTrabajadas(horasExtras);

        System.out.println("El total de horas trabajadas con horas extras incluidas es de: "+e1.getHorasTrabajadas());
        System.out.println("El salario neto de es: $" + e1.calcularSalarioNeto());

        //Constructor por parametros

        Empleado e2;

        System.out.print("Ingrese un nombre: ");
        nombre = sc.next();

        System.out.print("Ingrese su cedula: ");
        cedula = sc.next();

        System.out.print("Ingrese el total de horas trabajadas: ");
        horasTrabajadas = Integer.parseInt(sc.next());

        System.out.println("Ingrese el valor por horas trabajadas: ");
        valorHorasTrabajadas= Double.parseDouble(sc.next());

        System.out.println("Ingrese el porcentaje de retencion fuente: ");
        porcentajeRetencionFuente = Double.parseDouble(sc.next());

        e2 = new Empleado(nombre, cedula, horasTrabajadas, valorHorasTrabajadas, porcentajeRetencionFuente);

        System.out.println("Nombre del empleado: "+ e2.getNombre());
        System.out.println("Cdeula del empleado: "+ e2.getCedula());
        System.out.println("El valor por horas trabajadas es: "+ e2.getValorHorasTrabajadas());
        System.out.println("Las horas trabajadas son: " + e2.getHorasTrabajadas());
        System.out.println("El porcentaje retencion fuente es: "+ e2.getPorcentajeRetencionFuente());
        System.out.println("El salario bruto de es: $" +  e2.calcularSalarioBruto());
        System.out.println("El monto de retencion de es: $" + e2.calcularMontoRetencion());
        System.out.println("El salario neto de es: $" + e2.calcularSalarioNeto());

        System.out.println("Ingrese las horas extras del empleado: ");
        horasExtras=Integer.parseInt(sc.next());
        e2.adicionarHorasTrabajadas(horasExtras);

        System.out.println("El total de horas trabajadas con horas extras incluidas es de: "+e2.getHorasTrabajadas());
        System.out.println("El salario neto de es: $" + e2.calcularSalarioNeto());
    }
}

