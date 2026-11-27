package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Ec2 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Ec2(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ((A20) this.e).b();
                break;
            default:
                InterfaceC2347Wu0 it = (InterfaceC2347Wu0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                it.i((IOException) this.e);
                it.o(EnumC4869kO1.INTERNAL_ERROR);
                break;
        }
        return Unit.a;
    }
}
