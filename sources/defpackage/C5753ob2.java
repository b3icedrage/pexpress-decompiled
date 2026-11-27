package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ob2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5753ob2<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0 d;
    public final /* synthetic */ C5543nb2 e;

    /* JADX INFO: renamed from: ob2$a */
    @InterfaceC3368dU(c = "com.base.feature.support.chat.data.UserLookupSessionValue$valueFlow$1$invokeSuspend$$inlined$map$1$2", f = "UserLookupSessionValue.kt", l = {220, 219}, m = "emit")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;
        public InterfaceC6606sf0 g;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C5753ob2.this.a(null, this);
        }
    }

    public C5753ob2(InterfaceC6606sf0 interfaceC6606sf0, C5543nb2 c5543nb2) {
        this.d = interfaceC6606sf0;
        this.e = c5543nb2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r10.a(r11, r0) == r1) goto L28;
     */
    @Override // defpackage.InterfaceC6606sf0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r10, @org.jetbrains.annotations.NotNull defpackage.JM r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.C5753ob2.a
            if (r0 == 0) goto L13
            r0 = r11
            ob2$a r0 = (defpackage.C5753ob2.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ob2$a r0 = new ob2$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.d
            MN r1 = defpackage.MN.d
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.C1795Pt1.b(r11)
            goto L78
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            sf0 r10 = r0.g
            defpackage.C1795Pt1.b(r11)
            goto L6d
        L39:
            defpackage.C1795Pt1.b(r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            nb2 r11 = r9.e
            kf r2 = r11.c
            sf0 r6 = r9.d
            r0.g = r6
            r0.e = r5
            if (r10 == 0) goto L62
            GP1 r10 = r2.k
            java.lang.Object r10 = r10.getValue()
            uG r10 = (defpackage.C6945uG) r10
            if (r10 == 0) goto L60
            java.lang.Long r11 = new java.lang.Long
            long r7 = r10.a
            r11.<init>(r7)
            goto L69
        L60:
            r11 = r3
            goto L69
        L62:
            ZT1 r10 = r11.a
            java.lang.Object r10 = r10.a(r0)
            r11 = r10
        L69:
            if (r11 != r1) goto L6c
            goto L77
        L6c:
            r10 = r6
        L6d:
            r0.g = r3
            r0.e = r4
            java.lang.Object r10 = r10.a(r11, r0)
            if (r10 != r1) goto L78
        L77:
            return r1
        L78:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5753ob2.a(java.lang.Object, JM):java.lang.Object");
    }
}
