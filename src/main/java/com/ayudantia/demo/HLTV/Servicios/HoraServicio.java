package com.ayudantia.demo.HLTV.Servicios;

import java.util.List;

import com.ayudantia.demo.HLTV.Modelos.Hora;
import com.ayudantia.demo.HLTV.Repositorios.HoraRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("serviciohora")
public class HoraServicio{

    @Autowired
    @Qualifier("repositoriohora")
    private HoraRepositorio repositorio;
    
    public boolean crear(Hora hora){
        try{
            repositorio.save(hora);
            return true;
        } catch (Exception e){
            return false;
        }
    }


}