package com.prime.toolz.core;

/**
 * Default alpha levels used by Material components.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/prime/toolz/core/ContentAlpha;", "", "()V", "Divider", "", "OutlinedBorderOpacity", "disabled", "getDisabled", "()F", "high", "getHigh", "medium", "getMedium", "contentAlpha", "highContrastAlpha", "lowContrastAlpha", "HighContrastContentAlpha", "LowContrastContentAlpha", "app_debug"})
public final class ContentAlpha {
    
    /**
     * The default color opacity used for an [OutlinedButton]'s border color
     */
    public static final float OutlinedBorderOpacity = 0.12F;
    
    /**
     * The default alpha value of a divider is 0.12f.
     */
    public static final float Divider = 0.12F;
    @org.jetbrains.annotations.NotNull
    public static final com.prime.toolz.core.ContentAlpha INSTANCE = null;
    
    private ContentAlpha() {
        super();
    }
    
    /**
     * This default implementation uses separate alpha levels depending on the luminance of the
     * incoming color, and whether the theme is light or dark. This is to ensure correct contrast
     * and accessibility on all surfaces.
     *
     * See [HighContrastContentAlpha] and [LowContrastContentAlpha] for what the levels are
     * used for, and under what circumstances.
     */
    @androidx.compose.runtime.Composable
    private final float contentAlpha(float highContrastAlpha, float lowContrastAlpha) {
        return 0.0F;
    }
    
    @androidx.compose.runtime.Composable
    public final float getDisabled() {
        return 0.0F;
    }
    
    @androidx.compose.runtime.Composable
    public final float getHigh() {
        return 0.0F;
    }
    
    @androidx.compose.runtime.Composable
    public final float getMedium() {
        return 0.0F;
    }
    
    /**
     * Alpha levels for high luminance content in light theme, or low luminance content in dark theme.
     *
     * This content will typically be placed on colored surfaces, so it is important that the
     * contrast here is higher to meet accessibility standards, and increase legibility.
     *
     * These levels are typically used for text / iconography in primary colored tabs /
     * bottom navigation / etc.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/prime/toolz/core/ContentAlpha$HighContrastContentAlpha;", "", "()V", "disabled", "", "high", "medium", "app_debug"})
    static final class HighContrastContentAlpha {
        public static final float high = 1.0F;
        public static final float medium = 0.74F;
        public static final float disabled = 0.38F;
        @org.jetbrains.annotations.NotNull
        public static final com.prime.toolz.core.ContentAlpha.HighContrastContentAlpha INSTANCE = null;
        
        private HighContrastContentAlpha() {
            super();
        }
    }
    
    /**
     * Alpha levels for low luminance content in light theme, or high luminance content in dark theme.
     *
     * This content will typically be placed on grayscale surfaces, so the contrast here can be lower
     * without sacrificing accessibility and legibility.
     *
     * These levels are typically used for body text on the main surface (white in light theme, grey
     * in dark theme) and text / iconography in surface colored tabs / bottom navigation / etc.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/prime/toolz/core/ContentAlpha$LowContrastContentAlpha;", "", "()V", "disabled", "", "high", "medium", "app_debug"})
    static final class LowContrastContentAlpha {
        public static final float high = 0.87F;
        public static final float medium = 0.6F;
        public static final float disabled = 0.38F;
        @org.jetbrains.annotations.NotNull
        public static final com.prime.toolz.core.ContentAlpha.LowContrastContentAlpha INSTANCE = null;
        
        private LowContrastContentAlpha() {
            super();
        }
    }
}