package defpackage;

import android.widget.ImageView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.stub.screens.stub_results.StubResultsFragment;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stub.screens.stub_results.StubResultsFragment$initViews$$inlined$launchAndCollectIn$default$1", f = "StubResultsFragment.kt", l = {48}, m = "invokeSuspend")
public final class OT1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ VT1.a g;
    public final /* synthetic */ StubResultsFragment h;

    @InterfaceC3368dU(c = "com.base.feature.stub.screens.stub_results.StubResultsFragment$initViews$$inlined$launchAndCollectIn$default$1$1", f = "StubResultsFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ VT1.a g;
        public final /* synthetic */ StubResultsFragment h;

        /* JADX INFO: renamed from: OT1$a$a, reason: collision with other inner class name */
        public static final class C0110a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ StubResultsFragment e;

            public C0110a(KN kn, StubResultsFragment stubResultsFragment) {
                this.e = stubResultsFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                JT1 jt1 = (JT1) obj;
                PT1 pt1K = this.e.k();
                ImageView stubResultsImage = pt1K.e;
                Intrinsics.checkNotNullExpressionValue(stubResultsImage, "stubResultsImage");
                C3435dm0.d(stubResultsImage, jt1.a);
                pt1K.i.setText(jt1.b);
                pt1K.h.setText(R.string.try_again_get_info_text);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(VT1.a aVar, JM jm, StubResultsFragment stubResultsFragment) {
            super(2, jm);
            this.g = aVar;
            this.h = stubResultsFragment;
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
                C0110a c0110a = new C0110a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0110a, this) == mn) {
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
    public OT1(FP0 fp0, VT1.a aVar, JM jm, StubResultsFragment stubResultsFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = aVar;
        this.h = stubResultsFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new OT1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((OT1) create(kn, jm)).invokeSuspend(Unit.a);
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
