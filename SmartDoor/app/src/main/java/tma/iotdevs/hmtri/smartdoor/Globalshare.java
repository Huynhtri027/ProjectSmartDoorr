package tma.iotdevs.hmtri.smartdoor;

import android.app.Application;
import android.bluetooth.BluetoothSocket;

/**
 * Created by hmtri on 5/9/2017.
 */

public class Globalshare extends Application {



    private String mGlobalVarValue;
    private BluetoothSocket btSocket;
    public String getGlobalVarValue() {
        return mGlobalVarValue;
    }

    public void setGlobalVarValue(String str) {
        mGlobalVarValue = str;
    }

    public BluetoothSocket getGlobalSocketValue(){
        return btSocket;
    }

    public void setGlobalSocketValue(BluetoothSocket socket){
        this.btSocket = socket;
    }
}
