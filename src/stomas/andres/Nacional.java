package stomas.andres;

public class Nacional extends Cedula{
    public String getRut(){
        return super.getRun();
    }
    public void setRut(String run){
        super.setRun(run.trim());
    }
}
