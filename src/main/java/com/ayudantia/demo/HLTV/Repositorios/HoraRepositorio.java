package com.ayudantia.demo.HLTV.Repositorios;

import java.io.Serializable;
import java.util.List;

import com.ayudantia.demo.HLTV.Modelos.Hora;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("repositoriohora")
public interface HoraRepositorio extends JpaRepository<Hora, Serializable>{
    
}