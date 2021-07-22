import java.util.List;
import java.util.ArrayList;

/**
 * 
 */

public class ResourcesSchedule{

    private Tarea deleteMinStargingJob(ArrayList<Tarea> tareas){

        Tarea aux = tareas.get(0);
        tareas.remove(0);

        return aux;

    }

    public List<List<Tarea>> minimumResourcesSchedule(ArrayList<Tarea> tareas){

        int min = 1;
        int tamanho = tareas.size();
        boolean asignado;

        Tarea t01 = new Tarea();
        Tarea t02 = new Tarea();

        List<List<Tarea>> schedule = new ArrayList<List<Tarea>>();
        for(int i = 0; i < tamanho; i++){
            schedule.add(new ArrayList<Tarea>());
        }

        ArrayList<Tarea> wait = tareas;

        schedule.get(0).add(new Tarea(0,0));

        while( !(wait.isEmpty()) ){

            t01 = deleteMinStargingJob(wait);
            System.out.println(t01);

            asignado = false;



            /*
            for(int j = 1; j < min; j++){
                int k = 0;
                t02 = schedule.get(j-1).get(k);
                if(t02.getEnd() <= t01.getStart() || t01.getStart() <= t02.getEnd()){
                    schedule.get(j).add(t01);
                    asignado = true;
                    break;
                }
                k++;

            }*/

            /*
            for(int j = 0; j <= min; j++){
                for(int k = 0; k < schedule.size(); k++){
                    t02 = schedule.get(j).get(k);
                    if(t02.getEnd() <= t01.getStart() || t01.getStart() <= t02.getEnd()){
                        schedule.get(j).add(t01);
                        asignado = true;
                        break;
                    }
                }
                
            }*/

            /*
            for(int j = 1; j <= min; j++){
                for(int k = 0; k < schedule.size(); k++){
                    t02 = schedule.get().get();
                    if(t01.getEnd() <= t01.getStart() || t01.getStart() <= t01.getEnd()){
                        schedule.get(j).add(t01);
                        asignado = true;
                        break;
                    }
                }

            }*/

            if( !(asignado) ){
                //min += 1;
                schedule.get(min).add(t01);
                min += 1;
            }
            
        }

        return schedule;

    }

    public static void main(String[] args) {
        
        ResourcesSchedule ejemplo = new ResourcesSchedule();

        ArrayList<Tarea> horario = new ArrayList<Tarea>();

        horario.add(new Tarea(1,4));
        horario.add(new Tarea(1,3));
        horario.add(new Tarea(2,5));
        horario.add(new Tarea(3,7));
        horario.add(new Tarea(4,7));
        horario.add(new Tarea(6,9));
        horario.add(new Tarea(7,8));

        List<List<Tarea>> resultado = ejemplo.minimumResourcesSchedule(horario);

        System.out.println(resultado.size());
        //System.out.println(resultado.get(0).get(0));
        System.out.println(resultado.get(1).size());


    }

}