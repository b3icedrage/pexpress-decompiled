package defpackage;

import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$$inlined$launchAndCollectIn$default$1", f = "RobotInvestmentPart.kt", l = {48}, m = "invokeSuspend")
public final class C6879tx1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C5561ng0 g;
    public final /* synthetic */ C2533Yv1 h;

    /* JADX INFO: renamed from: tx1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$$inlined$launchAndCollectIn$default$1$1", f = "RobotInvestmentPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C5561ng0 g;
        public final /* synthetic */ C2533Yv1 h;

        /* JADX INFO: renamed from: tx1$a$a, reason: collision with other inner class name */
        public static final class C0498a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C2533Yv1 e;

            public C0498a(KN kn, C2533Yv1 c2533Yv1) {
                this.e = c2533Yv1;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                String strE;
                NumberFormat currencyInstance;
                C3489e3 c3489e3 = (C3489e3) obj;
                C2533Yv1 c2533Yv1 = this.e;
                TextView textView = c2533Yv1.o;
                Double d = new Double(c3489e3.b.b);
                String upperCase = c3489e3.b.a.toUpperCase(Locale.ROOT);
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
                textView.setText("\u202a" + QO.o(strE));
                c2533Yv1.i.setText(c3489e3.a);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5561ng0 c5561ng0, JM jm, C2533Yv1 c2533Yv1) {
            super(2, jm);
            this.g = c5561ng0;
            this.h = c2533Yv1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h);
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
                C0498a c0498a = new C0498a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0498a, this) == mn) {
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
    public C6879tx1(FP0 fp0, C5561ng0 c5561ng0, JM jm, C2533Yv1 c2533Yv1) {
        super(2, jm);
        this.e = fp0;
        this.g = c5561ng0;
        this.h = c2533Yv1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6879tx1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6879tx1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
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
