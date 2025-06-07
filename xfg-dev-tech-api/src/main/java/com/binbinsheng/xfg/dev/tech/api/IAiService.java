package com.binbinsheng.xfg.dev.tech.api;

import org.springframework.ai.chat.ChatResponse;
import reactor.core.publisher.Flux;

public interface IAiService {

    ChatResponse generate(String model, String message);

    //流式
    Flux<ChatResponse> generateStream(String model, String message);

}
