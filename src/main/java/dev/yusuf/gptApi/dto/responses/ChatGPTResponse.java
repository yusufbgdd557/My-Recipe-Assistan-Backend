package dev.yusuf.gptApi.dto.responses;

import dev.yusuf.gptApi.dto.requests.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatGPTResponse {
    //It will response of list of choices(You can check from POSTMAN)

    private List<Choice> choices;

}
//I built the dto classes and get the required infos using POSTMAN and analysing it.