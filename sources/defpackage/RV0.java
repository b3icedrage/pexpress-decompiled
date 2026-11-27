package defpackage;

import io.sentry.hints.a;
import io.sentry.hints.e;
import io.sentry.protocol.B;
import io.sentry.protocol.C4522d;
import io.sentry.protocol.F;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.util.g;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class RV0 implements N80, Closeable {

    @NotNull
    public final C2688aH1 d;

    @NotNull
    public final C6950uH1 e;

    @NotNull
    public final FG1 g;

    @Nullable
    public volatile C4533ip0 h = null;

    public RV0(@NotNull C2688aH1 c2688aH1) {
        this.d = c2688aH1;
        C6740tH1 c6740tH1 = new C6740tH1(c2688aH1);
        this.g = new FG1(c6740tH1);
        this.e = new C6950uH1(c6740tH1);
    }

    @Override // defpackage.N80
    @NotNull
    public final C2912bH1 c(@NotNull C2912bH1 c2912bH1, @NotNull C0841Do0 c0841Do0) {
        if (c2912bH1.l == null) {
            c2912bH1.l = "java";
        }
        if (p(c2912bH1, c0841Do0)) {
            l(c2912bH1);
            r rVar = this.d.getSessionReplay().l;
            if (rVar != null) {
                c2912bH1.g = rVar;
            }
        }
        return c2912bH1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.h != null) {
            this.h.f.shutdown();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.N80
    @NotNull
    public final EG1 f(@NotNull EG1 eg1, @NotNull C0841Do0 c0841Do0) {
        ArrayList arrayList;
        if (eg1.l == null) {
            eg1.l = "java";
        }
        Throwable th = eg1.n;
        if (th != null) {
            FG1 fg1 = this.g;
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            fg1.a(th, atomicInteger, hashSet, arrayDeque, null);
            eg1.x = new H81(new ArrayList(arrayDeque));
        }
        C4522d c4522d = eg1.r;
        C2688aH1 c2688aH1 = this.d;
        C4522d c4522dA = C4522d.a(c4522d, c2688aH1);
        if (c4522dA != null) {
            eg1.r = c4522dA;
        }
        Map<String, String> mapA = c2688aH1.getModulesLoader().a();
        if (mapA != null) {
            AbstractMap abstractMap = eg1.C;
            if (abstractMap == null) {
                eg1.C = new HashMap(mapA);
            } else {
                abstractMap.putAll(mapA);
            }
        }
        if (p(eg1, c0841Do0)) {
            l(eg1);
            if (eg1.d() == null) {
                ArrayList<s> arrayListC = eg1.c();
                if (arrayListC == null || arrayListC.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (s sVar : arrayListC) {
                        if (sVar.j != null && sVar.h != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(sVar.h);
                        }
                    }
                }
                boolean zIsAttachThreads = c2688aH1.isAttachThreads();
                C6950uH1 c6950uH1 = this.e;
                boolean zD = false;
                if (zIsAttachThreads || a.class.isInstance(c0841Do0.b("sentry:typeCheckHint"))) {
                    Object objB = c0841Do0.b("sentry:typeCheckHint");
                    boolean zIsAttachStacktrace = c2688aH1.isAttachStacktrace();
                    if (objB instanceof a) {
                        zD = ((a) objB).d();
                        zIsAttachStacktrace = true;
                    }
                    eg1.w = new H81(c6950uH1.a(Thread.getAllStackTraces(), arrayList, zD, zIsAttachStacktrace));
                } else if (c2688aH1.isAttachStacktrace() && ((arrayListC == null || arrayListC.isEmpty()) && !e.class.isInstance(c0841Do0.b("sentry:typeCheckHint")))) {
                    boolean zIsAttachStacktrace2 = c2688aH1.isAttachStacktrace();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread = Thread.currentThread();
                    map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                    eg1.w = new H81(c6950uH1.a(map, null, false, zIsAttachStacktrace2));
                    return eg1;
                }
            }
        }
        return eg1;
    }

    @Override // defpackage.N80
    @NotNull
    public final B g(@NotNull B b, @NotNull C0841Do0 c0841Do0) {
        if (b.l == null) {
            b.l = "java";
        }
        C4522d c4522dA = C4522d.a(b.r, this.d);
        if (c4522dA != null) {
            b.r = c4522dA;
        }
        if (p(b, c0841Do0)) {
            l(b);
        }
        return b;
    }

    public final void l(@NotNull VF1 vf1) {
        if (vf1.j == null) {
            vf1.j = this.d.getRelease();
        }
        if (vf1.k == null) {
            vf1.k = this.d.getEnvironment();
        }
        if (vf1.o == null) {
            vf1.o = this.d.getServerName();
        }
        if (this.d.isAttachServerName() && vf1.o == null) {
            if (this.h == null) {
                this.h = C4533ip0.a();
            }
            if (this.h != null) {
                C4533ip0 c4533ip0 = this.h;
                if (c4533ip0.c < System.currentTimeMillis() && c4533ip0.d.compareAndSet(false, true)) {
                    c4533ip0.b();
                }
                vf1.o = c4533ip0.b;
            }
        }
        if (vf1.p == null) {
            vf1.p = this.d.getDist();
        }
        if (vf1.g == null) {
            vf1.g = this.d.getSdkVersion();
        }
        AbstractMap abstractMap = vf1.i;
        C2688aH1 c2688aH1 = this.d;
        if (abstractMap == null) {
            vf1.i = new HashMap(new HashMap(c2688aH1.getTags()));
        } else {
            for (Map.Entry<String, String> entry : c2688aH1.getTags().entrySet()) {
                if (!vf1.i.containsKey(entry.getKey())) {
                    vf1.b(entry.getKey(), entry.getValue());
                }
            }
        }
        F f = vf1.m;
        if (f == null) {
            f = new F();
            vf1.m = f;
        }
        if (f.h == null && this.d.isSendDefaultPii()) {
            f.h = "{{auto}}";
        }
    }

    public final boolean p(@NotNull VF1 vf1, @NotNull C0841Do0 c0841Do0) {
        if (g.d(c0841Do0)) {
            return true;
        }
        this.d.getLogger().a(NG1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", vf1.d);
        return false;
    }

    @Override // defpackage.N80
    @Nullable
    public final PG1 k(@NotNull PG1 pg1) {
        return pg1;
    }
}
