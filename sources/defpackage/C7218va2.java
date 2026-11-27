package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: va2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7218va2 implements JW1.a {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C7218va2(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // JW1.a
    public final Object c() {
        switch (this.d) {
            case 0:
                ((C7639xa2) this.e).i.c();
                break;
            default:
                C4058gk2 c4058gk2 = (C4058gk2) this.e;
                Iterator<V42> it = c4058gk2.b.f0().iterator();
                while (it.hasNext()) {
                    c4058gk2.c.a(it.next(), 1);
                }
                break;
        }
        return null;
    }
}
