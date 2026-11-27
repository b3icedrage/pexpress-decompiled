package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1143Hl implements InterfaceC1065Gl {

    @NotNull
    public final InterfaceC4358iA0 a;

    /* JADX INFO: renamed from: Hl$a */
    @InterfaceC3368dU(c = "com.base.library.registration.usecases.AuthenticateUseCaseBase", f = "AuthenticateUseCaseBase.kt", l = {14}, m = "authenticationStep")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int g;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.g |= Integer.MIN_VALUE;
            return C1143Hl.this.b(this);
        }
    }

    public C1143Hl(@NotNull InterfaceC4358iA0 initializeExecutorUseCase) {
        Intrinsics.checkNotNullParameter(initializeExecutorUseCase, "initializeExecutorUseCase");
        this.a = initializeExecutorUseCase;
    }

    @Override // defpackage.InterfaceC1065Gl
    @Nullable
    public final Object a(@NotNull JM<? super CommonResult<?>> jm) {
        return b(jm);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull JM<? super CommonResult<Unit>> jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.g = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object objC = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.g;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            aVar.g = 1;
            objC = this.a.c(aVar);
            if (objC == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objC);
        }
        return !((Boolean) objC).booleanValue() ? new ResultError(new CommonError.NotAuthenticated()) : new ResultOk(Unit.a);
    }
}
