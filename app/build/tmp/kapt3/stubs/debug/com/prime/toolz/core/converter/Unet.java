package com.prime.toolz.core.converter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/prime/toolz/core/converter/Unet;", "", "code", "Lcom/primex/core/Text;", "getCode", "()Lcom/primex/core/Text;", "group", "getGroup", "icon", "", "getIcon", "()Ljava/lang/Integer;", "title", "getTitle", "uuid", "", "getUuid", "()Ljava/lang/String;", "toBase", "Lcom/prime/toolz/core/math/UnifiedReal;", "value", "(Lcom/prime/toolz/core/math/UnifiedReal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toUnit", "app_debug"})
public abstract interface Unet {
    
    /**
     * The unique Id of this unit in the converter.
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getUuid();
    
    /**
     * The title of the Unit.
     */
    @org.jetbrains.annotations.NotNull
    public abstract com.primex.core.Text getTitle();
    
    /**
     * The short name of the Unit
     */
    @org.jetbrains.annotations.NotNull
    public abstract com.primex.core.Text getCode();
    
    /**
     * The name resource of the group to which this unit belongs; e.g., SI, BTS etc.
     */
    @org.jetbrains.annotations.NotNull
    public abstract com.primex.core.Text getGroup();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Integer getIcon();
    
    /**
     * Consumes value in Unit and returns value in [base] unit
     * @param value the value in Unit
     */
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object toBase(@org.jetbrains.annotations.NotNull
    com.prime.toolz.core.math.UnifiedReal value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.prime.toolz.core.math.UnifiedReal> $completion);
    
    /**
     * Consumes value in base and returns value in [Unet]
     *
     * @param value: The value in base.
     */
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object toUnit(@org.jetbrains.annotations.NotNull
    com.prime.toolz.core.math.UnifiedReal value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.prime.toolz.core.math.UnifiedReal> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.Integer getIcon(@org.jetbrains.annotations.NotNull
        com.prime.toolz.core.converter.Unet $this) {
            return null;
        }
    }
}