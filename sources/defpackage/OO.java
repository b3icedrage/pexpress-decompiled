package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class OO implements Runnable {
    public final /* synthetic */ RO d;

    public OO(RO ro) {
        this.d = ro;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ThreadLocal) this.d.d).set(Boolean.TRUE);
    }
}
