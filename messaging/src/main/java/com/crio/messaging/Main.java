package com.crio.messaging;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import com.crio.messaging.message.ImageMessage;
import com.crio.messaging.message.TextMessage;

public class Main {
    public static void main(String[] args) {
        // Call the android/iOS Handler code to send a message.
        // In real world, these functions will be called from your REST API server methods.
        // Don't worry about them for now - let's live in a simple world :)


        // Ankur sends a text message to Abhinaya
		TextMessage message1 = new TextMessage();
        message1.setSenderId("SENDER_Ankur");
        message1.setReceiverId("RECEIVER_Abhinaya");
        message1.setTextMessageContent("Hello, Have you checked out https://blog.crio.do?");
        AndroidHandler.sendText(message1);

        // Aman sends a message to Abhiskek
        ImageMessage message2 = new ImageMessage();
        message2.setSenderId("SENDER_Aman");
        message2.setReceiverId("RECEIVER_Abhiskek");
        
        String imagePath = getFilePathFromResource("CrioLogo.png");
        message2.setImageMessageContent(imageToBase64StringConversion(imagePath), "1080x1920","Some Random Image MetaData");
        AndroidHandler.sendImage(message2);
	}

    public static String imageToBase64StringConversion(String filePath) {
        byte[] fileContent;
        try {
            fileContent = Files.readAllBytes(Paths.get(filePath));
            return Base64.getEncoder().encodeToString(fileContent);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    private static String getFilePathFromResource(String fileName){
       return Main.class.getClassLoader().getResource(fileName).getPath();
    }
}
