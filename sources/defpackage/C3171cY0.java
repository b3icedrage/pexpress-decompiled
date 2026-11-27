package defpackage;

/* JADX INFO: renamed from: cY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3171cY0<T, R> extends E0<T, R> {
    public final InterfaceC0748Cj0<? super T, ? extends R> e;

    /* JADX INFO: renamed from: cY0$a */
    public static final class a<T, R> implements InterfaceC3381dY0<T>, InterfaceC7316w20 {
        public final Object d;
        public final InterfaceC0748Cj0<? super T, ? extends R> e;
        public InterfaceC7316w20 g;

        public a(InterfaceC3381dY0<? super R> interfaceC3381dY0, InterfaceC0748Cj0<? super T, ? extends R> interfaceC0748Cj0) {
            this.d = interfaceC3381dY0;
            this.e = interfaceC0748Cj0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [dY0, java.lang.Object] */
        @Override // defpackage.InterfaceC3381dY0
        public final void a(Throwable th) {
            this.d.a(th);
        }

        @Override // defpackage.InterfaceC7316w20
        public final void b() {
            InterfaceC7316w20 interfaceC7316w20 = this.g;
            this.g = B20.d;
            interfaceC7316w20.b();
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [dY0, java.lang.Object] */
        @Override // defpackage.InterfaceC3381dY0
        public final void c(InterfaceC7316w20 interfaceC7316w20) {
            if (this.g != null) {
                interfaceC7316w20.b();
                EB1.b(new C1376Kk1("Disposable already set!"));
            } else {
                this.g = interfaceC7316w20;
                this.d.c(this);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [dY0, java.lang.Object] */
        @Override // defpackage.InterfaceC3381dY0
        public final void onComplete() {
            this.d.onComplete();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [dY0, java.lang.Object] */
        @Override // defpackage.InterfaceC3381dY0
        public final void onSuccess(T t) {
            ?? r0 = this.d;
            try {
                R rApply = this.e.apply(t);
                C1589Ne.r(rApply, "The mapper returned a null item");
                r0.onSuccess(rApply);
            } catch (Throwable th) {
                C4994l.j(th);
                r0.a(th);
            }
        }
    }

    public C3171cY0(YX0 yx0, InterfaceC0748Cj0 interfaceC0748Cj0) {
        super(yx0);
        this.e = interfaceC0748Cj0;
    }

    @Override // defpackage.YX0
    public final void b(InterfaceC3381dY0<? super R> interfaceC3381dY0) {
        this.d.a(new a(interfaceC3381dY0, this.e));
    }
}
