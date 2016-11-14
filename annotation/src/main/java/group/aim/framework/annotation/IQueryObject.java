package group.aim.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import group.aim.framework.annotation.enumeration.RestrictionType;
import group.aim.framework.enumeration.ColumnType;
import group.aim.framework.enumeration.NullableType;


/**
 * Created by ponlavitlarpeampaisarl on 3/6/15 AD.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
public @interface IQueryObject {
    String name();

    Restriction restriction() default @Restriction(type = RestrictionType.NONE);

    ColumnType type() default ColumnType.NONE;

    boolean persistence() default false;

    NullableType nullAble() default NullableType.NULLABLE;

}

