package defpackage;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: vV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$restartActivity$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
public final class C7201vV0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ ActivityC6781tV0 d;
    public final /* synthetic */ Intent e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7201vV0(ActivityC6781tV0 activityC6781tV0, Intent intent, JM<? super C7201vV0> jm) {
        super(2, jm);
        this.d = activityC6781tV0;
        this.e = intent;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7201vV0(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7201vV0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        ActivityC6781tV0 activityC6781tV0 = this.d;
        activityC6781tV0.a();
        activityC6781tV0.startActivity(this.e);
        activityC6781tV0.finish();
        return Unit.a;
    }
}
