package defpackage;

import io.sentry.ILogger;
import io.sentry.protocol.C;
import io.sentry.protocol.C4519a;
import io.sentry.protocol.C4520b;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.C4523e;
import io.sentry.protocol.C4525g;
import io.sentry.protocol.j;
import io.sentry.protocol.n;
import io.sentry.protocol.p;
import io.sentry.protocol.w;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4840kF extends C4521c {

    @NotNull
    public final C4521c g;

    @NotNull
    public final C4521c h;

    @NotNull
    public final C4521c i;

    @NotNull
    public final PD1 j;

    /* JADX INFO: renamed from: kF$a */
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
        }
    }

    public C4840kF(@NotNull C4521c c4521c, @NotNull C4521c c4521c2, @NotNull C4521c c4521c3, @NotNull PD1 pd1) {
        this.g = c4521c;
        this.h = c4521c2;
        this.i = c4521c3;
        this.j = pd1;
    }

    @NotNull
    public final C4521c A() {
        C4521c c4521c = new C4521c();
        c4521c.m(this.g);
        c4521c.m(this.h);
        c4521c.m(this.i);
        return c4521c;
    }

    @Override // io.sentry.protocol.C4521c
    public final boolean a(@Nullable Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.C4521c
    @NotNull
    public final Set<Map.Entry<String, Object>> b() {
        return A().d.entrySet();
    }

    @Override // io.sentry.protocol.C4521c
    @Nullable
    public final Object c(@Nullable String str) {
        Object objC = this.i.c(str);
        if (objC != null) {
            return objC;
        }
        Object objC2 = this.h.c(str);
        return objC2 != null ? objC2 : this.g.c(str);
    }

    @Override // io.sentry.protocol.C4521c
    @Nullable
    public final C4519a d() {
        C4519a c4519aD = this.i.d();
        if (c4519aD != null) {
            return c4519aD;
        }
        C4519a c4519aD2 = this.h.d();
        return c4519aD2 != null ? c4519aD2 : this.g.d();
    }

    @Override // io.sentry.protocol.C4521c
    @Nullable
    public final C4523e e() {
        C4523e c4523eE = this.i.e();
        if (c4523eE != null) {
            return c4523eE;
        }
        C4523e c4523eE2 = this.h.e();
        return c4523eE2 != null ? c4523eE2 : this.g.e();
    }

    @Override // io.sentry.protocol.C4521c
    @Nullable
    public final C4525g f() {
        C4525g c4525gF = this.i.f();
        if (c4525gF != null) {
            return c4525gF;
        }
        C4525g c4525gF2 = this.h.f();
        return c4525gF2 != null ? c4525gF2 : this.g.f();
    }

    @Override // io.sentry.protocol.C4521c
    @Nullable
    public final n g() {
        n nVarG = this.i.g();
        if (nVarG != null) {
            return nVarG;
        }
        n nVarG2 = this.h.g();
        return nVarG2 != null ? nVarG2 : this.g.g();
    }

    @Override // io.sentry.protocol.C4521c
    @Nullable
    public final p h() {
        p pVarH = this.i.h();
        if (pVarH != null) {
            return pVarH;
        }
        p pVarH2 = this.h.h();
        return pVarH2 != null ? pVarH2 : this.g.h();
    }

    @Override // io.sentry.protocol.C4521c
    @Nullable
    public final w i() {
        w wVarI = this.i.i();
        if (wVarI != null) {
            return wVarI;
        }
        w wVarI2 = this.h.i();
        return wVarI2 != null ? wVarI2 : this.g.i();
    }

    @Override // io.sentry.protocol.C4521c
    @Nullable
    public final C3561eO1 j() {
        C3561eO1 c3561eO1J = this.i.j();
        if (c3561eO1J != null) {
            return c3561eO1J;
        }
        C3561eO1 c3561eO1J2 = this.h.j();
        return c3561eO1J2 != null ? c3561eO1J2 : this.g.j();
    }

    @Override // io.sentry.protocol.C4521c
    @NotNull
    public final Enumeration<String> k() {
        return A().d.keys();
    }

    @Override // io.sentry.protocol.C4521c
    @Nullable
    public final Object l(@Nullable String str, @Nullable Object obj) {
        return z().l(str, obj);
    }

    @Override // io.sentry.protocol.C4521c
    public final void m(@Nullable C4521c c4521c) {
        throw null;
    }

    @Override // io.sentry.protocol.C4521c
    @Nullable
    public final Object n(@Nullable String str) {
        return z().n("robot_session");
    }

    @Override // io.sentry.protocol.C4521c
    public final void o(@NotNull C4519a c4519a) {
        z().o(c4519a);
    }

    @Override // io.sentry.protocol.C4521c
    public final void p(@NotNull C4520b c4520b) {
        z().p(c4520b);
    }

    @Override // io.sentry.protocol.C4521c
    public final void q(@NotNull C4523e c4523e) {
        z().q(c4523e);
    }

    @Override // io.sentry.protocol.C4521c
    public final void r(@NotNull C4525g c4525g) {
        throw null;
    }

    @Override // io.sentry.protocol.C4521c
    public final void s(@NotNull j jVar) {
        z().s(jVar);
    }

    @Override // io.sentry.protocol.C4521c, defpackage.BH0
    public final void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        A().serialize(w71, iLogger);
    }

    @Override // io.sentry.protocol.C4521c
    public final void t(@NotNull n nVar) {
        z().t(nVar);
    }

    @Override // io.sentry.protocol.C4521c
    public final void u(@NotNull p pVar) {
        z().u(pVar);
    }

    @Override // io.sentry.protocol.C4521c
    public final void v(@NotNull w wVar) {
        z().v(wVar);
    }

    @Override // io.sentry.protocol.C4521c
    public final void w(@NotNull C c) {
        z().w(c);
    }

    @Override // io.sentry.protocol.C4521c
    public final void x(@NotNull C3561eO1 c3561eO1) {
        z().x(c3561eO1);
    }

    @NotNull
    public final C4521c z() {
        int i = a.a[this.j.ordinal()];
        C4521c c4521c = this.i;
        if (i == 1) {
            return c4521c;
        }
        if (i != 2) {
            return i != 3 ? c4521c : this.g;
        }
        return this.h;
    }
}
