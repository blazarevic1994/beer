package com.example.beer.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMapper {

    public String asString(Date date) {
        return date != null ? new SimpleDateFormat( "dd/MM/yyyy" )
                .format( date ) : null;
    }

    public Date asDate(String date) {
        try {
            return date != null ? new SimpleDateFormat( "dd/MM/yyyy" )
                    .parse( date ) : null;
        }
        catch (ParseException e ) {
            throw new RuntimeException( e );
        }
    }

    public static void main(String[] args) {
        Date date = new DateMapper().asDate("01/01/2018");
        System.out.println(date);
    }
}
