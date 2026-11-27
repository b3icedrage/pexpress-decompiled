package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: Im1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1226Im1 extends ML0 implements Function1<C1774Pm1, Boolean> {
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226Im1(String str) {
        super(1);
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C1774Pm1 c1774Pm1) {
        C1774Pm1 it = c1774Pm1;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!StringsKt.I(this.d));
    }
}
