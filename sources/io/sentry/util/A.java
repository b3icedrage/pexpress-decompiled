package io.sentry.util;

import defpackage.C2171Up;
import defpackage.C2249Vp;
import defpackage.C2647a51;
import defpackage.C2688aH1;
import defpackage.C3561eO1;
import defpackage.C4401iO1;
import defpackage.C5364mj1;
import defpackage.C6398rf2;
import defpackage.C7160vH1;
import defpackage.InterfaceC1015Fu0;
import defpackage.InterfaceC1171Hu0;
import defpackage.InterfaceC2347Wu0;
import defpackage.MD1;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class A {

    public static final class a {

        @Nullable
        public C5364mj1 a;
    }

    public static final class b {

        @NotNull
        public final C7160vH1 a;

        @Nullable
        public final C2249Vp b;

        @Nullable
        public final C6398rf2 c;

        public b(@NotNull C7160vH1 c7160vH1, @Nullable C2249Vp c2249Vp, @Nullable C6398rf2 c6398rf2) {
            this.a = c7160vH1;
            this.b = c2249Vp;
            this.c = c6398rf2;
        }
    }

    @NotNull
    public static C2171Up a(@Nullable C2171Up c2171Up, @Nullable Boolean bool, @Nullable Double d, @Nullable Double d2) {
        if (c2171Up == null) {
            c2171Up = new C2171Up(C2647a51.a);
        }
        if (c2171Up.d == null) {
            Double d3 = c2171Up.c;
            if (d3 != null) {
                d = d3;
            }
            Double dB = u.b(d2, d, bool);
            if (c2171Up.f) {
                c2171Up.d = dB;
            }
        }
        if (c2171Up.f && c2171Up.g) {
            c2171Up.f = false;
        }
        return c2171Up;
    }

    @Nullable
    public static b b(@NotNull InterfaceC1171Hu0 interfaceC1171Hu0, @NotNull String str, @Nullable List<String> list, @Nullable InterfaceC2347Wu0 interfaceC2347Wu0) {
        C2688aH1 c2688aH1P = interfaceC1171Hu0.p();
        C6398rf2 c6398rf2 = null;
        if (c2688aH1P.isTraceSampling() && s.a(str, c2688aH1P.getTracePropagationTargets())) {
            final C2688aH1 c2688aH1P2 = interfaceC1171Hu0.p();
            if (interfaceC2347Wu0 != null && !interfaceC2347Wu0.j()) {
                C7160vH1 c7160vH1D = interfaceC2347Wu0.d();
                C2249Vp c2249VpK = interfaceC2347Wu0.k(list);
                if (c2688aH1P2.isPropagateTraceparent()) {
                    C3561eO1 c3561eO1W = interfaceC2347Wu0.w();
                    c6398rf2 = new C6398rf2(c3561eO1W.d, c3561eO1W.e, c7160vH1D.c);
                }
                return new b(c7160vH1D, c2249VpK, c6398rf2);
            }
            final a aVar = new a();
            aVar.a = null;
            interfaceC1171Hu0.y(new MD1() { // from class: io.sentry.util.y
                @Override // defpackage.MD1
                public final void e(InterfaceC1015Fu0 interfaceC1015Fu0) {
                    aVar.a = interfaceC1015Fu0.M(new z(interfaceC1015Fu0, c2688aH1P2));
                }
            });
            C5364mj1 c5364mj1 = aVar.a;
            if (c5364mj1 != null) {
                C2249Vp c2249VpA = C2249Vp.a(c5364mj1.c, list);
                io.sentry.protocol.u uVar = c5364mj1.a;
                C4401iO1 c4401iO1 = c5364mj1.b;
                return new b(new C7160vH1(uVar, c4401iO1, null), c2249VpA, c2688aH1P2.isPropagateTraceparent() ? new C6398rf2(uVar, c4401iO1, null) : null);
            }
        }
        return null;
    }
}
