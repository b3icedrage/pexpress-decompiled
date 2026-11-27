package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Cg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0739Cg0<T> extends AbstractC4317i0<T, T> {
    public final C7173vM g;
    public final C3636ek0.d h;
    public final C3636ek0.b i;

    /* JADX INFO: renamed from: Cg0$a */
    public static final class a<T> implements InterfaceC1518Mg0<T>, InterfaceC6779tU1 {
        public final InterfaceC1518Mg0 d;
        public final C7173vM e;
        public final C3636ek0.d g;
        public final C3636ek0.b h;
        public InterfaceC6779tU1 i;

        public a(InterfaceC1518Mg0 interfaceC1518Mg0, C7173vM c7173vM, C3636ek0.d dVar, C3636ek0.b bVar) {
            this.d = interfaceC1518Mg0;
            this.e = c7173vM;
            this.h = bVar;
            this.g = dVar;
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void a(Throwable th) {
            if (this.i != EnumC7620xU1.d) {
                this.d.a(th);
            } else {
                EB1.b(th);
            }
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void cancel() {
            try {
                this.h.getClass();
            } catch (Throwable th) {
                C4994l.j(th);
                EB1.b(th);
            }
            this.i.cancel();
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void d(T t) {
            this.d.d(t);
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
            InterfaceC1518Mg0 interfaceC1518Mg0 = this.d;
            try {
                C7173vM c7173vM = this.e;
                c7173vM.getClass();
                F81 f81 = (F81) c7173vM.d;
                C6921u81 c6921u81 = f81.c;
                G81 webSocketListener = f81.b;
                Intrinsics.checkNotNullParameter(webSocketListener, "webSocketListener");
                c6921u81.a.d(c6921u81.b.a(), webSocketListener);
                if (EnumC7620xU1.f(this.i, interfaceC6779tU1)) {
                    this.i = interfaceC6779tU1;
                    interfaceC1518Mg0.f(this);
                }
            } catch (Throwable th) {
                C4994l.j(th);
                interfaceC6779tU1.cancel();
                this.i = EnumC7620xU1.d;
                interfaceC1518Mg0.f(EnumC7332w60.d);
                interfaceC1518Mg0.a(th);
            }
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void onComplete() {
            if (this.i != EnumC7620xU1.d) {
                this.d.onComplete();
            }
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void s(long j) {
            try {
                this.g.getClass();
            } catch (Throwable th) {
                C4994l.j(th);
                EB1.b(th);
            }
            this.i.s(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0739Cg0(C1207Ig0 c1207Ig0, C7173vM c7173vM) {
        super(c1207Ig0);
        C3636ek0.d dVar = C3636ek0.e;
        C3636ek0.b bVar = C3636ek0.c;
        this.g = c7173vM;
        this.h = dVar;
        this.i = bVar;
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        this.e.g(new a(interfaceC1518Mg0, this.g, this.h, this.i));
    }
}
