package com.prime.toolz.core.billing;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001\u001a$\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"DEFAULT_DELAY", "", "DEFAULT_FORCE_DELAY", "DEFAULT_INITIAL_DELAY", "iBannerListener", "Lcom/unity3d/services/banners/BannerView$IListener;", "Advertiser", "Lcom/prime/toolz/core/billing/Advertiser;", "context", "Landroid/content/Context;", "iDelay", "delay", "forceDelay", "Banner", "", "modifier", "Landroidx/compose/ui/Modifier;", "size", "Lcom/unity3d/services/banners/UnityBannerSize;", "placementID", "", "app_debug"})
public final class AdvertiserKt {
    private static final long DEFAULT_DELAY = 0L;
    private static final long DEFAULT_INITIAL_DELAY = 0L;
    private static final long DEFAULT_FORCE_DELAY = 0L;
    @org.jetbrains.annotations.NotNull
    private static final com.unity3d.services.banners.BannerView.IListener iBannerListener = null;
    
    /**
     * **An Utility [Advertiser] class required to show advertisements in app.**
     * @param iDelay : The initial delay before an ad is showed to user.
     * @param delay: The delay between two intestinal ads.
     * @param forceDelay: minimum delay between interstitial ads if forced.
     *
     * @author Zakir Ahmad Sheikh
     * @since 5-01-2021
     */
    @org.jetbrains.annotations.NotNull
    public static final com.prime.toolz.core.billing.Advertiser Advertiser(@org.jetbrains.annotations.NotNull
    android.content.Context context, long iDelay, long delay, long forceDelay) {
        return null;
    }
    
    /**
     * By default, banner ads display anchored on the bottom-center of the screen, supporting 320 x 50
     * or 728 x 90 pixel resolution. To specify the banner anchor, use the Banner.SetPosition API. For example:
     */
    @androidx.compose.runtime.Composable
    public static final void Banner(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    com.unity3d.services.banners.UnityBannerSize size, @org.jetbrains.annotations.NotNull
    java.lang.String placementID) {
    }
}