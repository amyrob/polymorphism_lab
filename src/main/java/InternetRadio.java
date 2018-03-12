public class InternetRadio implements IConnect {

    @Override
    public String connect(String data){
        return "Connecting to " + data + " network";
    }

    public String tuneIntoStation(String stationName){
        return "Tunning into " + stationName;
    }

}
