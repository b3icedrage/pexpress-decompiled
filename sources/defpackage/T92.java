package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class T92 extends ML0 implements Function1<Object, Unit> {
    public final /* synthetic */ EY0 d;
    public final /* synthetic */ V92 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T92(EY0 ey0, V92 v92) {
        super(1);
        this.d = ey0;
        this.e = v92;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.d.j(this.e);
        return Unit.a;
    }
}
