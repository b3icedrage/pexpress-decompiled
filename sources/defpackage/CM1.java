package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class CM1 implements SB0 {

    @NotNull
    public final C4795k21 a;

    @NotNull
    public final C2000Sk b;

    @NotNull
    public final C3735fC1 c;

    @InterfaceC3368dU(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<InterfaceC6606sf0<? super Unit>, JM<? super Unit>, Object> {
        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new a(2, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC6606sf0<? super Unit> interfaceC6606sf0, JM<? super Unit> jm) {
            return ((a) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Unit.a;
        }
    }

    public CM1(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.a = ED.c();
        this.b = new C2000Sk();
        this.c = new C3735fC1(new a(2, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.SB0
    @Nullable
    public final Object a(@NotNull Function1 function1, @NotNull LM lm) throws Throwable {
        AM1 am1;
        C4795k21 c4795k21;
        Throwable th;
        InterfaceC4117h21 interfaceC4117h21;
        if (lm instanceof AM1) {
            am1 = (AM1) lm;
            int i = am1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                am1.i = i - Integer.MIN_VALUE;
            } else {
                am1 = new AM1(this, lm);
            }
        } else {
            am1 = new AM1(this, lm);
        }
        Object obj = am1.g;
        MN mn = MN.d;
        int i2 = am1.i;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                am1.d = function1;
                c4795k21 = this.a;
                am1.e = c4795k21;
                am1.i = 1;
                if (c4795k21.a(am1) != mn) {
                }
                return mn;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4117h21 = (InterfaceC4117h21) am1.d;
                try {
                    C1795Pt1.b(obj);
                    interfaceC4117h21.b(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC4117h21.b(null);
                    throw th;
                }
            }
            C4795k21 c4795k22 = am1.e;
            Function1 function2 = (Function1) am1.d;
            C1795Pt1.b(obj);
            c4795k21 = c4795k22;
            function1 = function2;
            am1.d = c4795k21;
            am1.e = null;
            am1.i = 2;
            Object objInvoke = function1.invoke(am1);
            if (objInvoke != mn) {
                C4795k21 c4795k23 = c4795k21;
                obj = objInvoke;
                interfaceC4117h21 = c4795k23;
                interfaceC4117h21.b(null);
                return obj;
            }
            return mn;
        } catch (Throwable th3) {
            C4795k21 c4795k24 = c4795k21;
            th = th3;
            interfaceC4117h21 = c4795k24;
            interfaceC4117h21.b(null);
            throw th;
        }
    }

    @Override // defpackage.SB0
    @Nullable
    public final Integer b() {
        return new Integer(this.b.a.incrementAndGet());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.SB0
    @Nullable
    public final Object c(@NotNull Function2 function2, @NotNull LM lm) throws Throwable {
        BM1 bm1;
        C4795k21 c4795k21;
        Throwable th;
        boolean z;
        if (lm instanceof BM1) {
            bm1 = (BM1) lm;
            int i = bm1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                bm1.i = i - Integer.MIN_VALUE;
            } else {
                bm1 = new BM1(this, lm);
            }
        } else {
            bm1 = new BM1(this, lm);
        }
        Object obj = bm1.g;
        MN mn = MN.d;
        int i2 = bm1.i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = bm1.e;
            c4795k21 = bm1.d;
            try {
                C1795Pt1.b(obj);
                if (z) {
                    c4795k21.b(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    c4795k21.b(null);
                }
                throw th;
            }
        }
        C1795Pt1.b(obj);
        C4795k21 c4795k22 = this.a;
        boolean zE = c4795k22.e();
        try {
            Boolean boolValueOf = Boolean.valueOf(zE);
            bm1.d = c4795k22;
            bm1.e = zE;
            bm1.i = 1;
            Object objInvoke = function2.invoke(boolValueOf, bm1);
            if (objInvoke == mn) {
                return mn;
            }
            c4795k21 = c4795k22;
            obj = objInvoke;
            z = zE;
            if (z) {
                c4795k21.b(null);
            }
            return obj;
        } catch (Throwable th3) {
            c4795k21 = c4795k22;
            th = th3;
            z = zE;
            if (z) {
                c4795k21.b(null);
            }
            throw th;
        }
    }

    @Override // defpackage.SB0
    @NotNull
    public final C3735fC1 d() {
        return this.c;
    }

    @Override // defpackage.SB0
    @Nullable
    public final Integer e() {
        return new Integer(this.b.a.get());
    }
}
