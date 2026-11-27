package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4693ja extends C3595ea {
    public C3386da p;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object n(C4693ja c4693ja, C1563Mv0 configuration, LM lm) {
        C3176ca c3176ca;
        Object objA;
        C1644Nv0 c1644Nv0;
        if (lm instanceof C3176ca) {
            c3176ca = (C3176ca) lm;
            int i = c3176ca.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3176ca.i = i - Integer.MIN_VALUE;
            } else {
                c3176ca = new C3176ca(c4693ja, lm);
            }
        } else {
            c3176ca = new C3176ca(c4693ja, lm);
        }
        Object obj = c3176ca.g;
        MN mn = MN.d;
        int i2 = c3176ca.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C4319i01 c4319i01 = new C4319i01(c4693ja);
            c3176ca.d = c4693ja;
            c3176ca.e = configuration;
            c3176ca.i = 1;
            if (c4319i01.d < 3) {
                c4319i01.c.a("Migrating storage to version 3");
                objA = c4319i01.a(c3176ca);
                if (objA != mn) {
                    objA = Unit.a;
                }
            } else {
                c4693ja.l.a("Storage already at version 3");
                objA = Unit.a;
            }
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            configuration = c3176ca.e;
            c4693ja = c3176ca.d;
            C1795Pt1.b(obj);
        }
        c4693ja.getClass();
        Intrinsics.checkNotNullParameter(configuration, "identityConfiguration");
        Object obj2 = C1644Nv0.b;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        synchronized (C1644Nv0.b) {
            try {
                LinkedHashMap linkedHashMap = C1644Nv0.c;
                String str = configuration.a;
                Object c1644Nv1 = linkedHashMap.get(str);
                if (c1644Nv1 == null) {
                    c1644Nv1 = new C1644Nv0(configuration);
                    linkedHashMap.put(str, c1644Nv1);
                }
                c1644Nv0 = (C1644Nv0) c1644Nv1;
            } catch (Throwable th) {
                throw th;
            }
        }
        c4693ja.m = c1644Nv0;
        C0642Ba listener = new C0642Ba(c4693ja.b);
        C1956Rv0 c1956Rv0 = c4693ja.d().a;
        c1956Rv0.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (c1956Rv0.d) {
            c1956Rv0.e.add(listener);
        }
        if (c4693ja.d().a.f) {
            listener.c(c4693ja.d().a.a(), EnumC2532Yv0.d);
        }
        if (!Intrinsics.a(c4693ja.a.q, null)) {
            c4693ja.a(new C7009ub());
        }
        C3386da c3386da = new C3386da(c4693ja);
        c4693ja.p = c3386da;
        c4693ja.a(c3386da);
        c4693ja.a(new C1219Ik0());
        c4693ja.a(new C5540nb());
        c4693ja.a(new C5956pa());
        c4693ja.a(new C6375ra());
        c4693ja.a(new C4903ka());
        JZ1 jz1 = c4693ja.h;
        Intrinsics.c(jz1, "null cannot be cast to non-null type com.amplitude.android.Timeline");
        KZ1 kz1 = (KZ1) jz1;
        C3595ea c3595eaC = kz1.c();
        C3595ea c3595eaC2 = kz1.c();
        C5189lv.k(c3595eaC.c, c3595eaC2.f, new GZ1(kz1, null), 2);
        return Unit.a;
    }
}
