package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5036lA0 extends C4616jA0 {

    @NotNull
    public final Vg2 b;

    @NotNull
    public final C3836fh2 c;

    /* JADX INFO: renamed from: lA0$a */
    @InterfaceC3368dU(c = "com.impl.core.backend.usecases.InitializeExecutorUseCaseImpl", f = "InitializeExecutorUseCaseImpl.kt", l = {33, 34}, m = "connect")
    public static final class a extends LM {
        public C5036lA0 d;
        public Function1 e;
        public /* synthetic */ Object g;
        public int i;

        public a(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return C5036lA0.this.d(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5036lA0(@NotNull Vg2 executor, @NotNull C3836fh2 realExecutor) {
        super(executor);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(realExecutor, "realExecutor");
        this.b = executor;
        this.c = realExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r6.f(r0) == r1) goto L22;
     */
    @Override // defpackage.InterfaceC4358iA0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.LM r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C4826kA0
            if (r0 == 0) goto L13
            r0 = r6
            kA0 r0 = (defpackage.C4826kA0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            kA0 r0 = new kA0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            lA0 r2 = r0.d
            defpackage.C1795Pt1.b(r6)
            goto L49
        L38:
            defpackage.C1795Pt1.b(r6)
            r0.d = r5
            r0.h = r4
            fh2 r6 = r5.c
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            Vg2 r6 = r2.b
            r2 = 0
            r0.d = r2
            r0.h = r3
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5036lA0.a(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC4358iA0
    @Nullable
    public final Object c(@NotNull LM lm) {
        C5249mA0 c5249mA0;
        C5036lA0 c5036lA0;
        if (lm instanceof C5249mA0) {
            c5249mA0 = (C5249mA0) lm;
            int i = c5249mA0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5249mA0.h = i - Integer.MIN_VALUE;
            } else {
                c5249mA0 = new C5249mA0(this, lm);
            }
        } else {
            c5249mA0 = new C5249mA0(this, lm);
        }
        Object objT = c5249mA0.e;
        MN mn = MN.d;
        int i2 = c5249mA0.h;
        if (i2 == 0) {
            C1795Pt1.b(objT);
            C1832Qg c1832Qg = U0.N;
            if (c1832Qg != null) {
                c1832Qg.invoke("reconnect_requested", OW0.b(new Pair(Payload.SOURCE, "use_case")));
            }
            Vg2 vg2 = this.b;
            vg2.v("use_case");
            this.c.v("use_case");
            c5249mA0.d = this;
            c5249mA0.h = 1;
            objT = vg2.t(new C5980pg(2), c5249mA0);
            if (objT != mn) {
                c5036lA0 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objT);
            return objT;
        }
        c5036lA0 = c5249mA0.d;
        C1795Pt1.b(objT);
        if (!((Boolean) objT).booleanValue()) {
            return Boolean.FALSE;
        }
        C3836fh2 c3836fh2 = c5036lA0.c;
        c5249mA0.d = null;
        c5249mA0.h = 2;
        Object objT2 = c3836fh2.t(new C5980pg(2), c5249mA0);
        return objT2 == mn ? mn : objT2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.C4616jA0
    @Nullable
    public final Object d(@NotNull Function1<? super CommonError, Unit> function1, @NotNull JM<? super Boolean> jm) {
        a aVar;
        C5036lA0 c5036lA0;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.i = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((LM) jm);
            }
        } else {
            aVar = new a((LM) jm);
        }
        Object objE = aVar.g;
        MN mn = MN.d;
        int i2 = aVar.i;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            aVar.d = this;
            aVar.e = function1;
            aVar.i = 1;
            Vg2 vg2 = this.b;
            vg2.getClass();
            objE = Vg2.E(vg2, aVar);
            if (objE != mn) {
                c5036lA0 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objE);
            return objE;
        }
        c5036lA0 = aVar.d;
        C1795Pt1.b(objE);
        if (!((Boolean) objE).booleanValue()) {
            return Boolean.FALSE;
        }
        C3836fh2 c3836fh2 = c5036lA0.c;
        aVar.d = null;
        aVar.e = null;
        aVar.i = 2;
        c3836fh2.getClass();
        Object objE2 = Vg2.E(c3836fh2, aVar);
        return objE2 == mn ? mn : objE2;
    }
}
