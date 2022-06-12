package Kikke.ExerciseThree;

public abstract class Console {

    private int controls;
    private String soundConnector;
    private String videoConnector;

    public Console(int Controls, String soundConnector, String videoConnector){
        this.controls = controls;
        this.soundConnector = soundConnector;
        this.videoConnector = videoConnector;
    }

    //Getters

    public int getControls(){
        return controls;
    }

    public String getSoundConnector(){
        return soundConnector;
    }

    public String getVideoConnector(){
        return videoConnector;
    }

    //Setters

    public void setControls(int controls){
        this.controls = controls;
    }

    public void setSoundConnector(String soundConnector){
        this.soundConnector = soundConnector;
    }

    public void setVideoConnector(String videoConnector){
        this.videoConnector = videoConnector;
    }
}
