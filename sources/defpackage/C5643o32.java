package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5643o32 implements InterfaceC6396rf0<Integer> {
    public final /* synthetic */ C3735fC1 d;

    /* JADX INFO: renamed from: o32$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;

        /* JADX INFO: renamed from: o32$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.api.feature.trading.usecases.TradingNotificationController$getProgressFlow$$inlined$filter$1$2", f = "TradingNotificationController.kt", l = {219}, m = "emit")
        public static final class C0453a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0453a(JM jm) {
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

        public a(InterfaceC6606sf0 interfaceC6606sf0) {
            this.d = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM jm) {
            C0453a c0453a;
            if (jm instanceof C0453a) {
                c0453a = (C0453a) jm;
                int i = c0453a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0453a.e = i - Integer.MIN_VALUE;
                } else {
                    c0453a = new C0453a(jm);
                }
            } else {
                c0453a = new C0453a(jm);
            }
            Object obj2 = c0453a.d;
            MN mn = MN.d;
            int i2 = c0453a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                if (((Number) obj).intValue() >= 0) {
                    c0453a.e = 1;
                    if (this.d.a(obj, c0453a) == mn) {
                        return mn;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj2);
            }
            return Unit.a;
        }
    }

    public C5643o32(C3735fC1 c3735fC1) {
        this.d = c3735fC1;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super Integer> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
        Object objC = this.d.c(new a(interfaceC6606sf0), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
