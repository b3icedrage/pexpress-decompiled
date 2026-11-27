package defpackage;

import android.content.res.Resources;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.AddUserUseCaseBase$tryAddUser$2", f = "AddUserUseCaseBase.kt", l = {27}, m = "invokeSuspend")
public final class C3929g8 extends AW1 implements Function1<JM<? super CommonResult<?>>, Object> {
    public int d;
    public final /* synthetic */ C4607j8 e;
    public final /* synthetic */ C6945uG g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3929g8(C4607j8 c4607j8, C6945uG c6945uG, JM<? super C3929g8> jm) {
        super(1, jm);
        this.e = c4607j8;
        this.g = c6945uG;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C3929g8(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super CommonResult<?>> jm) {
        return ((C3929g8) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        String country;
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        C6945uG c6945uG = this.g;
        String email = c6945uG.b;
        this.d = 1;
        C4607j8 c4607j8 = this.e;
        c4607j8.getClass();
        long j = c6945uG.a;
        C4923kf c4923kf = c4607j8.a;
        FF ff = (FF) c4923kf.b.getValue();
        if (ff != null) {
            country = ff.f;
        } else {
            Locale locale = OI.a(Resources.getSystem().getConfiguration()).get(0);
            country = String.valueOf(locale != null ? locale.getCountry() : null);
        }
        String currency = (String) c4923kf.F.d.getValue();
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(email, "email");
        C6732tF c6732tF = new C6732tF();
        c6732tF.a = j;
        c6732tF.b = country;
        c6732tF.c = currency;
        c6732tF.d = email;
        Object objC = c4607j8.b.c(c6732tF, this);
        return objC == mn ? mn : objC;
    }
}
