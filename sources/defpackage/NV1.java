package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.support.support.screens.need_help.SupportNeedHelpPartBase;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.need_help.SupportNeedHelpPartBase$initFlowCollectors$$inlined$launchAndCollectIn$default$2", f = "SupportNeedHelpPartBase.kt", l = {48}, m = "invokeSuspend")
public final class NV1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ SupportNeedHelpPartBase h;

    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.need_help.SupportNeedHelpPartBase$initFlowCollectors$$inlined$launchAndCollectIn$default$2$1", f = "SupportNeedHelpPartBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ SupportNeedHelpPartBase h;

        /* JADX INFO: renamed from: NV1$a$a, reason: collision with other inner class name */
        public static final class C0104a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ SupportNeedHelpPartBase e;

            public C0104a(KN kn, SupportNeedHelpPartBase supportNeedHelpPartBase) {
                this.e = supportNeedHelpPartBase;
                this.d = kn;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SupportNeedHelpPartBase supportNeedHelpPartBase = this.e;
                CardView cardView = ((C2639a31) supportNeedHelpPartBase.k()).e.d;
                if (zBooleanValue) {
                    ((C2639a31) supportNeedHelpPartBase.k()).g.setText(R.string.still_need_help);
                    TextView needHelpTitle = ((C2639a31) supportNeedHelpPartBase.k()).g;
                    Intrinsics.checkNotNullExpressionValue(needHelpTitle, "needHelpTitle");
                    int iE = C8056za.e(supportNeedHelpPartBase, R.dimen.still_need_help_top_margin);
                    ViewGroup.LayoutParams layoutParams = needHelpTitle.getLayoutParams();
                    int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
                    ViewGroup.LayoutParams layoutParams2 = needHelpTitle.getLayoutParams();
                    int marginEnd = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0;
                    ViewGroup.LayoutParams layoutParams3 = needHelpTitle.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    int i = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
                    Intrinsics.checkNotNullParameter(needHelpTitle, "<this>");
                    ViewGroup.LayoutParams layoutParams4 = needHelpTitle.getLayoutParams();
                    Intrinsics.c(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams4;
                    aVar.setMargins(marginStart, iE, marginEnd, i);
                    needHelpTitle.setLayoutParams(aVar);
                    cardView.setCardBackgroundColor(C8056za.i(supportNeedHelpPartBase, R.color.surface));
                    Intrinsics.checkNotNull(cardView);
                    int iE2 = C8056za.e(supportNeedHelpPartBase, R.dimen.common_outer_margin);
                    int iE3 = C8056za.e(supportNeedHelpPartBase, R.dimen.common_outer_margin);
                    int iE4 = C8056za.e(supportNeedHelpPartBase, R.dimen.common_outer_margin);
                    int iE5 = C8056za.e(supportNeedHelpPartBase, R.dimen.chat_with_support_bottom_margin);
                    Intrinsics.checkNotNullParameter(cardView, "<this>");
                    ViewGroup.LayoutParams layoutParams5 = cardView.getLayoutParams();
                    Intrinsics.c(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams5;
                    aVar2.setMargins(iE2, iE3, iE4, iE5);
                    cardView.setLayoutParams(aVar2);
                } else {
                    cardView.setCardBackgroundColor(C8056za.i(supportNeedHelpPartBase, R.color.background));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, SupportNeedHelpPartBase supportNeedHelpPartBase) {
            super(2, jm);
            this.g = fp1;
            this.h = supportNeedHelpPartBase;
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
                C0104a c0104a = new C0104a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0104a, this) == mn) {
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
    public NV1(FP0 fp0, FP1 fp1, JM jm, SupportNeedHelpPartBase supportNeedHelpPartBase) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = supportNeedHelpPartBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new NV1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((NV1) create(kn, jm)).invokeSuspend(Unit.a);
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
