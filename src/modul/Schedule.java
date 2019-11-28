package modul;

import java.sql.Date;
import java.sql.Time;

public class Schedule {
    int idS,idM,idR;
    Time startTime;
    Date dateS;

    public Schedule(int idS, int idM, int idR, Time startTime, Date dateS) {
        this.idS = idS;
        this.idM = idM;
        this.idR = idR;
        this.startTime = startTime;
        this.dateS = dateS;
    }

    public int getIdS() {
        return idS;
    }

    public void setIdS(int idS) {
        this.idS = idS;
    }

    public int getIdM() {
        return idM;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Date getDateS() {
        return dateS;
    }

    public void setDateS(Date dateS) {
        this.dateS = dateS;
    }
}
