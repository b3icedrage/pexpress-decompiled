package defpackage;

import io.sentry.ILogger;
import io.sentry.protocol.u;
import io.sentry.vendor.gson.stream.b;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Mh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1522Mh1 implements BH0 {

    @NotNull
    public u d;

    @Nullable
    public ConcurrentHashMap e;

    /* JADX INFO: renamed from: Mh1$a */
    public static final class a implements KG0<C1522Mh1> {
        @Override // defpackage.KG0
        @NotNull
        public final C1522Mh1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            C1522Mh1 c1522Mh1 = new C1522Mh1();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                if (strX0.equals("profiler_id")) {
                    u uVar = (u) q71.H(iLogger, new u.a());
                    if (uVar != null) {
                        c1522Mh1.d = uVar;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    q71.Q(iLogger, concurrentHashMap, strX0);
                }
            }
            c1522Mh1.e = concurrentHashMap;
            q71.B0();
            return c1522Mh1;
        }
    }

    public C1522Mh1() {
        this(u.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1522Mh1) {
            return this.d.equals(((C1522Mh1) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d});
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("profiler_id");
        c6319rH0.g(iLogger, this.d);
        ConcurrentHashMap concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.e, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public C1522Mh1(@NotNull u uVar) {
        this.d = uVar;
    }
}
