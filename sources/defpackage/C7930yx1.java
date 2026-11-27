package defpackage;

import android.widget.ImageView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$$inlined$launchAndCollectIn$default$4", f = "RobotInvestmentPart.kt", l = {48}, m = "invokeSuspend")
public final class C7930yx1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C5561ng0 g;
    public final /* synthetic */ C2533Yv1 h;

    /* JADX INFO: renamed from: yx1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initFlowCollectors$lambda$21$$inlined$launchAndCollectIn$default$4$1", f = "RobotInvestmentPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C5561ng0 g;
        public final /* synthetic */ C2533Yv1 h;

        /* JADX INFO: renamed from: yx1$a$a, reason: collision with other inner class name */
        public static final class C0544a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C2533Yv1 e;

            public C0544a(KN kn, C2533Yv1 c2533Yv1) {
                this.e = c2533Yv1;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C2153Uj c2153Uj = (C2153Uj) obj;
                String str = c2153Uj.b;
                C2533Yv1 c2533Yv1 = this.e;
                ImageView investmentAssetIcon = c2533Yv1.j;
                if (str != null) {
                    Intrinsics.checkNotNullExpressionValue(investmentAssetIcon, "investmentAssetIcon");
                    C3435dm0.c(investmentAssetIcon, c2153Uj.b, R.drawable.ic_trading_asset_not_loaded_icon);
                } else {
                    Integer num = c2153Uj.a;
                    if (num != null) {
                        Intrinsics.checkNotNullExpressionValue(investmentAssetIcon, "investmentAssetIcon");
                        C3435dm0.i(investmentAssetIcon, num);
                    }
                }
                c2533Yv1.m.setText(c2153Uj.c);
                c2533Yv1.n.setText(c2153Uj.d);
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
                C0544a c0544a = new C0544a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0544a, this) == mn) {
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
    public C7930yx1(FP0 fp0, C5561ng0 c5561ng0, JM jm, C2533Yv1 c2533Yv1) {
        super(2, jm);
        this.e = fp0;
        this.g = c5561ng0;
        this.h = c2533Yv1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7930yx1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7930yx1) create(kn, jm)).invokeSuspend(Unit.a);
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
