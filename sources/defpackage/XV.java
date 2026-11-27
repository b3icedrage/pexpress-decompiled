package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class XV extends AbstractC3972gL1 {

    @NotNull
    public final InterfaceC6211ql0 c;

    @NotNull
    public final DC1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XV(@NotNull C4923kf appData, @NotNull InterfaceC6211ql0 getOurUserUseCase, @NotNull DC1 savedEmailProvider, @NotNull AbstractC5045lD0 isShowValueUseCase) {
        super(appData, isShowValueUseCase);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(getOurUserUseCase, "getOurUserUseCase");
        Intrinsics.checkNotNullParameter(savedEmailProvider, "savedEmailProvider");
        Intrinsics.checkNotNullParameter(isShowValueUseCase, "isShowValueUseCase");
        this.c = getOurUserUseCase;
        this.d = savedEmailProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC3972gL1
    @Nullable
    public final Object a(@NotNull String str, @NotNull LM lm) {
        WV wv;
        XV xv;
        if (lm instanceof WV) {
            wv = (WV) lm;
            int i = wv.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                wv.i = i - Integer.MIN_VALUE;
            } else {
                wv = new WV(this, lm);
            }
        } else {
            wv = new WV(this, lm);
        }
        Object objA = wv.g;
        MN mn = MN.d;
        int i2 = wv.i;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            wv.d = this;
            wv.e = str;
            wv.i = 1;
            objA = this.c.a(str, wv);
            if (objA == mn) {
                return mn;
            }
            xv = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = wv.e;
            xv = wv.d;
            C1795Pt1.b(objA);
        }
        CommonResult commonResult = (CommonResult) objA;
        if (!(commonResult instanceof ResultError)) {
            if (commonResult instanceof ResultOk) {
                return new C4078gq1(C4078gq1.a.g, false, 6);
            }
            throw new C6489s51();
        }
        CommonError error = ((ResultError) commonResult).getError();
        xv.getClass();
        if (!(error instanceof CommonError.UserNotInDatabase)) {
            return new C4078gq1(C4078gq1.a.h, false, 4);
        }
        xv.d.a(str);
        return new C4078gq1(C4078gq1.a.g, false, 6);
    }
}
