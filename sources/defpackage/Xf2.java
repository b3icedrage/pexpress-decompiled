package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketBestSelectorBase$checkTimeForAllConnections$2$1", f = "WebSocketBestSelectorBase.kt", l = {78}, m = "invokeSuspend")
public final class Xf2 extends AW1 implements Function2<KN, JM<? super C5686oG>, Object> {
    public int d;
    public final /* synthetic */ Zf2 e;
    public final /* synthetic */ C5686oG g;
    public final /* synthetic */ List<InterfaceC7414wW<C5686oG>> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xf2(Zf2 zf2, C5686oG c5686oG, List<InterfaceC7414wW<C5686oG>> list, JM<? super Xf2> jm) {
        super(2, jm);
        this.e = zf2;
        this.g = c5686oG;
        this.h = list;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new Xf2(this.e, this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super C5686oG> jm) {
        return ((Xf2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            Zf2 zf2 = this.e;
            C6251qy c6251qy = new C6251qy(1, C5885pC0.b(this));
            c6251qy.r();
            List<InterfaceC7414wW<C5686oG>> list = this.h;
            C5686oG c5686oG = this.g;
            Wf2 wf2 = new Wf2(c5686oG, zf2, c6251qy, list);
            C4543is1.a aVar = new C4543is1.a();
            aVar.h(c5686oG.a);
            aVar.a("Origin", zf2.b.a());
            C4543is1 c4543is1B = aVar.b();
            C6711t81.a aVar2 = new C6711t81.a();
            Vf2 hostnameVerifier = new Vf2();
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!hostnameVerifier.equals(aVar2.t)) {
                aVar2.B = null;
            }
            aVar2.t = hostnameVerifier;
            new C6711t81(aVar2).d(c4543is1B, wf2);
            obj = c6251qy.q();
            if (obj == mn) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        C5686oG c5686oG2 = (C5686oG) obj;
        if (c5686oG2 != null) {
            return c5686oG2;
        }
        return null;
    }
}
