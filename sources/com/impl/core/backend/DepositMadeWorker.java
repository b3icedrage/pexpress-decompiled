package com.impl.core.backend;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.appsflyer.share.attribution.RequestError;
import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.C3999gU1;
import defpackage.C4923kf;
import defpackage.C5189lv;
import defpackage.C6266r20;
import defpackage.C6930uB;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC7012ub2;
import defpackage.JM;
import defpackage.KN;
import defpackage.LM;
import defpackage.MN;
import defpackage.R51;
import defpackage.RV;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B=\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/impl/core/backend/DepositMadeWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lkf;", "appData", "LuB;", "checkDepositMadeUseCase", "LgU1;", "subscribeForDepositUseCase", "Lub2;", "userRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkf;LuB;LgU1;Lub2;)V", R51.PUSH_ADDITIONAL_DATA_KEY, "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DepositMadeWorker extends CoroutineWorker {

    @NotNull
    public final C4923kf d;

    @NotNull
    public final C6930uB e;

    @NotNull
    public final C3999gU1 g;

    @NotNull
    public final InterfaceC7012ub2 h;

    public interface a {
        @NotNull
        DepositMadeWorker a(@NotNull Context context, @NotNull WorkerParameters workerParameters);
    }

    @InterfaceC3368dU(c = "com.impl.core.backend.DepositMadeWorker", f = "DepositMadeWorker.kt", l = {31}, m = "doWork")
    public static final class b extends LM {
        public /* synthetic */ Object d;
        public int g;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.g |= Integer.MIN_VALUE;
            return DepositMadeWorker.this.doWork(this);
        }
    }

    @InterfaceC3368dU(c = "com.impl.core.backend.DepositMadeWorker$doWork$2", f = "DepositMadeWorker.kt", l = {33, RequestError.NO_DEV_KEY, RequestError.RESPONSE_CODE_FAILURE}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super androidx.work.c.a>, Object> {
        public boolean d;
        public DepositMadeWorker e;
        public double g;
        public int h;

        @InterfaceC3368dU(c = "com.impl.core.backend.DepositMadeWorker$doWork$2$1", f = "DepositMadeWorker.kt", l = {36, 37}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Double>, Object> {
            public int d;
            public final /* synthetic */ DepositMadeWorker e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DepositMadeWorker depositMadeWorker, JM<? super a> jm) {
                super(2, jm);
                this.e = depositMadeWorker;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new a(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Double> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0022  */
            /* JADX WARN: Code duplicated, block: B:15:0x0033  */
            /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
            
                if (r7 == r0) goto L17;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
            @Override // defpackage.AbstractC7487wq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    MN r0 = defpackage.MN.d
                    int r1 = r6.d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    defpackage.C1795Pt1.b(r7)
                    goto L40
                L10:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L18:
                    defpackage.C1795Pt1.b(r7)
                    goto L33
                L1c:
                    defpackage.C1795Pt1.b(r7)
                    r7 = 0
                L20:
                    if (r7 != 0) goto L43
                    kotlin.time.b$a r7 = kotlin.time.b.e
                    R40 r7 = defpackage.R40.MINUTES
                    long r4 = kotlin.time.c.g(r3, r7)
                    r6.d = r3
                    java.lang.Object r7 = defpackage.IW.c(r4, r6)
                    if (r7 != r0) goto L33
                    goto L3f
                L33:
                    com.impl.core.backend.DepositMadeWorker r7 = r6.e
                    r6.d = r2
                    uB r7 = r7.e
                    java.lang.Object r7 = r7.a(r6)
                    if (r7 != r0) goto L40
                L3f:
                    return r0
                L40:
                    java.lang.Double r7 = (java.lang.Double) r7
                    goto L20
                L43:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.impl.core.backend.DepositMadeWorker.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(JM<? super c> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return DepositMadeWorker.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super androidx.work.c.a> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0079  */
        /* JADX WARN: Code duplicated, block: B:25:0x008b  */
        /* JADX WARN: Code duplicated, block: B:26:0x008e  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
        
            if (r11 == r0) goto L32;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                MN r0 = defpackage.MN.d
                int r1 = r10.h
                com.impl.core.backend.DepositMadeWorker r2 = com.impl.core.backend.DepositMadeWorker.this
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L2f
                if (r1 == r5) goto L29
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                defpackage.C1795Pt1.b(r11)
                goto La6
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                double r1 = r10.g
                boolean r4 = r10.d
                com.impl.core.backend.DepositMadeWorker r5 = r10.e
                defpackage.C1795Pt1.b(r11)
                goto L77
            L29:
                boolean r1 = r10.d
                defpackage.C1795Pt1.b(r11)
                goto L5d
            L2f:
                defpackage.C1795Pt1.b(r11)
                kf r11 = r2.d
                GP1 r11 = r11.e
                java.lang.Object r11 = r11.getValue()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                kotlin.time.b$a r1 = kotlin.time.b.e
                r1 = 30
                R40 r7 = defpackage.R40.MINUTES
                long r7 = kotlin.time.c.g(r1, r7)
                com.impl.core.backend.DepositMadeWorker$c$a r1 = new com.impl.core.backend.DepositMadeWorker$c$a
                r1.<init>(r2, r6)
                r10.d = r11
                r10.h = r5
                java.lang.Object r1 = defpackage.OZ1.d(r7, r1, r10)
                if (r1 != r0) goto L5a
                goto La5
            L5a:
                r9 = r1
                r1 = r11
                r11 = r9
            L5d:
                java.lang.Double r11 = (java.lang.Double) r11
                if (r11 == 0) goto La6
                double r7 = r11.doubleValue()
                r10.e = r2
                r10.d = r1
                r10.g = r7
                r10.h = r4
                java.lang.Object r11 = com.impl.core.backend.DepositMadeWorker.b(r2, r10)
                if (r11 != r0) goto L74
                goto La5
            L74:
                r4 = r1
                r5 = r2
                r1 = r7
            L77:
                if (r4 == 0) goto La6
                com.api.core.backend.domain.models.responseModels.CommonMakeDeposit r11 = new com.api.core.backend.domain.models.responseModels.CommonMakeDeposit
                java.lang.String r1 = java.lang.String.valueOf(r1)
                kf r2 = r5.d
                GP1 r2 = r2.k
                java.lang.Object r2 = r2.getValue()
                uG r2 = (defpackage.C6945uG) r2
                if (r2 == 0) goto L8e
                java.lang.String r2 = r2.g
                goto L8f
            L8e:
                r2 = r6
            L8f:
                r11.<init>(r1, r2)
                r10.e = r6
                r10.h = r3
                gU1 r1 = r5.g
                qK1 r1 = r1.b
                java.lang.Object r11 = r1.a(r11, r10)
                if (r11 != r0) goto La1
                goto La3
            La1:
                kotlin.Unit r11 = kotlin.Unit.a
            La3:
                if (r11 != r0) goto La6
            La5:
                return r0
            La6:
                androidx.work.c$a$c r11 = new androidx.work.c$a$c
                r11.<init>()
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.impl.core.backend.DepositMadeWorker.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositMadeWorker(@NotNull Context context, @NotNull WorkerParameters params, @NotNull C4923kf appData, @NotNull C6930uB checkDepositMadeUseCase, @NotNull C3999gU1 subscribeForDepositUseCase, @NotNull InterfaceC7012ub2 userRepository) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(checkDepositMadeUseCase, "checkDepositMadeUseCase");
        Intrinsics.checkNotNullParameter(subscribeForDepositUseCase, "subscribeForDepositUseCase");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.d = appData;
        this.e = checkDepositMadeUseCase;
        this.g = subscribeForDepositUseCase;
        this.h = userRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r7.d(r2, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.impl.core.backend.DepositMadeWorker r6, defpackage.LM r7) {
        /*
            boolean r0 = r7 instanceof defpackage.OX
            if (r0 == 0) goto L13
            r0 = r7
            OX r0 = (defpackage.OX) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            OX r0 = new OX
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.C1795Pt1.b(r7)
            goto L84
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.String r6 = r0.e
            com.impl.core.backend.DepositMadeWorker r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L6f
        L3d:
            com.impl.core.backend.DepositMadeWorker r6 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L55
        L43:
            defpackage.C1795Pt1.b(r7)
            kf r7 = r6.d
            GP1 r7 = r7.f
            r0.d = r6
            r0.i = r5
            java.lang.Object r7 = defpackage.C7236vf0.a(r7, r0)
            if (r7 != r1) goto L55
            goto L83
        L55:
            rG r7 = (defpackage.C6315rG) r7
            java.lang.String r7 = r7.a
            ub2 r2 = r6.h
            XF r5 = new XF
            r5.<init>(r7)
            r0.d = r6
            r0.e = r7
            r0.i = r4
            java.lang.Object r2 = r2.h(r5, r0)
            if (r2 != r1) goto L6d
            goto L83
        L6d:
            r2 = r6
            r6 = r7
        L6f:
            ub2 r7 = r2.h
            XF r2 = new XF
            r2.<init>(r6)
            r6 = 0
            r0.d = r6
            r0.e = r6
            r0.i = r3
            java.lang.Object r6 = r7.d(r2, r0)
            if (r6 != r1) goto L84
        L83:
            return r1
        L84:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.impl.core.backend.DepositMadeWorker.b(com.impl.core.backend.DepositMadeWorker, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public final Object doWork(@NotNull JM<? super androidx.work.c.a> jm) throws Throwable {
        b bVar;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.g = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        Object objP = bVar.d;
        MN mn = MN.d;
        int i2 = bVar.g;
        if (i2 == 0) {
            C1795Pt1.b(objP);
            RV rv = C6266r20.a;
            c cVar = new c(null);
            bVar.g = 1;
            objP = C5189lv.p(rv, cVar, bVar);
            if (objP == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objP);
        }
        Intrinsics.checkNotNullExpressionValue(objP, "withContext(...)");
        return objP;
    }
}
