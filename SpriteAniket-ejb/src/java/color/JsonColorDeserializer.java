/*
 * File name: JsonColorDeserializer.java
 * Author: Aniket Babbar
`* Student Number: 040957207
 * Course: CST8218 - Web Enterprise Application, Section: 300
 * Professor: Todd Kelley
 * Assignment: 1
 * Date: 26th March, 2021
 * Purpose: Deserialize the color for restful api.
 */
package color;

import java.awt.Color;
import java.awt.Event;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.stream.JsonParser;
import static javax.json.stream.JsonParser.Event.KEY_NAME;
import static javax.json.stream.JsonParser.Event.VALUE_NUMBER;

/**
 *
 * @author Aniket
 */
public class JsonColorDeserializer implements JsonbDeserializer<Color> {
    @Override
    public Color deserialize(javax.json.stream.JsonParser parser, javax.json.bind.serializer.DeserializationContext ctx, java.lang.reflect.Type rtType) {
        String keyname = "";  int value = 0; int red = 0; int green = 0; int blue = 0;
        while (parser.hasNext()) {
            JsonParser.Event event = parser.next();
            switch (event) {
                case KEY_NAME: {
                    keyname = parser.getString();
                    break;
                }
                case VALUE_NUMBER: {
                    value = parser.getInt();
                    if (keyname.equals("red")) red = value;
                    else if (keyname.equals("green")) green = value;
                    else if (keyname.equals("blue")) blue = value; 
                    break;
               }
            }
        }   
        return new Color(red,green,blue);
    } 
}