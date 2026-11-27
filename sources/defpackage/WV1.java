package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.recyclerview.widget.RecyclerView;
import com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase$initFlowCollectors$$inlined$launchAndCollectIn$2", f = "SupportPopularQuestionsPartBase.kt", l = {48}, m = "invokeSuspend")
public final class WV1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ XV1.a g;
    public final /* synthetic */ SupportPopularQuestionsPartBase h;

    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase$initFlowCollectors$$inlined$launchAndCollectIn$2$1", f = "SupportPopularQuestionsPartBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ XV1.a g;
        public final /* synthetic */ SupportPopularQuestionsPartBase h;

        /* JADX INFO: renamed from: WV1$a$a, reason: collision with other inner class name */
        public static final class C0170a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ SupportPopularQuestionsPartBase e;

            public C0170a(KN kn, SupportPopularQuestionsPartBase supportPopularQuestionsPartBase) {
                this.e = supportPopularQuestionsPartBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SupportPopularQuestionsPartBase supportPopularQuestionsPartBase = this.e;
                ShimmerFrameLayout questionListShimmer = ((C1831Qf1) supportPopularQuestionsPartBase.k()).h;
                Intrinsics.checkNotNullExpressionValue(questionListShimmer, "questionListShimmer");
                questionListShimmer.setVisibility(zBooleanValue ? 0 : 8);
                ShimmerFrameLayout questionListShimmer2 = ((C1831Qf1) supportPopularQuestionsPartBase.k()).h;
                Intrinsics.checkNotNullExpressionValue(questionListShimmer2, "questionListShimmer");
                if (zBooleanValue) {
                    questionListShimmer2.b();
                } else {
                    questionListShimmer2.c();
                }
                RecyclerView popularQuestionsRecycler = ((C1831Qf1) supportPopularQuestionsPartBase.k()).g;
                Intrinsics.checkNotNullExpressionValue(popularQuestionsRecycler, "popularQuestionsRecycler");
                popularQuestionsRecycler.setVisibility(zBooleanValue ? 8 : 0);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(XV1.a aVar, JM jm, SupportPopularQuestionsPartBase supportPopularQuestionsPartBase) {
            super(2, jm);
            this.g = aVar;
            this.h = supportPopularQuestionsPartBase;
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
                C0170a c0170a = new C0170a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0170a, this) == mn) {
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
    public WV1(FP0 fp0, XV1.a aVar, JM jm, SupportPopularQuestionsPartBase supportPopularQuestionsPartBase) {
        super(2, jm);
        this.e = fp0;
        this.g = aVar;
        this.h = supportPopularQuestionsPartBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new WV1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((WV1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.g, aVar, this) == mn) {
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
