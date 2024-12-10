package com.prime.toolz.core.math;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004J\"\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u001b\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00132\u0006\u0010\u0014\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/prime/toolz/core/math/NumUtil;", "", "()V", "DECIMAL", "", "EXPONENT", "ZERO", "addThousandSeparators", "", "whole", "separator", "doubleToString", "x", "", "maxLen", "", "rounding", "removeFrontZeroes", "split", "", "number", "(Ljava/lang/String;)[Ljava/lang/String;", "stripTrailingZeroes", "fraction", "app_debug"})
public final class NumUtil {
    
    /**
     * The symbol used to represent exponent part of a number.
     */
    public static final char EXPONENT = 'E';
    
    /**
     * The symbol for the decimal point of a number.
     */
    public static final char DECIMAL = '.';
    
    /**
     * The symbol for the zero digit
     */
    public static final char ZERO = '0';
    @org.jetbrains.annotations.NotNull
    public static final com.prime.toolz.core.math.NumUtil INSTANCE = null;
    
    private NumUtil() {
        super();
    }
    
    /**
     * Removes Front zeros from the whole part of a number.
     *
     * @param whole The Whole Part of a number.
     * @return modified number.
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String removeFrontZeroes(@org.jetbrains.annotations.NotNull
    java.lang.String whole) {
        return null;
    }
    
    /**
     * Strips Trailing Zeros to from fraction part of a [String] representation of a number.
     *
     * @param fraction [String] representation of Number
     * @return [String] representation of modified number.
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String stripTrailingZeroes(@org.jetbrains.annotations.NotNull
    java.lang.String fraction) {
        return null;
    }
    
    /**
     * A helper function to split a number into 3 parts; whole, fraction and exponent.
     *
     * **Note**
     * if the component (say fraction) is missing; while the symbol i.e., [DECIMAL] is present
     * present empty is returned else *null* at its place in the resulting array.
     *
     * ***For E.g.***
     * If the given number is 12345.6789E12345 it will return a string array where
     * a[0] = 12345 (i.e,  Whole Part)
     * a[1] = .6789  (i.e., Fractional Part)
     * a[2] = 12345 (i.e., Scientific part)
     *
     * @param number: The number to split e.g., 123.45E789
     * @return [Array] of size 3 with whole, fraction and exponent at respective hole.
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] split(@org.jetbrains.annotations.NotNull
    java.lang.String number) {
        return null;
    }
    
    /**
     * Return a copy of the supplied string with [separator] added every three digits.
     * Inserting a digit separator every 3 digits appears to be
     * at least somewhat acceptable, though not necessarily preferred, everywhere.
     *
     * The grouping separator in the result is NOT localized.
     * @param whole: The number as whole in the format 123.456E789,
     * @param separator: The provided separator char like ,
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String addThousandSeparators(@org.jetbrains.annotations.NotNull
    java.lang.String whole, char separator) {
        return null;
    }
    
    /**
     * Renders a real number to a String (for user display).
     * @param maxLen the maximum total length of the resulting string
     * @param rounding the number of final digits to round
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Deprecated
    public final java.lang.String doubleToString(double x, int maxLen, int rounding) {
        return null;
    }
}