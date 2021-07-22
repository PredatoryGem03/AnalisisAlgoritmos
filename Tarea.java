/**
 * 
 */

public class Tarea{

    private int start;
    private int end;

    public Tarea(){
        this.start = 0;
        this.end = 0;
    }

    public Tarea(int start, int end){

        this.start = start;
        this.end = end;

    }

    public int getStart(){
        return start;
    }

    public int getEnd(){
        return end;
    }

    public String toString(){
        return "["+start+", "+end+"]";
    }

}