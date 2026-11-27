package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: x42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7537x42 extends ML0 implements Function1 {
    public final /* synthetic */ EY0 d;
    public final /* synthetic */ InterfaceC1608Nj0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7537x42(InterfaceC1608Nj0 interfaceC1608Nj0, EY0 ey0) {
        super(1);
        this.d = ey0;
        this.e = interfaceC1608Nj0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.d.k(this.e.apply(obj));
        return Unit.a;
    }
}
