package defpackage;

/* JADX INFO: renamed from: f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3715f7 implements Runnable {
    public final /* synthetic */ C4345i7.a d;
    public final /* synthetic */ Object e;

    public RunnableC3715f7(C4345i7.a aVar, Object obj) {
        this.d = aVar;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.d = this.e;
    }
}
