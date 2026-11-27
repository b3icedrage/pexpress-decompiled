package defpackage;

import com.base.feature.registration.screens.captcha.CaptchaFragmentDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1985Sf implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C1985Sf(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((C4) this.e).invoke();
                break;
            default:
                ((CaptchaFragmentDialog) this.e).n.invoke();
                break;
        }
        return Unit.a;
    }
}
