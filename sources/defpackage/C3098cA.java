package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3098cA<T> extends AbstractC2123Tz<T> {

    @NotNull
    public final Object h;

    /* JADX INFO: renamed from: cA$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {92}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ InterfaceC6396rf0<T> e;
        public final /* synthetic */ KF1<T> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC6396rf0<? extends T> interfaceC6396rf0, KF1<T> kf1, JM<? super a> jm) {
            super(2, jm);
            this.e = interfaceC6396rf0;
            this.g = kf1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new a(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (this.e.c(this.g, this) == mn) {
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

    public C3098cA(@NotNull Iterable<? extends InterfaceC6396rf0<? extends T>> iterable, @NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        super(coroutineContext, i, enumC1796Pu);
        this.h = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.AbstractC2123Tz
    @Nullable
    public final Object j(@NotNull InterfaceC1133Hh1<? super T> interfaceC1133Hh1, @NotNull JM<? super Unit> jm) {
        KF1 kf1 = new KF1(interfaceC1133Hh1);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C5189lv.k(interfaceC1133Hh1, null, new a((InterfaceC6396rf0) it.next(), kf1, null), 3);
        }
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public final AbstractC2123Tz<T> k(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        return new C3098cA(this.h, coroutineContext, i, enumC1796Pu);
    }

    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public final InterfaceC0764Co1<T> m(@NotNull KN kn) {
        Function2 c2045Sz = new C2045Sz(this, null);
        EnumC1796Pu enumC1796Pu = EnumC1796Pu.d;
        ON on = ON.d;
        C1055Gh1 c1055Gh1 = new C1055Gh1(AN.b(kn, this.d), C2889bA.a(this.e, 4, enumC1796Pu), true, true);
        c1055Gh1.s0(on, c1055Gh1, c2045Sz);
        return c1055Gh1;
    }
}
