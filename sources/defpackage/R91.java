package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class R91 implements P91 {
    public final W11<P91.a> c = new W11<>();
    public final C6117qJ1<P91.a.c> d = new C6117qJ1<>();

    public R91() {
        a(P91.b);
    }

    public final void a(@NonNull P91.a aVar) {
        this.c.i(aVar);
        boolean z = aVar instanceof P91.a.c;
        C6117qJ1<P91.a.c> c6117qJ1 = this.d;
        if (z) {
            c6117qJ1.j((P91.a.c) aVar);
        } else if (aVar instanceof P91.a.C0114a) {
            c6117qJ1.k(((P91.a.C0114a) aVar).a);
        }
    }
}
