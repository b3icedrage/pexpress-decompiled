package defpackage;

import com.api.core.backend.domain.models.responseModels.PingResponseApi;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.impl.core.backend.abstractModels.RawWebSocketRequest;
import com.impl.core.backend.modelsRequest.AuthenticationRequest;
import com.impl.core.backend.modelsRequest.PingRequestImpl;
import com.impl.core.backend.modelsResponse.PingResponseImpl;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ng2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5563ng2 implements InterfaceC4930kg2 {

    @NotNull
    public final C4720jg2 a;

    @NotNull
    public final GI1 b;

    public C5563ng2(@NotNull C4720jg2 webSocketConnectionDataSource, @NotNull GI1 sessionIdDataSource) {
        Intrinsics.checkNotNullParameter(webSocketConnectionDataSource, "webSocketConnectionDataSource");
        Intrinsics.checkNotNullParameter(sessionIdDataSource, "sessionIdDataSource");
        this.a = webSocketConnectionDataSource;
        this.b = sessionIdDataSource;
    }

    @Override // defpackage.InterfaceC4930kg2
    public final void a(@NotNull Vg2 executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        C4720jg2 c4720jg2 = this.a;
        c4720jg2.getClass();
        Intrinsics.checkNotNullParameter(executor, "executor");
        c4720jg2.f = executor;
    }

    @Override // defpackage.InterfaceC4930kg2
    @Nullable
    public final Object b(@NotNull Dg2 dg2) {
        Vg2 vg2 = this.a.f;
        if (vg2 == null) {
            Intrinsics.l("executor");
            throw null;
        }
        Object objJ = vg2.J(new RawWebSocketRequest("41"), dg2);
        MN mn = MN.d;
        if (objJ != mn) {
            objJ = Unit.a;
        }
        return objJ == mn ? objJ : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(boolean z, @NotNull String str, long j, @NotNull LM lm) {
        C5140lg2 c5140lg2;
        C5563ng2 c5563ng2;
        if (lm instanceof C5140lg2) {
            c5140lg2 = (C5140lg2) lm;
            int i = c5140lg2.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5140lg2.j = i - Integer.MIN_VALUE;
            } else {
                c5140lg2 = new C5140lg2(this, lm);
            }
        } else {
            c5140lg2 = new C5140lg2(this, lm);
        }
        Object objA = c5140lg2.h;
        MN mn = MN.d;
        int i2 = c5140lg2.j;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            if (z) {
                AuthenticationRequest authenticationRequest = new AuthenticationRequest(str, 0, j);
                c5140lg2.j = 3;
                Object objW = this.a.w(authenticationRequest, c5140lg2);
                if (objW != mn) {
                    return objW;
                }
            } else {
                c5140lg2.d = this;
                c5140lg2.e = str;
                c5140lg2.g = j;
                c5140lg2.j = 1;
                objA = this.b.a(c5140lg2);
                if (objA != mn) {
                    c5563ng2 = this;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                C1795Pt1.b(objA);
                return objA;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objA);
            return objA;
        }
        j = c5140lg2.g;
        str = c5140lg2.e;
        c5563ng2 = c5140lg2.d;
        C1795Pt1.b(objA);
        CommonResult commonResult = (CommonResult) objA;
        if (commonResult instanceof ResultOk) {
            str = (String) ((ResultOk) commonResult).a();
        } else {
            if (!(commonResult instanceof ResultError)) {
                throw new C6489s51();
            }
            if (C1603Nh1.a(((ResultError) commonResult).getError())) {
                return commonResult;
            }
        }
        C4720jg2 c4720jg2 = c5563ng2.a;
        AuthenticationRequest authenticationRequest2 = new AuthenticationRequest(str, 1, j);
        c5140lg2.d = null;
        c5140lg2.e = null;
        c5140lg2.j = 2;
        Object objW2 = c4720jg2.w(authenticationRequest2, c5140lg2);
        return objW2 == mn ? mn : objW2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(@NotNull LM lm) {
        C5353mg2 c5353mg2;
        if (lm instanceof C5353mg2) {
            c5353mg2 = (C5353mg2) lm;
            int i = c5353mg2.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5353mg2.g = i - Integer.MIN_VALUE;
            } else {
                c5353mg2 = new C5353mg2(this, lm);
            }
        } else {
            c5353mg2 = new C5353mg2(this, lm);
        }
        Object objY = c5353mg2.d;
        MN mn = MN.d;
        int i2 = c5353mg2.g;
        if (i2 == 0) {
            C1795Pt1.b(objY);
            new PingRequestImpl();
            c5353mg2.g = 1;
            objY = this.a.y(c5353mg2);
            if (objY == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objY);
        }
        CommonResult commonResult = (CommonResult) objY;
        if (commonResult instanceof ResultOk) {
            PingResponseApi pingResponseApi = (PingResponseApi) ((ResultOk) commonResult).a();
            Intrinsics.c(pingResponseApi, "null cannot be cast to non-null type com.impl.core.backend.modelsResponse.PingResponseImpl");
            return new ResultOk((PingResponseImpl) pingResponseApi);
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }
}
