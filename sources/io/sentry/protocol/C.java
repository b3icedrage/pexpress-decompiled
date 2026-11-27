package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements BH0 {

    @Nullable
    public String[] d;

    @Nullable
    public ConcurrentHashMap e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.d, ((C) obj).d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("active_profiles");
            c6319rH0.g(iLogger, this.d);
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.e, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}
