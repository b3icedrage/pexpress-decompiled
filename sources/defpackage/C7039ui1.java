package defpackage;

import com.api.core.backend.domain.models.responseModels.AccountType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ui1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7039ui1 implements InterfaceC0735Cf {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC7012ub2 b;

    /* JADX INFO: renamed from: ui1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.REAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.DEMO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public C7039ui1(@NotNull C4923kf appData, @NotNull InterfaceC7012ub2 userRepository) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.a = appData;
        this.b = userRepository;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean a(@NotNull InterfaceC0735Cf interfaceC0735Cf) {
        return InterfaceC0735Cf.a.a(this, interfaceC0735Cf);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r2.d(r0) == r1) goto L25;
     */
    @Override // defpackage.InterfaceC0735Cf
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.LM r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C7249vi1
            if (r0 == 0) goto L13
            r0 = r6
            vi1 r0 = (defpackage.C7249vi1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            vi1 r0 = new vi1
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
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ui1 r2 = r0.d
            defpackage.C1795Pt1.b(r6)
            goto L50
        L38:
            defpackage.C1795Pt1.b(r6)
            r0.d = r5
            r0.h = r4
            kf r6 = r5.a
            GP1 r6 = r6.k
            java.lang.Object r6 = defpackage.C7236vf0.a(r6, r0)
            if (r6 != r1) goto L4a
            goto L4c
        L4a:
            kotlin.Unit r6 = kotlin.Unit.a
        L4c:
            if (r6 != r1) goto L4f
            goto L5b
        L4f:
            r2 = r5
        L50:
            r6 = 0
            r0.d = r6
            r0.h = r3
            java.lang.Object r6 = r2.d(r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7039ui1.b(LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r6.c(r4, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.LM r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C7460wi1
            if (r0 == 0) goto L13
            r0 = r6
            wi1 r0 = (defpackage.C7460wi1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            wi1 r0 = new wi1
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
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ui1 r2 = r0.d
            defpackage.C1795Pt1.b(r6)
            goto L49
        L38:
            defpackage.C1795Pt1.b(r6)
            r0.d = r5
            r0.h = r4
            ub2 r6 = r5.b
            java.lang.Object r6 = r6.q(r0)
            if (r6 != r1) goto L48
            goto L61
        L48:
            r2 = r5
        L49:
            rf0 r6 = (defpackage.InterfaceC6396rf0) r6
            java.lang.String r4 = "user.balances"
            com.api.core.backend.domain.models.resultModels.CommonResultKt$okFilter$$inlined$filterIsInstance$1 r6 = com.api.core.backend.domain.models.resultModels.CommonResultKt.c(r6, r4)
            xi1 r4 = new xi1
            r4.<init>(r2)
            r2 = 0
            r0.d = r2
            r0.h = r3
            java.lang.Object r6 = r6.c(r4, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7039ui1.d(LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0735Cf
    public final void stop() {
    }
}
