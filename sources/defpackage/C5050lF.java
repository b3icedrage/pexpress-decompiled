package defpackage;

import io.sentry.featureflags.b;
import io.sentry.featureflags.c;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.C4525g;
import io.sentry.protocol.F;
import io.sentry.protocol.o;
import io.sentry.protocol.u;
import io.sentry.util.C4527a;
import io.sentry.util.C4529c;
import io.sentry.util.d;
import io.sentry.util.p;
import io.sentry.util.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5050lF implements InterfaceC1015Fu0 {
    public final KD1 a;
    public final InterfaceC1015Fu0 b;
    public final InterfaceC1015Fu0 c;

    /* JADX INFO: renamed from: lF$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PD1.values().length];
            a = iArr;
            try {
                iArr[PD1.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PD1.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[PD1.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[PD1.COMBINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C5050lF(@NotNull InterfaceC1015Fu0 interfaceC1015Fu0, @NotNull InterfaceC1015Fu0 interfaceC1015Fu1, @NotNull KD1 kd1) {
        this.a = kd1;
        this.b = interfaceC1015Fu0;
        this.c = interfaceC1015Fu1;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final InterfaceC1327Ju0 A() {
        InterfaceC1327Ju0 interfaceC1327Ju0A = this.c.A();
        if (!(interfaceC1327Ju0A instanceof C3919g51)) {
            return interfaceC1327Ju0A;
        }
        InterfaceC1327Ju0 interfaceC1327Ju0A2 = this.b.A();
        return !(interfaceC1327Ju0A2 instanceof C3919g51) ? interfaceC1327Ju0A2 : this.a.v;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void B(@Nullable InterfaceC4302hv0 interfaceC4302hv0) {
        i(null).B(interfaceC4302hv0);
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void C() {
        i(null).C();
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final List<io.sentry.internal.eventprocessor.a> D() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.a.l);
        copyOnWriteArrayList.addAll(this.b.D());
        copyOnWriteArrayList.addAll(this.c.D());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void E(@Nullable Object obj, @Nullable String str) {
        i(null).E(obj, str);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final List<C2234Vk> F() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.a.F());
        copyOnWriteArrayList.addAll(this.b.F());
        copyOnWriteArrayList.addAll(this.c.F());
        return copyOnWriteArrayList;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void G(KD1.c cVar) {
        i(null).G(cVar);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final C4521c H() {
        KD1 kd1 = this.a;
        return new C4840kF(kd1.r, this.b.H(), this.c.H(), kd1.m.getDefaultScopeType());
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final String I() {
        String strI = this.c.I();
        if (strI != null) {
            return strI;
        }
        String strI2 = this.b.I();
        return strI2 != null ? strI2 : this.a.e;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void J(@NotNull u uVar) {
        this.a.getClass();
        this.b.J(uVar);
        this.c.J(uVar);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final List<String> K() {
        List<String> listK = this.c.K();
        if (!listK.isEmpty()) {
            return listK;
        }
        List<String> listK2 = this.b.K();
        return !listK2.isEmpty() ? listK2 : this.a.g;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final CI1 L(KD1.b bVar) {
        return i(null).L(bVar);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final C5364mj1 M(KD1.a aVar) {
        return i(null).M(aVar);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final List<N80> N() {
        return d.a((CopyOnWriteArrayList) D());
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final String O() {
        String strO = this.c.O();
        if (strO != null) {
            return strO;
        }
        String strO2 = this.b.O();
        return strO2 != null ? strO2 : this.a.O();
    }

    public final void a(@NotNull EG1 eg1) {
        InterfaceC2347Wu0 interfaceC2347Wu0;
        KD1 kd1 = this.a;
        if (!kd1.m.isTracingEnabled() || eg1.a() == null) {
            return;
        }
        Map<Throwable, q<WeakReference<InterfaceC2347Wu0>, String>> map = kd1.w;
        Throwable thA = eg1.a();
        p.b(thA, "throwable cannot be null");
        while (thA.getCause() != null && thA.getCause() != thA) {
            thA = thA.getCause();
        }
        q<WeakReference<InterfaceC2347Wu0>, String> qVar = map.get(thA);
        if (qVar != null) {
            WeakReference weakReference = qVar.a;
            if (eg1.e.j() == null && (interfaceC2347Wu0 = (InterfaceC2347Wu0) weakReference.get()) != null) {
                eg1.e.x(interfaceC2347Wu0.w());
            }
            String str = qVar.b;
            if (eg1.z != null || str == null) {
                return;
            }
            eg1.z = str;
        }
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void b(@Nullable String str, @Nullable String str2) {
        i(null).b(str, str2);
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void c(@Nullable F f) {
        i(null).c(f);
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void clear() {
        i(null).clear();
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final o d() {
        o oVarD = this.c.d();
        if (oVarD != null) {
            return oVarD;
        }
        o oVarD2 = this.b.d();
        return oVarD2 != null ? oVarD2 : this.a.f;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final InterfaceC2347Wu0 e() {
        InterfaceC2347Wu0 interfaceC2347Wu0E = this.c.e();
        if (interfaceC2347Wu0E != null) {
            return interfaceC2347Wu0E;
        }
        InterfaceC2347Wu0 interfaceC2347Wu0E2 = this.b.e();
        return interfaceC2347Wu0E2 != null ? interfaceC2347Wu0E2 : this.a.e();
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1015Fu0 clone() {
        return new C5050lF(this.b.clone(), this.c.clone(), this.a);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final C4525g g() {
        return v().g();
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final Map<String, Object> getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.a.k);
        concurrentHashMap.putAll(this.b.getExtras());
        concurrentHashMap.putAll(this.c.getExtras());
        return concurrentHashMap;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final NG1 getLevel() {
        NG1 level = this.c.getLevel();
        if (level != null) {
            return level;
        }
        NG1 level2 = this.b.getLevel();
        return level2 != null ? level2 : this.a.a;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final CI1 getSession() {
        CI1 session = this.c.getSession();
        if (session != null) {
            return session;
        }
        CI1 session2 = this.b.getSession();
        return session2 != null ? session2 : this.a.n;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final Map<String, String> getTags() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(C4529c.a(this.a.i));
        concurrentHashMap.putAll(this.b.getTags());
        concurrentHashMap.putAll(this.c.getTags());
        return concurrentHashMap;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final F getUser() {
        F user = this.c.getUser();
        if (user != null) {
            return user;
        }
        F user2 = this.b.getUser();
        return user2 != null ? user2 : this.a.d;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void h(@Nullable NG1 ng1) {
        i(null).h(ng1);
    }

    public final InterfaceC1015Fu0 i(@Nullable PD1 pd1) {
        InterfaceC1015Fu0 interfaceC1015Fu0 = this.b;
        InterfaceC1015Fu0 interfaceC1015Fu1 = this.c;
        KD1 kd1 = this.a;
        if (pd1 != null) {
            int i = a.a[pd1.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return kd1;
                    }
                    if (i == 4) {
                        return this;
                    }
                }
                return interfaceC1015Fu0;
            }
            return interfaceC1015Fu1;
        }
        int i2 = a.a[kd1.m.getDefaultScopeType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return kd1;
                }
            }
            return interfaceC1015Fu0;
        }
        return interfaceC1015Fu1;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final u k() {
        u uVarK = this.c.k();
        u uVar = u.e;
        if (!uVar.equals(uVarK)) {
            return uVarK;
        }
        u uVarK2 = this.b.k();
        return !uVar.equals(uVarK2) ? uVarK2 : this.a.u;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void l(@NotNull C0702Bu c0702Bu, @Nullable C0841Do0 c0841Do0) {
        i(null).l(c0702Bu, c0841Do0);
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void m(@NotNull List<String> list) {
        i(null).m(list);
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void n(@Nullable String str, @Nullable String str2) {
        i(null).n(str, str2);
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void o(@NotNull u uVar) {
        i(null).o(uVar);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final C2688aH1 p() {
        return this.a.m;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final Map<String, SF1> q() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(C4529c.a(this.a.j));
        concurrentHashMap.putAll(this.b.q());
        concurrentHashMap.putAll(this.c.q());
        return concurrentHashMap;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final InterfaceC4302hv0 r() {
        InterfaceC4302hv0 interfaceC4302hv0R = this.c.r();
        if (interfaceC4302hv0R != null) {
            return interfaceC4302hv0R;
        }
        InterfaceC4302hv0 interfaceC4302hv0R2 = this.b.r();
        return interfaceC4302hv0R2 != null ? interfaceC4302hv0R2 : this.a.b;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void removeTag(@Nullable String str) {
        i(null).removeTag(str);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final CI1 s() {
        return i(null).s();
    }

    @Override // defpackage.InterfaceC1015Fu0
    @Nullable
    public final KD1.d t() {
        return i(null).t();
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void u() {
        i(null).u();
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final b v() {
        PD1 pd1;
        io.sentry.featureflags.a.C0394a c0394a;
        C2688aH1 c2688aH1 = this.a.m;
        b bVar = this.a.x;
        b bVarV = this.b.v();
        b bVarV2 = this.c.v();
        int maxFeatureFlags = c2688aH1.getMaxFeatureFlags();
        c cVar = c.a;
        if (maxFeatureFlags > 0) {
            io.sentry.featureflags.a aVar = bVar instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVar : null;
            io.sentry.featureflags.a aVar2 = bVarV instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarV : null;
            io.sentry.featureflags.a aVar3 = bVarV2 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarV2 : null;
            CopyOnWriteArrayList<io.sentry.featureflags.a.C0394a> copyOnWriteArrayList = aVar == null ? null : aVar.a;
            CopyOnWriteArrayList<io.sentry.featureflags.a.C0394a> copyOnWriteArrayList2 = aVar2 == null ? null : aVar2.a;
            CopyOnWriteArrayList<io.sentry.featureflags.a.C0394a> copyOnWriteArrayList3 = aVar3 == null ? null : aVar3.a;
            int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
            int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
            int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
            if (size != 0 || size2 != 0 || size3 != 0) {
                int i = size - 1;
                int i2 = size2 - 1;
                int i3 = size3 - 1;
                io.sentry.featureflags.a.C0394a c0394a2 = (copyOnWriteArrayList == null || i < 0) ? null : copyOnWriteArrayList.get(i);
                io.sentry.featureflags.a.C0394a c0394a3 = (copyOnWriteArrayList2 == null || i2 < 0) ? null : copyOnWriteArrayList2.get(i2);
                io.sentry.featureflags.a.C0394a c0394a4 = (copyOnWriteArrayList3 == null || i3 < 0) ? null : copyOnWriteArrayList3.get(i3);
                LinkedHashMap linkedHashMap = new LinkedHashMap(maxFeatureFlags);
                while (linkedHashMap.size() < maxFeatureFlags && (c0394a2 != null || c0394a3 != null || c0394a4 != null)) {
                    if (c0394a2 != null) {
                        pd1 = PD1.GLOBAL;
                        c0394a = c0394a2;
                    } else {
                        pd1 = null;
                        c0394a = null;
                    }
                    if (c0394a3 != null) {
                        if (c0394a != null) {
                            throw null;
                        }
                        pd1 = PD1.ISOLATION;
                        c0394a = c0394a3;
                    }
                    if (c0394a4 != null) {
                        if (c0394a != null) {
                            throw null;
                        }
                        pd1 = PD1.CURRENT;
                        c0394a = c0394a4;
                    }
                    if (c0394a == null) {
                        break;
                    }
                    if (!linkedHashMap.containsKey(null)) {
                        linkedHashMap.put(null, c0394a);
                    }
                    if (PD1.CURRENT.equals(pd1)) {
                        i3--;
                        c0394a4 = (copyOnWriteArrayList3 == null || i3 < 0) ? null : copyOnWriteArrayList3.get(i3);
                    } else if (PD1.ISOLATION.equals(pd1)) {
                        i2--;
                        c0394a3 = (copyOnWriteArrayList2 == null || i2 < 0) ? null : copyOnWriteArrayList2.get(i2);
                    } else if (PD1.GLOBAL.equals(pd1)) {
                        i--;
                        c0394a2 = (copyOnWriteArrayList == null || i < 0) ? null : copyOnWriteArrayList.get(i);
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.values());
                Collections.reverse(arrayList);
                CopyOnWriteArrayList<io.sentry.featureflags.a.C0394a> copyOnWriteArrayList4 = new CopyOnWriteArrayList<>(arrayList);
                io.sentry.featureflags.a aVar4 = new io.sentry.featureflags.a();
                new C4527a();
                aVar4.a = copyOnWriteArrayList4;
                return aVar4;
            }
        }
        return cVar;
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void w(@NotNull C5364mj1 c5364mj1) {
        i(null).w(c5364mj1);
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final Queue<C0702Bu> x() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.x());
        arrayList.addAll(this.b.x());
        InterfaceC1015Fu0 interfaceC1015Fu0 = this.c;
        arrayList.addAll(interfaceC1015Fu0.x());
        Collections.sort(arrayList);
        Queue<C0702Bu> queueA = KD1.a(interfaceC1015Fu0.p().getMaxBreadcrumbs());
        queueA.addAll(arrayList);
        return queueA;
    }

    @Override // defpackage.InterfaceC1015Fu0
    @NotNull
    public final C5364mj1 y() {
        return i(null).y();
    }

    @Override // defpackage.InterfaceC1015Fu0
    public final void z(@Nullable String str) {
        i(null).z(str);
    }
}
