package com.konka.dhtsearch.db.mongodb;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MongoCollection 
{
	String value() default "";
}


