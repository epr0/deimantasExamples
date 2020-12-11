package lt.sdacademy.advancedfeatures.annotations.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 When to use custom annotations:
* If we want place a restriction on the field so that it can store a value that is supported by our annotation.
* Providing the customs check to the field that can be globally applied to different services.
* Can be used to reduce the lines of code. If we use the same annotation work bunch of fields instead of writing validations or constraints.
* */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String value() default "Sestadienis";

    String name();

    int age();
}
