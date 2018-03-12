import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Desktop desktop;
    InternetRadio internetRadio;

    @Before
    public void before() {
        network = new Network("CodeClan", 5);
        desktop = new Desktop("Keith's Desktop", "Apple", "Macbook Pro");
        internetRadio = new InternetRadio();
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(desktop);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll() {
        network.connect(desktop);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void hasAllSpotsWhenEmpty(){
        assertEquals(5, this.network.freeSpots());
    }

    @Test
    public void canGetFreeSpots(){
        this.network.connect(internetRadio);
        assertEquals(4, this.network.freeSpots());
    }

    @Test
    public void cannotExceedCapacity(){
        for (int i = 0; i< 6; i++) {
            this.network.connect(internetRadio);

        }
        assertEquals(0, this.network.freeSpots());
    }


}
