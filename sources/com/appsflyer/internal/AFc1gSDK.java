package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.C5491nL;
import defpackage.C7121v6;
import defpackage.InterfaceC3770fO0;
import defpackage.XO0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1gSDK implements AFc1kSDK {

    @NotNull
    private final AFc1dSDK<SharedPreferences> d;

    @NotNull
    private final InterfaceC3770fO0 registerClient;

    public AFc1gSDK(@NotNull AFc1dSDK<SharedPreferences> aFc1dSDK) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.d = aFc1dSDK;
        this.registerClient = XO0.b(new C7121v6(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences q_(AFc1gSDK aFc1gSDK) {
        return aFc1gSDK.d.AFKeystoreWrapper.invoke();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final boolean AFKeystoreWrapper(@Nullable String str) {
        try {
            return ((SharedPreferences) this.registerClient.getValue()).getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, C5491nL.c("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void AFLogger(@Nullable String str, long j) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void d(@Nullable String str, @Nullable String str2) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    @NotNull
    public final SharedPreferences p_() {
        return (SharedPreferences) this.registerClient.getValue();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void registerClient(@Nullable String str, boolean z) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final long unregisterClient(@Nullable String str, long j) {
        try {
            return ((SharedPreferences) this.registerClient.getValue()).getLong(str, j);
        } catch (ClassCastException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, C5491nL.c("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final int AFLogger(@Nullable String str, int i) {
        try {
            return ((SharedPreferences) this.registerClient.getValue()).getInt(str, i);
        } catch (ClassCastException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, C5491nL.c("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    @Nullable
    public final String d(@Nullable String str) {
        try {
            return ((SharedPreferences) this.registerClient.getValue()).getString(str, null);
        } catch (ClassCastException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, C5491nL.c("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final boolean registerClient(@Nullable String str) {
        return ((SharedPreferences) this.registerClient.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void AFLogger(@Nullable String str) {
        ((SharedPreferences) this.registerClient.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void d(@Nullable String str, int i) {
        ((SharedPreferences) this.registerClient.getValue()).edit().putInt(str, i).apply();
    }
}
