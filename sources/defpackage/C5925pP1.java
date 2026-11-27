package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: pP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common_action.StartGateWatchdogKt$watchStartGate$3", f = "StartGateWatchdog.kt", l = {27}, m = "invokeSuspend")
public final class C5925pP1 extends AW1 implements Function2<Boolean, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ boolean e;
    public final /* synthetic */ X5 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ C7530x3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5925pP1(X5 x5, long j, C7530x3 c7530x3, JM jm) {
        super(2, jm);
        this.g = x5;
        this.h = j;
        this.i = c7530x3;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C5925pP1 c5925pP1 = new C5925pP1(this.g, this.h, this.i, jm);
        c5925pP1.e = ((Boolean) obj).booleanValue();
        return c5925pP1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, JM<? super Unit> jm) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((C5925pP1) create(bool2, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            if (this.e) {
                this.g.invoke();
                this.d = 1;
                if (IW.c(this.h, this) == mn) {
                    return mn;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1795Pt1.b(obj);
        this.i.invoke();
        return Unit.a;
    }
}
