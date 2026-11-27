package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ko0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1387Ko0 extends ML0 implements Function1<C2013So0, Unit> {
    public final /* synthetic */ C1465Lo0 d;
    public final /* synthetic */ C0997Fo0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1387Ko0(C1465Lo0 c1465Lo0, C0997Fo0 c0997Fo0) {
        super(1);
        this.d = c1465Lo0;
        this.e = c0997Fo0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2013So0 c2013So0) {
        C2013So0 it = c2013So0;
        Intrinsics.checkNotNullParameter(it, "it");
        C1465Lo0 c1465Lo0 = this.d;
        InterfaceC5570ni1 interfaceC5570ni1 = c1465Lo0.g;
        C0997Fo0 c0997Fo0 = this.e;
        if (interfaceC5570ni1.l(c0997Fo0.c)) {
            c1465Lo0.B(c0997Fo0.f);
        }
        return Unit.a;
    }
}
