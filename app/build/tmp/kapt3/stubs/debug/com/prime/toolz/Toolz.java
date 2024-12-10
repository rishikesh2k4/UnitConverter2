package com.prime.toolz;

@dagger.hilt.android.HiltAndroidApp
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/prime/toolz/Toolz;", "Landroid/app/Application;", "()V", "Companion", "app_debug"})
public final class Toolz extends android.app.Application {
    
    /**
     * The counter counts the number of times this app was launched.
     */
    @org.jetbrains.annotations.NotNull
    private static final com.primex.preferences.Key.Key1<java.lang.Integer, java.lang.Integer> KEY_LAUNCH_COUNTER = null;
    
    /**
     * The link to PlayStore Market.
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GOOGLE_STORE = "market://details?id=com.prime.toolz2.debug";
    
    /**
     * If PlayStore is not available in Users Phone. This will be used to redirect to the
     * WebPage of the app.
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FALLBACK_GOOGLE_STORE = "http://play.google.com/store/apps/details?id=com.prime.toolz2.debug";
    
    /**
     * Package name for the Google Play Store. Value can be verified here:
     * https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil.html#GOOGLE_PLAY_STORE_PACKAGE
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PKG_GOOGLE_PLAY_STORE = "com.android.vending";
    @org.jetbrains.annotations.NotNull
    public static final com.prime.toolz.Toolz.Companion Companion = null;
    
    public Toolz() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/prime/toolz/Toolz$Companion;", "", "()V", "FALLBACK_GOOGLE_STORE", "", "GOOGLE_STORE", "KEY_LAUNCH_COUNTER", "Lcom/primex/preferences/Key$Key1;", "", "getKEY_LAUNCH_COUNTER", "()Lcom/primex/preferences/Key$Key1;", "PKG_GOOGLE_PLAY_STORE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * The counter counts the number of times this app was launched.
         */
        @org.jetbrains.annotations.NotNull
        public final com.primex.preferences.Key.Key1<java.lang.Integer, java.lang.Integer> getKEY_LAUNCH_COUNTER() {
            return null;
        }
    }
}