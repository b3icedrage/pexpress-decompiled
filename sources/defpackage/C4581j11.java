package defpackage;

/* JADX INFO: renamed from: j11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4581j11<T> implements WM<AbstractC1091Gt1, T> {
    public static final C1802Pw b;
    public final AbstractC5897pG0<T> a;

    static {
        C1802Pw c1802Pw = C1802Pw.h;
        b = C1802Pw.a.b("EFBBBF");
    }

    public C4581j11(AbstractC5897pG0<T> abstractC5897pG0) {
        this.a = abstractC5897pG0;
    }

    @Override // defpackage.WM
    public final Object a(AbstractC1091Gt1 abstractC1091Gt1) {
        AbstractC1091Gt1 abstractC1091Gt2 = abstractC1091Gt1;
        InterfaceC2833av interfaceC2833avK = abstractC1091Gt2.k();
        try {
            C1802Pw c1802Pw = b;
            if (interfaceC2833avK.U(0L, c1802Pw)) {
                interfaceC2833avK.r(c1802Pw.d.length);
            }
            SH0 sh0 = new SH0(interfaceC2833avK);
            T tA = this.a.a(sh0);
            if (sh0.k() != AbstractC8000zH0.b.n) {
                throw new EG0("JSON document was not fully consumed.");
            }
            abstractC1091Gt2.close();
            return tA;
        } catch (Throwable th) {
            abstractC1091Gt2.close();
            throw th;
        }
    }
}
