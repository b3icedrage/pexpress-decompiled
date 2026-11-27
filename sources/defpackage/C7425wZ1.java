package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7425wZ1 extends AbstractC7004uZ1 {

    @NotNull
    public final AbstractC1787Pr f;
    public boolean g;
    public boolean h;

    /* JADX INFO: renamed from: wZ1$a */
    @InterfaceC3368dU(c = "com.impl.feature.trading.providers.TimeSelectionsProviderImpl", f = "TimeSelectionsProviderImpl.kt", l = {19, 22, ConnectionResult.API_DISABLED, 29, 31, UserVerificationMethods.USER_VERIFY_LOCATION}, m = "lockByType")
    public static final class a extends LM {
        public C7425wZ1 d;
        public boolean e;
        public long g;
        public /* synthetic */ Object h;
        public int j;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return C7425wZ1.this.c(false, this);
        }
    }

    /* JADX INFO: renamed from: wZ1$b */
    @InterfaceC3368dU(c = "com.impl.feature.trading.providers.TimeSelectionsProviderImpl$lockByType$2", f = "TimeSelectionsProviderImpl.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function1<JM<? super kotlin.time.b>, Object> {
        public b() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new b(1, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super kotlin.time.b> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            int i = AbstractC7004uZ1.e;
            return new kotlin.time.b(AbstractC7004uZ1.b);
        }
    }

    /* JADX INFO: renamed from: wZ1$c */
    @InterfaceC3368dU(c = "com.impl.feature.trading.providers.TimeSelectionsProviderImpl$lockByType$3", f = "TimeSelectionsProviderImpl.kt", l = {}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function1<JM<? super kotlin.time.b>, Object> {
        public c() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new c(1, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super kotlin.time.b> jm) {
            return ((c) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            int i = AbstractC7004uZ1.e;
            return new kotlin.time.b(AbstractC7004uZ1.d);
        }
    }

    public C7425wZ1(@NotNull AbstractC1787Pr betDurationUseCase) {
        Intrinsics.checkNotNullParameter(betDurationUseCase, "betDurationUseCase");
        this.f = betDurationUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC7004uZ1
    @Nullable
    public final Object b(@NotNull LM lm) {
        C7214vZ1 c7214vZ1;
        C7425wZ1 c7425wZ1;
        if (lm instanceof C7214vZ1) {
            c7214vZ1 = (C7214vZ1) lm;
            int i = c7214vZ1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7214vZ1.h = i - Integer.MIN_VALUE;
            } else {
                c7214vZ1 = new C7214vZ1(this, lm);
            }
        } else {
            c7214vZ1 = new C7214vZ1(this, lm);
        }
        Object objO = c7214vZ1.e;
        MN mn = MN.d;
        int i2 = c7214vZ1.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            AbstractC1787Pr.a aVar = this.f.b;
            c7214vZ1.d = this;
            c7214vZ1.h = 1;
            objO = C4466ii.o(aVar, c7214vZ1);
            if (objO == mn) {
                return mn;
            }
            c7425wZ1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7425wZ1 = c7214vZ1.d;
            C1795Pt1.b(objO);
        }
        long j = ((kotlin.time.b) objO).d;
        boolean z = c7425wZ1.g;
        long j2 = AbstractC7004uZ1.b;
        C1709Or c1709Or = new C1709Or(20, kotlin.time.b.k(j, j2), j2, z);
        boolean z2 = c7425wZ1.g;
        long j3 = AbstractC7004uZ1.c;
        C1709Or c1709Or2 = new C1709Or(20, kotlin.time.b.k(j, j3), j3, z2);
        long j4 = AbstractC7004uZ1.d;
        return WE.f(c1709Or, c1709Or2, new C1709Or(16, kotlin.time.b.k(j, j4), j4, c7425wZ1.h));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3 A[PHI: r5 r12 r13
      0x00f3: PHI (r5v7 long) = (r5v5 long), (r5v8 long) binds: [B:39:0x00f0, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r12v16 wZ1) = (r12v14 wZ1), (r12v21 wZ1) binds: [B:39:0x00f0, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r13v22 java.lang.Object) = (r13v21 java.lang.Object), (r13v1 java.lang.Object) binds: [B:39:0x00f0, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        if (r13.j(r13.c, new defpackage.C1865Qr(r2, null), r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0110, code lost:
    
        if (r12 == r1) goto L46;
     */
    @Override // defpackage.AbstractC7004uZ1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r12, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7425wZ1.c(boolean, JM):java.lang.Object");
    }

    @Override // defpackage.AbstractC7004uZ1
    public final void d() {
        this.g = false;
        this.h = false;
    }
}
