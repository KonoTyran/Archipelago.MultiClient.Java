package dev.koifysh.archipelago.network.client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import dev.koifysh.archipelago.events.Event;
import dev.koifysh.archipelago.network.APPacket;
import dev.koifysh.archipelago.network.APPacketType;

import java.util.HashMap;

public class BouncePacket extends APPacket implements Event {

    @Expose
    @SerializedName("games")
    public String[] games = new String[]{};

    @Expose
    @SerializedName("slots")
    public int[] slots = new int[]{};

    @Expose
    @SerializedName("tags")
    public String[] tags = new String[]{};

    @Expose
    @SerializedName("data")
    private HashMap<String, Object> data;

    public BouncePacket() {
        super(APPacketType.Bounce);
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
}
