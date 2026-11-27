package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6200qi1 extends ML0 implements Function1<C6619si1, Unit> {
    public final /* synthetic */ C6409ri1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6200qi1(C6409ri1 c6409ri1) {
        super(1);
        this.d = c6409ri1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C6619si1 c6619si1) {
        C6619si1 state = c6619si1;
        Intrinsics.checkNotNullParameter(state, "state");
        EK1 ek1 = this.d.f;
        String str = state.a;
        ek1.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        ek1.b.b(EK1.z[1], str);
        return Unit.a;
    }
}
