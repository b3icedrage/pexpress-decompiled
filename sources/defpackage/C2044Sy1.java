package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Sy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart$initTextListeners$1$6", f = "RobotRiskManagementPart.kt", l = {}, m = "invokeSuspend")
public final class C2044Sy1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C1100Gw1 d;
    public final /* synthetic */ RobotRiskManagementPart e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2044Sy1(C1100Gw1 c1100Gw1, RobotRiskManagementPart robotRiskManagementPart, JM<? super C2044Sy1> jm) {
        super(2, jm);
        this.d = c1100Gw1;
        this.e = robotRiskManagementPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2044Sy1(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2044Sy1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        EditText lossLimitValue = this.d.k;
        Intrinsics.checkNotNullExpressionValue(lossLimitValue, "lossLimitValue");
        lossLimitValue.addTextChangedListener(new a(this.e));
        return Unit.a;
    }

    /* JADX INFO: renamed from: Sy1$a */
    public static final class a implements TextWatcher {
        public final /* synthetic */ RobotRiskManagementPart d;

        public a(RobotRiskManagementPart robotRiskManagementPart) {
            this.d = robotRiskManagementPart;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Nullable Editable editable) {
            Object obj = this.d.i;
            Intrinsics.checkNotNull(obj);
            ((InterfaceC2200Uy1) obj).d(String.valueOf(editable), false);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
