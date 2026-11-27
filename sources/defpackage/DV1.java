package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.recyclerview.widget.RecyclerView;
import com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase$initFlowCollectors$$inlined$launchAndCollectIn$2", f = "SupportIssueCategoriesPartBase.kt", l = {48}, m = "invokeSuspend")
public final class DV1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ XV1.b g;
    public final /* synthetic */ SupportIssueCategoriesPartBase h;

    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase$initFlowCollectors$$inlined$launchAndCollectIn$2$1", f = "SupportIssueCategoriesPartBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ XV1.b g;
        public final /* synthetic */ SupportIssueCategoriesPartBase h;

        /* JADX INFO: renamed from: DV1$a$a, reason: collision with other inner class name */
        public static final class C0016a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ SupportIssueCategoriesPartBase e;

            public C0016a(KN kn, SupportIssueCategoriesPartBase supportIssueCategoriesPartBase) {
                this.e = supportIssueCategoriesPartBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SupportIssueCategoriesPartBase supportIssueCategoriesPartBase = this.e;
                ShimmerFrameLayout categoriesListShimmer = ((C6098qD0) supportIssueCategoriesPartBase.k()).e;
                Intrinsics.checkNotNullExpressionValue(categoriesListShimmer, "categoriesListShimmer");
                categoriesListShimmer.setVisibility(zBooleanValue ? 0 : 8);
                ShimmerFrameLayout categoriesListShimmer2 = ((C6098qD0) supportIssueCategoriesPartBase.k()).e;
                Intrinsics.checkNotNullExpressionValue(categoriesListShimmer2, "categoriesListShimmer");
                if (zBooleanValue) {
                    categoriesListShimmer2.b();
                } else {
                    categoriesListShimmer2.c();
                }
                RecyclerView issueCategoriesRecycler = ((C6098qD0) supportIssueCategoriesPartBase.k()).g;
                Intrinsics.checkNotNullExpressionValue(issueCategoriesRecycler, "issueCategoriesRecycler");
                issueCategoriesRecycler.setVisibility(zBooleanValue ? 8 : 0);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(XV1.b bVar, JM jm, SupportIssueCategoriesPartBase supportIssueCategoriesPartBase) {
            super(2, jm);
            this.g = bVar;
            this.h = supportIssueCategoriesPartBase;
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
                C0016a c0016a = new C0016a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0016a, this) == mn) {
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
    public DV1(FP0 fp0, XV1.b bVar, JM jm, SupportIssueCategoriesPartBase supportIssueCategoriesPartBase) {
        super(2, jm);
        this.e = fp0;
        this.g = bVar;
        this.h = supportIssueCategoriesPartBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new DV1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((DV1) create(kn, jm)).invokeSuspend(Unit.a);
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
