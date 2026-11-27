package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase$initFlowCollectors$$inlined$launchAndCollectIn$1", f = "SupportPopularQuestionsPartBase.kt", l = {48}, m = "invokeSuspend")
public final class VV1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ SupportPopularQuestionsPartBase h;

    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase$initFlowCollectors$$inlined$launchAndCollectIn$1$1", f = "SupportPopularQuestionsPartBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ SupportPopularQuestionsPartBase h;

        /* JADX INFO: renamed from: VV1$a$a, reason: collision with other inner class name */
        public static final class C0160a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ SupportPopularQuestionsPartBase e;

            public C0160a(KN kn, SupportPopularQuestionsPartBase supportPopularQuestionsPartBase) {
                this.e = supportPopularQuestionsPartBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C5053lG c5053lG;
                List<T> list = (List) obj;
                SupportPopularQuestionsPartBase supportPopularQuestionsPartBase = this.e;
                supportPopularQuestionsPartBase.getClass();
                Iterator<T> it = list.iterator();
                if (it.hasNext()) {
                    T next = it.next();
                    if (it.hasNext()) {
                        int length = ((C5053lG) next).a.length();
                        do {
                            T next2 = it.next();
                            int length2 = ((C5053lG) next2).a.length();
                            if (length < length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it.hasNext());
                    }
                    c5053lG = next;
                } else {
                    c5053lG = null;
                }
                C5053lG c5053lG2 = c5053lG;
                if (c5053lG2 != null) {
                    ((C1831Qf1) supportPopularQuestionsPartBase.k()).e.g.setText(c5053lG2.a);
                }
                ((C1597Nf1) supportPopularQuestionsPartBase.m.getValue()).p(list);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, SupportPopularQuestionsPartBase supportPopularQuestionsPartBase) {
            super(2, jm);
            this.g = interfaceC6396rf0;
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
                C0160a c0160a = new C0160a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0160a, this) == mn) {
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
    public VV1(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, SupportPopularQuestionsPartBase supportPopularQuestionsPartBase) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = supportPopularQuestionsPartBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new VV1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((VV1) create(kn, jm)).invokeSuspend(Unit.a);
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
