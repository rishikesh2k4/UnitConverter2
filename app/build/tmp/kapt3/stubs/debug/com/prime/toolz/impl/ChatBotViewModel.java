package com.prime.toolz.impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\'H\u0016J\u0010\u0010)\u001a\u00020\'2\u0006\u0010*\u001a\u00020\fH\u0016J\u0010\u0010+\u001a\u00020\'2\u0006\u0010*\u001a\u00020\fH\u0016J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u0002H.0-\"\u0004\b\u0000\u0010.*\b\u0012\u0004\u0012\u0002H.0/H\u0003R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0011R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0011\u00a8\u00060"}, d2 = {"Lcom/prime/toolz/impl/ChatBotViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/prime/toolz/chatbot/ChatBot;", "preferences", "Lcom/primex/preferences/Preferences;", "channel", "Landroidx/compose/material3/SnackbarHostState;", "(Lcom/primex/preferences/Preferences;Landroidx/compose/material3/SnackbarHostState;)V", "_conversation", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/prime/toolz/core/gpt/Message;", "_id", "", "<set-?>", "", "_processing", "get_processing", "()Z", "set_processing", "(Z)V", "_processing$delegate", "Landroidx/compose/runtime/MutableState;", "_token", "get_token", "()Ljava/lang/String;", "_token$delegate", "Landroidx/compose/runtime/State;", "api", "Lcom/prime/toolz/core/gpt/ChatGPT;", "conversation", "", "getConversation", "()Ljava/util/List;", "isLoggedIn", "job", "Lkotlinx/coroutines/Job;", "processing", "getProcessing", "_clear", "", "clear", "onLoggedIn", "value", "send", "asComposeState", "Landroidx/compose/runtime/State;", "T", "Lkotlinx/coroutines/flow/Flow;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ChatBotViewModel extends androidx.lifecycle.ViewModel implements com.prime.toolz.chatbot.ChatBot {
    @org.jetbrains.annotations.NotNull
    private final com.primex.preferences.Preferences preferences = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.material3.SnackbarHostState channel = null;
    @org.jetbrains.annotations.NotNull
    private final com.prime.toolz.core.gpt.ChatGPT api = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State _token$delegate = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String _id;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.prime.toolz.core.gpt.Message> _conversation = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState _processing$delegate = null;
    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.Job job;
    
    @javax.inject.Inject
    public ChatBotViewModel(@org.jetbrains.annotations.NotNull
    com.primex.preferences.Preferences preferences, @org.jetbrains.annotations.NotNull
    androidx.compose.material3.SnackbarHostState channel) {
        super();
    }
    
    @java.lang.Deprecated
    private final <T extends java.lang.Object>androidx.compose.runtime.State<T> asComposeState(kotlinx.coroutines.flow.Flow<? extends T> $this$asComposeState) {
        return null;
    }
    
    private final java.lang.String get_token() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.prime.toolz.core.gpt.Message> getConversation() {
        return null;
    }
    
    @java.lang.Override
    public boolean isLoggedIn() {
        return false;
    }
    
    private final boolean get_processing() {
        return false;
    }
    
    private final void set_processing(boolean p0) {
    }
    
    @java.lang.Override
    public boolean getProcessing() {
        return false;
    }
    
    private final void _clear() {
    }
    
    @java.lang.Override
    public void clear() {
    }
    
    @java.lang.Override
    public void onLoggedIn(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @java.lang.Override
    public void send(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
}