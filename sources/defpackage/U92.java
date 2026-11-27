package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class U92 extends ML0 implements Function1<String, Unit> {
    public final /* synthetic */ EY0 d;
    public final /* synthetic */ V92 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U92(EY0 ey0, V92 v92) {
        super(1);
        this.d = ey0;
        this.e = v92;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        this.d.j(this.e);
        return Unit.a;
    }
}
