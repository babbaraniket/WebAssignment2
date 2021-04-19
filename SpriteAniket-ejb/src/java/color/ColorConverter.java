/*
 * File name: ColorConverter.java
 * Author: Aniket Babbar
`* Student Number: 040957207
 * Course: CST8218 - Web Enterprise Application, Section: 300
 * Professor: Todd Kelley
 * Assignment: 1
 * Date: 26th March, 2021
 * Purpose: Convert the color object and change it as object and string for the user on jsf pages.
 */
package color;

import java.awt.Color;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("color.ColorConverter")
public class ColorConverter implements Converter {
     
    /** 
     * This getAsObject() method convert the string value of color to the object of Color type
     * to be store in the sprite.
     */
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        value = value.substring(1, value.length() - 1);
        String[] parts = value.split(",");
        int[] ints = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            ints[i] = Integer.parseInt(parts[i]);
        }
        return new Color(ints[0],ints[1],ints[2]);
    }
    
    /**
     * This getAsString() method helps to convert the Color type value to string so that it 
     * can be shown to user as a readable unit.
     */
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Color color = (Color) value;
        return "["+ color.getRed() + "," + color.getGreen() + "," + color.getBlue() + "]";
    }
}