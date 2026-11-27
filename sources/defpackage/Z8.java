package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Z8 extends ML0 implements Function1<C3513e9, Unit> {
    public final /* synthetic */ S8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z8(S8 s8) {
        super(1);
        this.d = s8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C3513e9 c3513e9) {
        C3513e9 state = c3513e9;
        Intrinsics.checkNotNullParameter(state, "state");
        List<C7129v8> list = state.b;
        W11<Boolean> w11 = this.d.j;
        boolean z = false;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C7129v8) it.next()).b instanceof AbstractC3723f9.b) {
                    z = true;
                    break;
                }
            }
        }
        w11.i(Boolean.valueOf(z));
        return Unit.a;
    }
}
