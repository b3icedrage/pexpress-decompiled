package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: ch0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3205ch0 implements InterfaceC3760fL<C3415dh0.a> {
    public final /* synthetic */ String a;

    public C3205ch0(String str) {
        this.a = str;
    }

    @Override // defpackage.InterfaceC3760fL
    public final void a(C3415dh0.a aVar) {
        C3415dh0.a aVar2 = aVar;
        synchronized (C3415dh0.c) {
            try {
                C2703aM1<String, ArrayList<InterfaceC3760fL<C3415dh0.a>>> c2703aM1 = C3415dh0.d;
                ArrayList<InterfaceC3760fL<C3415dh0.a>> orDefault = c2703aM1.getOrDefault(this.a, null);
                if (orDefault == null) {
                    return;
                }
                c2703aM1.remove(this.a);
                for (int i = 0; i < orDefault.size(); i++) {
                    orDefault.get(i).a(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
