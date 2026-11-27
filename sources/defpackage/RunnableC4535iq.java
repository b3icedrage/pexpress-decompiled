package defpackage;

/* JADX INFO: renamed from: iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4535iq implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC4535iq(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                AbstractC6558sR abstractC6558sR = (AbstractC6558sR) this.e;
                C4454ie2 c4454ie2 = abstractC6558sR.w;
                c4454ie2.b.set(0.0f, 0.0f, c4454ie2.c - 0.0f, c4454ie2.d - 60.0f);
                B42 b42 = abstractC6558sR.h0;
                abstractC6558sR.d0.getClass();
                b42.g();
                B42 b43 = abstractC6558sR.g0;
                abstractC6558sR.c0.getClass();
                b43.g();
                abstractC6558sR.k();
                break;
            default:
                C0682Bn0.a((C6251qy) this.e);
                break;
        }
    }
}
