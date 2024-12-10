package com.prime.toolz.settings;

/**
 * Interface representing the settings.
 *
 * @property nightMode The state of the night mode preference.
 * @property colorSystemBars The state of the color system bars preference.
 * @property hideStatusBar The state of the hide status bar preference.
 * @property dynamicColors The state of the dynamic colors preference.
 * @property numberGroupSeparator The state of the number group separator preference.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J5\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u00162\u0006\u0010\u0017\u001a\u0002H\u0014H&\u00a2\u0006\u0002\u0010\u0018R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006\u00a8\u0006\u001a"}, d2 = {"Lcom/prime/toolz/settings/Settings;", "", "colorSystemBars", "Lcom/prime/toolz/settings/Preference;", "", "getColorSystemBars", "()Lcom/prime/toolz/settings/Preference;", "dynamicColors", "getDynamicColors", "hideStatusBar", "getHideStatusBar", "nightMode", "Lcom/prime/toolz/core/NightMode;", "getNightMode", "numberGroupSeparator", "", "getNumberGroupSeparator", "set", "", "S", "O", "key", "Lcom/primex/preferences/Key;", "value", "(Lcom/primex/preferences/Key;Ljava/lang/Object;)V", "Companion", "app_debug"})
@androidx.compose.runtime.Stable
public abstract interface Settings {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String route = "route_settings";
    @org.jetbrains.annotations.NotNull
    public static final com.prime.toolz.settings.Settings.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public abstract com.prime.toolz.settings.Preference<com.prime.toolz.core.NightMode> getNightMode();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.prime.toolz.settings.Preference<java.lang.Boolean> getColorSystemBars();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.prime.toolz.settings.Preference<java.lang.Boolean> getHideStatusBar();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.prime.toolz.settings.Preference<java.lang.Boolean> getDynamicColors();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.prime.toolz.settings.Preference<java.lang.Character> getNumberGroupSeparator();
    
    /**
     * Sets the value for the specified key.
     *
     * @param key the key for the setting
     * @param value the value to be set
     * @param S the type of setting
     * @param O the type of value
     */
    public abstract <S extends java.lang.Object, O extends java.lang.Object>void set(@org.jetbrains.annotations.NotNull
    com.primex.preferences.Key<S, O> key, O value);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u000bR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/prime/toolz/settings/Settings$Companion;", "", "()V", "KEY_COLOR_STATUS_BAR", "Lcom/primex/preferences/Key$Key2;", "", "getKEY_COLOR_STATUS_BAR", "()Lcom/primex/preferences/Key$Key2;", "KEY_DYNAMIC_COLORS", "getKEY_DYNAMIC_COLORS", "KEY_GROUP_SEPARATOR", "", "", "getKEY_GROUP_SEPARATOR", "KEY_HIDE_STATUS_BAR", "getKEY_HIDE_STATUS_BAR", "KEY_NIGHT_MODE", "Lcom/prime/toolz/core/NightMode;", "getKEY_NIGHT_MODE", "LatoFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "getLatoFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "route", "direction", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String route = "route_settings";
        
        /**
         * Retrieves/Sets The [NightMode] Strategy
         */
        @org.jetbrains.annotations.NotNull
        private static final com.primex.preferences.Key.Key2<java.lang.String, com.prime.toolz.core.NightMode> KEY_NIGHT_MODE = null;
        @org.jetbrains.annotations.NotNull
        private static final com.primex.preferences.Key.Key2<java.lang.Boolean, java.lang.Boolean> KEY_COLOR_STATUS_BAR = null;
        @org.jetbrains.annotations.NotNull
        private static final com.primex.preferences.Key.Key2<java.lang.Boolean, java.lang.Boolean> KEY_HIDE_STATUS_BAR = null;
        @org.jetbrains.annotations.NotNull
        private static final com.primex.preferences.Key.Key2<java.lang.Boolean, java.lang.Boolean> KEY_DYNAMIC_COLORS = null;
        @org.jetbrains.annotations.NotNull
        private static final com.primex.preferences.Key.Key2<java.lang.String, java.lang.Character> KEY_GROUP_SEPARATOR = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.compose.ui.text.font.FontFamily LatoFontFamily = null;
        
        private Companion() {
            super();
        }
        
        /**
         * Provides the direction for the settings route.
         *
         * @return the route for settings
         */
        @org.jetbrains.annotations.NotNull
        public final java.lang.String direction() {
            return null;
        }
        
        /**
         * Retrieves/Sets The [NightMode] Strategy
         */
        @org.jetbrains.annotations.NotNull
        public final com.primex.preferences.Key.Key2<java.lang.String, com.prime.toolz.core.NightMode> getKEY_NIGHT_MODE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.primex.preferences.Key.Key2<java.lang.Boolean, java.lang.Boolean> getKEY_COLOR_STATUS_BAR() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.primex.preferences.Key.Key2<java.lang.Boolean, java.lang.Boolean> getKEY_HIDE_STATUS_BAR() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.primex.preferences.Key.Key2<java.lang.Boolean, java.lang.Boolean> getKEY_DYNAMIC_COLORS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.primex.preferences.Key.Key2<java.lang.String, java.lang.Character> getKEY_GROUP_SEPARATOR() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.ui.text.font.FontFamily getLatoFontFamily() {
            return null;
        }
    }
}