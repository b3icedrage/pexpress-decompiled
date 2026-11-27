package defpackage;

import com.base.feature.robot.robot.common.screens.RobotCommonFragment;
import com.google.android.gms.common.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: i10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4322i10 implements InterfaceC3902g10 {

    @NotNull
    public final C6120qK1 a = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);

    /* JADX INFO: renamed from: i10$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.providers.DialogProviderBase$emit$1", f = "DialogProviderBase.kt", l = {ConnectionResult.API_DISABLED}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ W00 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W00 w00, JM<? super a> jm) {
            super(2, jm);
            this.g = w00;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4322i10.this.new a(this.g, jm);
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
                C6120qK1 c6120qK1 = C4322i10.this.a;
                this.d = 1;
                if (c6120qK1.a(this.g, this) == mn) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC3902g10
    @Nullable
    public final void a(@NotNull RobotCommonFragment.e.a.C0292a c0292a, @NotNull LM lm) {
        C4112h10 c4112h10;
        if (lm instanceof C4112h10) {
            c4112h10 = (C4112h10) lm;
            int i = c4112h10.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4112h10.g = i - Integer.MIN_VALUE;
            } else {
                c4112h10 = new C4112h10(this, lm);
            }
        } else {
            c4112h10 = new C4112h10(this, lm);
        }
        Object obj = c4112h10.d;
        MN mn = MN.d;
        int i2 = c4112h10.g;
        if (i2 != 0) {
            if (i2 == 1) {
                throw EK.c(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1795Pt1.b(obj);
        C6120qK1 c6120qK1 = this.a;
        c4112h10.g = 1;
        c6120qK1.c(c0292a, c4112h10);
    }

    @Override // defpackage.InterfaceC3902g10
    public final void b(@NotNull W00 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C5189lv.k(C3286d41.a, null, new a(event, null), 3);
    }
}
