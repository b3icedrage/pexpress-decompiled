package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class HM1 implements Runnable {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ GM1.c.a e;

    public HM1(GM1.c.a aVar, boolean z) {
        this.e = aVar;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GM1.c.a aVar = this.e;
        aVar.getClass();
        C6177qc2.a();
        GM1.c cVar = GM1.c.this;
        boolean z = cVar.a;
        boolean z2 = this.d;
        cVar.a = z2;
        if (z != z2) {
            cVar.b.a(z2);
        }
    }
}
