package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Te1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.platform.screens.platform_webview.PlatformViewModelBase$downloadOrOpenApp$1", f = "PlatformViewModelBase.kt", l = {139}, m = "invokeSuspend")
public final class C2062Te1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC2140Ue1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2062Te1(AbstractC2140Ue1 abstractC2140Ue1, JM<? super C2062Te1> jm) {
        super(2, jm);
        this.e = abstractC2140Ue1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2062Te1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2062Te1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            YX yx = this.e.m;
            this.d = 1;
            if (yx.c(this) == mn) {
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
