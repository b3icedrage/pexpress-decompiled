package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import io.sentry.android.core.b0;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3775fQ implements InterfaceC0735Cf {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC7012ub2 b;

    @NotNull
    public final L32 c;

    @NotNull
    public volatile Set<DF> d;

    public C3775fQ(@NotNull C4923kf appData, @NotNull InterfaceC7012ub2 userRepository, @NotNull L32 tradingRepository) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(tradingRepository, "tradingRepository");
        this.a = appData;
        this.b = userRepository;
        this.c = tradingRepository;
        this.d = C6702t60.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(C3775fQ c3775fQ, JM jm) {
        C2713aQ c2713aQ;
        long j;
        Object value;
        C6106qG c6106qG;
        c3775fQ.getClass();
        if (jm instanceof C2713aQ) {
            c2713aQ = (C2713aQ) jm;
            int i = c2713aQ.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2713aQ.i = i - Integer.MIN_VALUE;
            } else {
                c2713aQ = new C2713aQ(c3775fQ, jm);
            }
        } else {
            c2713aQ = new C2713aQ(c3775fQ, jm);
        }
        Object objI = c2713aQ.g;
        MN mn = MN.d;
        int i2 = c2713aQ.i;
        if (i2 == 0) {
            C1795Pt1.b(objI);
            C4923kf c4923kf = c3775fQ.a;
            C6945uG c6945uG = (C6945uG) c4923kf.k.getValue();
            if (c6945uG == null) {
                return Unit.a;
            }
            C6106qG c6106qG2 = (C6106qG) c4923kf.c.getValue();
            if (c6106qG2 == null || c6106qG2.f) {
                return Unit.a;
            }
            long j2 = c6945uG.a;
            JF jf = new JF(j2);
            c2713aQ.d = c3775fQ;
            c2713aQ.e = j2;
            c2713aQ.i = 1;
            objI = c3775fQ.b.i(jf, c2713aQ);
            if (objI == mn) {
                return mn;
            }
            j = j2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c2713aQ.e;
            c3775fQ = c2713aQ.d;
            C1795Pt1.b(objI);
        }
        CommonResult commonResult = (CommonResult) objI;
        if (commonResult instanceof ResultOk) {
            C6945uG c6945uG2 = (C6945uG) c3775fQ.a.k.getValue();
            if (c6945uG2 == null || c6945uG2.a != j) {
                return Unit.a;
            }
            GP1 gp1 = c3775fQ.a.c;
            do {
                value = gp1.getValue();
                c6106qG = (C6106qG) value;
            } while (!gp1.d(value, c6106qG != null ? C6106qG.a(c6106qG, null, 31) : null));
        } else {
            if (!(commonResult instanceof ResultError)) {
                throw new C6489s51();
            }
            C3686f.f(b0.c("CryptoDemoTradesUpdater", "crypto enabling error: " + ((ResultError) commonResult).getError()));
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean a(@NotNull InterfaceC0735Cf interfaceC0735Cf) {
        return InterfaceC0735Cf.a.a(this, interfaceC0735Cf);
    }

    @Override // defpackage.InterfaceC0735Cf
    @Nullable
    public final Object b(@NotNull LM lm) {
        C4923kf c4923kf = this.a;
        Object objC = C4466ii.g(new C7648xd(C4466ii.l(new C4250hg0(c4923kf.b, 0), c4923kf.c, new C0807Dd(c4923kf.k, 2), new C4718jg0(new C4928kg0(this.d, new C3735fC1(new XP(this, null)), new YP(3, null)), new ZP(this, null)), new C3356dQ(5, null)), 1), -1).c(new C3565eQ(this), lm);
        return objC == MN.d ? objC : Unit.a;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean c() {
        return true;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final void stop() {
    }
}
