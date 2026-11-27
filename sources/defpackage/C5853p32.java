package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: p32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$getProgressFlow$$inlined$transform$1", f = "TradingNotificationController.kt", l = {36}, m = "invokeSuspend")
public final class C5853p32 extends AW1 implements Function2<InterfaceC6606sf0<? super Integer>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1699On1 g;
    public final /* synthetic */ D32 h;

    /* JADX INFO: renamed from: p32$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0<Integer> d;
        public final /* synthetic */ D32 e;

        /* JADX INFO: renamed from: p32$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$getProgressFlow$$inlined$transform$1$1", f = "TradingNotificationController.kt", l = {219}, m = "emit")
        public static final class C0468a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0468a(JM jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.e |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(InterfaceC6606sf0 interfaceC6606sf0, D32 d32) {
            this.e = d32;
            this.d = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(T t, @NotNull JM<? super Unit> jm) {
            C0468a c0468a;
            if (jm instanceof C0468a) {
                c0468a = (C0468a) jm;
                int i = c0468a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0468a.e = i - Integer.MIN_VALUE;
                } else {
                    c0468a = new C0468a(jm);
                }
            } else {
                c0468a = new C0468a(jm);
            }
            Object obj = c0468a.d;
            MN mn = MN.d;
            int i2 = c0468a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj);
                Integer num = new Integer(100 - ((int) ((((Number) t).intValue() / this.e.c.r0) * 100)));
                c0468a.e = 1;
                if (this.d.a(num, c0468a) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5853p32(C1699On1 c1699On1, JM jm, D32 d32) {
        super(2, jm);
        this.g = c1699On1;
        this.h = d32;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C5853p32 c5853p32 = new C5853p32(this.g, jm, this.h);
        c5853p32.e = obj;
        return c5853p32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<? super Integer> interfaceC6606sf0, JM<? super Unit> jm) {
        return ((C5853p32) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a((InterfaceC6606sf0) this.e, this.h);
            this.d = 1;
            if (this.g.d.c(aVar, this) == mn) {
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
