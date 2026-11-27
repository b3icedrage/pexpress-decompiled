package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.b;
import com.impl.core.backend.DepositMadeWorker;
import com.impl.core.backend.responseModels.Deposit;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Zc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2554Zc1 implements InterfaceC0735Cf {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final C6754tM0 b;

    @NotNull
    public final Context c;

    @NotNull
    public final GP1 d;

    public C2554Zc1(@NotNull C4923kf appData, @NotNull C6754tM0 lastDepositUseCase, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(lastDepositUseCase, "lastDepositUseCase");
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = appData;
        this.b = lastDepositUseCase;
        this.c = context;
        this.d = C1589Ne.i(Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean a(@NotNull InterfaceC0735Cf interfaceC0735Cf) {
        return InterfaceC0735Cf.a.a(this, interfaceC0735Cf);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC0735Cf
    @Nullable
    public final Object b(@NotNull LM lm) {
        C2476Yc1 c2476Yc1;
        C2554Zc1 c2554Zc1;
        C2554Zc1 c2554Zc2;
        if (lm instanceof C2476Yc1) {
            c2476Yc1 = (C2476Yc1) lm;
            int i = c2476Yc1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2476Yc1.h = i - Integer.MIN_VALUE;
            } else {
                c2476Yc1 = new C2476Yc1(this, lm);
            }
        } else {
            c2476Yc1 = new C2476Yc1(this, lm);
        }
        Object obj = c2476Yc1.e;
        Object obj2 = MN.d;
        int i2 = c2476Yc1.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            if (!((Boolean) this.d.getValue()).booleanValue()) {
                c2476Yc1.d = this;
                c2476Yc1.h = 1;
                Object objA = C7236vf0.a(this.a.k, c2476Yc1);
                if (objA != obj2) {
                    objA = Unit.a;
                }
                if (objA != obj2) {
                    c2554Zc1 = this;
                }
                return obj2;
            }
            return Unit.a;
        }
        if (i2 == 1) {
            c2554Zc1 = c2476Yc1.d;
            C1795Pt1.b(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2554Zc2 = c2476Yc1.d;
            C1795Pt1.b(obj);
        }
        GP1 gp1 = c2554Zc2.d;
        Boolean bool = Boolean.TRUE;
        gp1.getClass();
        gp1.m(null, bool);
        return Unit.a;
        c2476Yc1.d = c2554Zc1;
        c2476Yc1.h = 2;
        if (c2554Zc1.d(c2476Yc1) != obj2) {
            c2554Zc2 = c2554Zc1;
            GP1 gp2 = c2554Zc2.d;
            Boolean bool2 = Boolean.TRUE;
            gp2.getClass();
            gp2.m(null, bool2);
            return Unit.a;
        }
        return obj2;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(LM lm) {
        C2398Xc1 c2398Xc1;
        C2554Zc1 c2554Zc1;
        if (lm instanceof C2398Xc1) {
            c2398Xc1 = (C2398Xc1) lm;
            int i = c2398Xc1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2398Xc1.h = i - Integer.MIN_VALUE;
            } else {
                c2398Xc1 = new C2398Xc1(this, lm);
            }
        } else {
            c2398Xc1 = new C2398Xc1(this, lm);
        }
        Object objM = c2398Xc1.e;
        MN mn = MN.d;
        int i2 = c2398Xc1.h;
        if (i2 == 0) {
            C1795Pt1.b(objM);
            c2398Xc1.d = this;
            c2398Xc1.h = 1;
            objM = this.b.m(c2398Xc1);
            if (objM == mn) {
                return mn;
            }
            c2554Zc1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2554Zc1 = c2398Xc1.d;
            C1795Pt1.b(objM);
        }
        Deposit deposit = (Deposit) objM;
        if (deposit != null) {
            deposit.toString();
            c2554Zc1.getClass();
            K91.a aVar = new K91.a(DepositMadeWorker.class);
            Intrinsics.checkNotNullParameter("DEPOSIT_MADE_WORKER_TAG", "tag");
            aVar.c.add("DEPOSIT_MADE_WORKER_TAG");
            b EMPTY = b.c;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            K91 k91A = aVar.e(EMPTY).a();
            C4736jk2 c4736jk2B = C4736jk2.b(c2554Zc1.c);
            EnumC5957pa0 enumC5957pa0 = EnumC5957pa0.d;
            c4736jk2B.getClass();
            c4736jk2B.a("DEPOSIT_MADE_WORKER_TAG", enumC5957pa0, Collections.singletonList(k91A));
        } else {
            C3686f.f(Log.d("PendingDepositUpdater", "no pending deposit found"));
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final void stop() {
    }
}
