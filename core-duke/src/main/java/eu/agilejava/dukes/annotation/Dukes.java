package eu.agilejava.dukes.annotation;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Stereotype;
import jakarta.enterprise.util.Nonbinding;

import java.lang.annotation.*;

@Stereotype
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ApplicationScoped
@Target(ElementType.TYPE)
public @interface Dukes {

    @Nonbinding
    String message();
}
