package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: iB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4360iB extends ML0 implements Function1<C3730fB, Unit> {
    public final /* synthetic */ C4618jB d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4360iB(C4618jB c4618jB) {
        super(1);
        this.d = c4618jB;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C3730fB c3730fB) {
        C3730fB it = c3730fB;
        Intrinsics.checkNotNullParameter(it, "it");
        EK1 ek1 = this.d.f;
        long jCurrentTimeMillis = System.currentTimeMillis() + 3600000;
        ek1.getClass();
        ek1.t.b(EK1.z[22], Long.valueOf(jCurrentTimeMillis));
        return Unit.a;
    }
}
