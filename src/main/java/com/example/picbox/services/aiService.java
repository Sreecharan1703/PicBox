package com.example.picbox.services;
import java.util.List;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import com.google.api.services.drive.model.File;

@Service
public class aiService {

    private final ChatClient chatClient;

    public aiService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public String generateResponse(String prompt) {
        return this.chatClient.prompt()
                .user(prompt)
                .call()
                .content(); 
    }

    public String[] searchfeature(List<File> allFiles, String name) {
        
        String prompt = "Find files semantically related to the concept of '" + name + "'. " +
        "Use broad semantic matching (e.g., if the search is 'bird', include files named 'peacock', 'eagle', etc.). " +
        "Here is the list of file metadata: " + allFiles.toString() + ". " +
        "Return ONLY a valid matching file names separated by commas. " +
        "Do not include any markdown formatting, conversational text, or explanations.";

        try {
            String Jsonresponse = this.chatClient.prompt()
                    .user(prompt)
                    .call()
                    .content();

            System.out.println("AI Response: " + Jsonresponse);

            String[] matchingFileNames = Jsonresponse.split(",");
            for (int i = 0; i < matchingFileNames.length; i++) {
                matchingFileNames[i] = matchingFileNames[i].trim();
            }
            return matchingFileNames;

        } catch (Exception ex) {
            System.err.println("Error during AI response generation: " + ex.getMessage());
            return new String[0]; 
        }
    }
}
