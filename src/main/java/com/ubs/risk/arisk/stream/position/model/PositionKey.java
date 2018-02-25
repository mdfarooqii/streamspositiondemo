package com.ubs.risk.arisk.stream.position.model;

public class PositionKey {

    private String positionId;
    private String positionName;

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String toString(){
        return "className is : "+this.getClass().getName() +"\n"
                + "positionId : ["+positionId + "]\n"
                + "positionName : ["+positionName+"]";
    }
}
