package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class R71 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R71(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                YC buildSerialDescriptor = (YC) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C5653o60 c5653o60 = ((T71) this.e).b;
                buildSerialDescriptor.getClass();
                Intrinsics.checkNotNullParameter(c5653o60, "<set-?>");
                buildSerialDescriptor.b = c5653o60;
                break;
            default:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((C5892pE1) this.e).e.c(L70.class).a(it);
                break;
        }
        return Unit.a;
    }
}
