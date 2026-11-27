package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.util.C4529c;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements BH0 {

    @Nullable
    public List<y> d;

    @Nullable
    public AbstractMap e;

    @Nullable
    public Boolean g;

    @Nullable
    public b h;

    @Nullable
    public ConcurrentHashMap i;

    public static final class a implements KG0<z> {
        @Override // defpackage.KG0
        @NotNull
        public final z a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            z zVar = new z();
            q71.X0();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "frames":
                        zVar.d = q71.q0(iLogger, new y.a());
                        break;
                    case "instruction_addr_adjustment":
                        zVar.h = (b) q71.H(iLogger, new b.a());
                        break;
                    case "registers":
                        zVar.e = C4529c.a((Map) q71.W0());
                        break;
                    case "snapshot":
                        zVar.g = q71.H0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            zVar.i = concurrentHashMap;
            q71.B0();
            return zVar;
        }
    }

    public enum b implements BH0 {
        AUTO,
        ALL,
        ALL_BUT_FIRST,
        NONE;

        public static final class a implements KG0<b> {
            @Override // defpackage.KG0
            @NotNull
            public final b a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
                return b.valueOf(q71.B().toUpperCase(Locale.ROOT));
            }
        }

        @Override // defpackage.BH0
        public void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
            ((C6319rH0) w71).j(toString().toLowerCase(Locale.ROOT));
        }
    }

    public z() {
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("frames");
            c6319rH0.g(iLogger, this.d);
        }
        if (this.e != null) {
            c6319rH0.c("registers");
            c6319rH0.g(iLogger, this.e);
        }
        if (this.g != null) {
            c6319rH0.c("snapshot");
            c6319rH0.h(this.g);
        }
        if (this.h != null) {
            c6319rH0.c("instruction_addr_adjustment");
            c6319rH0.g(iLogger, this.h);
        }
        ConcurrentHashMap concurrentHashMap = this.i;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.i, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }

    public z(@Nullable List<y> list) {
        this.d = list;
    }
}
