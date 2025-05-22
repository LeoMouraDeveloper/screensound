package br.com.alura.screensound.service;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

public class ConsultaChatGPT {

    public static String obterInformacao(String texto){
        ChatLanguageModel gemini = GoogleAiGeminiChatModel.builder()
                .apiKey(System.getenv("OPENAI_APIKEY"))
                .modelName("gemini-1.5-flash")
                .build();

        String response = gemini.generate("Me fale sobre o artista/banda: " + texto + ", quero principais músicas, idade e biografia");
        return response;
    }
}
