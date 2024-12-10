package com.prime.toolz.core.converter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J)\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/prime/toolz/core/converter/Converter;", "", "drawableRes", "", "getDrawableRes", "()I", "title", "Lcom/primex/core/Text;", "getTitle", "()Lcom/primex/core/Text;", "units", "", "Lcom/prime/toolz/core/converter/Unet;", "getUnits", "()[Lcom/prime/toolz/core/converter/Unet;", "uuid", "", "getUuid", "()Ljava/lang/String;", "convert", "Lcom/prime/toolz/core/math/UnifiedReal;", "from", "to", "value", "(Lcom/prime/toolz/core/converter/Unet;Lcom/prime/toolz/core/converter/Unet;Lcom/prime/toolz/core/math/UnifiedReal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface Converter {
    
    /**
     * The title of the Unit.
     */
    @org.jetbrains.annotations.NotNull
    public abstract com.primex.core.Text getTitle();
    
    /**
     * The resource icon associated with this converter.
     */
    public abstract int getDrawableRes();
    
    /**
     * The unique Id to identify this converter.
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getUuid();
    
    /**
     * The list of units supported by this converter.
     */
    @org.jetbrains.annotations.NotNull
    public abstract com.prime.toolz.core.converter.Unet[] getUnits();
    
    /**
     * The method to convert [value]from -> to
     */
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object convert(@org.jetbrains.annotations.NotNull
    com.prime.toolz.core.converter.Unet from, @org.jetbrains.annotations.NotNull
    com.prime.toolz.core.converter.Unet to, @org.jetbrains.annotations.NotNull
    com.prime.toolz.core.math.UnifiedReal value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.prime.toolz.core.math.UnifiedReal> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        /**
         * The method to convert [value]from -> to
         */
        @org.jetbrains.annotations.Nullable
        public static java.lang.Object convert(@org.jetbrains.annotations.NotNull
        com.prime.toolz.core.converter.Converter $this, @org.jetbrains.annotations.NotNull
        com.prime.toolz.core.converter.Unet from, @org.jetbrains.annotations.NotNull
        com.prime.toolz.core.converter.Unet to, @org.jetbrains.annotations.NotNull
        com.prime.toolz.core.math.UnifiedReal value, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super com.prime.toolz.core.math.UnifiedReal> $completion) {
            return null;
        }
    }
}