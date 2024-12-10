package com.prime.toolz.impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J5\u0010\u001d\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u001f\"\u0004\b\u0001\u0010 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H 0\"2\u0006\u0010#\u001a\u0002H H\u0016\u00a2\u0006\u0002\u0010$J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u0002H\'0&\"\u0004\b\u0000\u0010\'*\b\u0012\u0004\u0012\u0002H\'0(H\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0013\u0010\fR!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\t8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0017\u0010\fR!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\t8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/prime/toolz/impl/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/prime/toolz/settings/Settings;", "preferences", "Lcom/primex/preferences/Preferences;", "channel", "Landroidx/compose/material3/SnackbarHostState;", "(Lcom/primex/preferences/Preferences;Landroidx/compose/material3/SnackbarHostState;)V", "colorSystemBars", "Lcom/prime/toolz/settings/Preference;", "", "getColorSystemBars", "()Lcom/prime/toolz/settings/Preference;", "colorSystemBars$delegate", "Landroidx/compose/runtime/State;", "dynamicColors", "getDynamicColors", "dynamicColors$delegate", "hideStatusBar", "getHideStatusBar", "hideStatusBar$delegate", "nightMode", "Lcom/prime/toolz/core/NightMode;", "getNightMode", "nightMode$delegate", "numberGroupSeparator", "", "getNumberGroupSeparator", "numberGroupSeparator$delegate", "set", "", "S", "O", "key", "Lcom/primex/preferences/Key;", "value", "(Lcom/primex/preferences/Key;Ljava/lang/Object;)V", "asComposeState", "Landroidx/compose/runtime/State;", "T", "Lkotlinx/coroutines/flow/Flow;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SettingsViewModel extends androidx.lifecycle.ViewModel implements com.prime.toolz.settings.Settings {
    @org.jetbrains.annotations.NotNull
    private final com.primex.preferences.Preferences preferences = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.material3.SnackbarHostState channel = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State nightMode$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State colorSystemBars$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State hideStatusBar$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State dynamicColors$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State numberGroupSeparator$delegate = null;
    
    @javax.inject.Inject
    public SettingsViewModel(@org.jetbrains.annotations.NotNull
    com.primex.preferences.Preferences preferences, @org.jetbrains.annotations.NotNull
    androidx.compose.material3.SnackbarHostState channel) {
        super();
    }
    
    @java.lang.Deprecated
    private final <T extends java.lang.Object>androidx.compose.runtime.State<T> asComposeState(kotlinx.coroutines.flow.Flow<? extends T> $this$asComposeState) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.prime.toolz.settings.Preference<com.prime.toolz.core.NightMode> getNightMode() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.prime.toolz.settings.Preference<java.lang.Boolean> getColorSystemBars() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.prime.toolz.settings.Preference<java.lang.Boolean> getHideStatusBar() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.prime.toolz.settings.Preference<java.lang.Boolean> getDynamicColors() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.prime.toolz.settings.Preference<java.lang.Character> getNumberGroupSeparator() {
        return null;
    }
    
    @java.lang.Override
    public <S extends java.lang.Object, O extends java.lang.Object>void set(@org.jetbrains.annotations.NotNull
    com.primex.preferences.Key<S, O> key, O value) {
    }
}