package defpackage;

import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: se1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$showOnSelectedAccount$2$1", f = "PlatformFragmentImpl.kt", l = {172}, m = "invokeSuspend")
public final class C6603se1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ PlatformFragmentImpl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6603se1(PlatformFragmentImpl platformFragmentImpl, JM<? super C6603se1> jm) {
        super(2, jm);
        this.e = platformFragmentImpl;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6603se1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6603se1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C1621Nn1 c1621Nn1 = this.e.x.i;
            this.d = 1;
            if (C4466ii.o(c1621Nn1, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
