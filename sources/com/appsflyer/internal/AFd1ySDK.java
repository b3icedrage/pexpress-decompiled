package com.appsflyer.internal;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import defpackage.C1526Mj;
import defpackage.C6367rX0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1ySDK {
    /* JADX WARN: Code duplicated, block: B:43:0x00e9  */
    public static boolean registerClient(@NotNull String str, @NotNull String str2) {
        Pair pair;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iAFKeystoreWrapper = AFj1kSDK.AFKeystoreWrapper(str);
        int iAFKeystoreWrapper2 = AFj1kSDK.AFKeystoreWrapper(str2);
        Intrinsics.checkNotNullParameter(str2, "");
        C6367rX0 c6367rX0C = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").c(str2);
        Pair pair2 = null;
        if (c6367rX0C == null) {
            pair = null;
        } else {
            C6367rX0.b bVar = c6367rX0C.c;
            MatchGroup matchGroupC = bVar.c(1);
            Integer intOrNull = (matchGroupC == null || (str11 = matchGroupC.a) == null) ? null : StringsKt.toIntOrNull(str11);
            MatchGroup matchGroupC2 = bVar.c(2);
            Integer intOrNull2 = (matchGroupC2 == null || (str10 = matchGroupC2.a) == null) ? null : StringsKt.toIntOrNull(str10);
            MatchGroup matchGroupC3 = bVar.c(3);
            Integer intOrNull3 = (matchGroupC3 == null || (str9 = matchGroupC3.a) == null) ? null : StringsKt.toIntOrNull(str9);
            MatchGroup matchGroupC4 = bVar.c(4);
            Integer intOrNull4 = (matchGroupC4 == null || (str8 = matchGroupC4.a) == null) ? null : StringsKt.toIntOrNull(str8);
            MatchGroup matchGroupC5 = bVar.c(5);
            Integer intOrNull5 = (matchGroupC5 == null || (str7 = matchGroupC5.a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup matchGroupC6 = bVar.c(6);
            Integer intOrNull6 = (matchGroupC6 == null || (str6 = matchGroupC6.a) == null) ? null : StringsKt.toIntOrNull(str6);
            Object[] objArr = {intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6};
            Integer num = intOrNull6;
            Intrinsics.checkNotNullParameter(objArr, "");
            if (C1526Mj.m(objArr, null)) {
                pair = null;
            } else {
                Intrinsics.checkNotNull(intOrNull);
                int iIntValue = intOrNull.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull2);
                int iIntValue2 = (intOrNull2.intValue() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + iIntValue;
                Intrinsics.checkNotNull(intOrNull3);
                Integer numValueOf = Integer.valueOf(intOrNull3.intValue() + iIntValue2);
                Intrinsics.checkNotNull(intOrNull4);
                int iIntValue3 = intOrNull4.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull5);
                int iIntValue4 = (intOrNull5.intValue() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + iIntValue3;
                Intrinsics.checkNotNull(num);
                pair = new Pair(numValueOf, Integer.valueOf(num.intValue() + iIntValue4));
            }
        }
        Intrinsics.checkNotNullParameter(str2, "");
        C6367rX0 c6367rX0C2 = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").c(str2);
        if (c6367rX0C2 != null) {
            C6367rX0.b bVar2 = c6367rX0C2.c;
            MatchGroup matchGroupC7 = bVar2.c(1);
            Integer intOrNull7 = (matchGroupC7 == null || (str5 = matchGroupC7.a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup matchGroupC8 = bVar2.c(3);
            Integer intOrNull8 = (matchGroupC8 == null || (str4 = matchGroupC8.a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroupC9 = bVar2.c(4);
            Integer intOrNull9 = (matchGroupC9 == null || (str3 = matchGroupC9.a) == null) ? null : StringsKt.toIntOrNull(str3);
            if (intOrNull7 != null) {
                pair2 = new Pair(Integer.valueOf(intOrNull7.intValue() * 1000000), Integer.valueOf(((intOrNull7.intValue() + 1) * 1000000) - 1));
            } else if (intOrNull8 != null && intOrNull9 != null) {
                pair2 = new Pair(Integer.valueOf((intOrNull9.intValue() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + (intOrNull8.intValue() * 1000000)), Integer.valueOf((((intOrNull9.intValue() + 1) * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + (intOrNull8.intValue() * 1000000)) - 1));
            }
        }
        if (iAFKeystoreWrapper2 == -1 || pair != null) {
            if (pair2 != null) {
                if (((Number) pair2.d).intValue() > iAFKeystoreWrapper || iAFKeystoreWrapper > ((Number) pair2.e).intValue()) {
                    return false;
                }
            } else if (pair == null || ((Number) pair.d).intValue() > iAFKeystoreWrapper || iAFKeystoreWrapper > ((Number) pair.e).intValue()) {
                return false;
            }
        } else if (iAFKeystoreWrapper2 != iAFKeystoreWrapper) {
            return false;
        }
        return true;
    }
}
