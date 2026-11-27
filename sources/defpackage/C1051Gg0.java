package defpackage;

/* JADX INFO: renamed from: Gg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1051Gg0<T, U> extends AbstractC4317i0<T, U> {
    public final C3636ek0.a g;

    /* JADX INFO: renamed from: Gg0$a */
    public static final class a<T, U> extends AbstractC3659er<T, U> {
        public final C3636ek0.a i;

        public a(InterfaceC2913bI interfaceC2913bI, C3636ek0.a aVar) {
            super(interfaceC2913bI);
            this.i = aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.InterfaceC2913bI
        public final boolean c(T t) {
            if (this.h) {
                return false;
            }
            try {
                this.i.getClass();
                Object objCast = Pf2.a.class.cast(t);
                C1589Ne.r(objCast, "The mapper function returned a null value.");
                return this.d.c((Object) objCast);
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.InterfaceC6359rU1
        public final void d(T t) {
            if (this.h) {
                return;
            }
            InterfaceC2913bI<? super R> interfaceC2913bI = this.d;
            try {
                this.i.getClass();
                Object objCast = Pf2.a.class.cast(t);
                C1589Ne.r(objCast, "The mapper function returned a null value.");
                interfaceC2913bI.d((Object) objCast);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // defpackage.InterfaceC4863kM1
        public final U poll() {
            T tPoll = this.g.poll();
            if (tPoll == null) {
                return null;
            }
            this.i.getClass();
            U u = (U) Pf2.a.class.cast(tPoll);
            C1589Ne.r(u, "The mapper function returned a null value.");
            return u;
        }
    }

    /* JADX INFO: renamed from: Gg0$b */
    public static final class b<T, U> extends AbstractC3869fr<T, U> {
        public final C3636ek0.a i;

        public b(InterfaceC1518Mg0 interfaceC1518Mg0, C3636ek0.a aVar) {
            super(interfaceC1518Mg0);
            this.i = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.InterfaceC6359rU1
        public final void d(T t) {
            if (this.h) {
                return;
            }
            InterfaceC1518Mg0 interfaceC1518Mg0 = this.d;
            try {
                this.i.getClass();
                Object objCast = Pf2.a.class.cast(t);
                C1589Ne.r(objCast, "The mapper function returned a null value.");
                interfaceC1518Mg0.d(objCast);
            } catch (Throwable th) {
                C4994l.j(th);
                this.e.cancel();
                a(th);
            }
        }

        @Override // defpackage.InterfaceC4863kM1
        public final U poll() {
            T tPoll = this.g.poll();
            if (tPoll == null) {
                return null;
            }
            this.i.getClass();
            U u = (U) Pf2.a.class.cast(tPoll);
            C1589Ne.r(u, "The mapper function returned a null value.");
            return u;
        }
    }

    public C1051Gg0(C1129Hg0 c1129Hg0, C3636ek0.a aVar) {
        super(c1129Hg0);
        this.g = aVar;
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        boolean z = interfaceC1518Mg0 instanceof InterfaceC2913bI;
        C3636ek0.a aVar = this.g;
        AbstractC7871yg0<T> abstractC7871yg0 = this.e;
        if (z) {
            abstractC7871yg0.g(new a((InterfaceC2913bI) interfaceC1518Mg0, aVar));
        } else {
            abstractC7871yg0.g(new b(interfaceC1518Mg0, aVar));
        }
    }
}
