
/*
 * File name: ColorAdapter.java
 * Author: Aniket Babbar
`* Student Number: 040957207
 * Course: CST8218 - Web Enterprise Application, Section: 300
 * Professor: Todd Kelley
 * Assignment: 1
 * Date: 26th March, 2021
 * Purpose: Convert the color object and change it as readble string for restful api.
 */
package color;

import java.awt.Color;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author Aniket
 */
public class ColorAdapter extends XmlAdapter<ColorAdapter.ColorValueType, Color> {
        @Override
        public Color unmarshal(ColorValueType v) throws Exception {
            return new Color(v.red, v.green, v.blue);
        }
        @Override
        public ColorValueType marshal(Color v) throws Exception {
            return new ColorValueType(v.getRed(), v.getRed(), v.getBlue());
        }
        @XmlAccessorType(XmlAccessType.FIELD)
        public static class ColorValueType {
            private int red;
            private int green;
            private int blue;
            public ColorValueType() {
            }
            public ColorValueType(int red, int green, int blue) {
                this.red = red;
                this.green = green;
                this.blue = blue;
            }
        } 
}

