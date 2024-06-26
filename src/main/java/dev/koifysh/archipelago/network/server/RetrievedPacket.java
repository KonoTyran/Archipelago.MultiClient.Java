package dev.koifysh.archipelago.network.server;

import com.google.gson.annotations.SerializedName;
import dev.koifysh.archipelago.network.APPacket;
import dev.koifysh.archipelago.network.APPacketType;

import java.util.HashMap;

public class RetrievedPacket  extends APPacket {

    @SerializedName("keys")
    public HashMap<String, Object> keys;

    @SerializedName("request_id")
    public int requestID;

    public RetrievedPacket() {
        super(APPacketType.Retrieved);
    }
}

