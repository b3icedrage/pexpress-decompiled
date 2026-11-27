package defpackage;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class KU1 implements InterfaceC6027pt0 {
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final LinkedBlockingQueue<LU1> g = new LinkedBlockingQueue<>();

    @Override // defpackage.InterfaceC6027pt0
    public final synchronized FS0 d(String str) {
        JU1 ju1;
        ju1 = (JU1) this.e.get(str);
        if (ju1 == null) {
            ju1 = new JU1(str, this.g, this.d);
            this.e.put(str, ju1);
        }
        return ju1;
    }
}
