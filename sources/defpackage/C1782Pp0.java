package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1782Pp0 implements KN, Closeable {
    public static final /* synthetic */ AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(C1782Pp0.class, "closed");

    @NotNull
    private volatile /* synthetic */ int closed;

    @NotNull
    public final InterfaceC2514Yp0 d;
    public final boolean e;

    @NotNull
    public final C2684aG0 g;

    @NotNull
    public final CoroutineContext h;

    @NotNull
    public final C4539ir0 i;

    @NotNull
    public final C6440rr0 j;

    @NotNull
    public final C7491wr0 k;

    @NotNull
    public final C2175Uq0 l;

    @NotNull
    public final YH m;

    @NotNull
    public final X80 n;

    @NotNull
    public final C2332Wp0<C4077gq0> o;

    /* JADX INFO: renamed from: Pp0$a */
    public static final class a extends ML0 implements Function1<Throwable, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            if (th != null) {
                LN.c(C1782Pp0.this.d, null);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Pp0$b */
    @InterfaceC3368dU(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", l = {144, 146}, m = "invokeSuspend")
    public static final class b extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<Object, C3032br0>, Object, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ AbstractC1121Hd1 e;
        public /* synthetic */ Object g;

        public b(JM<? super b> jm) {
            super(3, jm);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        
            if (r3.d(r8, r1) == r0) goto L18;
         */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                MN r0 = defpackage.MN.d
                int r1 = r8.d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                defpackage.C1795Pt1.b(r9)
                goto L6a
            L10:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L18:
                java.lang.Object r1 = r8.g
                Hd1 r3 = r8.e
                defpackage.C1795Pt1.b(r9)
                goto L48
            L20:
                defpackage.C1795Pt1.b(r9)
                Hd1 r9 = r8.e
                java.lang.Object r1 = r8.g
                boolean r4 = r1 instanceof defpackage.C2250Vp0
                if (r4 == 0) goto L6d
                Pp0 r4 = defpackage.C1782Pp0.this
                Uq0 r4 = r4.l
                kotlin.Unit r5 = kotlin.Unit.a
                r6 = r1
                Vp0 r6 = (defpackage.C2250Vp0) r6
                mr0 r6 = r6.d()
                r8.e = r9
                r8.g = r1
                r8.d = r3
                java.lang.Object r3 = r4.a(r5, r6, r8)
                if (r3 != r0) goto L45
                goto L69
            L45:
                r7 = r3
                r3 = r9
                r9 = r7
            L48:
                mr0 r9 = (defpackage.AbstractC5391mr0) r9
                r4 = r1
                Vp0 r4 = (defpackage.C2250Vp0) r4
                r4.getClass()
                java.lang.String r5 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)
                java.lang.String r5 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)
                r4.g = r9
                r9 = 0
                r8.e = r9
                r8.g = r9
                r8.d = r2
                java.lang.Object r9 = r3.d(r8, r1)
                if (r9 != r0) goto L6a
            L69:
                return r0
            L6a:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            L6d:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                java.lang.String r0 = "Error: HttpClientCall expected, but found "
                r9.<init>(r0)
                r9.append(r1)
                r0 = 40
                r9.append(r0)
                java.lang.Class r0 = r1.getClass()
                Vp1 r1 = defpackage.C2017Sp1.a
                RI0 r0 = r1.b(r0)
                r9.append(r0)
                java.lang.String r0 = ")."
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C1782Pp0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(AbstractC1121Hd1<Object, C3032br0> abstractC1121Hd1, Object obj, JM<? super Unit> jm) {
            b bVar = C1782Pp0.this.new b(jm);
            bVar.e = abstractC1121Hd1;
            bVar.g = obj;
            return bVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: Pp0$c */
    public static final class c extends ML0 implements Function1<C1782Pp0, Unit> {
        public static final c d = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C1782Pp0 c1782Pp0) {
            C1782Pp0 install = c1782Pp0;
            Intrinsics.checkNotNullParameter(install, "$this$install");
            FS0 fs0 = C5524nW.a;
            Intrinsics.checkNotNullParameter(install, "<this>");
            install.i.f(C4539ir0.i, new C5101lW(3, null));
            C1277Jd1 c1277Jd1 = C6440rr0.g;
            C5314mW c5314mW = new C5314mW(3, null);
            C6440rr0 c6440rr0 = install.j;
            c6440rr0.f(c1277Jd1, c5314mW);
            Intrinsics.checkNotNullParameter(install, "<this>");
            c6440rr0.f(c1277Jd1, new C5944pW(3, null));
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: Pp0$d */
    @InterfaceC3368dU(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", l = {177}, m = "invokeSuspend")
    public static final class d extends AW1 implements InterfaceC1060Gj0<AbstractC1121Hd1<C5601nr0, C2250Vp0>, C5601nr0, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ AbstractC1121Hd1 e;

        public d(JM<? super d> jm) {
            super(3, jm);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            AbstractC1121Hd1 abstractC1121Hd1;
            Throwable cause;
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC1121Hd1 = this.e;
                try {
                    C1795Pt1.b(obj);
                    return Unit.a;
                } catch (Throwable th) {
                    cause = th;
                    X80 x80 = C1782Pp0.this.n;
                    C4466ii c4466ii = ED.h;
                    AbstractC5391mr0 response = ((C2250Vp0) abstractC1121Hd1.d).d();
                    Intrinsics.checkNotNullParameter(response, "response");
                    Intrinsics.checkNotNullParameter(cause, "cause");
                    x80.a(c4466ii);
                    throw cause;
                }
            }
            C1795Pt1.b(obj);
            AbstractC1121Hd1 abstractC1121Hd2 = this.e;
            try {
                this.e = abstractC1121Hd2;
                this.d = 1;
                if (abstractC1121Hd2.c(this) == mn) {
                    return mn;
                }
                return Unit.a;
            } catch (Throwable th2) {
                abstractC1121Hd1 = abstractC1121Hd2;
                cause = th2;
                X80 x81 = C1782Pp0.this.n;
                C4466ii c4466ii2 = ED.h;
                AbstractC5391mr0 response2 = ((C2250Vp0) abstractC1121Hd1.d).d();
                Intrinsics.checkNotNullParameter(response2, "response");
                Intrinsics.checkNotNullParameter(cause, "cause");
                x81.a(c4466ii2);
                throw cause;
            }
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(AbstractC1121Hd1<C5601nr0, C2250Vp0> abstractC1121Hd1, C5601nr0 c5601nr0, JM<? super Unit> jm) {
            d dVar = C1782Pp0.this.new d(jm);
            dVar.e = abstractC1121Hd1;
            return dVar.invokeSuspend(Unit.a);
        }
    }

    public C1782Pp0() {
        throw null;
    }

    public C1782Pp0(@NotNull InterfaceC2514Yp0 engine, @NotNull C2332Wp0 other) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(other, "userConfig");
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(other, "userConfig");
        this.d = engine;
        this.closed = 0;
        C2684aG0 c2684aG0 = new C2684aG0((XF0) engine.getE().p(XF0.a.d));
        this.g = c2684aG0;
        this.h = engine.getE().t(c2684aG0);
        this.i = new C4539ir0(other.g);
        this.j = new C6440rr0(other.g);
        C7491wr0 c7491wr0 = new C7491wr0(other.g);
        this.k = c7491wr0;
        this.l = new C2175Uq0(other.g);
        this.m = new YH();
        this.n = new X80();
        C2332Wp0<C4077gq0> c2332Wp0 = new C2332Wp0<>();
        this.o = c2332Wp0;
        if (this.e) {
            c2684aG0.W(new a());
        }
        engine.N0(this);
        c7491wr0.f(C7491wr0.j, new b(null));
        C3660er0.a aVar = C3660er0.a;
        C4561iz c4561iz = C4561iz.g;
        c2332Wp0.a(aVar, c4561iz);
        c2332Wp0.a(C5816ot.a, c4561iz);
        if (other.f) {
            c block = c.d;
            Intrinsics.checkNotNullParameter("DefaultTransformers", "key");
            Intrinsics.checkNotNullParameter(block, "block");
            c2332Wp0.c.put("DefaultTransformers", block);
        }
        c2332Wp0.a(C6860tr0.b, c4561iz);
        C1390Kp0.a aVar2 = C1390Kp0.d;
        c2332Wp0.a(aVar2, c4561iz);
        if (other.e) {
            c2332Wp0.a(C2253Vq0.a, c4561iz);
        }
        Intrinsics.checkNotNullParameter(other, "other");
        c2332Wp0.e = other.e;
        c2332Wp0.f = other.f;
        c2332Wp0.a.putAll(other.a);
        c2332Wp0.b.putAll(other.b);
        c2332Wp0.c.putAll(other.c);
        if (other.f) {
            c2332Wp0.a(C1707Oq0.d, c4561iz);
        }
        C2498Yk<Unit> c2498Yk = NV.a;
        Intrinsics.checkNotNullParameter(c2332Wp0, "<this>");
        MV block2 = new MV(1);
        FS0 fs0 = C1704Op0.a;
        Intrinsics.checkNotNullParameter(c2332Wp0, "<this>");
        Intrinsics.checkNotNullParameter(block2, "block");
        c2332Wp0.a(aVar2, block2);
        Intrinsics.checkNotNullParameter(this, "client");
        Iterator it = c2332Wp0.a.values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this);
        }
        Iterator it2 = c2332Wp0.c.values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(this);
        }
        this.j.f(C6440rr0.f, new d(null));
        this.e = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull C3032br0 c3032br0, @NotNull LM lm) {
        C1860Qp0 c1860Qp0;
        if (lm instanceof C1860Qp0) {
            c1860Qp0 = (C1860Qp0) lm;
            int i = c1860Qp0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1860Qp0.g = i - Integer.MIN_VALUE;
            } else {
                c1860Qp0 = new C1860Qp0(this, lm);
            }
        } else {
            c1860Qp0 = new C1860Qp0(this, lm);
        }
        Object objA = c1860Qp0.d;
        MN mn = MN.d;
        int i2 = c1860Qp0.g;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            this.n.a(ED.d);
            Object obj = c3032br0.d;
            c1860Qp0.g = 1;
            objA = this.i.a(c3032br0, obj, c1860Qp0);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objA);
        }
        Intrinsics.c(objA, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (C2250Vp0) objA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (p.compareAndSet(this, 0, 1)) {
            InterfaceC2576Zk interfaceC2576Zk = (InterfaceC2576Zk) this.m.f(C4965kq0.a);
            Iterator<T> it = interfaceC2576Zk.c().iterator();
            while (it.hasNext()) {
                C2498Yk c2498Yk = (C2498Yk) it.next();
                Intrinsics.c(c2498Yk, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objF = interfaceC2576Zk.f(c2498Yk);
                if (objF instanceof Closeable) {
                    ((Closeable) objF).close();
                }
            }
            this.g.X();
            if (this.e) {
                this.d.close();
            }
        }
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.h;
    }

    @NotNull
    public final String toString() {
        return "HttpClient[" + this.d + ']';
    }
}
