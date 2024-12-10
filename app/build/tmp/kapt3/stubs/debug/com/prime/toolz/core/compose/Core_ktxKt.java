package com.prime.toolz.core.compose;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0004\u00a8\u0006\n"}, d2 = {"LocalNavController", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/navigation/NavHostController;", "getLocalNavController", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalWindowSizeClass", "Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "getLocalWindowSizeClass$annotations", "()V", "getLocalWindowSizeClass", "app_debug"})
public final class Core_ktxKt {
    
    /**
     * Used to provide access to the [NavHostController] through composition without needing to pass it down the tree.
     *
     * To use this composition local, you can call [LocalNavController.current] to get the [NavHostController].
     * If no [NavHostController] has been set, an error will be thrown.
     *
     * Example usage:
     *
     * ```
     * val navController = LocalNavController.current
     * navController.navigate("destination")
     * ```
     */
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.navigation.NavHostController> LocalNavController = null;
    
    /**
     * [CompositionLocal] containing the [WindowSizeClass].
     *
     * This [CompositionLocal] is used to access the current [WindowSizeClass] within a composition.
     * If no [WindowSizeClass] is found in the composition hierarchy, a default [WindowSizeClass]
     * will be calculated based on the provided size.
     *
     * Usage:
     *
     * ```
     * val windowSizeClass = LocalWindowSizeClass.current
     * // Use the windowSizeClass value within the composition
     * ```
     * @optIn ExperimentalMaterial3WindowSizeClassApi
     */
    @org.jetbrains.annotations.NotNull
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material3.windowsizeclass.WindowSizeClass> LocalWindowSizeClass = null;
    
    /**
     * Used to provide access to the [NavHostController] through composition without needing to pass it down the tree.
     *
     * To use this composition local, you can call [LocalNavController.current] to get the [NavHostController].
     * If no [NavHostController] has been set, an error will be thrown.
     *
     * Example usage:
     *
     * ```
     * val navController = LocalNavController.current
     * navController.navigate("destination")
     * ```
     */
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.navigation.NavHostController> getLocalNavController() {
        return null;
    }
    
    /**
     * [CompositionLocal] containing the [WindowSizeClass].
     *
     * This [CompositionLocal] is used to access the current [WindowSizeClass] within a composition.
     * If no [WindowSizeClass] is found in the composition hierarchy, a default [WindowSizeClass]
     * will be calculated based on the provided size.
     *
     * Usage:
     *
     * ```
     * val windowSizeClass = LocalWindowSizeClass.current
     * // Use the windowSizeClass value within the composition
     * ```
     * @optIn ExperimentalMaterial3WindowSizeClassApi
     */
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material3.windowsizeclass.WindowSizeClass> getLocalWindowSizeClass() {
        return null;
    }
    
    /**
     * [CompositionLocal] containing the [WindowSizeClass].
     *
     * This [CompositionLocal] is used to access the current [WindowSizeClass] within a composition.
     * If no [WindowSizeClass] is found in the composition hierarchy, a default [WindowSizeClass]
     * will be calculated based on the provided size.
     *
     * Usage:
     *
     * ```
     * val windowSizeClass = LocalWindowSizeClass.current
     * // Use the windowSizeClass value within the composition
     * ```
     * @optIn ExperimentalMaterial3WindowSizeClassApi
     */
    @kotlin.OptIn(markerClass = {androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi.class})
    @java.lang.Deprecated
    public static void getLocalWindowSizeClass$annotations() {
    }
}