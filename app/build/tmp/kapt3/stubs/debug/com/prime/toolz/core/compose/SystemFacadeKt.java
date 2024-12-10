package com.prime.toolz.core.compose;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a1\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u0006\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00070\nH\u0087\b\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00070\u000bH\u0087\b\u001a\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0010"}, d2 = {"LocalSystemFacade", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/prime/toolz/core/compose/SystemFacade;", "getLocalSystemFacade", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "preference", "Landroidx/compose/runtime/State;", "O", "S", "key", "Lcom/primex/preferences/Key$Key1;", "Lcom/primex/preferences/Key$Key2;", "purchase", "Lcom/android/billingclient/api/Purchase;", "id", "", "app_debug"})
public final class SystemFacadeKt {
    
    /**
     * A [staticCompositionLocalOf] variable that provides access to the [SystemFacade] interface.
     *
     * The [SystemFacade] interface defines common methods that can be implemented by an activity that
     * uses a single view with child views.
     * This local composition allows child views to access the implementation of the [SystemFacade]
     * interface provided by their parent activity.
     *
     * If the [SystemFacade] interface is not defined, an error message will be thrown.
     */
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.prime.toolz.core.compose.SystemFacade> LocalSystemFacade = null;
    
    /**
     * A [staticCompositionLocalOf] variable that provides access to the [SystemFacade] interface.
     *
     * The [SystemFacade] interface defines common methods that can be implemented by an activity that
     * uses a single view with child views.
     * This local composition allows child views to access the implementation of the [SystemFacade]
     * interface provided by their parent activity.
     *
     * If the [SystemFacade] interface is not defined, an error message will be thrown.
     */
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.prime.toolz.core.compose.SystemFacade> getLocalSystemFacade() {
        return null;
    }
    
    /**
     * A composable function that uses the [LocalSystemFacade] to fetch [Preference] as state.
     * @param key A key to identify the preference value.
     * @return A [State] object that represents the current value of the preference identified by the provided key.
     * The value can be null if no preference value has been set for the given key.
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    public static final <S extends java.lang.Object, O extends java.lang.Object>androidx.compose.runtime.State<O> preference(@org.jetbrains.annotations.NotNull
    com.primex.preferences.Key.Key1<S, O> key) {
        return null;
    }
    
    /**
     * @see [preference]
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    public static final <S extends java.lang.Object, O extends java.lang.Object>androidx.compose.runtime.State<O> preference(@org.jetbrains.annotations.NotNull
    com.primex.preferences.Key.Key2<S, O> key) {
        return null;
    }
    
    /**
     * A composable function that uses the [LocalSystemFacade] to fetch the purchase state of a product.
     * @param id The product ID to identify the purchase state.
     * @return A [State] object that represents the current purchase state of the provided product ID.
     * The value can be null if there is no purchase associated with the given product ID.
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.State<com.android.billingclient.api.Purchase> purchase(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
}