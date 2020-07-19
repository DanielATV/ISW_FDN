package com.ayudantia.demo.HLTV.Modelos;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Table(name="Hora")
@Entity
public class Hora{
    @Id
    @GenericGenerator(name="incrementHora", strategy="increment")
    @GeneratedValue(generator="incrementHora")
    @Column(name="id_sillon")
    long idSillon;

    @Column(name="id_paciente")
    long idPaciente;

    
    @Column(name="fecha_inicio")
    int fInicio;

    @Column(name="fecha_termino")
    String fTermino;

    public Hora(){

    }

    public Hora(long idSillon, long idPaciente, int fInicio, String fTermino) {
        this.idSillon = idSillon;
        this.idPaciente = idPaciente;
        this.fInicio = fInicio;
        this.fTermino = fTermino;
    }

    public long getIdSillon() {
        return this.idSillon;
    }

    public void setIdSillon(long idSillon) {
        this.idSillon = idSillon;
    }

    public long getIdPaciente() {
        return this.idPaciente;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    

    public int getFechaInicio() {
        return this.fInicio;
    }

    public void setFechaInicio(int fInicio) {
        this.fInicio = fInicio;
    }

    public String getFechaTermino() {
        return this.fTermino;
    }

    public void setFechaTermino(String fTermino) {
        this.fTermino = fTermino;
    }


}