package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: nh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5567nh2 extends Thread {
    public final Rf2 d;
    public final KY1 e;

    public AbstractC5567nh2(String str, Rf2 rf2, KY1 ky1) {
        super(str);
        this.d = rf2;
        this.e = ky1;
    }

    public abstract void a();

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        RQ0 rq0 = this.d.d;
        if (rq0 != null) {
            for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) rq0.g()) {
                try {
                    interfaceC7873yg2.getClass();
                } catch (Throwable th) {
                    rq0.a(interfaceC7873yg2, th);
                }
            }
        }
        a();
        if (rq0 != null) {
            for (InterfaceC7873yg2 interfaceC7873yg3 : (ArrayList) rq0.g()) {
                try {
                    interfaceC7873yg3.getClass();
                } catch (Throwable th2) {
                    rq0.a(interfaceC7873yg3, th2);
                }
            }
        }
    }
}
