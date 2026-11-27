package defpackage;

import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6355rT0 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final C1281Jf b;

    @NotNull
    public final U6 c;

    @NotNull
    public final C4612j90 d;

    @NotNull
    public final InterfaceC6516sD e;

    @NotNull
    public final InterfaceC4358iA0 f;

    @NotNull
    public final InterfaceC7012ub2 g;

    @NotNull
    public final InterfaceC1777Pn1 h;

    @NotNull
    public final ArrayList i;

    /* JADX INFO: renamed from: rT0$a */
    @InterfaceC3368dU(c = "com.api.core.LogoutManager", f = "LogoutManager.kt", l = {42, 43, 44, 48, 51, 59}, m = "logout")
    public static final class a extends LM {
        public C6355rT0 d;
        public boolean e;
        public /* synthetic */ Object g;
        public int i;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return C6355rT0.this.a(false, this);
        }
    }

    /* JADX INFO: renamed from: rT0$b */
    @InterfaceC3368dU(c = "com.api.core.LogoutManager$logout$2", f = "LogoutManager.kt", l = {49}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C6355rT0.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                CookieManager cookieManager = CookieManager.getInstance();
                Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
                RV rv = C6266r20.a;
                Object objP = C5189lv.p(QV0.a, new YM(cookieManager, null), this);
                if (objP != obj2) {
                    objP = Unit.a;
                }
                if (objP == obj2) {
                    return obj2;
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

    /* JADX INFO: renamed from: rT0$c */
    @InterfaceC3368dU(c = "com.api.core.LogoutManager$logout$3", f = "LogoutManager.kt", l = {56}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public c(JM<? super c> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C6355rT0.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C6355rT0 c6355rT0 = C6355rT0.this;
                this.d = 1;
                if (c6355rT0.a.a(this) == mn) {
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

    public C6355rT0(@NotNull C4923kf appDataRepository, @NotNull C1281Jf appDataUpdatersStarter, @NotNull U6 activityAppDataUpdatersStarter, @NotNull C4612j90 eventsFlowsProvider, @NotNull InterfaceC6516sD clearUseCase, @NotNull InterfaceC4358iA0 initializeExecutorUseCase, @NotNull InterfaceC7012ub2 userRepository, @NotNull InterfaceC1777Pn1 readyToStartUpdatersUseCase) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(appDataUpdatersStarter, "appDataUpdatersStarter");
        Intrinsics.checkNotNullParameter(activityAppDataUpdatersStarter, "activityAppDataUpdatersStarter");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(clearUseCase, "clearUseCase");
        Intrinsics.checkNotNullParameter(initializeExecutorUseCase, "initializeExecutorUseCase");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(readyToStartUpdatersUseCase, "readyToStartUpdatersUseCase");
        this.a = appDataRepository;
        this.b = appDataUpdatersStarter;
        this.c = activityAppDataUpdatersStarter;
        this.d = eventsFlowsProvider;
        this.e = clearUseCase;
        this.f = initializeExecutorUseCase;
        this.g = userRepository;
        this.h = readyToStartUpdatersUseCase;
        this.i = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f A[PHI: r2 r9
      0x008f: PHI (r2v4 rT0) = (r2v2 rT0), (r2v5 rT0) binds: [B:28:0x008b, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r9v3 boolean) = (r9v1 boolean), (r9v4 boolean) binds: [B:28:0x008b, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f A[PHI: r2 r9
      0x009f: PHI (r2v6 rT0) = (r2v4 rT0), (r2v7 rT0) binds: [B:31:0x009b, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r9v5 boolean) = (r9v3 boolean), (r9v6 boolean) binds: [B:31:0x009b, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x0132 A[PHI: r2 r9
      0x0132: PHI (r2v8 rT0) = (r2v6 rT0), (r2v9 rT0) binds: [B:37:0x012f, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r9v7 boolean) = (r9v5 boolean), (r9v8 boolean) binds: [B:37:0x012f, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0142 A[PHI: r2 r9
      0x0142: PHI (r2v10 rT0) = (r2v8 rT0), (r2v12 rT0) binds: [B:40:0x013f, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r9v9 boolean) = (r9v7 boolean), (r9v14 boolean) binds: [B:40:0x013f, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x015d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0172  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016c, code lost:
    
        if (r9.a(r10, r0) == r1) goto L46;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r9, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6355rT0.a(boolean, JM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(boolean z, @NotNull LM lm) {
        C6565sT0 c6565sT0;
        C6355rT0 c6355rT0;
        Iterator it;
        if (lm instanceof C6565sT0) {
            c6565sT0 = (C6565sT0) lm;
            int i = c6565sT0.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6565sT0.j = i - Integer.MIN_VALUE;
            } else {
                c6565sT0 = new C6565sT0(this, lm);
            }
        } else {
            c6565sT0 = new C6565sT0(this, lm);
        }
        Object obj = c6565sT0.h;
        MN mn = MN.d;
        int i2 = c6565sT0.j;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            this.d.a();
            c6355rT0 = this;
            it = this.i.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c6565sT0.g;
            it = c6565sT0.e;
            c6355rT0 = c6565sT0.d;
            C1795Pt1.b(obj);
        }
        while (it.hasNext()) {
            Function2 function2 = (Function2) it.next();
            Boolean boolValueOf = Boolean.valueOf(z);
            c6565sT0.d = c6355rT0;
            c6565sT0.e = it;
            c6565sT0.g = z;
            c6565sT0.j = 1;
            if (function2.invoke(boolValueOf, c6565sT0) == mn) {
                return mn;
            }
        }
        c6355rT0.i.clear();
        return Unit.a;
    }
}
