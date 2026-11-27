package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.NG1;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.protocol.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4524f implements BH0 {

    @NotNull
    public final String d;
    public final boolean e;

    @Nullable
    public ConcurrentHashMap g;

    /* JADX INFO: renamed from: io.sentry.protocol.f$a */
    public static final class a implements KG0<C4524f> {
        @Override // defpackage.KG0
        @NotNull
        public final C4524f a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            String strE0 = null;
            Boolean boolH0 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("result")) {
                    boolH0 = q71.H0();
                } else if (strX0.equals("flag")) {
                    strE0 = q71.e0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    q71.Q(iLogger, concurrentHashMap, strX0);
                }
            }
            if (strE0 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                iLogger.d(NG1.ERROR, "Missing required field \"flag\"", illegalStateException);
                throw illegalStateException;
            }
            if (boolH0 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                iLogger.d(NG1.ERROR, "Missing required field \"result\"", illegalStateException2);
                throw illegalStateException2;
            }
            C4524f c4524f = new C4524f(strE0, boolH0.booleanValue());
            c4524f.g = concurrentHashMap;
            q71.B0();
            return c4524f;
        }
    }

    public C4524f(@NotNull String str, boolean z) {
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4524f.class == obj.getClass()) {
            C4524f c4524f = (C4524f) obj;
            if (io.sentry.util.p.a(this.d, c4524f.d) && io.sentry.util.p.a(Boolean.valueOf(this.e), Boolean.valueOf(c4524f.e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, Boolean.valueOf(this.e)});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("flag");
        c6319rH0.j(this.d);
        c6319rH0.c("result");
        c6319rH0.k(this.e);
        ConcurrentHashMap concurrentHashMap = this.g;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.g, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}
