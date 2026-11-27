package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class KG implements GG {

    @NotNull
    public final InterfaceC1900Rc1 a;

    @NotNull
    public final InterfaceC3509e8 b;

    @NotNull
    public final InterfaceC3546eJ1 c;

    @NotNull
    public final InterfaceC0720Ca d;

    @NotNull
    public final C4966kq1 e;

    @InterfaceC3368dU(c = "com.base.library.registration.usecases.CompletePendingRegistrationUseCaseBase", f = "CompletePendingRegistrationUseCaseBase.kt", l = {47, 47}, m = "reportRegistration")
    public static final class a extends LM {
        public Object d;
        public /* synthetic */ Object e;
        public int h;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return KG.this.a(this);
        }
    }

    public KG(@NotNull InterfaceC1900Rc1 pendingAddUser, @NotNull InterfaceC3509e8 addUserUseCase, @NotNull InterfaceC3546eJ1 setConversionUseCase, @NotNull InterfaceC0720Ca analyticsUseCase, @NotNull C4966kq1 params) {
        Intrinsics.checkNotNullParameter(pendingAddUser, "pendingAddUser");
        Intrinsics.checkNotNullParameter(addUserUseCase, "addUserUseCase");
        Intrinsics.checkNotNullParameter(setConversionUseCase, "setConversionUseCase");
        Intrinsics.checkNotNullParameter(analyticsUseCase, "analyticsUseCase");
        Intrinsics.checkNotNullParameter(params, "params");
        this.a = pendingAddUser;
        this.b = addUserUseCase;
        this.c = setConversionUseCase;
        this.d = analyticsUseCase;
        this.e = params;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.GG
    @Nullable
    public final Object a(@NotNull JM<? super CommonResult<?>> jm) {
        a aVar;
        KG kg;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object objB = aVar.e;
        MN mn = MN.d;
        int i2 = aVar.h;
        if (i2 == 0) {
            C1795Pt1.b(objB);
            S80 s80 = S80.EMAIL_AUTH;
            C4966kq1 c4966kq1 = this.e;
            c4966kq1.getClass();
            Intrinsics.checkNotNullParameter(s80, "<set-?>");
            c4966kq1.f = s80;
            aVar.d = this;
            aVar.h = 1;
            objB = this.d.b(aVar);
            if (objB != mn) {
                kg = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = aVar.d;
            C1795Pt1.b(objB);
            return obj;
        }
        kg = (KG) aVar.d;
        C1795Pt1.b(objB);
        InterfaceC1900Rc1 interfaceC1900Rc1 = kg.a;
        aVar.d = objB;
        aVar.h = 2;
        return interfaceC1900Rc1.d(aVar) == mn ? mn : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.GG
    @Nullable
    public final Object b(@NotNull String str, @NotNull CommonError commonError, @NotNull LM lm) {
        HG hg;
        if (lm instanceof HG) {
            hg = (HG) lm;
            int i = hg.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                hg.i = i - Integer.MIN_VALUE;
            } else {
                hg = new HG(this, lm);
            }
        } else {
            hg = new HG(this, lm);
        }
        Object obj = hg.g;
        MN mn = MN.d;
        int i2 = hg.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            hg.d = str;
            hg.e = commonError;
            hg.i = 1;
            if (this.a.d(hg) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commonError = hg.e;
            str = hg.d;
            C1795Pt1.b(obj);
        }
        C8056za.r(commonError, str);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        if (r8.a(r0) == r1) goto L37;
     */
    @Override // defpackage.GG
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.Nullable java.lang.String r8, long r9, long r11, @org.jetbrains.annotations.NotNull defpackage.LM r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof defpackage.IG
            if (r0 == 0) goto L13
            r0 = r13
            IG r0 = (defpackage.IG) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            IG r0 = new IG
            r0.<init>(r7, r13)
        L18:
            java.lang.Object r13 = r0.h
            MN r1 = defpackage.MN.d
            int r2 = r0.j
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L47
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            defpackage.C1795Pt1.b(r13)
            goto L9c
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            KG r8 = r0.d
            defpackage.C1795Pt1.b(r13)
            goto L7c
        L3d:
            long r11 = r0.g
            long r9 = r0.e
            KG r8 = r0.d
            defpackage.C1795Pt1.b(r13)
            goto L5c
        L47:
            defpackage.C1795Pt1.b(r13)
            r0.d = r7
            r0.e = r9
            r0.g = r11
            r0.j = r6
            Rc1 r13 = r7.a
            java.lang.Object r13 = r13.e(r8, r0)
            if (r13 != r1) goto L5b
            goto L9b
        L5b:
            r8 = r7
        L5c:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L6c
            com.api.core.backend.domain.models.resultModels.ResultOk r8 = new com.api.core.backend.domain.models.resultModels.ResultOk
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.<init>(r9)
            return r8
        L6c:
            JG r13 = new JG
            r13.<init>(r8, r9, r3)
            r0.d = r8
            r0.j = r5
            java.lang.Object r13 = defpackage.OZ1.d(r11, r13, r0)
            if (r13 != r1) goto L7c
            goto L9b
        L7c:
            com.api.core.backend.domain.models.resultModels.CommonResult r13 = (com.api.core.backend.domain.models.resultModels.CommonResult) r13
            if (r13 != 0) goto L8a
            com.api.core.backend.domain.models.resultModels.ResultError r13 = new com.api.core.backend.domain.models.resultModels.ResultError
            com.api.core.backend.domain.models.resultModels.CommonError$TimeoutException r9 = new com.api.core.backend.domain.models.resultModels.CommonError$TimeoutException
            r9.<init>()
            r13.<init>(r9)
        L8a:
            boolean r9 = r13 instanceof com.api.core.backend.domain.models.resultModels.ResultError
            if (r9 == 0) goto L8f
            return r13
        L8f:
            eJ1 r8 = r8.c
            r0.d = r3
            r0.j = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L9c
        L9b:
            return r1
        L9c:
            com.api.core.backend.domain.models.resultModels.ResultOk r8 = new com.api.core.backend.domain.models.resultModels.ResultOk
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KG.c(java.lang.String, long, long, LM):java.lang.Object");
    }
}
