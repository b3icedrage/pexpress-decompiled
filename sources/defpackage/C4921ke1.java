package defpackage;

import com.api.feature.webpage.screen.WebViewFragment;
import com.base.feature.platform.screens.platform_webview.PlatformFragmentBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ke1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.platform.screens.platform_webview.PlatformFragmentBase$initWebViewClient$1$1", f = "PlatformFragmentBase.kt", l = {68}, m = "invokeSuspend")
public final class C4921ke1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ PlatformFragmentBase<AbstractC2140Ue1> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4921ke1(PlatformFragmentBase<AbstractC2140Ue1> platformFragmentBase, JM<? super C4921ke1> jm) {
        super(2, jm);
        this.e = platformFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4921ke1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4921ke1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        PlatformFragmentBase<AbstractC2140Ue1> platformFragmentBase = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            if (platformFragmentBase.o.a(this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        WebViewFragment.u(platformFragmentBase, true, 2);
        return Unit.a;
    }
}
