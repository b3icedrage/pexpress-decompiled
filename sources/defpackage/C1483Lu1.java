package defpackage;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Lu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart$initFlowCollectors$$inlined$launchAndCollectIn$default$6", f = "RobotAccountSelectionPart.kt", l = {48}, m = "invokeSuspend")
public final class C1483Lu1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ C7717xw1 h;
    public final /* synthetic */ RobotAccountSelectionPart i;

    /* JADX INFO: renamed from: Lu1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart$initFlowCollectors$$inlined$launchAndCollectIn$default$6$1", f = "RobotAccountSelectionPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ C7717xw1 h;
        public final /* synthetic */ RobotAccountSelectionPart i;

        /* JADX INFO: renamed from: Lu1$a$a, reason: collision with other inner class name */
        public static final class C0088a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C7717xw1 e;
            public final /* synthetic */ RobotAccountSelectionPart g;

            public C0088a(KN kn, C7717xw1 c7717xw1, RobotAccountSelectionPart robotAccountSelectionPart) {
                this.e = c7717xw1;
                this.g = robotAccountSelectionPart;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                String strE;
                NumberFormat currencyInstance;
                R3 r3 = (R3) obj;
                C7717xw1 c7717xw1 = this.e;
                AppCompatImageView accountIcon = c7717xw1.g;
                Intrinsics.checkNotNullExpressionValue(accountIcon, "accountIcon");
                C3435dm0.e(accountIcon, r3.e, EnumC7035uh1.g);
                TextView accountName = c7717xw1.h;
                Intrinsics.checkNotNullExpressionValue(accountName, "accountName");
                String string = this.g.getString(r3.a);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                C1874Qu.s(accountName, string);
                TextView accountBalance = c7717xw1.e;
                Intrinsics.checkNotNullExpressionValue(accountBalance, "accountBalance");
                C7396wQ c7396wQ = r3.b;
                Double d = new Double(c7396wQ.b);
                String upperCase = c7396wQ.a.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                try {
                    if (Intrinsics.a(upperCase, "DEMO")) {
                        currencyInstance = NumberFormat.getCurrencyInstance();
                        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                        decimalFormatSymbols.setCurrencySymbol("Đ");
                        Intrinsics.c(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
                        ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
                    } else {
                        currencyInstance = NumberFormat.getCurrencyInstance();
                        currencyInstance.setCurrency(Currency.getInstance(upperCase));
                    }
                    strE = currencyInstance.format(d);
                    Intrinsics.checkNotNullExpressionValue(strE, "format(...)");
                } catch (IllegalArgumentException unused) {
                    String str = new DecimalFormat("###,###,##0.00").format(d);
                    String upperCase2 = C5491nL.c(" ", upperCase).toUpperCase(Locale.ROOT);
                    strE = C6133qP.e(upperCase2, "toUpperCase(...)", str, upperCase2);
                }
                C1874Qu.s(accountBalance, "\u202a" + QO.o(strE));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JM jm, C7717xw1 c7717xw1, FP1 fp1, RobotAccountSelectionPart robotAccountSelectionPart) {
            super(2, jm);
            this.g = fp1;
            this.h = c7717xw1;
            this.i = robotAccountSelectionPart;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(jm, this.h, this.g, this.i);
            aVar.e = obj;
            return aVar;
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
                C0088a c0088a = new C0088a((KN) this.e, this.h, this.i);
                this.d = 1;
                if (this.g.c(c0088a, this) == mn) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1483Lu1(JM jm, FP0 fp0, C7717xw1 c7717xw1, FP1 fp1, RobotAccountSelectionPart robotAccountSelectionPart) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = c7717xw1;
        this.i = robotAccountSelectionPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1483Lu1(jm, this.e, this.h, this.g, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1483Lu1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(null, this.h, this.g, this.i);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
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
