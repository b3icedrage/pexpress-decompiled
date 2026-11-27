package defpackage;

import com.api.core.backend.domain.models.abstractModels.WebSocketRequestAbstract;
import com.api.core.backend.domain.models.requestModels.MakeABetRequestApi;
import com.api.core.backend.domain.models.responseModels.CommonDefaultResponse;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class T32 extends N32 {

    @NotNull
    public final K22 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T32(@NotNull K22 tradingDataSource, @NotNull InterfaceC4833kC1 safeRequestsApi) {
        super(tradingDataSource, safeRequestsApi);
        Intrinsics.checkNotNullParameter(tradingDataSource, "tradingDataSource");
        Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
        this.c = tradingDataSource;
    }

    @Override // defpackage.L32
    @Nullable
    public final Unit a() {
        return Unit.a;
    }

    @Override // defpackage.L32
    @Nullable
    public final Object b(@NotNull YF yf, @NotNull C6864ts1 c6864ts1) {
        return this.b.e(new Q32(this, yf, null), c6864ts1);
    }

    @Override // defpackage.L32
    @Nullable
    public final ResultOk c() {
        return new ResultOk(new CommonDefaultResponse("", HttpPlatformResponse.MAX_MESSAGE_LENGTH));
    }

    @Override // defpackage.L32
    @Nullable
    public final Object d() {
        throw new H51(null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.L32
    @Nullable
    public final Object f(@NotNull LM lm) {
        P32 p32;
        if (lm instanceof P32) {
            p32 = (P32) lm;
            int i = p32.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                p32.g = i - Integer.MIN_VALUE;
            } else {
                p32 = new P32(this, lm);
            }
        } else {
            p32 = new P32(this, lm);
        }
        Object objE = p32.d;
        Object obj = MN.d;
        int i2 = p32.g;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            p32.g = 1;
            objE = this.c.e();
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objE);
        }
        return C2182Us1.a(new O32((InterfaceC6396rf0) objE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.L32
    @Nullable
    public final Object g(@NotNull WebSocketRequestAbstract webSocketRequestAbstract, @NotNull LM lm) {
        S32 s32;
        if (lm instanceof S32) {
            s32 = (S32) lm;
            int i = s32.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                s32.g = i - Integer.MIN_VALUE;
            } else {
                s32 = new S32(this, lm);
            }
        } else {
            s32 = new S32(this, lm);
        }
        Object objB = s32.d;
        Object obj = MN.d;
        int i2 = s32.g;
        if (i2 == 0) {
            C1795Pt1.b(objB);
            if (!(webSocketRequestAbstract instanceof MakeABetRequestApi)) {
                return new C0658Bf0(new ResultError(new CommonError.OtherError(null, 0, 3, null)));
            }
            s32.g = 1;
            objB = this.c.b((MakeABetRequestApi) webSocketRequestAbstract);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objB);
        }
        return C2182Us1.a(new R32((InterfaceC6396rf0) objB));
    }

    @Override // defpackage.L32
    @Nullable
    public final Object h(@NotNull XP xp) {
        return this.c.c();
    }

    @Override // defpackage.L32
    @Nullable
    public final Object i() {
        Intrinsics.checkNotNullParameter("An operation is not implemented: Not yet implemented", "message");
        throw new H51("An operation is not implemented: Not yet implemented");
    }
}
