package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import defpackage.C6585sa;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1tSDK implements AFb1aSDK {

    @NotNull
    private final AFc1eSDK AFLogger;

    @NotNull
    private final AFf1fSDK d;

    @NotNull
    private final AFd1zSDK unregisterClient;

    public AFc1tSDK(@NotNull AFc1eSDK aFc1eSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFf1fSDK aFf1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        this.AFLogger = aFc1eSDK;
        this.unregisterClient = aFd1zSDK;
        this.d = aFf1fSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerClient(AFc1tSDK aFc1tSDK, AppSetIdInfo appSetIdInfo) {
        AFc1eSDK aFc1eSDK = aFc1tSDK.AFLogger;
        int scope = appSetIdInfo.getScope();
        String id = appSetIdInfo.getId();
        Intrinsics.checkNotNullExpressionValue(id, "");
        aFc1eSDK.setUserEmail = new AFc1rSDK(scope, id);
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final boolean AFLogger() {
        return !this.d.AFLogger() && !this.AFLogger.setCustomerUserId && AFj1qSDK.AFLogger(this.unregisterClient.d) && AFj1qSDK.registerClient(this.unregisterClient.d);
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void unregisterClient() {
        Context context = this.unregisterClient.d;
        if (context != null) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new C6585sa(this));
            } catch (Throwable th) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, 120, null);
                Unit unit = Unit.a;
            }
        }
    }
}
