package group.aim.framework.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import group.aim.framework.annotation.enumeration.RestrictionType;

/**
 * Created by ponlavitlarpeampaisarl on 3/6/15 AD.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Restriction {
    RestrictionType type() default RestrictionType.NONE;

    int value() default 0;
}
