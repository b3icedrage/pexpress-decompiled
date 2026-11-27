package defpackage;

/* JADX INFO: renamed from: er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3659er<T, R> implements InterfaceC2913bI<T>, InterfaceC1145Hl1<R> {
    public final InterfaceC2913bI<? super R> d;
    public InterfaceC6779tU1 e;
    public InterfaceC1145Hl1<T> g;
    public boolean h;

    public AbstractC3659er(InterfaceC2913bI<? super R> interfaceC2913bI) {
        this.d = interfaceC2913bI;
    }

    @Override // defpackage.InterfaceC6359rU1
    public void a(Throwable th) {
        if (this.h) {
            EB1.b(th);
        } else {
            this.h = true;
            this.d.a(th);
        }
    }

    public final void b(Throwable th) {
        C4994l.j(th);
        this.e.cancel();
        a(th);
    }

    @Override // defpackage.InterfaceC6779tU1
    public final void cancel() {
        this.e.cancel();
    }

    @Override // defpackage.InterfaceC4863kM1
    public final void clear() {
        this.g.clear();
    }

    public int e() {
        return 0;
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
        if (EnumC7620xU1.f(this.e, interfaceC6779tU1)) {
            this.e = interfaceC6779tU1;
            if (interfaceC6779tU1 instanceof InterfaceC1145Hl1) {
                this.g = (InterfaceC1145Hl1) interfaceC6779tU1;
            }
            this.d.f(this);
        }
    }

    @Override // defpackage.InterfaceC4863kM1
    public final boolean isEmpty() {
        return this.g.isEmpty();
    }

    @Override // defpackage.InterfaceC4863kM1
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.InterfaceC6359rU1
    public void onComplete() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.d.onComplete();
    }

    @Override // defpackage.InterfaceC6779tU1
    public final void s(long j) {
        this.e.s(j);
    }
}
