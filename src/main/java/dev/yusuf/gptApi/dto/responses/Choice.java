package dev.yusuf.gptApi.dto.responses;

import dev.yusuf.gptApi.dto.requests.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Choice {

    private int index;
    private Message message;

}
