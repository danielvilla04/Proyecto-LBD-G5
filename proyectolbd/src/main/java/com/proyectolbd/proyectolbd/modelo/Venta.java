package com.proyectolbd.proyectolbd.modelo;

import java.sql.Date;

public class Venta {
    
    private int idVenta;
    private int idFactura;
    private Date fechaVenta;
    private int totalVenta;


    public Venta() {
    }


    public Venta(int idVenta, int idFactura, Date fechaVenta, int totalVenta) {
        this.idVenta = idVenta;
        this.idFactura = idFactura;
        this.fechaVenta = fechaVenta;
        this.totalVenta = totalVenta;
    }


    public int getIdVenta() {
        return idVenta;
    }


    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }


    public int getIdFactura() {
        return idFactura;
    }


    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }


    public Date getFechaVenta() {
        return fechaVenta;
    }


    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }


    public int getTotalVenta() {
        return totalVenta;
    }


    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }

    
    

}
