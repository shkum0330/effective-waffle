package com.ssafy.chat.api.response;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class ChatParam {
    private Long memberId;
    private String message;
    private Timestamp timestamp;
}
