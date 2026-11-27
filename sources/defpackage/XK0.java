package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class XK0 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ XK0(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ((InterfaceC1101Gx) this.e).cancel();
                break;
            default:
                ((Boolean) obj).getClass();
                ((C5892pE1) this.e).e.c(C6954uJ.class).j();
                break;
        }
        return Unit.a;
    }
}
