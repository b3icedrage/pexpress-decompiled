package io.sentry.protocol;

import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements BH0 {

    @Nullable
    public final String d;

    @Nullable
    public ConcurrentHashMap e;

    public D(@Nullable String str) {
        this.d = str;
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        String str = this.d;
        if (str != null) {
            c6319rH0.c(Payload.SOURCE);
            c6319rH0.g(iLogger, str);
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                C4564j.h(this.e, str2, c6319rH0, str2, iLogger);
            }
        }
        c6319rH0.b();
    }
}
