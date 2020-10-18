package edu.co.unipana.jjls;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.co.unipana.jjls.model.Vehiculo;

public class Main {

	public static void main(String...args) throws IOException {
		
		
		Vehiculo v = new Vehiculo();
		v.setCilindraje(100d);
		v.setId(1);
		v.setKilometros("9000");
		v.setMantenimiento("1 anio");
		v.setMarca("Ford");
		v.setModelo(2008);
		v.setPlaca("GMV770");
		v.setTipo("Bus");
		v.setTipoGasolina("Corriente");
		
		
		
		v.setImagen(extractBytes("/Users/sergio/Documents/carro.jpeg"));
	
		
		
		// Creating Object of ObjectMapper define in Jakson Api 
        ObjectMapper obj = new ObjectMapper(); 
        
        
        System.out.println(obj.writeValueAsString(v));
        
	}
	
	
	public static byte[] extractBytes (String ImageName) throws IOException {
		 // open image
		 File imgPath = new File(ImageName);
		 BufferedImage bufferedImage = ImageIO.read(imgPath);

		 // get DataBufferBytes from Raster
		 WritableRaster raster = bufferedImage .getRaster();
		 DataBufferByte data   = (DataBufferByte) raster.getDataBuffer();

		 return ( data.getData() );
		}
	
}

