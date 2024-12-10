package com.prime.toolz.impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010?\u001a\u00020/H\u0016J\b\u0010@\u001a\u00020/H\u0016J\u0014\u0010A\u001a\u00020/*\u00020B2\u0006\u0010C\u001a\u00020DH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0017X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 RC\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000f0\"2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000f0\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R/\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.\u0012\u0006\u0012\u0004\u0018\u0001000,X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u00101R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u00102\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b7\u0010*\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00108\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010 R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020-0>X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006E"}, d2 = {"Lcom/prime/toolz/impl/UnitConverterViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/prime/toolz/converter/UnitConverter;", "preferences", "Lcom/primex/preferences/Preferences;", "channel", "Landroidx/compose/material3/SnackbarHostState;", "(Lcom/primex/preferences/Preferences;Landroidx/compose/material3/SnackbarHostState;)V", "_converter", "Landroidx/compose/runtime/MutableState;", "Lcom/prime/toolz/core/converter/Converter;", "_fromUnit", "Lcom/prime/toolz/core/converter/Unet;", "_toUnit", "_value", "", "value", "converter", "getConverter", "()Lcom/prime/toolz/core/converter/Converter;", "setConverter", "(Lcom/prime/toolz/core/converter/Converter;)V", "converters", "", "getConverters", "()Ljava/util/List;", "formatter", "Ljava/text/DecimalFormat;", "fromUnit", "getFromUnit", "()Lcom/prime/toolz/core/converter/Unet;", "setFromUnit", "(Lcom/prime/toolz/core/converter/Unet;)V", "<set-?>", "", "Lcom/primex/core/Text;", "more", "getMore", "()Ljava/util/Map;", "setMore", "(Ljava/util/Map;)V", "more$delegate", "Landroidx/compose/runtime/MutableState;", "onUpdate", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/jvm/functions/Function2;", "result", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "result$delegate", "toUnit", "getToUnit", "setToUnit", "getValue", "setValue", "version", "Lkotlinx/coroutines/flow/MutableStateFlow;", "clear", "swap", "copy", "Landroid/content/res/Resources;", "clipboard", "Landroidx/compose/ui/platform/ClipboardManager;", "app_debug"})
@kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class UnitConverterViewModel extends androidx.lifecycle.ViewModel implements com.prime.toolz.converter.UnitConverter {
    @org.jetbrains.annotations.NotNull
    private final com.primex.preferences.Preferences preferences = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.material3.SnackbarHostState channel = null;
    
    /**
     * The version of this [ViewModel].
     * Update to this triggers calculation.
     */
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> version = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.prime.toolz.core.converter.Converter> converters = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.prime.toolz.core.converter.Converter> _converter = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.prime.toolz.core.converter.Unet> _fromUnit = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.prime.toolz.core.converter.Unet> _toUnit = null;
    
    /**
     * The value to  be converted.
     * The Max length = [MAX_ALLOWED_CHARS]
     */
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> _value = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState more$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState result$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final java.text.DecimalFormat formatter = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onUpdate = null;
    
    @javax.inject.Inject
    public UnitConverterViewModel(@org.jetbrains.annotations.NotNull
    com.primex.preferences.Preferences preferences, @org.jetbrains.annotations.NotNull
    androidx.compose.material3.SnackbarHostState channel) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.prime.toolz.core.converter.Converter> getConverters() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.Map<com.primex.core.Text, java.lang.String> getMore() {
        return null;
    }
    
    public void setMore(@org.jetbrains.annotations.NotNull
    java.util.Map<com.primex.core.Text, java.lang.String> p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.prime.toolz.core.converter.Converter getConverter() {
        return null;
    }
    
    @java.lang.Override
    public void setConverter(@org.jetbrains.annotations.NotNull
    com.prime.toolz.core.converter.Converter value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.prime.toolz.core.converter.Unet getFromUnit() {
        return null;
    }
    
    @java.lang.Override
    public void setFromUnit(@org.jetbrains.annotations.NotNull
    com.prime.toolz.core.converter.Unet value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.prime.toolz.core.converter.Unet getToUnit() {
        return null;
    }
    
    @java.lang.Override
    public void setToUnit(@org.jetbrains.annotations.NotNull
    com.prime.toolz.core.converter.Unet value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getValue() {
        return null;
    }
    
    @java.lang.Override
    public void setValue(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getResult() {
        return null;
    }
    
    public void setResult(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    public void swap() {
    }
    
    @java.lang.Override
    public void clear() {
    }
    
    @java.lang.Override
    public void copy(@org.jetbrains.annotations.NotNull
    android.content.res.Resources $this$copy, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.platform.ClipboardManager clipboard) {
    }
}