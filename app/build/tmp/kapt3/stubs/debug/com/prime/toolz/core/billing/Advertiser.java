package com.prime.toolz.core.billing;

/**
 * A interface for implementing Advertisement in app.
 * This is useful for implementing Interstitial and Rewarded video ads.
 * since both are shown one at a time hence there will be no issue of sync.
 *
 * @author Zakir Ahmad Sheikh
 * @since 2021
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH&\u00a8\u0006\n"}, d2 = {"Lcom/prime/toolz/core/billing/Advertiser;", "", "show", "", "activity", "Landroid/app/Activity;", "force", "", "action", "Lkotlin/Function0;", "app_debug"})
public abstract interface Advertiser {
    
    /**
     * Show interstitial ad.
     * @param activity Current Android activity of calling app.
     * @param force a user tag to signify the importance of showing of ad.
     * @param action -> the code to trigger after completing of action.
     */
    public abstract void show(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, boolean force, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> action);
    
    /**
     * A interface for implementing Advertisement in app.
     * This is useful for implementing Interstitial and Rewarded video ads.
     * since both are shown one at a time hence there will be no issue of sync.
     *
     * @author Zakir Ahmad Sheikh
     * @since 2021
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}