package com.prime.toolz.core.billing;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0013\"\u00020\u0005H&\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0016H&R$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/prime/toolz/core/billing/BillingManager;", "", "details", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "Lcom/android/billingclient/api/ProductDetails;", "getDetails", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "purchases", "", "Lcom/android/billingclient/api/Purchase;", "getPurchases", "launchBillingFlow", "", "activity", "Landroid/app/Activity;", "product", "uSKUS", "", "(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;)Z", "refresh", "", "release", "app_debug"})
public abstract interface BillingManager {
    
    /**
     * The list of items that the user have purchased.
     */
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.android.billingclient.api.Purchase>> getPurchases();
    
    /**
     * The [ProductDetails] mapped with their product Ids.
     */
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, com.android.billingclient.api.ProductDetails>> getDetails();
    
    /**
     * Launch the billing flow. This will launch an external Activity for a result, so it requires
     * an Activity reference. For subscriptions, it supports upgrading from one SKU type to another
     * by passing in SKUs to be upgraded.
     *
     * @param activity active activity to launch our billing flow from
     * @param sku SKU (Product ID) to be purchased
     * @param uSKUS SKUs that the subscription can be upgraded from
     * @return true if launch is successful
     */
    public abstract boolean launchBillingFlow(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String product, @org.jetbrains.annotations.NotNull
    java.lang.String... uSKUS);
    
    /**
     * Needs to be called by the parent to run and refresh the code.
     */
    public abstract void refresh();
    
    /**
     * Releases resources associated with this object.
     *
     * You must call this method once the instance is no longer required.
     */
    public abstract void release();
}