package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase$initFlowCollectors$$inlined$launchAndCollectIn$1", f = "SupportIssueCategoriesPartBase.kt", l = {48}, m = "invokeSuspend")
public final class CV1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ SupportIssueCategoriesPartBase h;

    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase$initFlowCollectors$$inlined$launchAndCollectIn$1$1", f = "SupportIssueCategoriesPartBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ SupportIssueCategoriesPartBase h;

        /* JADX INFO: renamed from: CV1$a$a, reason: collision with other inner class name */
        public static final class C0011a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ SupportIssueCategoriesPartBase e;

            public C0011a(KN kn, SupportIssueCategoriesPartBase supportIssueCategoriesPartBase) {
                this.e = supportIssueCategoriesPartBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                ((C6307rD0) this.e.m.getValue()).p((List) obj);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, SupportIssueCategoriesPartBase supportIssueCategoriesPartBase) {
            super(2, jm);
            this.g = interfaceC6396rf0;
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
                C0011a c0011a = new C0011a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0011a, this) == mn) {
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
    public CV1(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, SupportIssueCategoriesPartBase supportIssueCategoriesPartBase) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = supportIssueCategoriesPartBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new CV1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((CV1) create(kn, jm)).invokeSuspend(Unit.a);
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
