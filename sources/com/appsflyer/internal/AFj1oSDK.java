package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import defpackage.C1717Ot1;
import defpackage.C1795Pt1;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1oSDK implements AFj1tSDK {
    @Override // com.appsflyer.internal.AFj1tSDK
    @NotNull
    public final String registerClient() {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.c(obj, "");
            objA = (String) obj;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        return (String) (objA instanceof C1717Ot1.b ? "" : objA);
    }
}
