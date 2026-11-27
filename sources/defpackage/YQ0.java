package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class YQ0 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ YQ0(int i, Object obj, Object obj2) {
        super(1);
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ((EY0) this.e).j((C2717aR0) this.g);
                break;
            default:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((C6370rY0) this.e).c.b((String) this.g, new AbstractC4688jY0.a());
                break;
        }
        return Unit.a;
    }
}
