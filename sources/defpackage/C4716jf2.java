package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.screens.vpninstruction.VpnInstructionViewModelBase$initVpnAdapter$1", f = "VpnInstructionViewModelBase.kt", l = {20}, m = "invokeSuspend")
public final class C4716jf2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public C4248hf2 d;
    public int e;
    public final /* synthetic */ C4248hf2 g;
    public final /* synthetic */ C4926kf2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4716jf2(C4248hf2 c4248hf2, C4926kf2 c4926kf2, JM jm) {
        super(2, jm);
        this.g = c4248hf2;
        this.h = c4926kf2;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4716jf2(this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4716jf2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        C4248hf2 c4248hf2;
        MN mn = MN.d;
        int i = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            C4248hf2 c4248hf3 = this.g;
            InterfaceC5136lf2 interfaceC5136lf2 = this.h.d;
            this.d = c4248hf3;
            this.e = 1;
            Serializable serializableA = interfaceC5136lf2.a(this);
            if (serializableA == mn) {
                return mn;
            }
            c4248hf2 = c4248hf3;
            obj = serializableA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4248hf2 = this.d;
            C1795Pt1.b(obj);
        }
        c4248hf2.p((List) obj);
        return Unit.a;
    }
}
