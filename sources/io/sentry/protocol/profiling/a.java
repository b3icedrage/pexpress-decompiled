package io.sentry.protocol.profiling;

import defpackage.BH0;
import defpackage.C4564j;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import io.sentry.protocol.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements BH0 {

    @NotNull
    public List<io.sentry.protocol.profiling.b> d = new ArrayList();

    @NotNull
    public List<List<Integer>> e = new ArrayList();

    @NotNull
    public List<y> g = new ArrayList();

    @NotNull
    public Map<String, c> h = new HashMap();

    @Nullable
    public ConcurrentHashMap i;

    /* JADX INFO: renamed from: io.sentry.protocol.profiling.a$a, reason: collision with other inner class name */
    public static final class C0400a implements KG0<a> {
        @Override // defpackage.KG0
        @NotNull
        public final a a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            q71.X0();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "frames":
                        ArrayList arrayListQ0 = q71.q0(iLogger, new y.a());
                        if (arrayListQ0 == null) {
                            break;
                        } else {
                            aVar.g = arrayListQ0;
                            break;
                        }
                        break;
                    case "stacks":
                        List<List<Integer>> list = (List) q71.H(iLogger, new b());
                        if (list == null) {
                            break;
                        } else {
                            aVar.e = list;
                            break;
                        }
                        break;
                    case "samples":
                        ArrayList arrayListQ1 = q71.q0(iLogger, new io.sentry.protocol.profiling.b.a());
                        if (arrayListQ1 == null) {
                            break;
                        } else {
                            aVar.d = arrayListQ1;
                            break;
                        }
                        break;
                    case "thread_metadata":
                        HashMap mapD1 = q71.d1(iLogger, new c.a());
                        if (mapD1 == null) {
                            break;
                        } else {
                            aVar.h = mapD1;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        q71.Q(iLogger, concurrentHashMap, strX0);
                        break;
                }
            }
            aVar.i = concurrentHashMap;
            q71.B0();
            return aVar;
        }
    }

    public static final class b implements KG0<List<List<Integer>>> {
        @Override // defpackage.KG0
        @NotNull
        public final List<List<Integer>> a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            q71.l1();
            while (q71.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                q71.l1();
                while (q71.hasNext()) {
                    arrayList2.add(Integer.valueOf(q71.E0()));
                }
                q71.h1();
                arrayList.add(arrayList2);
            }
            q71.h1();
            return arrayList;
        }
    }

    @Override // defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        c6319rH0.c("samples");
        c6319rH0.g(iLogger, this.d);
        c6319rH0.c("stacks");
        c6319rH0.g(iLogger, this.e);
        c6319rH0.c("frames");
        c6319rH0.g(iLogger, this.g);
        c6319rH0.c("thread_metadata");
        c6319rH0.g(iLogger, this.h);
        ConcurrentHashMap concurrentHashMap = this.i;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C4564j.h(this.i, str, c6319rH0, str, iLogger);
            }
        }
        c6319rH0.b();
    }
}
