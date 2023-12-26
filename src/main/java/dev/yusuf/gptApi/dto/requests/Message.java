package dev.yusuf.gptApi.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String role;//This is for who is accessing it -> User or Admin
    private String content;//PROMPT->This is for what are you searching for, your question, message etc.

}
