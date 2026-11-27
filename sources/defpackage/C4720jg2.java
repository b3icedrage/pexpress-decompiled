package defpackage;

import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.impl.core.backend.modelsRequest.AuthenticationRequest;
import com.impl.core.backend.modelsResponse.AuthenticationResponse;
import com.impl.core.backend.modelsResponse.PingResponseImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4720jg2 extends G1 {

    @NotNull
    public final Object e = XO0.a(EnumC4403iP0.d, new R4(this, 8));
    public Vg2 f;

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Type inference failed for: r12v6, types: [fO0, java.lang.Object] */
    @Nullable
    public final Object w(@NotNull AuthenticationRequest authenticationRequest, @NotNull LM lm) {
        C3203cg2 c3203cg2;
        C4720jg2 c4720jg2;
        if (lm instanceof C3203cg2) {
            c3203cg2 = (C3203cg2) lm;
            int i = c3203cg2.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3203cg2.i = i - Integer.MIN_VALUE;
            } else {
                c3203cg2 = new C3203cg2(this, lm);
            }
        } else {
            c3203cg2 = new C3203cg2(this, lm);
        }
        C3203cg2 c3203cg3 = c3203cg2;
        Object obj = c3203cg3.g;
        MN mn = MN.d;
        int i2 = c3203cg3.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            c3203cg3.d = this;
            c3203cg3.e = authenticationRequest;
            c3203cg3.i = 1;
            if (x(c3203cg3) != mn) {
                c4720jg2 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        authenticationRequest = c3203cg3.e;
        c4720jg2 = c3203cg3.d;
        C1795Pt1.b(obj);
        AuthenticationRequest authenticationRequest2 = new AuthenticationRequest(authenticationRequest.f().getSession(), authenticationRequest.f().getIsDemo(), authenticationRequest.f().getUid());
        C4720jg2 c4720jg3 = c4720jg2;
        Vg2 vg2 = c4720jg3.f;
        if (vg2 == null) {
            Intrinsics.l("executor");
            throw null;
        }
        C3098cA c3098cAX = C4466ii.x(C7683xl2.b(AuthenticationResponse.NAME, new TypeToken<AuthenticationResponse>() { // from class: com.impl.core.backend.data_sources.WebSocketConnectionDataSourceImpl$authenticate$$inlined$getRightMessages$default$1
        }, ((InterfaceC5125ld) c4720jg3.e.getValue()).d()), C7683xl2.b(AuthenticationResponse.NAME, new TypeToken<AuthenticationResponse>() { // from class: com.impl.core.backend.data_sources.WebSocketConnectionDataSourceImpl$authenticate$$inlined$getRightMessages$default$2
        }, C5020l60.d));
        c3203cg3.d = null;
        c3203cg3.e = null;
        c3203cg3.i = 2;
        int i3 = Fg2.w;
        Object objB = vg2.B("auth", c3098cAX, "auth", AuthenticationResponse.NAME, new Ng2(vg2, authenticationRequest2, null), c3203cg3);
        return objB == mn ? mn : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [fO0, java.lang.Object] */
    public final Object x(LM lm) {
        C3622eg2 c3622eg2;
        C4720jg2 c4720jg2;
        C1832Qg c1832Qg;
        if (lm instanceof C3622eg2) {
            c3622eg2 = (C3622eg2) lm;
            int i = c3622eg2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3622eg2.h = i - Integer.MIN_VALUE;
            } else {
                c3622eg2 = new C3622eg2(this, lm);
            }
        } else {
            c3622eg2 = new C3622eg2(this, lm);
        }
        Object objD = c3622eg2.e;
        MN mn = MN.d;
        int i2 = c3622eg2.h;
        if (i2 == 0) {
            C1795Pt1.b(objD);
            C4718jg0 c4718jg0 = new C4718jg0(((InterfaceC5125ld) this.e.getValue()).d(), this);
            long j = Fg2.v;
            C3832fg2 c3832fg2 = new C3832fg2(this, null);
            c3622eg2.d = this;
            c3622eg2.h = 1;
            objD = OZ1.d(j, new C2443Xr1(null, c4718jg0, c3832fg2), c3622eg2);
            if (objD == mn) {
                return mn;
            }
            c4720jg2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4720jg2 = c3622eg2.d;
            C1795Pt1.b(objD);
        }
        if (((JsonElement) objD) == null && (c1832Qg = U0.N) != null) {
            Vg2 vg2 = c4720jg2.f;
            if (vg2 == null) {
                Intrinsics.l("executor");
                throw null;
            }
            c1832Qg.invoke("namespace_ack_timeout", OW0.b(new Pair("is_real", Boolean.valueOf(vg2 instanceof C3836fh2))));
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object y(@NotNull LM lm) {
        C4461ig2 c4461ig2;
        if (lm instanceof C4461ig2) {
            c4461ig2 = (C4461ig2) lm;
            int i = c4461ig2.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4461ig2.g = i - Integer.MIN_VALUE;
            } else {
                c4461ig2 = new C4461ig2(this, lm);
            }
        } else {
            c4461ig2 = new C4461ig2(this, lm);
        }
        Object obj = c4461ig2.d;
        MN mn = MN.d;
        int i2 = c4461ig2.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            Vg2 vg2 = this.f;
            if (vg2 == null) {
                Intrinsics.l("executor");
                throw null;
            }
            c4461ig2.g = 1;
            if (Fg2.z(vg2, "ps", null, c4461ig2, 14) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return new ResultOk(new PingResponseImpl());
    }
}
