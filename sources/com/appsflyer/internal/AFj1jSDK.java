package com.appsflyer.internal;

import defpackage.C4564j;
import defpackage.C5491nL;
import defpackage.Z0;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFj1jSDK;", "", "<init>", "()V", "", "p0", "AFKeystoreWrapper", "(Ljava/lang/String;)Ljava/lang/String;", "p1", "unregisterClient", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "AFLogger"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFj1jSDK {

    @NotNull
    public static final AFj1jSDK INSTANCE = new AFj1jSDK();

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[kotlin.text.a.values().length];
            try {
                kotlin.text.a.C0432a c0432a = kotlin.text.a.d;
                iArr[15] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kotlin.text.a.C0432a c0432a2 = kotlin.text.a.d;
                iArr[16] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kotlin.text.a.C0432a c0432a3 = kotlin.text.a.d;
                iArr[19] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kotlin.text.a.C0432a c0432a4 = kotlin.text.a.d;
                iArr[20] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kotlin.text.a.C0432a c0432a5 = kotlin.text.a.d;
                iArr[21] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kotlin.text.a.C0432a c0432a6 = kotlin.text.a.d;
                iArr[22] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                kotlin.text.a.C0432a c0432a7 = kotlin.text.a.d;
                iArr[23] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                kotlin.text.a.C0432a c0432a8 = kotlin.text.a.d;
                iArr[28] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                kotlin.text.a.C0432a c0432a9 = kotlin.text.a.d;
                iArr[29] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            d = iArr;
        }
    }

    private AFj1jSDK() {
    }

    public static String AFKeystoreWrapper(String p0, String p1) throws IOException {
        String strC = Z0.c(p0, p1);
        StringBuilder sb = new StringBuilder();
        int length = strC.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strC.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @NotNull
    public static String AFLogger(@NotNull String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < p0.length(); i++) {
            char cCharAt = p0.charAt(i);
            switch (AFa1vSDK.d[CharsKt.b(cCharAt).ordinal()]) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    sb.append(cCharAt);
                    break;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Locale locale = Locale.ROOT;
        return C4564j.g(locale, "", string, locale, "");
    }

    @NotNull
    public static String unregisterClient(@NotNull String p0, @NotNull String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return C5491nL.c("+", StringsKt.g0(AFKeystoreWrapper(p0, p1), '0'));
    }

    @NotNull
    public static String AFKeystoreWrapper(@NotNull String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < p0.length(); i++) {
            char cCharAt = p0.charAt(i);
            if (!CharsKt.c(cCharAt)) {
                int i2 = AFa1vSDK.d[CharsKt.b(cCharAt).ordinal()];
                if (i2 != 1 && i2 != 2) {
                    sb.append(cCharAt);
                }
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Locale locale = Locale.ROOT;
        return C4564j.g(locale, "", string, locale, "");
    }
}
