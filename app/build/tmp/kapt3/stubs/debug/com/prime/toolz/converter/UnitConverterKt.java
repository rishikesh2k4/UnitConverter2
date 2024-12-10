package com.prime.toolz.converter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003\u001a\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003\u001a\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a0\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003\u001aU\u0010\u001b\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c2!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u001d2\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\"H\u0003\u001a\u001a\u0010#\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003\u001a\u001a\u0010$\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003\u001a\u0084\u0001\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020(2%\b\u0004\u0010)\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010(\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\n0\u001d2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001c0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001e\b\u0004\u0010,\u001a\u0018\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n0\u001d\u00a2\u0006\u0002\b.\u00a2\u0006\u0002\b/H\u0083\b\u001a2\u00100\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020(2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003\u001ai\u00101\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020(2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001c0\f2#\u0010)\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010(\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\n0\u001d2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u001a\u00103\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003\u001a\u001a\u00104\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003\u001a\u0010\u00105\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u008c\u0001\u00106\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\b2!\u00107\u001a\u001d\u0012\u0013\u0012\u001108\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u001d2\u0006\u00102\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020(2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001c0\f2#\u0010)\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010(\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\n0\u001d2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003\u001aV\u00109\u001a\u00020\n*\u00020:2\u0006\u0010\'\u001a\u00020(2%\b\u0004\u0010)\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010(\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\n0\u001d2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001c0\fH\u0083\b\u001a\u0015\u0010;\u001a\u00020\n*\u00020:2\u0006\u0010\u0011\u001a\u00020\u0012H\u0083\b\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00048CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006<"}, d2 = {"FIELD_MIN_HEIGHT", "Landroidx/compose/ui/unit/Dp;", "F", "NumberFormatTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getNumberFormatTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "TAG", "", "AboutEquals", "", "values", "", "Lcom/primex/core/Text;", "modifier", "Landroidx/compose/ui/Modifier;", "Actions", "state", "Lcom/prime/toolz/converter/UnitConverter;", "Compact", "Converter", "value", "Lcom/prime/toolz/core/converter/Converter;", "checked", "", "onTap", "Lkotlin/Function0;", "Converters", "", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "current", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "Expanded", "Medium", "MenuBox", "expanded", "selected", "Lcom/prime/toolz/core/converter/Unet;", "onItemClick", "item", "", "field", "Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "MenuItem", "ResultField", "visualTransformation", "SideBar", "TopBar", "UnitConverter", "ValueField", "onValueChange", "Landroidx/compose/ui/text/input/TextFieldValue;", "Menu", "Landroidx/compose/foundation/layout/ColumnScope;", "TextFields", "app_debug"})
@kotlin.Suppress(names = {"NOTHING_TO_INLINE"})
public final class UnitConverterKt {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "UnitConverter";
    private static final float FIELD_MIN_HEIGHT = 0.0F;
    
    @androidx.compose.runtime.Composable
    private static final androidx.compose.ui.text.input.VisualTransformation getNumberFormatTransformation() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    private static final void TopBar(com.prime.toolz.converter.UnitConverter state, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void SideBar(com.prime.toolz.converter.UnitConverter state, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void Converter(com.prime.toolz.core.converter.Converter value, boolean checked, kotlin.jvm.functions.Function0<kotlin.Unit> onTap, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.NonRestartableComposable
    private static final void Converters(java.util.List<? extends com.prime.toolz.core.converter.Converter> value, kotlin.jvm.functions.Function1<? super com.prime.toolz.core.converter.Converter, kotlin.Unit> onTap, com.prime.toolz.core.converter.Converter current, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues contentPadding) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.NonRestartableComposable
    private static final void MenuItem(com.prime.toolz.core.converter.Unet value, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> onItemClick, boolean checked) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void Menu(androidx.compose.foundation.layout.ColumnScope $this$Menu, com.prime.toolz.core.converter.Unet selected, kotlin.jvm.functions.Function1<? super com.prime.toolz.core.converter.Unet, kotlin.Unit> onItemClick, java.util.Map<java.lang.CharSequence, ? extends java.util.List<? extends com.prime.toolz.core.converter.Unet>> values) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    private static final void MenuBox(boolean expanded, com.prime.toolz.core.converter.Unet selected, kotlin.jvm.functions.Function1<? super com.prime.toolz.core.converter.Unet, kotlin.Unit> onItemClick, java.util.Map<java.lang.CharSequence, ? extends java.util.List<? extends com.prime.toolz.core.converter.Unet>> values, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.material3.ExposedDropdownMenuBoxScope, kotlin.Unit> field) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    private static final void ValueField(java.lang.String value, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange, androidx.compose.ui.text.input.VisualTransformation visualTransformation, com.prime.toolz.core.converter.Unet checked, java.util.Map<java.lang.CharSequence, ? extends java.util.List<? extends com.prime.toolz.core.converter.Unet>> values, kotlin.jvm.functions.Function1<? super com.prime.toolz.core.converter.Unet, kotlin.Unit> onItemClick, androidx.compose.ui.Modifier modifier) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    public static final void ResultField(@org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.input.VisualTransformation visualTransformation, @org.jetbrains.annotations.NotNull
    com.prime.toolz.core.converter.Unet checked, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.CharSequence, ? extends java.util.List<? extends com.prime.toolz.core.converter.Unet>> values, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.prime.toolz.core.converter.Unet, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void Actions(com.prime.toolz.converter.UnitConverter state, androidx.compose.ui.Modifier modifier) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    private static final void AboutEquals(java.util.Map<com.primex.core.Text, java.lang.String> values, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void TextFields(androidx.compose.foundation.layout.ColumnScope $this$TextFields, com.prime.toolz.converter.UnitConverter state) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Compact(@org.jetbrains.annotations.NotNull
    com.prime.toolz.converter.UnitConverter state, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void Expanded(com.prime.toolz.converter.UnitConverter state, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.NonRestartableComposable
    private static final void Medium(com.prime.toolz.converter.UnitConverter state, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.NonRestartableComposable
    public static final void UnitConverter(@org.jetbrains.annotations.NotNull
    com.prime.toolz.converter.UnitConverter state) {
    }
}