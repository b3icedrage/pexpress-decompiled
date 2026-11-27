package defpackage;

import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: vn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.feature.activation.register.ReRegistrationViewModelImpl$showCaptcha$1", f = "ReRegistrationViewModelImpl.kt", l = {71}, m = "invokeSuspend")
public final class C7269vn1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ CaptchaDestination e;
    public final /* synthetic */ C7059un1 g;
    public final /* synthetic */ Function0<Unit> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7269vn1(CaptchaDestination captchaDestination, C7059un1 c7059un1, Function0<Unit> function0, JM<? super C7269vn1> jm) {
        super(2, jm);
        this.e = captchaDestination;
        this.g = c7059un1;
        this.h = function0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7269vn1(this.e, this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7269vn1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C7059un1 c7059un1 = this.g;
            EB eb = c7059un1.P;
            Map mapB = OW0.b(new Pair("auth.entry", "re_registration"));
            C5137lg c5137lg = new C5137lg(c7059un1, this.h, 1);
            this.d = 1;
            if (C1730Oy.b("register", this.e, eb, c7059un1.O, C5653o60.d, mapB, c5137lg, this) == mn) {
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
