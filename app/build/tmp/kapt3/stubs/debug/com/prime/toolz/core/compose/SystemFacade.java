package com.prime.toolz.core.compose;

/**
 * An interface defining the methods and properties needed for common app functionality,
 * such as in-app updates, showing ads, and launching the app store.
 *
 * This interface is intended to be implemented by a class that is scoped to the entire app,
 * and is accessible from all parts of the app hierarchy.
 *
 * @see DefaultProvider
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000bH&J\u0012\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H&J0\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00150\u0014\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u00150\u0018H\'J.\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0014\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u00150\u0019H\'J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00142\u0006\u0010\u001b\u001a\u00020\u000eH\'J$\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001fH&J&\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\"\u001a\u00020#H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006$"}, d2 = {"Lcom/prime/toolz/core/compose/SystemFacade;", "", "channel", "Landroidx/compose/material3/SnackbarHostState;", "getChannel", "()Landroidx/compose/material3/SnackbarHostState;", "inAppUpdateProgress", "", "getInAppUpdateProgress", "()F", "launchAppStore", "", "launchBillingFlow", "id", "", "launchReviewFlow", "launchUpdateFlow", "report", "", "observeAsState", "Landroidx/compose/runtime/State;", "O", "S", "key", "Lcom/primex/preferences/Key$Key1;", "Lcom/primex/preferences/Key$Key2;", "Lcom/android/billingclient/api/Purchase;", "product", "showAd", "force", "action", "Lkotlin/Function0;", "snack", "title", "duration", "Landroidx/compose/material3/SnackbarDuration;", "app_debug"})
@androidx.compose.runtime.Stable
public abstract interface SystemFacade {
    
    /**
     * A simple property that represents the progress of the in-app update.
     *
     * The progress is represented as a [State] object, which allows you to observe changes to the
     * progress value.
     *
     * The progress value is a float between 0.0 and 1.0, indicating the percentage of the update
     * that has been completed. The Float.NaN represents a default value when no update is going on.
     */
    public abstract float getInAppUpdateProgress();
    
    /**
     * A simple channel for sending messages
     */
    @org.jetbrains.annotations.NotNull
    public abstract androidx.compose.material3.SnackbarHostState getChannel();
    
    /**
     * A utility extension function for showing interstitial ads.
     * * Note: The ad will not be shown if the app is adFree Version.
     *
     * @param force If `true`, the ad will be shown regardless of the AdFree status.
     * @param action A callback to be executed after the ad is shown.
     */
    public abstract void showAd(boolean force, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> action);
    
    /**
     * This uses the provider to submit message to [ToastHostState]
     *
     * @see ToastHostState.show
     */
    public abstract void snack(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String action, @org.jetbrains.annotations.NotNull
    androidx.compose.material3.SnackbarDuration duration);
    
    /**
     * A utility method to launch the in-app update flow, with an option to report low-priority
     * issues to the user via a Toast.
     *
     * @param report If `true`, low-priority issues will be reported to the user using the
     *              ToastHostState channel.
     */
    public abstract void launchUpdateFlow(boolean report);
    
    /**
     * This is a convenient method for launching an in-app review process, with some built-in
     * conditions and guardrails.
     * Specifically, this method will only launch the review dialog if certain criteria are met,
     * as follows:
     *
     * - The app has been launched at least [MIN_LAUNCH_COUNT] times.
     * - At least [MAX_DAYS_BEFORE_FIRST_REVIEW] days have passed since the first launch.
     * - If a review has already been prompted, at least [MAX_DAYS_AFTER_FIRST_REVIEW] days have
     * passed since the last review prompt.
     *
     * These criteria are designed to ensure that the review prompt is only shown at appropriate
     * intervals, and that users are not repeatedly prompted to leave a review.
     *
     * Note that this method should not be used to prompt for a review after every cold boot or launch of the app.
     */
    public abstract void launchReviewFlow();
    
    /**
     * Launches the Google Play Store app for this app's package.
     *
     * This function creates an intent to open the Google Play Store app for this app's package.
     * If the Google Play Store app is not installed, the intent will open the Play Store website instead.
     *
     * Note: This function requires the `android.permission.INTERNET` permission to be declared in your app's manifest file.
     */
    public abstract void launchAppStore();
    
    /**
     * @see Preferences.observeAsState
     */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.NonRestartableComposable
    @org.jetbrains.annotations.NotNull
    public abstract <S extends java.lang.Object, O extends java.lang.Object>androidx.compose.runtime.State<O> observeAsState(@org.jetbrains.annotations.NotNull
    com.primex.preferences.Key.Key1<S, O> key);
    
    /**
     * @see Preferences.observeAsState
     */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.NonRestartableComposable
    @org.jetbrains.annotations.NotNull
    public abstract <S extends java.lang.Object, O extends java.lang.Object>androidx.compose.runtime.State<O> observeAsState(@org.jetbrains.annotations.NotNull
    com.primex.preferences.Key.Key2<S, O> key);
    
    /**
     * @see BillingManager.observeAsState
     */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.NonRestartableComposable
    @org.jetbrains.annotations.NotNull
    public abstract androidx.compose.runtime.State<com.android.billingclient.api.Purchase> observeAsState(@org.jetbrains.annotations.NotNull
    java.lang.String product);
    
    /**
     * @see BillingManager.launchBillingFlow
     */
    public abstract void launchBillingFlow(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    /**
     * An interface defining the methods and properties needed for common app functionality,
     * such as in-app updates, showing ads, and launching the app store.
     *
     * This interface is intended to be implemented by a class that is scoped to the entire app,
     * and is accessible from all parts of the app hierarchy.
     *
     * @see DefaultProvider
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}