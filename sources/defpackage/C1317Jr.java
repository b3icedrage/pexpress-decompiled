package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.confirm_bottomsheet.screens.bet_cofirm.BetConfirmBottomSheetDialogFragment;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: renamed from: Jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.screens.bet_cofirm.BetConfirmBottomSheetDialogFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1", f = "BetConfirmBottomSheetDialogFragment.kt", l = {48}, m = "invokeSuspend")
public final class C1317Jr extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ BetConfirmBottomSheetDialogFragment h;

    /* JADX INFO: renamed from: Jr$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.screens.bet_cofirm.BetConfirmBottomSheetDialogFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1$1", f = "BetConfirmBottomSheetDialogFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ BetConfirmBottomSheetDialogFragment h;

        /* JADX INFO: renamed from: Jr$a$a, reason: collision with other inner class name */
        public static final class C0066a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ BetConfirmBottomSheetDialogFragment e;

            public C0066a(KN kn, BetConfirmBottomSheetDialogFragment betConfirmBottomSheetDialogFragment) {
                this.e = betConfirmBottomSheetDialogFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                String str;
                int i = 0;
                final C1631Nr c1631Nr = (C1631Nr) obj;
                final BetConfirmBottomSheetDialogFragment betConfirmBottomSheetDialogFragment = this.e;
                C3662es c3662esI = betConfirmBottomSheetDialogFragment.i();
                C3662es c3662esI2 = betConfirmBottomSheetDialogFragment.i();
                String str2 = c1631Nr.b;
                ImageView titleImage = c3662esI2.l;
                if (str2 != null) {
                    Intrinsics.checkNotNullExpressionValue(titleImage, "titleImage");
                    C3435dm0.f(titleImage, str2);
                }
                Integer num = c1631Nr.a;
                if (num != null) {
                    int iIntValue = num.intValue();
                    Intrinsics.checkNotNullExpressionValue(titleImage, "titleImage");
                    C3435dm0.e(titleImage, iIntValue, EnumC7035uh1.g);
                }
                TextView textView = c3662esI2.m;
                String str3 = c1631Nr.d;
                if (str3 != null && (str = c1631Nr.e) != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) str3);
                    spannableStringBuilder.append((CharSequence) " ");
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new ForegroundColorSpan(C8056za.i(betConfirmBottomSheetDialogFragment, R.color.primary)), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    textView.setText(spannableStringBuilder);
                }
                Integer num2 = c1631Nr.c;
                if (num2 != null) {
                    textView.setText(betConfirmBottomSheetDialogFragment.getString(num2.intValue()));
                    Unit unit = Unit.a;
                }
                C3243cs c3243cs = c3662esI.e;
                c3243cs.g.setText(betConfirmBottomSheetDialogFragment.getString(R.string.initial_amount_title));
                c3243cs.h.setText(c1631Nr.f);
                C3243cs c3243cs2 = c3662esI.k;
                c3243cs2.g.setText(betConfirmBottomSheetDialogFragment.getString(R.string.duration_title));
                Context context = betConfirmBottomSheetDialogFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                c3243cs2.h.setText(N7.C(b.r(c1631Nr.g, R40.SECONDS), context));
                C3243cs c3243cs3 = c3662esI.j;
                c3243cs3.g.setText(betConfirmBottomSheetDialogFragment.getString(R.string.strategy_text));
                C3496e42 c3496e42 = c1631Nr.h;
                if (c3496e42 != null) {
                    c3243cs3.h.setText(betConfirmBottomSheetDialogFragment.getString(c3496e42.b));
                }
                C3243cs c3243cs4 = c3662esI.h;
                c3243cs4.g.setText(betConfirmBottomSheetDialogFragment.getString(R.string.indicator_title));
                c3243cs4.h.setText(c1631Nr.i.e);
                View divider = c3243cs4.e;
                Intrinsics.checkNotNullExpressionValue(divider, "divider");
                divider.setVisibility(8);
                c3662esI.g.setOnClickListener(new ViewOnClickListenerC0927Er(betConfirmBottomSheetDialogFragment, c1631Nr, i));
                C3452ds c3452ds = c3662esI.i;
                c3452ds.e.setText(betConfirmBottomSheetDialogFragment.getString(R.string.one_click_deals_text));
                c3452ds.g.setText(betConfirmBottomSheetDialogFragment.getString(R.string.open_deals_without_confirm));
                SwitchMaterial switchMaterial = c3452ds.h;
                switchMaterial.setChecked(c1631Nr.k);
                switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Fr
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                        C5189lv.k(C7652xe.f(betConfirmBottomSheetDialogFragment), null, new C1239Ir(c1631Nr, z, null), 3);
                    }
                });
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, BetConfirmBottomSheetDialogFragment betConfirmBottomSheetDialogFragment) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = betConfirmBottomSheetDialogFragment;
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
                C0066a c0066a = new C0066a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0066a, this) == mn) {
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
    public C1317Jr(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, BetConfirmBottomSheetDialogFragment betConfirmBottomSheetDialogFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = betConfirmBottomSheetDialogFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1317Jr(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1317Jr) create(kn, jm)).invokeSuspend(Unit.a);
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
