package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Wr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.ReplySubscriptionKt$sendOnceAfterSubscribed$1", f = "ReplySubscription.kt", l = {46}, m = "invokeSuspend")
public final class C2339Wr1 extends AW1 implements Function2<InterfaceC1133Hh1<Object>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AtomicBoolean g;
    public final /* synthetic */ P22 h;
    public final /* synthetic */ C3098cA i;

    /* JADX INFO: renamed from: Wr1$a */
    @InterfaceC3368dU(c = "com.base.core.backend.ReplySubscriptionKt$sendOnceAfterSubscribed$1$1", f = "ReplySubscription.kt", l = {44}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C3098cA e;
        public final /* synthetic */ InterfaceC1133Hh1<Object> g;

        /* JADX INFO: renamed from: Wr1$a$a, reason: collision with other inner class name */
        public static final class C0177a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC1133Hh1<T> d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0177a(InterfaceC1133Hh1<? super T> interfaceC1133Hh1) {
                this.d = interfaceC1133Hh1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(T t, JM<? super Unit> jm) {
                Object objJ = this.d.j(jm, t);
                return objJ == MN.d ? objJ : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3098cA c3098cA, InterfaceC1133Hh1 interfaceC1133Hh1, JM jm) {
            super(2, jm);
            this.e = c3098cA;
            this.g = interfaceC1133Hh1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, this.g, jm);
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
                C0177a c0177a = new C0177a(this.g);
                this.d = 1;
                if (this.e.c(c0177a, this) == mn) {
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
    public C2339Wr1(AtomicBoolean atomicBoolean, P22 p22, C3098cA c3098cA, JM jm) {
        super(2, jm);
        this.g = atomicBoolean;
        this.h = p22;
        this.i = c3098cA;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C2339Wr1 c2339Wr1 = new C2339Wr1(this.g, this.h, this.i, jm);
        c2339Wr1.e = obj;
        return c2339Wr1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1133Hh1<Object> interfaceC1133Hh1, JM<? super Unit> jm) {
        return ((C2339Wr1) create(interfaceC1133Hh1, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC1133Hh1 interfaceC1133Hh1 = (InterfaceC1133Hh1) this.e;
            C5189lv.j(interfaceC1133Hh1, C6266r20.b, ON.h, new a(this.i, interfaceC1133Hh1, null));
            if (this.g.compareAndSet(false, true)) {
                this.d = 1;
                if (this.h.invoke(this) == mn) {
                    return mn;
                }
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
