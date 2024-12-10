package com.prime.toolz.converter;

/**
 * Interface representing a unit converter.
 *
 * @property converters The array of converters supported by the engine.
 * @property converter The currently selected converter.
 * @property fromUnit The current unit to convert from.
 * @property toUnit The current unit to convert into.
 * @property value The value to be converted.
 * @property result The result of the conversion.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 )2\u00020\u0001:\u0001)J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020#H&J\u0014\u0010%\u001a\u00020#*\u00020&2\u0006\u0010\'\u001a\u00020(H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\rX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u00020\rX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u0018\u0010\u001e\u001a\u00020\u0015X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010!\u00a8\u0006*"}, d2 = {"Lcom/prime/toolz/converter/UnitConverter;", "", "converter", "Lcom/prime/toolz/core/converter/Converter;", "getConverter", "()Lcom/prime/toolz/core/converter/Converter;", "setConverter", "(Lcom/prime/toolz/core/converter/Converter;)V", "converters", "", "getConverters", "()Ljava/util/List;", "fromUnit", "Lcom/prime/toolz/core/converter/Unet;", "getFromUnit", "()Lcom/prime/toolz/core/converter/Unet;", "setFromUnit", "(Lcom/prime/toolz/core/converter/Unet;)V", "more", "", "Lcom/primex/core/Text;", "", "getMore", "()Ljava/util/Map;", "result", "getResult", "()Ljava/lang/String;", "toUnit", "getToUnit", "setToUnit", "value", "getValue", "setValue", "(Ljava/lang/String;)V", "clear", "", "swap", "copy", "Landroid/content/res/Resources;", "clipboard", "Landroidx/compose/ui/platform/ClipboardManager;", "Companion", "app_debug"})
@androidx.compose.runtime.Stable
public abstract interface UnitConverter {
    @org.jetbrains.annotations.NotNull
    public static final com.prime.toolz.converter.UnitConverter.Companion Companion = null;
    
    /**
     * The all of converters supported by [engine]
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.prime.toolz.core.converter.Converter> getConverters();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.prime.toolz.core.converter.Converter getConverter();
    
    public abstract void setConverter(@org.jetbrains.annotations.NotNull
    com.prime.toolz.core.converter.Converter p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.prime.toolz.core.converter.Unet getFromUnit();
    
    public abstract void setFromUnit(@org.jetbrains.annotations.NotNull
    com.prime.toolz.core.converter.Unet p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.prime.toolz.core.converter.Unet getToUnit();
    
    public abstract void setToUnit(@org.jetbrains.annotations.NotNull
    com.prime.toolz.core.converter.Unet p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getValue();
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getResult();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Map<com.primex.core.Text, java.lang.String> getMore();
    
    /**
     * Swaps the fromUnit and toUnit.
     */
    public abstract void swap();
    
    /**
     * Clears the value.
     */
    public abstract void clear();
    
    /**
     * Copies the text.
     *
     * @return The copied text.
     */
    public abstract void copy(@org.jetbrains.annotations.NotNull
    android.content.res.Resources clipboard, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.platform.ClipboardManager p1);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/prime/toolz/converter/UnitConverter$Companion;", "", "()V", "route", "", "getRoute", "()Ljava/lang/String;", "direction", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        private static final java.lang.String route = "unit_converter";
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getRoute() {
            return null;
        }
        
        /**
         * Provides the direction for the unit converter route.
         *
         * @return The route for the unit converter.
         */
        @org.jetbrains.annotations.NotNull
        public final java.lang.String direction() {
            return null;
        }
    }
}