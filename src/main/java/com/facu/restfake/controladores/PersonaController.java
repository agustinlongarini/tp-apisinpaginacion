package com.facu.restfake.controladores;

import com.facu.restfake.entidades.Persona;
import com.facu.restfake.servicios.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

}
