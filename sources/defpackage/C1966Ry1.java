package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ry1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.risk_management.screens.RobotRiskManagementPart$initTextListeners$1$3", f = "RobotRiskManagementPart.kt", l = {}, m = "invokeSuspend")
public final class C1966Ry1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C1100Gw1 d;
    public final /* synthetic */ RobotRiskManagementPart e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1966Ry1(C1100Gw1 c1100Gw1, RobotRiskManagementPart robotRiskManagementPart, JM<? super C1966Ry1> jm) {
        super(2, jm);
        this.d = c1100Gw1;
        this.e = robotRiskManagementPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1966Ry1(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1966Ry1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        EditText maximumProfitValue = this.d.p;
        Intrinsics.checkNotNullExpressionValue(maximumProfitValue, "maximumProfitValue");
        maximumProfitValue.addTextChangedListener(new a(this.e));
        return Unit.a;
    }

    /* JADX INFO: renamed from: Ry1$a */
    public static final class a implements TextWatcher {
        public final /* synthetic */ RobotRiskManagementPart d;

        public a(RobotRiskManagementPart robotRiskManagementPart) {
            this.d = robotRiskManagementPart;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Nullable Editable editable) {
            Object obj = this.d.i;
            Intrinsics.checkNotNull(obj);
            C2360Wy1 c2360Wy1 = (C2360Wy1) obj;
            String newValue = String.valueOf(editable);
            c2360Wy1.getClass();
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            if (newValue.length() == 0) {
                return;
            }
            C6561sS.g(c2360Wy1, new C3475dz1(c2360Wy1, newValue, null));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
