package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4738jl0 implements InterfaceC4270hl0 {

    @NotNull
    public final InterfaceC1131Hh a;

    public C4738jl0(@NotNull InterfaceC1131Hh appRepository, @NotNull C4923kf appDataRepository) {
        Intrinsics.checkNotNullParameter(appRepository, "appRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = appRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC4270hl0
    @Nullable
    public final Object a(@NotNull LM lm) {
        C4479il0 c4479il0;
        if (lm instanceof C4479il0) {
            c4479il0 = (C4479il0) lm;
            int i = c4479il0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4479il0.g = i - Integer.MIN_VALUE;
            } else {
                c4479il0 = new C4479il0(this, lm);
            }
        } else {
            c4479il0 = new C4479il0(this, lm);
        }
        Object objH = c4479il0.d;
        MN mn = MN.d;
        int i2 = c4479il0.g;
        if (i2 == 0) {
            C1795Pt1.b(objH);
            c4479il0.g = 1;
            objH = this.a.h(c4479il0);
            if (objH == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objH);
        }
        CommonResult commonResult = (CommonResult) objH;
        return new Long(commonResult instanceof ResultOk ? ((Number) ((ResultOk) commonResult).a()).longValue() : System.currentTimeMillis());
    }
}
