package defpackage;

import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.appsflyer.share.attribution.RequestError;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ah0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.registration.screens.forgetpassword.ForgetPasswordViewModelImpl$showCaptcha$1", f = "ForgetPasswordViewModelImpl.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "invokeSuspend")
public final class C0586Ah0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ CaptchaDestination.RemindPass e;
    public final /* synthetic */ C0664Bh0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function0<Unit> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0586Ah0(CaptchaDestination.RemindPass remindPass, C0664Bh0 c0664Bh0, boolean z, Function0 function0, JM jm) {
        super(2, jm);
        this.e = remindPass;
        this.g = c0664Bh0;
        this.h = z;
        this.i = function0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0586Ah0(this.e, this.g, this.h, this.i, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C0586Ah0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            final C0664Bh0 c0664Bh0 = this.g;
            EB eb = c0664Bh0.y;
            Map mapB = this.h ? OW0.b(new Pair("captcha.after_transient", Boolean.TRUE)) : PW0.c();
            final Function0<Unit> function0 = this.i;
            Function1 function1 = new Function1() { // from class: zh0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    String captchaToken = (String) obj2;
                    C0664Bh0 c0664Bh1 = c0664Bh0;
                    c0664Bh1.getClass();
                    Intrinsics.checkNotNullParameter(captchaToken, "captchaToken");
                    c0664Bh1.v.setValue(captchaToken);
                    function0.invoke();
                    return Unit.a;
                }
            };
            this.d = 1;
            if (C1730Oy.b("forgot_password", this.e, eb, c0664Bh0.x, C5653o60.d, mapB, function1, this) == mn) {
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
