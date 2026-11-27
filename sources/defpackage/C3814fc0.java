package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonMinimumDeposit;
import com.api.core.backend.domain.models.responseModels.CommonRecommendedDeposit;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3814fc0 implements InterfaceC3185cc0 {

    @NotNull
    public final InterfaceC7012ub2 a;

    public C3814fc0(@NotNull InterfaceC7012ub2 userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.a = userRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC3185cc0
    @Nullable
    public final Object a(long j, @NotNull LM lm) {
        C3395dc0 c3395dc0;
        if (lm instanceof C3395dc0) {
            c3395dc0 = (C3395dc0) lm;
            int i = c3395dc0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3395dc0.g = i - Integer.MIN_VALUE;
            } else {
                c3395dc0 = new C3395dc0(this, lm);
            }
        } else {
            c3395dc0 = new C3395dc0(this, lm);
        }
        Object objB = c3395dc0.d;
        Object obj = MN.d;
        int i2 = c3395dc0.g;
        if (i2 == 0) {
            C1795Pt1.b(objB);
            c3395dc0.g = 1;
            objB = this.a.b();
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objB);
        }
        CommonResult commonResult = (CommonResult) objB;
        ResultOk resultOk = commonResult instanceof ResultOk ? (ResultOk) commonResult : null;
        if (resultOk != null) {
            return (CommonMinimumDeposit) resultOk.a();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC3185cc0
    @Nullable
    public final Object b(@NotNull LM lm) {
        C3604ec0 c3604ec0;
        if (lm instanceof C3604ec0) {
            c3604ec0 = (C3604ec0) lm;
            int i = c3604ec0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3604ec0.g = i - Integer.MIN_VALUE;
            } else {
                c3604ec0 = new C3604ec0(this, lm);
            }
        } else {
            c3604ec0 = new C3604ec0(this, lm);
        }
        Object objV = c3604ec0.d;
        Object obj = MN.d;
        int i2 = c3604ec0.g;
        if (i2 == 0) {
            C1795Pt1.b(objV);
            c3604ec0.g = 1;
            objV = this.a.v();
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objV);
        }
        CommonResult commonResult = (CommonResult) objV;
        ResultOk resultOk = commonResult instanceof ResultOk ? (ResultOk) commonResult : null;
        if (resultOk != null) {
            return (CommonRecommendedDeposit) resultOk.a();
        }
        return null;
    }
}
