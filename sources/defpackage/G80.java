package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class G80 extends Thread {
    public final /* synthetic */ K80 d;

    public G80(K80 k80) {
        this.d = k80;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        K80 k80 = this.d;
        k80.c.l(null);
        k80.b.l(null);
        k80.h = false;
    }
}
