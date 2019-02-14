package com.harmonycloud.entity;

import javax.persistence.Entity;

/**
 * @author qidong
 * @date 2019/2/13
 */

public class Room {
    private Integer roomId;
    private String roomName;
    private Integer clinicId;

    public Room() {
    }

    public Room(Integer roomId, String roomName, Integer clinicId) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.clinicId = clinicId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getClinicId() {
        return clinicId;
    }

    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }
}
