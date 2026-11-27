package defpackage;

import androidx.activity.OnBackPressedDispatcher;
import com.impl.feature.registration.screens.forgetpassword.ForgetPasswordFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: uh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7034uh0 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7034uh0(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (ForgetPasswordFragmentImpl) this.e;
            case 1:
                ((OnBackPressedDispatcher) this.e).c();
                return Unit.a;
            default:
                return (Wd2) ((C3238cq0) this.e).invoke();
        }
    }
}
