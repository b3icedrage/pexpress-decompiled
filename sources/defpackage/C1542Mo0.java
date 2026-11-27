package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Mo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1542Mo0 extends ML0 implements Function1<C2013So0, Boolean> {
    public final /* synthetic */ C1465Lo0 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1542Mo0(long j, C1465Lo0 c1465Lo0) {
        super(1);
        this.d = c1465Lo0;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C2013So0 c2013So0) {
        C2013So0 it = c2013So0;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(this.d.h.get(Long.valueOf(this.e)) != null);
    }
}
