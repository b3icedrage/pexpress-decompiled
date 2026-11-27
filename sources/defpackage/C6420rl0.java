package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6420rl0 implements InterfaceC6211ql0 {

    @NotNull
    public final InterfaceC7012ub2 a;

    @NotNull
    public final C4923kf b;

    @NotNull
    public final C4966kq1 c;

    /* JADX INFO: renamed from: rl0$a */
    @InterfaceC3368dU(c = "com.base.library.registration.usecases.GetRobotUserUseCaseBase", f = "GetRobotUserUseCaseBase.kt", l = {22}, m = "tryGetUserData")
    public static final class a extends LM {
        public C6420rl0 d;
        public /* synthetic */ Object e;
        public int h;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return C6420rl0.this.a(null, this);
        }
    }

    public C6420rl0(@NotNull InterfaceC7012ub2 userRepository, @NotNull C4923kf appDataRepository, @NotNull C4966kq1 registrationAndLoginParams) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(registrationAndLoginParams, "registrationAndLoginParams");
        this.a = userRepository;
        this.b = appDataRepository;
        this.c = registrationAndLoginParams;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6211ql0
    @Nullable
    public final Object a(@NotNull String str, @NotNull JM<? super CommonResult<?>> jm) {
        a aVar;
        C6420rl0 c6420rl0;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object objY = aVar.e;
        MN mn = MN.d;
        int i2 = aVar.h;
        if (i2 == 0) {
            C1795Pt1.b(objY);
            C4923kf c4923kf = this.b;
            C6945uG c6945uG = (C6945uG) c4923kf.k.getValue();
            Long lValueOf = c6945uG != null ? Long.valueOf(c6945uG.a) : null;
            GP1 gp1 = c4923kf.k;
            if (str == null) {
                C6945uG c6945uG2 = (C6945uG) gp1.getValue();
                str = c6945uG2 != null ? c6945uG2.b : null;
            }
            C6945uG c6945uG3 = (C6945uG) gp1.getValue();
            String str2 = c6945uG3 != null ? c6945uG3.g : null;
            C6945uG c6945uG4 = (C6945uG) gp1.getValue();
            ZF zf = new ZF(str, str2, lValueOf, c6945uG4 != null ? c6945uG4.d : null);
            aVar.d = this;
            aVar.h = 1;
            objY = this.a.y(zf, aVar);
            if (objY == mn) {
                return mn;
            }
            c6420rl0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6420rl0 = aVar.d;
            C1795Pt1.b(objY);
        }
        CommonResult commonResult = (CommonResult) objY;
        if (commonResult instanceof ResultOk) {
            c6420rl0.b.c.setValue(((ResultOk) commonResult).a());
            GP1 gp2 = c6420rl0.b.d;
            Boolean bool = Boolean.TRUE;
            gp2.getClass();
            gp2.m(null, bool);
            return commonResult;
        }
        if (!(commonResult instanceof ResultError)) {
            throw new C6489s51();
        }
        if (!(((ResultError) commonResult).getError() instanceof CommonError.UserNotInDatabase)) {
            return commonResult;
        }
        GP1 gp3 = c6420rl0.b.d;
        Boolean bool2 = Boolean.FALSE;
        gp3.getClass();
        gp3.m(null, bool2);
        return new ResultOk(Unit.a);
    }

    @Override // defpackage.InterfaceC6211ql0
    @Nullable
    public final Object b(@NotNull JM<? super CommonResult<?>> jm) {
        return a(this.c.a, jm);
    }
}
