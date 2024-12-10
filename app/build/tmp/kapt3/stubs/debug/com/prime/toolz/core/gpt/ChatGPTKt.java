package com.prime.toolz.core.gpt;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aE\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"CHAT_GPT_MODEL", "", "TAG", "USER_AGENT", "toJsonArray", "Lkotlinx/serialization/json/JsonArray;", "Lcom/prime/toolz/core/gpt/Message;", "getToJsonArray", "(Lcom/prime/toolz/core/gpt/Message;)Lkotlinx/serialization/json/JsonArray;", "send", "Lokhttp3/ResponseBody;", "Lcom/prime/toolz/core/gpt/ChatGPT;", "token", "message", "parentID", "conversationId", "model", "(Lcom/prime/toolz/core/gpt/ChatGPT;Ljava/lang/String;Lcom/prime/toolz/core/gpt/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ChatGPTKt {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "ChatGPT";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CHAT_GPT_MODEL = "text-davinci-002-render-sha";
    
    private static final kotlinx.serialization.json.JsonArray getToJsonArray(com.prime.toolz.core.gpt.Message $this$toJsonArray) {
        return null;
    }
    
    /**
     * Sends a request to the backend API's conversation endpoint and receives the response as a stream.
     *
     * This function is a suspending function, which means it can be called from a coroutine.
     *
     * @param token The authorization token for the request.
     * @param message The message to be sent.
     * @param parentID The ID of the parent message. It is a non-null and non-empty string. Defaults to a randomly generated UUID if not provided.
     * @param conversationId The ID of the conversation. If provided, the message will be added to an existing conversation. If not provided, a new conversation will be created.
     * @param model The name of the model to be used for generating the response. Defaults to [CHAT_GPT_MODEL].
     * @return The response body as a stream, which can be parsed as a Buffered Stream.
     *
     * @see source
     */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object send(@org.jetbrains.annotations.NotNull
    com.prime.toolz.core.gpt.ChatGPT $this$send, @org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.prime.toolz.core.gpt.Message message, @org.jetbrains.annotations.NotNull
    java.lang.String parentID, @org.jetbrains.annotations.Nullable
    java.lang.String conversationId, @org.jetbrains.annotations.NotNull
    java.lang.String model, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> $completion) {
        return null;
    }
}