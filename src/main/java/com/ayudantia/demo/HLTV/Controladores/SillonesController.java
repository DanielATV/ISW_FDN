package com.ayudantia.demo.HLTV.Controladores;

import javax.validation.Valid;


import com.ayudantia.demo.HLTV.Modelos.Hora;
import com.ayudantia.demo.HLTV.Servicios.HoraServicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("sillones")
public class SillonesController {

    @Autowired
    @Qualifier("serviciohora")
    HoraServicio servicio;
    
    @PostMapping
    public boolean createHora(@RequestBody @Valid Hora hora){

        System.out.println(hora.getFechaInicio());
        System.out.println(hora.getFechaTermino());
        System.out.println(hora.getIdPaciente());
        System.out.println(hora.getIdSillon());
        return servicio.crear(hora);
    }
}