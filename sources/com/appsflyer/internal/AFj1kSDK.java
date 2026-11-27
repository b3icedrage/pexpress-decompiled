package com.appsflyer.internal;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import defpackage.C6367rX0;
import defpackage.Z0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1kSDK {
    public static final int AFKeystoreWrapper(@NotNull String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        C6367rX0 c6367rX0C = new Regex("(\\d+).(\\d+).(\\d+).*").c(str);
        if (c6367rX0C == null) {
            return -1;
        }
        C6367rX0.b bVar = c6367rX0C.c;
        MatchGroup matchGroupC = bVar.c(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroupC == null || (str4 = matchGroupC.a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroupC2 = bVar.c(2);
        int iIntValue3 = (((matchGroupC2 == null || (str3 = matchGroupC2.a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + iIntValue2;
        MatchGroup matchGroupC3 = bVar.c(3);
        if (matchGroupC3 != null && (str2 = matchGroupC3.a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }

    public static final String registerClient(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strC = "";
        for (byte b : bArrDigest) {
            String str3 = String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            strC = Z0.c(strC, str3);
        }
        return strC;
    }
}
