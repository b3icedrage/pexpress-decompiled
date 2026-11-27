package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonErrorClassificationKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5913pL1 implements InterfaceC5703oL1 {

    @NotNull
    public final VK1 a;

    @NotNull
    public final InterfaceC1547Mq b;

    @NotNull
    public final C4923kf c;

    @NotNull
    public final KW1 d;

    @NotNull
    public final KW1 e;

    @NotNull
    public final KW1 f;

    @NotNull
    public final KW1 g;

    @NotNull
    public final KW1 h;

    public C5913pL1(@NotNull VK1 showAlertDialogUseCase, @NotNull InterfaceC1547Mq registrationCallback, @NotNull C4923kf appDataRepository) {
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(registrationCallback, "registrationCallback");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = showAlertDialogUseCase;
        this.b = registrationCallback;
        this.c = appDataRepository;
        this.d = XO0.b(new C5770og(this, 4));
        this.e = XO0.b(new B5(this, 4));
        this.f = XO0.b(new Q2(this, 8));
        this.g = XO0.b(new C6399rg(this, 8));
        this.h = XO0.b(new C1907Rf(this, 6));
    }

    @Override // defpackage.InterfaceC5703oL1
    @Nullable
    public final Object a(@NotNull CommonError commonError, @NotNull LM lm) {
        AbstractC1592Nf abstractC1592Nf;
        if ((commonError instanceof CommonError.IncorrectCredentials) || (commonError instanceof CommonError.EmailNotExists) || (commonError instanceof CommonError.InvalidEmail)) {
            abstractC1592Nf = (AbstractC1592Nf) this.d.getValue();
        } else if (commonError instanceof CommonError.RestrictedCountry) {
            abstractC1592Nf = (AbstractC1592Nf) this.g.getValue();
        } else if (commonError instanceof CommonError.DuoAuthInvalidCode) {
            abstractC1592Nf = (AbstractC1592Nf.m) this.h.getValue();
        } else {
            abstractC1592Nf = CommonErrorClassificationKt.c(commonError) ? (AbstractC1592Nf) this.f.getValue() : (AbstractC1592Nf) this.e.getValue();
        }
        Boolean boolA = this.a.a(abstractC1592Nf, null, null);
        return boolA == MN.d ? boolA : Unit.a;
    }
}
