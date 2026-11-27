package defpackage;

/* JADX INFO: renamed from: Ux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2195Ux implements Runnable {
    public final /* synthetic */ C4606j72.a d;
    public final /* synthetic */ int e;

    public RunnableC2195Ux(C4606j72.a aVar, int i) {
        this.d = aVar;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7708xt1.e eVar = this.d.b;
        if (eVar != null) {
            eVar.b(this.e);
        }
    }
}
