package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0736Cf0 {

    /* JADX INFO: renamed from: Cf0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class a<T> extends LM {
        public InterfaceC6606sf0 d;
        public InterfaceC0764Co1 e;
        public InterfaceC2621Zz g;
        public boolean h;
        public /* synthetic */ Object i;
        public int j;

        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.j |= Integer.MIN_VALUE;
            return C0736Cf0.a(null, null, false, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r2.a(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(defpackage.InterfaceC6606sf0<? super T> r7, defpackage.InterfaceC0764Co1<? extends T> r8, boolean r9, defpackage.JM<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof defpackage.C0736Cf0.a
            if (r0 == 0) goto L13
            r0 = r10
            Cf0$a r0 = (defpackage.C0736Cf0.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            Cf0$a r0 = new Cf0$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.i
            MN r1 = defpackage.MN.d
            int r2 = r0.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            boolean r9 = r0.h
            Zz r7 = r0.g
            Co1 r8 = r0.e
            sf0 r2 = r0.d
            defpackage.C1795Pt1.b(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.h
            Zz r7 = r0.g
            Co1 r8 = r0.e
            sf0 r2 = r0.d
            defpackage.C1795Pt1.b(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            defpackage.C1795Pt1.b(r10)
            boolean r10 = r7 instanceof defpackage.TY1
            if (r10 != 0) goto Lab
            Zz r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.d = r7     // Catch: java.lang.Throwable -> L35
            r0.e = r8     // Catch: java.lang.Throwable -> L35
            r0.g = r10     // Catch: java.lang.Throwable -> L35
            r0.h = r9     // Catch: java.lang.Throwable -> L35
            r0.j = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L67
            goto L87
        L67:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L35
            r0.d = r2     // Catch: java.lang.Throwable -> L35
            r0.e = r8     // Catch: java.lang.Throwable -> L35
            r0.g = r7     // Catch: java.lang.Throwable -> L35
            r0.h = r9     // Catch: java.lang.Throwable -> L35
            r0.j = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.a(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
        L87:
            return r1
        L88:
            if (r9 == 0) goto L8d
            r8.l(r3)
        L8d:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L9b:
            if (r3 != 0) goto La7
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La7:
            r8.l(r3)
        Laa:
            throw r10
        Lab:
            TY1 r7 = (defpackage.TY1) r7
            java.lang.Throwable r7 = r7.d
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0736Cf0.a(sf0, Co1, boolean, JM):java.lang.Object");
    }
}
