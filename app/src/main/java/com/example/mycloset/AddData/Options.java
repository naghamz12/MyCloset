package com.example.mycloset.AddData;

public class Options {
    private String HighEnd, School, Casual, Wedding, Party, Travel, Gym;

    public Options(String highEnd, String school, String casual, String wedding, String party, String travel, String gym) {
        HighEnd = highEnd;
        School = school;
        Casual = casual;
        Wedding = wedding;
        Party = party;
        Travel = travel;
        Gym = gym;
    }

    public String getHighEnd() {
        return HighEnd;
    }

    public void setHighEnd(String highEnd) {
        HighEnd = highEnd;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getCasual() {
        return Casual;
    }

    public void setCasual(String casual) {
        Casual = casual;
    }

    public String getWedding() {
        return Wedding;
    }

    public void setWedding(String wedding) {
        Wedding = wedding;
    }

    public String getParty() {
        return Party;
    }

    public void setParty(String party) {
        Party = party;
    }

    public String getTravel() {
        return Travel;
    }

    public void setTravel(String travel) {
        Travel = travel;
    }

    public String getGym() {
        return Gym;
    }

    public void setGym(String gym) {
        Gym = gym;
    }

    @Override
    public String toString() {
        return "Options{" +
                "HighEnd='" + HighEnd + '\'' +
                ", School='" + School + '\'' +
                ", Casual='" + Casual + '\'' +
                ", Wedding='" + Wedding + '\'' +
                ", Party='" + Party + '\'' +
                ", Travel='" + Travel + '\'' +
                ", Gym='" + Gym + '\'' +
                '}';
    }
}
