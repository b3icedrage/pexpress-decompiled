package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements BH0 {

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public List<String> g;

    @Nullable
    public ConcurrentHashMap h;

    public static final class a implements KG0<m> {
        @Override // defpackage.KG0
        @NotNull
        public final m a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            m mVar = new m();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "params":
                        List<String> list = (List) q71.W0();
                        if (list == null) {
                            break;
                        } else {
                            mVar.g = list;
                            break;
                        }
                        break;
                    case "message":
                        mVar.e = q71.e0();
                        break;
                    case "formatted":
                        mVar.d = q71.e0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            mVar.h = concurrentHashMap;
            q71.B0();
            return mVar;
        }
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.d != null) {
            c6319rH0.c("formatted");
            c6319rH0.j(this.d);
        }
        if (this.e != null) {
            c6319rH0.c("message");
            c6319rH0.j(this.e);
        }
        List<String> list = this.g;
        if (list != null && !list.isEmpty()) {
            c6319rH0.c("params");
            c6319rH0.g(iLogger, this.g);
        }
        ConcurrentHashMap concurrentHashMap = this.h;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.h, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}
