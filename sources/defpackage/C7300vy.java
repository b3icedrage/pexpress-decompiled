package defpackage;

/* JADX INFO: renamed from: vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C7300vy {
    public boolean a;
    public a b;
    public boolean c;

    /* JADX INFO: renamed from: vy$a */
    public interface a {
        void a();
    }

    public final void a(a aVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.b == aVar) {
                return;
            }
            this.b = aVar;
            if (this.a) {
                aVar.a();
            }
        }
    }
}
