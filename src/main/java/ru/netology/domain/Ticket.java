package ru.netology.domain;

import java.util.Objects;

public class Ticket implements Comparable<Ticket> {
    int id;
    int costTicket;
    String departureAirport;
    String arrivalAirport;
    int timeTravel;

    public Ticket() {
    }

    public Ticket(int id, int costTicket, String departureAirport, String arrivalAirport, int timeTravel) {
        this.id = id;
        this.costTicket = costTicket;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.timeTravel = timeTravel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCostTicket() {
        return costTicket;
    }

    public void setCostTicket(int costTicket) {
        this.costTicket = costTicket;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(int timeTravel) {
        this.timeTravel = timeTravel;
    }

    public boolean matches(String text) {
        if (getDepartureAirport().contains(text)) {
            return true;
        }
        if (getArrivalAirport().contains(text)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && costTicket == ticket.costTicket && timeTravel == ticket.timeTravel && departureAirport.equals(ticket.departureAirport) && arrivalAirport.equals(ticket.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, costTicket, departureAirport, arrivalAirport, timeTravel);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", costTicket=" + costTicket +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", timeTravel=" + timeTravel +
                '}';
    }

    @Override
    public int compareTo(Ticket t) {
        return this.costTicket - t.costTicket;
    }
}
