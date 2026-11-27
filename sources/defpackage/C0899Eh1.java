package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Eh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0899Eh1 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0899Eh1(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                C1717Ot1.a aVar = C1717Ot1.e;
                Unit unit = Unit.a;
                ((C6251qy) obj2).resumeWith(unit);
                return unit;
            default:
                InterfaceC1023Fx it = (InterfaceC1023Fx) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                AbstractC7971z80 this_asFactory = (AbstractC7971z80) ((VI1) obj2).d;
                Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
                Intrinsics.checkNotNullParameter(it, "it");
                return this_asFactory;
        }
    }
}
