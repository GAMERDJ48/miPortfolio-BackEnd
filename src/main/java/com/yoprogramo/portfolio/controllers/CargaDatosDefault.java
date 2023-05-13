package com.yoprogramo.portfolio.controllers;

import com.yoprogramo.portfolio.entities.*;
import com.yoprogramo.portfolio.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path = "portfolio/carga")
public class CargaDatosDefault {
    @Autowired
    PersonaService personaService;
    @Autowired
    ContactoService contactoService;
    @Autowired
    ExperienciaService experienciaService;
    @Autowired
    FormacionService formacionService;
    @Autowired
    HabilidadService habilidadService;
    @Autowired
    ProyectoService proyectoService;
    @Autowired
    TipoOrganizacionService tipoOrganizacionService;
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("")
    public void datosDefault(){
        Usuario usuario = new Usuario("admin","admin");
        Persona persona = new Persona("Franco","Ruiz", "2616619199", LocalDate.of(2000,2,19),
                "Soy alumno de 5to año de Ingeniería en Sistemas en la Universidad Tecnológica Nacional y deseo desempeñarme a nivel profesional, Me desempeño en programación, soy receptivo a las nuevas ideas y las pongo en practica. Además me adapto muy bien a los cambios emergentes",
                "https://media.licdn.com/dms/image/D4D03AQHS4I_BfT5afA/profile-displayphoto-shrink_100_100/0/1675897086739?e=1689206400&v=beta&t=EaGeDinJJACjWemAT1hrjrqnBQjlJbjsSsVhvLkk7eE",
                "https://images.pexels.com/photos/1447092/pexels-photo-1447092.png?cs=srgb&dl=pexels-thanhhoa-tran-1447092.jpg&fm=jpg"
                ,null,null,null,null,null);
        Contacto contacto = new Contacto("Linkedin","https://www.linkedin.com/in/franco-ruiz-64a24423b/");
        Contacto contacto1 = new Contacto("Gmail","mailto:francoruiz.48.2000@gmail.com");
        Contacto contacto2 = new Contacto("Facebook","https://www.facebook.com/ruizfranco2000");
        Contacto contacto3 = new Contacto("Instagram","https://www.instagram.com/francoruiz2000");
        TipoOrganizacion empresa=new TipoOrganizacion("Empresa");
        TipoOrganizacion ong=new TipoOrganizacion("ONG");
        TipoOrganizacion universidad=new TipoOrganizacion("Universidad");
        TipoOrganizacion escuelaSecundaria=new TipoOrganizacion("Escuela Secundaria");
        Experiencia experiencia = new Experiencia("Miembro del equipo de alianzas estrategicas","AIESEC",
                ong,"Soy miembro de AIESEC en Mendoza, el cual es una asociación civil internacional sin fines de lucro con la misión del desarrollo de liderazgo en los jovenes. Esta ubicada en 110 paises y se especializa en intercambios internacionales de voluntariado y laborales. ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpKGP2IeyZ9AZ548WmeHzrXIYa2SLoRsg7UNO-XMo6CCRppVo-vzupCaYRYxufuI609xk&usqp=CAU",
                2023,null );
        Experiencia experiencia1 = new Experiencia("Atención al cliente","Kiosco MILLCAYAC",
                empresa, "MILLCAYAC, kiosco en Maipú, referencias 2615326569, Eugenia",
                "",
                2022,null);
        Experiencia experiencia2 = new Experiencia("Programador Independiente","Martins Domingos", empresa,
                "Fue un trabajo que hice como programador independiente donde diseñe y desarrolle un software de control de máquinas cosechadoras para la empresa Martins Domingos. El software incluye control de: combustible, stock, facturas, remitos,cosechas, vehículos, etc. ",
                "",
                2021,2022 );
        Formacion formacion = new Formacion("Universidad Tecnologica Nacional - Facultad Regional Mendoza",
                universidad, "Ingenieria en Sistemas",
                "Ingeniería en Sistemas de información(cursando el ultimo año, fecha tentativa de finalizado 2024). ",
                "https://utn.edu.ar/images/logo-utn.png",2019, null);
        Formacion formacion1 = new Formacion("AMICANA",empresa,"Ingles",
                "Realize hasta 4to año de Ingles en AMICANA, Institución de Ingles. Puedo decir que tengo un nivel intermedio de ingles. ",
                "http://www.amicana.com/images/logo.jpg",2020,2022);

        Habilidad habilidad = new Habilidad("Java",70);
        Habilidad habilidad1 = new Habilidad("Python",35);
        Habilidad habilidad2 = new Habilidad("Spring",53);
        Habilidad habilidad3 = new Habilidad("Bootstrap",45);
        Habilidad habilidad4 = new Habilidad("Thymeleaf",61);
        Habilidad habilidad5 = new Habilidad("HTML",40);
        Habilidad habilidad6 = new Habilidad("Ingles",55);

        List<String> tecnologias = new ArrayList<>();
        tecnologias.add("Java");
        tecnologias.add("Spring");
        tecnologias.add("Angular");
        tecnologias.add("Bootstrap");

        List<String> tecnologias1 = new ArrayList<>();
        tecnologias.add("Java");
        tecnologias.add("Spring");
        tecnologias.add("Thymeleaf");
        tecnologias.add("Bootstrap");
        Proyecto proyecto=new Proyecto("Portfolio Web con #YoProgramo", "","",
                "Se realizo una aplicacion web donde mostramos nuestro CV o mejor dicho es nuestro portfolio. Esta app tiene secciones de: contactos (redes sociales); Experiencias que hayamos tenido cualquier organización; Formación Academica; Habilidades; Proyectos de programación.",
                tecnologias1, 2022, null);
        Proyecto proyecto1=new Proyecto("Sistema de Control de Stock y Facturación de Maquinas Cosechadoras (SCSF)", "","",
                "Proyecto que realize como programador independiente en Martins Domingos. Por razones de confidencialidad, no me puedo brindar el GitHub del software.",
                tecnologias, 2022, 2023);

        try {
            usuarioService.save(usuario);
            personaService.save(persona);
            contactoService.save(contacto);
            contactoService.save(contacto1);
            contactoService.save(contacto3);
            contactoService.save(contacto2);
            tipoOrganizacionService.save(empresa);
            tipoOrganizacionService.save(universidad);
            tipoOrganizacionService.save(escuelaSecundaria);
            tipoOrganizacionService.save(ong);
            experienciaService.save(experiencia);
            experienciaService.save(experiencia1);
            experienciaService.save(experiencia2);
            formacionService.save(formacion);
            formacionService.save(formacion1);
            habilidadService.save(habilidad);
            habilidadService.save(habilidad1);
            habilidadService.save(habilidad2);
            habilidadService.save(habilidad3);
            habilidadService.save(habilidad4);
            habilidadService.save(habilidad5);
            habilidadService.save(habilidad6);
            proyectoService.save(proyecto);
            proyectoService.save(proyecto1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
