package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.base.feature.robot.robot.options.screens.RobotOptionsPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.options.screens.RobotOptionsPart$initTextListeners$1$3", f = "RobotOptionsPart.kt", l = {}, m = "invokeSuspend")
public final class C4312hy1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C1334Jw1 d;
    public final /* synthetic */ RobotOptionsPart e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4312hy1(C1334Jw1 c1334Jw1, RobotOptionsPart robotOptionsPart, JM<? super C4312hy1> jm) {
        super(2, jm);
        this.d = c1334Jw1;
        this.e = robotOptionsPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4312hy1(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4312hy1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C1334Jw1 c1334Jw1 = this.d;
        EditText amountValueEditText = c1334Jw1.h;
        Intrinsics.checkNotNullExpressionValue(amountValueEditText, "amountValueEditText");
        amountValueEditText.addTextChangedListener(new a(c1334Jw1, this.e));
        return Unit.a;
    }

    /* JADX INFO: renamed from: hy1$a */
    public static final class a implements TextWatcher {
        public final /* synthetic */ C1334Jw1 d;
        public final /* synthetic */ RobotOptionsPart e;

        public a(C1334Jw1 c1334Jw1, RobotOptionsPart robotOptionsPart) {
            this.d = c1334Jw1;
            this.e = robotOptionsPart;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            if (this.d.h.getTag() == null) {
                Object obj = this.e.i;
                Intrinsics.checkNotNull(obj);
                C5623ny1 c5623ny1 = (C5623ny1) obj;
                String newValue = String.valueOf(charSequence);
                c5623ny1.getClass();
                Intrinsics.checkNotNullParameter(newValue, "newValue");
                if (newValue.length() == 0) {
                    return;
                }
                C6561sS.g(c5623ny1, new C4990ky1(c5623ny1, newValue, null));
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
