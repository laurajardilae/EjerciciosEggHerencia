package servicio;

import entidades.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AppServicio {
    private List<Integrante> personas=new ArrayList<>();
    private HashMap<String, Integer> conteoSexo = new HashMap<>();
    private HashMap<String, Integer> edades = new HashMap<>();
    private HashMap<String, Integer> problemasSaludMap = new HashMap<>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public AppServicio() {
    }


    public void ejecutar(){
        System.out.println("BIENVENIDO");
        datosPorDefecto();
        menu();
    }
    public void datosPorDefecto(){
        ConFactoresDeRiesgo familia1 = new ConFactoresDeRiesgo("A123");
        SinFactoresDeRiesgo familia2 = new SinFactoresDeRiesgo("B123");
        Ninio ninio = new Ninio(11111,"Pepito", LocalDate.parse("2020-01-01"),"H",familia1 ); //3 años
        Joven joven = new Joven(22222,"Juan",LocalDate.parse("2007-02-10"),"O",familia1); //16
        Adulto adulto = new Adulto(3333, "Juliana", LocalDate.parse("1980-03-20"),"M",familia1); //43
        adulto.setProblemaSalud(new ProblemaSalud(true, false));
        AdultoMayor adultoMayor = new AdultoMayor(4444, "Roberto",LocalDate.parse("1960-06-09"),"H",familia2);//63
        adultoMayor.setProblemaSalud(new ProblemaSalud(true, true));
        personas.add(ninio);
        personas.add(joven);
        personas.add(adulto);
        personas.add(adultoMayor);
    }
    public void menu(){
        Integer opc;
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Consultar el total de las personas");
            System.out.println("2. Ver totales por sexo");
            System.out.println("3. Ver totales por edad");
            System.out.println("4. Ver totales por enfermedad");
            System.out.println("9. Salir");
            opc = Integer.parseInt(scan.next());
            switch (opc){
                case 1:
                    System.out.println("El total de las personas es: " + totalPersonas());
                    break;
                case 2:
                    contarPorSexo();
                    System.out.println("Los totales por sexo son: " + conteoSexo.toString());
                    break;
                case 3:
                    separarEdades();
                    System.out.println("Los totales por edad son: " + edades.toString());
                    break;
                case 4:
                    contarProblemasSalud();
                    System.out.println("Los totales por enfermedad son: " + problemasSaludMap.toString());
                    break;
            }
        }while (opc!=9);
    }

    public Integer totalPersonas(){
        return personas.size();
    }
    public void contarPorSexo(){
        conteoSexo.put("mujer",0);
        conteoSexo.put("hombre",0);
        conteoSexo.put("otro",0);
        Integer valorActual=0;
        for (Integrante i:personas             ) {
            if(i.getSexo().equalsIgnoreCase("H")){
                valorActual = conteoSexo.get("hombre");
                conteoSexo.put("hombre",valorActual+1);
            } else if (i.getSexo().equalsIgnoreCase("M")){
                valorActual = conteoSexo.get("mujer");
                conteoSexo.put("mujer",valorActual+1);
            } else {
                valorActual = conteoSexo.get("otro");
                conteoSexo.put("otro",valorActual+1);
            }
            valorActual=0;
        }
    }
    public void separarEdades(){
        edades.put("<1",0);
        edades.put("1-10",0);
        edades.put("11-20",0);
        edades.put("21-60",0);
        edades.put(">60",0);
        Integer edadAux, valorActual=0;
        for (Integrante i:personas             ) {
            edadAux = Period.between(i.getFechaNacimiento(),LocalDate.now()).getYears();
            if(edadAux<1){
                valorActual = edades.get("<1");
                edades.put("<1",valorActual+1);
            } else if (edadAux>=1&&edadAux<=10){
                valorActual = edades.get("1-10");
                edades.put("1-10",valorActual+1);
            } else if (edadAux>=11&&edadAux<=20){
                valorActual = edades.get("11-20");
                edades.put("11-20",valorActual+1);
            }else if (edadAux>=21&&edadAux<=60){
                valorActual = edades.get("21-60");
                edades.put("21-60",valorActual+1);
            }else if (edadAux>60){
                valorActual = edades.get(">60");
                edades.put(">60",valorActual+1);
            }
            valorActual=0;
        }
    }
    public void contarProblemasSalud(){
        problemasSaludMap.put("DBT",0);
        problemasSaludMap.put("HTA",0);
        Integer valorActual=0;
        for (Integrante i:personas             ) {
            if(i.getProblemaSalud() != null) {
                if (i.getProblemaSalud().isDbt()) {
                    valorActual = problemasSaludMap.get("DBT");
                    problemasSaludMap.put("DBT", valorActual + 1);
                }
                if (i.getProblemaSalud().isHta()) {
                    valorActual = problemasSaludMap.get("HTA");
                    problemasSaludMap.put("HTA", valorActual + 1);
                }
            }
            valorActual=0;
        }
    }
}
