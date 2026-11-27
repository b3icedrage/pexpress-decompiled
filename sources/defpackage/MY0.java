package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class MY0 implements Function0 {
    public final OY0 d;
    public final AbstractC6208qk1 e;
    public final AbstractC0673Bk0.c g;
    public final EnumC0804Dc h;
    public final int i;
    public final C5155lk1 j;

    public MY0(OY0 oy0, AbstractC6208qk1 abstractC6208qk1, AbstractC0673Bk0.c cVar, EnumC0804Dc enumC0804Dc, int i, C5155lk1 c5155lk1) {
        this.d = oy0;
        this.e = abstractC6208qk1;
        this.g = cVar;
        this.h = enumC0804Dc;
        this.i = i;
        this.j = c5155lk1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt.e0(this.d.a.a.e.h(this.e, this.g, this.h, this.i, this.j));
    }
}
