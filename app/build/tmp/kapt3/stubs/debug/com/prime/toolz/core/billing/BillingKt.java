package com.prime.toolz.core.billing;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u0004\u0018\u00010\b*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0005H\u0086\u0002\u001a\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0016*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0005H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"RECONNECT_TIMER_MAX_TIME_MILLISECONDS", "", "RECONNECT_TIMER_START_MILLISECONDS", "SKU_DETAILS_REQUERY_TIME", "TAG", "", "purchased", "", "Lcom/android/billingclient/api/Purchase;", "getPurchased", "(Lcom/android/billingclient/api/Purchase;)Z", "BillingManager", "Lcom/prime/toolz/core/billing/BillingManager;", "context", "Landroid/content/Context;", "products", "", "subscriptions", "(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;)Lcom/prime/toolz/core/billing/BillingManager;", "get", "id", "observeAsState", "Landroidx/compose/runtime/State;", "app_debug"})
public final class BillingKt {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "BillingManager";
    private static final long RECONNECT_TIMER_START_MILLISECONDS = 1000L;
    private static final long RECONNECT_TIMER_MAX_TIME_MILLISECONDS = 900000L;
    private static final long SKU_DETAILS_REQUERY_TIME = 14400000L;
    
    /**
     * A one stop solution for monetization and Billing.
     * @param products The list of in-app product ids.
     * @param subscriptions The list of in-app subscription Ids.
     *
     * @author Zakir Ahmad Sheikh
     * @since 18-08-2022
     */
    @org.jetbrains.annotations.NotNull
    public static final com.prime.toolz.core.billing.BillingManager BillingManager(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String[] products, @org.jetbrains.annotations.Nullable
    java.lang.String[] subscriptions) {
        return null;
    }
    
    /**
     * Returns the purchase associated with this [id].
     */
    @org.jetbrains.annotations.Nullable
    public static final com.android.billingclient.api.Purchase get(@org.jetbrains.annotations.NotNull
    com.prime.toolz.core.billing.BillingManager $this$get, @org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    /**
     * Observe the purchase as [State] associated with the [id].
     *  ``@Composable
     * @NonRestartableComposable
     * fun BillingManager.observeAsState(id: String) =
     * purchases.map { it.find { it.products.contains(id) } }
     * .collectAsState(initial = this@BillingManager[id]) ``
     */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.NonRestartableComposable
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.State<com.android.billingclient.api.Purchase> observeAsState(@org.jetbrains.annotations.NotNull
    com.prime.toolz.core.billing.BillingManager $this$observeAsState, @org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    public static final boolean getPurchased(@org.jetbrains.annotations.Nullable
    com.android.billingclient.api.Purchase $this$purchased) {
        return false;
    }
}