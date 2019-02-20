package test.pojo;

import test.pojo.AppointmentKey;

import java.util.Date;

public class Appointment extends AppointmentKey {
    private Date appointTime;

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }
}