package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: xO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7601xO0 implements Function0 {
    public final LO0 d;
    public final FO0 e;

    public C7601xO0(FO0 fo0, LO0 lo0) {
        this.d = lo0;
        this.e = fo0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LO0 lo0 = this.d;
        KE0 ke0 = lo0.a;
        return CollectionsKt.h0(ke0.x.g(this.e.n, lo0));
    }
}
