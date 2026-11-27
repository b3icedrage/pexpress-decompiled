package defpackage;

import com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase$requestCameraThenLaunch$1", f = "WebViewFileChooserUseCaseBase.kt", l = {181}, m = "invokeSuspend")
public final class Sh2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ WebViewFileChooserUseCaseBase e;
    public final /* synthetic */ Mf2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sh2(WebViewFileChooserUseCaseBase webViewFileChooserUseCaseBase, Mf2 mf2, JM<? super Sh2> jm) {
        super(2, jm);
        this.e = webViewFileChooserUseCaseBase;
        this.g = mf2;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new Sh2(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((Sh2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            final WebViewFileChooserUseCaseBase webViewFileChooserUseCaseBase = this.e;
            InterfaceC3890fy interfaceC3890fy = webViewFileChooserUseCaseBase.b;
            final Mf2 mf2 = this.g;
            Function0 function0 = new Function0() { // from class: Rh2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    WebViewFileChooserUseCaseBase webViewFileChooserUseCaseBase2 = webViewFileChooserUseCaseBase;
                    webViewFileChooserUseCaseBase2.getClass();
                    if (mf2.e) {
                        webViewFileChooserUseCaseBase2.i(new C7946z2(webViewFileChooserUseCaseBase2, 8));
                    } else {
                        webViewFileChooserUseCaseBase2.g(false);
                    }
                    return Unit.a;
                }
            };
            B5 b5 = new B5(webViewFileChooserUseCaseBase, 7);
            Q2 q2 = new Q2(webViewFileChooserUseCaseBase, 10);
            this.d = 1;
            if (interfaceC3890fy.c(function0, b5, q2, this) == mn) {
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
