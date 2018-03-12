import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int maxDevices;

    public Network(String name, int maxDevices){
        this.devices = new ArrayList<>();
        this.name = name;
        this.maxDevices = maxDevices;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(IConnect device){
        if (freeSpots() > 0)
            devices.add(device);
    }

    public void disconnectAll(){
        devices.clear();
    }

    public int freeSpots(){
        return maxDevices - this.devices.size();
    }
}