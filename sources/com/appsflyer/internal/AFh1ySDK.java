package com.appsflyer.internal;

import com.appsflyer.exception_manager.ExceptionManager;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1ySDK extends AFLoggerBase {

    @NotNull
    private final AFc1bSDK unregisterClient;

    public AFh1ySDK(@NotNull AFc1bSDK aFc1bSDK) {
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.unregisterClient = aFc1bSDK;
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void e(@NotNull LogTag logTag, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(logTag, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z3) {
            if (StringsKt.I(str)) {
                str = "missing label";
            }
            String strWithTag = withTag(str, logTag);
            ExceptionManager entries = this.unregisterClient.getEntries();
            if (entries != null) {
                entries.storeNewException(th, strWithTag);
            }
        }
    }
}
