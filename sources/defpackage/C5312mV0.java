package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$initAll$1", f = "MainActivity.kt", l = {380}, m = "invokeSuspend")
public final class C5312mV0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ ActivityC6781tV0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5312mV0(JM jm, ActivityC6781tV0 activityC6781tV0, Bundle bundle) {
        super(2, jm);
        this.e = bundle;
        this.g = activityC6781tV0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5312mV0(jm, this.g, this.e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5312mV0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            Bundle bundle = this.e;
            if (bundle != null && bundle.getBoolean("WAS_LANGUAGE_CHANGED")) {
                LU lu = this.g.z;
                if (lu == null) {
                    Intrinsics.l("deepLinkManager");
                    throw null;
                }
                this.d = 1;
                if (lu.c(this) == mn) {
                    return mn;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
