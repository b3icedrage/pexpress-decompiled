package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ww0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2353Ww0 implements InterfaceC1959Rw0 {

    @NotNull
    public final LU a;

    /* JADX INFO: renamed from: Ww0$a */
    @InterfaceC3368dU(c = "com.base.app.usecases.onesignal.InAppMessageDeeplinkExecutorBase$execute$1", f = "InAppMessageDeeplinkExecutorBase.kt", l = {19}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ InterfaceC1791Ps0 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1791Ps0 interfaceC1791Ps0, JM<? super a> jm) {
            super(2, jm);
            this.g = interfaceC1791Ps0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C2353Ww0.this.new a(this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                LU lu = C2353Ww0.this.a;
                String actionId = this.g.getResult().getActionId();
                Intrinsics.checkNotNull(actionId);
                this.d = 1;
                if (lu.b(actionId, this) == mn) {
                    return mn;
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

    public C2353Ww0(@NotNull LU deeplinkManager) {
        Intrinsics.checkNotNullParameter(deeplinkManager, "deeplinkManager");
        this.a = deeplinkManager;
    }

    @Override // defpackage.InterfaceC1959Rw0
    public final void a(@NotNull InterfaceC1791Ps0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getResult().getActionId() != null) {
            EM em = C3784fT.a;
            RV rv = C6266r20.a;
            C5189lv.k(em, QV0.a, new a(event, null), 2);
        }
    }
}
