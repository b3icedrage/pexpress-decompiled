package defpackage;

import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.support.support.screens.need_help.SupportNeedHelpPartBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.need_help.SupportNeedHelpPartBase$initFlowCollectors$$inlined$launchAndCollectIn$default$3", f = "SupportNeedHelpPartBase.kt", l = {48}, m = "invokeSuspend")
public final class OV1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C6610sg0 g;
    public final /* synthetic */ SupportNeedHelpPartBase h;

    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.need_help.SupportNeedHelpPartBase$initFlowCollectors$$inlined$launchAndCollectIn$default$3$1", f = "SupportNeedHelpPartBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C6610sg0 g;
        public final /* synthetic */ SupportNeedHelpPartBase h;

        /* JADX INFO: renamed from: OV1$a$a, reason: collision with other inner class name */
        public static final class C0111a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ SupportNeedHelpPartBase e;

            public C0111a(KN kn, SupportNeedHelpPartBase supportNeedHelpPartBase) {
                this.e = supportNeedHelpPartBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SupportNeedHelpPartBase supportNeedHelpPartBase = this.e;
                TextView indicator = ((C2639a31) supportNeedHelpPartBase.k()).e.g;
                Intrinsics.checkNotNullExpressionValue(indicator, "indicator");
                indicator.setVisibility(zBooleanValue ? 0 : 8);
                ((C2639a31) supportNeedHelpPartBase.k()).e.g.setText("1");
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6610sg0 c6610sg0, JM jm, SupportNeedHelpPartBase supportNeedHelpPartBase) {
            super(2, jm);
            this.g = c6610sg0;
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
                C0111a c0111a = new C0111a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0111a, this) == mn) {
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
    public OV1(FP0 fp0, C6610sg0 c6610sg0, JM jm, SupportNeedHelpPartBase supportNeedHelpPartBase) {
        super(2, jm);
        this.e = fp0;
        this.g = c6610sg0;
        this.h = supportNeedHelpPartBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new OV1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((OV1) create(kn, jm)).invokeSuspend(Unit.a);
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
