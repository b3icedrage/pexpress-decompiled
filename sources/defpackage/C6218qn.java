package defpackage;

/* JADX INFO: renamed from: qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6218qn implements K71<AbstractC5713oP.e.d.a.b.AbstractC0460b> {
    public static final C6218qn a = new C6218qn();
    public static final C6175qc0 b = C6175qc0.a("type");
    public static final C6175qc0 c = C6175qc0.a("reason");
    public static final C6175qc0 d = C6175qc0.a("frames");
    public static final C6175qc0 e = C6175qc0.a("causedBy");
    public static final C6175qc0 f = C6175qc0.a("overflowCount");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.e.d.a.b.AbstractC0460b abstractC0460b = (AbstractC5713oP.e.d.a.b.AbstractC0460b) obj;
        L71 l72 = l71;
        l72.a(b, abstractC0460b.e());
        l72.a(c, abstractC0460b.d());
        l72.a(d, abstractC0460b.b());
        l72.a(e, abstractC0460b.a());
        l72.e(f, abstractC0460b.c());
    }
}
