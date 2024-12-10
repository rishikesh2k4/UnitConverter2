package com.prime.toolz.core.gpt;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/prime/toolz/core/gpt/ChatGPT;", "", "send", "Lokhttp3/ResponseBody;", "token", "", "body", "Lokhttp3/RequestBody;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ChatGPT {
    @org.jetbrains.annotations.NotNull
    public static final com.prime.toolz.core.gpt.ChatGPT.Companion Companion = null;
    
    /**
     * Sends a request [Message] as [RequestBody] and receives [ResponseBody] as a response.
     * The response body is a stream and can be parsed as a Buffered Stream.
     *
     * This function is used to send a request to the backend API's conversation endpoint. It requires the following parameters:
     * [token]: A string containing the authorization token for the request, passed as a header.
     * [body]: The request body containing the message to be sent, passed as a JSON object.
     *
     * The function uses the HTTP POST method to send the request to the specified endpoint.
     *
     * @param token The authorization token for the request.  Append with 'Bearer'
     * @param body The request body containing the message to be sent.
     * @return The response body as a stream, which can be parsed as a Buffered Stream.
     *
     * @see <a href="https://github.com/terminalcommandnewsletter/everything-chatgpt/blob/520e6cd6d78d1d08ab4f0c863316429c76a6a540/client-side-js/%5BNot%20used%20anymore%5D%20264-13e92c51b0315184.js">source</a>
     */
    @retrofit2.http.Headers(value = {"accept: text/event-stream", "accept-encoding: gzip, deflate, br", "accept-language: en-GB,en-US;q=0.9,en;q=0.8", "content-type: application/json", "referer: https://chat.openai.com/chat", "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36"})
    @retrofit2.http.POST(value = "backend-api/conversation")
    @org.jetbrains.annotations.Nullable
    @java.lang.Deprecated
    public abstract java.lang.Object send(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String token, @retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/prime/toolz/core/gpt/ChatGPT$Companion;", "", "()V", "invoke", "Lcom/prime/toolz/core/gpt/ChatGPT;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.prime.toolz.core.gpt.ChatGPT invoke() {
            return null;
        }
    }
}