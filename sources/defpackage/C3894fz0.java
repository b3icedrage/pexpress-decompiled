package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsBottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsBottomSheetDialogFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1", f = "IndicatorsDetailsBottomSheetDialogFragment.kt", l = {48}, m = "invokeSuspend")
public final class C3894fz0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ IndicatorsDetailsBottomSheetDialogFragment h;

    /* JADX INFO: renamed from: fz0$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsBottomSheetDialogFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1$1", f = "IndicatorsDetailsBottomSheetDialogFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ IndicatorsDetailsBottomSheetDialogFragment h;

        /* JADX INFO: renamed from: fz0$a$a, reason: collision with other inner class name */
        public static final class C0359a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ IndicatorsDetailsBottomSheetDialogFragment e;

            public C0359a(KN kn, IndicatorsDetailsBottomSheetDialogFragment indicatorsDetailsBottomSheetDialogFragment) {
                this.e = indicatorsDetailsBottomSheetDialogFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C1491Lx0 item = (C1491Lx0) obj;
                IndicatorsDetailsBottomSheetDialogFragment indicatorsDetailsBottomSheetDialogFragment = this.e;
                C2274Vx0 indicatorDetailsView = indicatorsDetailsBottomSheetDialogFragment.i().h;
                Intrinsics.checkNotNullExpressionValue(indicatorDetailsView, "indicatorDetailsView");
                C3262cy0 c3262cy0 = new C3262cy0(indicatorDetailsView);
                Intrinsics.checkNotNullParameter(item, "item");
                C2274Vx0 c2274Vx0 = c3262cy0.u;
                Context context = c2274Vx0.d.getContext();
                c2274Vx0.n.setText(item.e);
                CardView indicatorDetailsBottomCard = c2274Vx0.e;
                Intrinsics.checkNotNullExpressionValue(indicatorDetailsBottomCard, "indicatorDetailsBottomCard");
                String str = item.b;
                boolean z = false;
                indicatorDetailsBottomCard.setVisibility(Intrinsics.a(str, "summary") ? 0 : 8);
                ImageView indicatorDetailsIcon = c2274Vx0.j;
                Intrinsics.checkNotNullExpressionValue(indicatorDetailsIcon, "indicatorDetailsIcon");
                MA1.d(indicatorDetailsIcon, item.c);
                if (Intrinsics.a(str, "summary")) {
                    indicatorDetailsIcon.setBackgroundResource(R.drawable.transparent_bg);
                }
                boolean zA = Intrinsics.a(str, "summary");
                ShapeableImageView indicatorDetailsPageIllustration = c2274Vx0.m;
                String str2 = item.d;
                if (zA) {
                    Intrinsics.checkNotNullExpressionValue(indicatorDetailsPageIllustration, "indicatorDetailsPageIllustration");
                    C3435dm0.j(indicatorDetailsPageIllustration, str2, R.drawable.ic_indicators_summary_details_placeholder);
                } else {
                    Intrinsics.checkNotNullExpressionValue(indicatorDetailsPageIllustration, "indicatorDetailsPageIllustration");
                    C3435dm0.f(indicatorDetailsPageIllustration, str2);
                }
                ImageView indicatorDetailsLockIcon = c2274Vx0.k;
                Intrinsics.checkNotNullExpressionValue(indicatorDetailsLockIcon, "indicatorDetailsLockIcon");
                boolean z2 = item.l;
                indicatorDetailsLockIcon.setVisibility((!z2 || Intrinsics.a(str, "summary")) ? 8 : 0);
                LinearLayout linearLayout = c2274Vx0.o;
                linearLayout.removeAllViews();
                for (EnumC2121Ty0 enumC2121Ty0 : item.i) {
                    View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.indicator_details_item_tag, linearLayout, z);
                    TextView textView = (TextView) C3476e.h(viewInflate, R.id.step_description_text);
                    if (textView == null) {
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.step_description_text)));
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    Intrinsics.checkNotNullExpressionValue(new C2356Wx0(constraintLayout, textView), "inflate(...)");
                    textView.setText(context.getString(LL.l(enumC2121Ty0)));
                    linearLayout.addView(constraintLayout);
                    z = false;
                }
                TextView textView2 = c2274Vx0.l;
                Integer num = item.h;
                if (num != null) {
                    textView2.setText(context.getString(num.intValue()));
                }
                if (Intrinsics.a(str, "summary")) {
                    TextView indicatorDetailsBottomCardDescriptionThird = c2274Vx0.h;
                    Intrinsics.checkNotNullExpressionValue(indicatorDetailsBottomCardDescriptionThird, "indicatorDetailsBottomCardDescriptionThird");
                    indicatorDetailsBottomCardDescriptionThird.setVisibility(8);
                    c2274Vx0.g.setText(context.getString(R.string.ai_strategy_moving_averages));
                    c2274Vx0.i.setText(context.getString(R.string.ai_strategy_technical_indicators));
                }
                MaterialButton indicatorDetailsSelectionButton = indicatorsDetailsBottomSheetDialogFragment.i().g;
                Intrinsics.checkNotNullExpressionValue(indicatorDetailsSelectionButton, "indicatorDetailsSelectionButton");
                indicatorDetailsSelectionButton.setVisibility(z2 ? 4 : 0);
                MaterialButton indicatorDetailsActivationButton = indicatorsDetailsBottomSheetDialogFragment.i().e;
                Intrinsics.checkNotNullExpressionValue(indicatorDetailsActivationButton, "indicatorDetailsActivationButton");
                indicatorDetailsActivationButton.setVisibility(!z2 ? 4 : 0);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, IndicatorsDetailsBottomSheetDialogFragment indicatorsDetailsBottomSheetDialogFragment) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = indicatorsDetailsBottomSheetDialogFragment;
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
                C0359a c0359a = new C0359a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0359a, this) == mn) {
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
    public C3894fz0(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, IndicatorsDetailsBottomSheetDialogFragment indicatorsDetailsBottomSheetDialogFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = indicatorsDetailsBottomSheetDialogFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3894fz0(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3894fz0) create(kn, jm)).invokeSuspend(Unit.a);
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
