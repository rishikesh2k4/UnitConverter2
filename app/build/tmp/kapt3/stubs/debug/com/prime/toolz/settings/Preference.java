package com.prime.toolz.settings;

/**
 * Immutable data class representing a preference.
 *
 * @property value The value of the preference.
 * @property title The title text of the preference.
 * @property vector The optional vector image associated with the preference.
 * @property summary The optional summary text of the preference.
 * @param P The type of the preference value.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J@\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/prime/toolz/settings/Preference;", "P", "", "value", "title", "Lcom/primex/core/Text;", "vector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "summery", "(Ljava/lang/Object;Lcom/primex/core/Text;Landroidx/compose/ui/graphics/vector/ImageVector;Lcom/primex/core/Text;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getVector", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Lcom/primex/core/Text;Landroidx/compose/ui/graphics/vector/ImageVector;Lcom/primex/core/Text;)Lcom/prime/toolz/settings/Preference;", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
@androidx.compose.runtime.Immutable
public final class Preference<P extends java.lang.Object> {
    private final P value = null;
    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final com.primex.core.Text title = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.ui.graphics.vector.ImageVector vector = null;
    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final com.primex.core.Text summery = null;
    
    public Preference(P value, @org.jetbrains.annotations.NotNull
    com.primex.core.Text title, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.vector.ImageVector vector, @org.jetbrains.annotations.Nullable
    com.primex.core.Text summery) {
        super();
    }
    
    public final P getValue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.compose.ui.graphics.vector.ImageVector getVector() {
        return null;
    }
    
    public final P component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.primex.core.Text component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.compose.ui.graphics.vector.ImageVector component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.primex.core.Text component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.prime.toolz.settings.Preference<P> copy(P value, @org.jetbrains.annotations.NotNull
    com.primex.core.Text title, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.vector.ImageVector vector, @org.jetbrains.annotations.Nullable
    com.primex.core.Text summery) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}