package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class VM0 implements TM0 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC2421Xk0 b;

    public VM0(@NotNull C4923kf appData, @NotNull InterfaceC2421Xk0 getCurrenciesUseCase) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(getCurrenciesUseCase, "getCurrenciesUseCase");
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = appData;
        this.b = getCurrenciesUseCase;
    }

    @Override // defpackage.TM0
    @Nullable
    public final Unit a() {
        return Unit.a;
    }

    @Override // defpackage.TM0
    public final long b(long j) {
        return 1000 - (System.currentTimeMillis() - j);
    }

    @Override // defpackage.TM0
    @Nullable
    public final Boolean c() {
        C6315rG c6315rG = (C6315rG) this.a.f.getValue();
        String str = c6315rG != null ? c6315rG.a : null;
        return Boolean.valueOf(!(str == null || StringsKt.I(str)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.TM0
    @Nullable
    public final Object d(@NotNull SM0 sm0, @NotNull JM jm) {
        UM0 um0;
        VM0 vm0;
        if (jm instanceof UM0) {
            um0 = (UM0) jm;
            int i = um0.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                um0.i = i - Integer.MIN_VALUE;
            } else {
                um0 = new UM0(this, (LM) jm);
            }
        } else {
            um0 = new UM0(this, (LM) jm);
        }
        Object obj = um0.g;
        MN mn = MN.d;
        int i2 = um0.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            um0.d = this;
            um0.e = sm0;
            um0.i = 1;
            if (this.b.a(um0) != mn) {
                vm0 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        vm0 = um0.d;
        C1795Pt1.b(obj);
        um0.d = null;
        um0.e = null;
        um0.i = 2;
        vm0.getClass();
        Boolean bool = Boolean.TRUE;
        return bool == mn ? mn : bool;
    }
}
