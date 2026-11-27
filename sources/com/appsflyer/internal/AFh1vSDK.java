package com.appsflyer.internal;

import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1vSDK extends AFLoggerBase {

    @NotNull
    private final AFc1bSDK AFKeystoreWrapper;
    private final boolean AFLogger;

    public AFh1vSDK(@NotNull AFc1bSDK aFc1bSDK) {
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.AFKeystoreWrapper = aFc1bSDK;
        this.AFLogger = true;
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void d(@NotNull LogTag logTag, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(logTag, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFKeystoreWrapper.AFLoggerLogLevel().AFLogger("D", extendedMsg(str, logTag));
        }
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void e(@NotNull LogTag logTag, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(logTag, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z4) {
            this.AFKeystoreWrapper.AFLoggerLogLevel().AFLogger("E", extendedMsg(str, logTag));
        }
        if (z4) {
            this.AFKeystoreWrapper.AFLoggerLogLevel().registerClient(th);
        }
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void force(@NotNull LogTag logTag, @NotNull String str) {
        Intrinsics.checkNotNullParameter(logTag, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFLogger("F", extendedMsg(str, logTag));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final boolean getShouldExtendMsg() {
        return this.AFLogger;
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void i(@NotNull LogTag logTag, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(logTag, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFKeystoreWrapper.AFLoggerLogLevel().AFLogger("I", extendedMsg(str, logTag));
        }
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void v(@NotNull LogTag logTag, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(logTag, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFKeystoreWrapper.AFLoggerLogLevel().AFLogger("V", extendedMsg(str, logTag));
        }
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void w(@NotNull LogTag logTag, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(logTag, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFKeystoreWrapper.AFLoggerLogLevel().AFLogger("W", extendedMsg(str, logTag));
        }
    }
}
