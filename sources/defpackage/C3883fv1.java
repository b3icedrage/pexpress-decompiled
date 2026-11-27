package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.asset_selection.RobotAssetSelectionPart;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.asset_selection.RobotAssetSelectionPart$initFlowCollectors$lambda$3$$inlined$launchAndCollectIn$default$3", f = "RobotAssetSelectionPart.kt", l = {48}, m = "invokeSuspend")
public final class C3883fv1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ RobotAssetSelectionPart h;
    public final /* synthetic */ C0632Aw1 i;

    /* JADX INFO: renamed from: fv1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.asset_selection.RobotAssetSelectionPart$initFlowCollectors$lambda$3$$inlined$launchAndCollectIn$default$3$1", f = "RobotAssetSelectionPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ RobotAssetSelectionPart h;
        public final /* synthetic */ C0632Aw1 i;

        /* JADX INFO: renamed from: fv1$a$a, reason: collision with other inner class name */
        public static final class C0354a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ RobotAssetSelectionPart e;
            public final /* synthetic */ C0632Aw1 g;

            public C0354a(KN kn, RobotAssetSelectionPart robotAssetSelectionPart, C0632Aw1 c0632Aw1) {
                this.e = robotAssetSelectionPart;
                this.g = c0632Aw1;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                InterfaceC4303hv1 interfaceC4303hv1 = (InterfaceC4303hv1) obj;
                this.e.l(false);
                if (interfaceC4303hv1 instanceof InterfaceC4303hv1.d) {
                    C0632Aw1 c0632Aw1 = this.g;
                    TextView assetName = c0632Aw1.h;
                    Intrinsics.checkNotNullExpressionValue(assetName, "assetName");
                    InterfaceC4303hv1.d dVar = (InterfaceC4303hv1.d) interfaceC4303hv1;
                    C1874Qu.s(assetName, dVar.a().b);
                    TextView assetPercents = c0632Aw1.i;
                    Intrinsics.checkNotNullExpressionValue(assetPercents, "assetPercents");
                    C1874Qu.s(assetPercents, dVar.a().c);
                    TextView assetAutoText = c0632Aw1.e;
                    Intrinsics.checkNotNullExpressionValue(assetAutoText, "assetAutoText");
                    boolean z = interfaceC4303hv1 instanceof InterfaceC4303hv1.a;
                    assetAutoText.setVisibility(z ? 0 : 8);
                    ImageView assetIcon = c0632Aw1.g;
                    if (z) {
                        Intrinsics.checkNotNullExpressionValue(assetIcon, "assetIcon");
                        C3435dm0.i(assetIcon, new Integer(2131231099));
                    } else {
                        Intrinsics.checkNotNullExpressionValue(assetIcon, "assetIcon");
                        C3435dm0.c(assetIcon, dVar.a().a, R.drawable.ic_trading_asset_not_loaded_icon);
                    }
                } else if (!Intrinsics.a(interfaceC4303hv1, InterfaceC4303hv1.b.a)) {
                    throw new C6489s51();
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, RobotAssetSelectionPart robotAssetSelectionPart, C0632Aw1 c0632Aw1) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = robotAssetSelectionPart;
            this.i = c0632Aw1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h, this.i);
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
                C0354a c0354a = new C0354a((KN) this.e, this.h, this.i);
                this.d = 1;
                if (this.g.c(c0354a, this) == mn) {
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
    public C3883fv1(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, RobotAssetSelectionPart robotAssetSelectionPart, C0632Aw1 c0632Aw1) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = robotAssetSelectionPart;
        this.i = c0632Aw1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3883fv1(this.e, this.g, jm, this.h, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3883fv1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h, this.i);
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
