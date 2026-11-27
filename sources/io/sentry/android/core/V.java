package io.sentry.android.core;

import defpackage.C0841Do0;
import defpackage.C3561eO1;
import defpackage.C4401iO1;
import defpackage.EG1;
import defpackage.EnumC4869kO1;
import defpackage.InterfaceC4010gY0;
import defpackage.N80;
import io.sentry.protocol.C4519a;
import io.sentry.protocol.C4521c;
import io.sentry.util.C4527a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class V implements N80 {

    @NotNull
    public final C4494e d;

    @NotNull
    public final SentryAndroidOptions e;

    @NotNull
    public final C4527a g = new C4527a();

    public V(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull C4494e c4494e) {
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.e = sentryAndroidOptions;
        this.d = c4494e;
    }

    public static void a(@NotNull io.sentry.android.core.performance.h hVar, @NotNull io.sentry.protocol.B b) {
        C3561eO1 c3561eO1J;
        C4401iO1 c4401iO1;
        if (hVar.d == io.sentry.android.core.performance.h.d.COLD && (c3561eO1J = b.e.j()) != null) {
            ArrayList arrayList = b.w;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c4401iO1 = null;
                    break;
                }
                io.sentry.protocol.x xVar = (io.sentry.protocol.x) it.next();
                if (xVar.j.contentEquals("app.start.cold")) {
                    c4401iO1 = xVar.h;
                    break;
                }
            }
            io.sentry.android.core.performance.i iVar = new io.sentry.android.core.performance.i();
            io.sentry.android.core.performance.i iVar2 = hVar.h;
            long j = iVar2.e;
            long j2 = iVar2.g;
            long j3 = io.sentry.android.core.performance.h.t;
            iVar.d = "Process Initialization";
            iVar.e = j;
            iVar.g = j2;
            iVar.h = j3;
            boolean zE = iVar.e();
            io.sentry.protocol.u uVar = c3561eO1J.d;
            if (zE && Math.abs(iVar.b()) <= 10000) {
                arrayList.add(e(iVar, c4401iO1, uVar, "process.load"));
            }
            ArrayList arrayList2 = new ArrayList(hVar.k.values());
            Collections.sort(arrayList2);
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(e((io.sentry.android.core.performance.i) it2.next(), c4401iO1, uVar, "contentprovider.load"));
                }
            }
            io.sentry.android.core.performance.i iVar3 = hVar.j;
            if (iVar3.h != 0) {
                arrayList.add(e(iVar3, c4401iO1, uVar, "application.load"));
            }
        }
    }

    public static boolean b(@NotNull io.sentry.protocol.B b) {
        for (io.sentry.protocol.x xVar : b.w) {
            if (xVar.j.contentEquals("app.start.cold") || xVar.j.contentEquals("app.start.warm")) {
                return true;
            }
        }
        C3561eO1 c3561eO1J = b.e.j();
        if (c3561eO1J == null) {
            return false;
        }
        String str = c3561eO1J.i;
        return str.equals("app.start.cold") || str.equals("app.start.warm");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    public static void d(io.sentry.protocol.B b) {
        boolean z;
        Double d;
        Double d2;
        Object obj;
        ArrayList<io.sentry.protocol.x> arrayList = b.w;
        io.sentry.protocol.x xVar = null;
        io.sentry.protocol.x xVar2 = null;
        for (io.sentry.protocol.x xVar3 : arrayList) {
            if ("ui.load.initial_display".equals(xVar3.j)) {
                xVar = xVar3;
            } else if ("ui.load.full_display".equals(xVar3.j)) {
                xVar2 = xVar3;
            }
            if (xVar != null && xVar2 != null) {
                break;
            }
        }
        if (xVar == null && xVar2 == null) {
            return;
        }
        for (io.sentry.protocol.x xVar4 : arrayList) {
            if (xVar4 != xVar && xVar4 != xVar2) {
                Map<String, Object> map = xVar4.o;
                boolean z2 = false;
                boolean z3 = map == null || (obj = map.get("thread.name")) == null || "main".equals(obj);
                Double d3 = xVar4.d;
                if (xVar != null) {
                    double dDoubleValue = d3.doubleValue();
                    if (dDoubleValue < xVar.d.doubleValue() || (((d2 = xVar.e) != null && dDoubleValue > d2.doubleValue()) || !z3)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (xVar2 != null) {
                    double dDoubleValue2 = d3.doubleValue();
                    if (dDoubleValue2 >= xVar2.d.doubleValue() && ((d = xVar2.e) == null || dDoubleValue2 <= d.doubleValue())) {
                        z2 = true;
                    }
                }
                if (z || z2) {
                    Map concurrentHashMap = xVar4.o;
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                        xVar4.o = concurrentHashMap;
                    }
                    if (z) {
                        concurrentHashMap.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z2) {
                        concurrentHashMap.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    @NotNull
    public static io.sentry.protocol.x e(@NotNull io.sentry.android.core.performance.i iVar, @Nullable C4401iO1 c4401iO1, @NotNull io.sentry.protocol.u uVar, @NotNull String str) {
        long jB;
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.e.b));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        Double dValueOf = Double.valueOf(iVar.e / 1000.0d);
        if (iVar.e()) {
            jB = iVar.b() + iVar.e;
        } else {
            jB = 0;
        }
        return new io.sentry.protocol.x(dValueOf, Double.valueOf(jB / 1000.0d), uVar, new C4401iO1(), c4401iO1, str, iVar.d, EnumC4869kO1.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // defpackage.N80
    @NotNull
    public final io.sentry.protocol.B g(@NotNull io.sentry.protocol.B b, @NotNull C0841Do0 c0841Do0) {
        Map map;
        SentryAndroidOptions sentryAndroidOptions = this.e;
        C4527a.C0404a c0404aA = this.g.a();
        try {
            if (!sentryAndroidOptions.isTracingEnabled()) {
                c0404aA.close();
                return b;
            }
            io.sentry.android.core.performance.h hVarC = io.sentry.android.core.performance.h.c();
            boolean zB = b(b);
            HashMap map2 = b.x;
            C4521c c4521c = b.e;
            if (zB) {
                if (hVarC.q && hVarC.e.a().booleanValue()) {
                    long jB = hVarC.b(sentryAndroidOptions).b();
                    if (jB != 0) {
                        map2.put(hVarC.d == io.sentry.android.core.performance.h.d.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.k(Float.valueOf(jB), InterfaceC4010gY0.a.MILLISECOND.apiName()));
                        a(hVarC, b);
                        hVarC.q = false;
                        hVarC.k.clear();
                        hVarC.l.clear();
                    }
                }
                C4519a c4519aD = c4521c.d();
                if (c4519aD == null) {
                    c4519aD = new C4519a();
                    c4521c.o(c4519aD);
                }
                c4519aD.n = hVarC.d == io.sentry.android.core.performance.h.d.COLD ? "cold" : "warm";
            }
            d(b);
            io.sentry.protocol.u uVar = b.d;
            C3561eO1 c3561eO1J = c4521c.j();
            if (uVar != null && c3561eO1J != null && c3561eO1J.i.contentEquals("ui.load")) {
                C4494e c4494e = this.d;
                C4527a.C0404a c0404aA2 = c4494e.f.a();
                try {
                    if (c4494e.c()) {
                        ConcurrentHashMap concurrentHashMap = c4494e.c;
                        Map map3 = (Map) concurrentHashMap.get(uVar);
                        concurrentHashMap.remove(uVar);
                        c0404aA2.close();
                        map = map3;
                    } else {
                        c0404aA2.close();
                        map = null;
                    }
                    if (map != null) {
                        map2.putAll(map);
                    }
                } catch (Throwable th) {
                    try {
                        c0404aA2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c0404aA.close();
            return b;
        } catch (Throwable th3) {
            try {
                c0404aA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.N80
    @Nullable
    public final EG1 f(@NotNull EG1 eg1, @NotNull C0841Do0 c0841Do0) {
        return eg1;
    }
}
