package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.protocol.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4525g implements BH0 {

    @NotNull
    public final List<C4524f> d;

    @Nullable
    public ConcurrentHashMap e;

    public C4525g() {
        this.d = new ArrayList();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4525g.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.p.a(this.d, ((C4525g) obj).d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("values");
        c6319rH0.g(iLogger, this.d);
        ConcurrentHashMap concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.e, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public C4525g(@NotNull List<C4524f> list) {
        this.d = list;
    }
}
