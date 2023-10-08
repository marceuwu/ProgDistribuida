//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.10.07 a las 08:50:09 PM CST 
//


package com.itq.userService.dto;

import javax.xml.bind.annotation.XmlRegistry;

import com.itq.userService.dto.AckUserInfo;
import com.itq.userService.dto.AckValidation;
import com.itq.userService.dto.IdUsuario;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.itq.autoService.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.itq.autoService.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AckValidation }
     * 
     */
    public AckValidation createAckValidation() {
        return new AckValidation();
    }

    /**
     * Create an instance of {@link AckUserInfo }
     * 
     */
    public AckUserInfo createAckUserInfo() {
        return new AckUserInfo();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link IdUsuario }
     * 
     */
    public IdUsuario createIdUsuario() {
        return new IdUsuario();
    }

}
