package com.prime.toolz.chatbot;

/**
 * An interface representing state of a chat bot.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\b\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/prime/toolz/chatbot/ChatBot;", "", "conversation", "", "Lcom/prime/toolz/core/gpt/Message;", "getConversation", "()Ljava/util/List;", "isLoggedIn", "", "()Z", "processing", "getProcessing", "clear", "", "onLoggedIn", "value", "", "send", "Companion", "app_debug"})
public abstract interface ChatBot {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String route = "route_chat_bot";
    @org.jetbrains.annotations.NotNull
    public static final com.prime.toolz.chatbot.ChatBot.Companion Companion = null;
    
    /**
     * A conversation is a list of messages, where each subsequent message is a child of the previous one.
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.prime.toolz.core.gpt.Message> getConversation();
    
    /**
     * Sends a message. The message will be appended to the [conversation] list.
     *
     * @param message The message to be sent.
     */
    public abstract void send(@org.jetbrains.annotations.NotNull
    java.lang.String value);
    
    /**
     * The state of the chat bot.
     */
    public abstract boolean getProcessing();
    
    /**
     * Indicates whether this app has access to the back-end server.
     *
     * @return true if this app has access, false otherwise.
     */
    public abstract boolean isLoggedIn();
    
    /**
     * Sets or saves persistently the access token provided by the user.
     *
     * Example JSON input:
     * ```
     * {
     *    "user": {
     *        "id": "user-sdsdsgfghhfgjgj",
     *        "name": "Zakir Sheikh",
     *        "email": "feedbacktoprime@gmail.com",
     *        "image": "https://lh3.googleusercontent.com/s96-c",
     *        "picture": "https://lh3.googleusercontent.com/a/fy60ks=s96-c",
     *        "idp": "google-oauth2",
     *        "iat": 1686933542,
     *        "mfa": false,
     *        "groups": [],
     *        "intercom_hash": "d66746f97303663eb50b9a5cd43286d135c3f36daf19949"
     *    },
     *    "expires": "2023-07-27T04:19:42.475Z",
     *    "accessToken": "access token",
     *    "authProvider": "auth0"
     * }
     * ```
     * @param value The JSON string containing the access token. If an empty string is passed, the old saved value will be removed.
     */
    public abstract void onLoggedIn(@org.jetbrains.annotations.NotNull
    java.lang.String value);
    
    /**
     * Clears the conversation and starts a new one.
     */
    public abstract void clear();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/prime/toolz/chatbot/ChatBot$Companion;", "", "()V", "route", "", "direction", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String route = "route_chat_bot";
        
        private Companion() {
            super();
        }
        
        /**
         * Provides the direction for the [ChatBot] route.
         *
         * @return the route for [ChatBot]
         */
        @org.jetbrains.annotations.NotNull
        public final java.lang.String direction() {
            return null;
        }
    }
}