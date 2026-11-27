package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: qJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6115qJ extends AbstractC5567nh2 {
    @Override // defpackage.AbstractC5567nh2
    public final void a() {
        Rf2 rf2 = this.d;
        try {
            rf2.b();
        } catch (C6193qg2 e) {
            RQ0 rq0 = rf2.d;
            rq0.b(e);
            for (InterfaceC7873yg2 interfaceC7873yg2 : (ArrayList) rq0.g()) {
                try {
                    interfaceC7873yg2.getClass();
                } catch (Throwable th) {
                    rq0.a(interfaceC7873yg2, th);
                }
            }
        }
    }
}
