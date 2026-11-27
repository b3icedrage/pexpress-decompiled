package defpackage;

import com.google.android.gms.common.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", l = {ConnectionResult.API_DISABLED, ConnectionResult.API_DISABLED_FOR_CONNECTION, 26, 31}, m = "invokeSuspend")
public final class C0630Aw extends AW1 implements Function2<InterfaceC5583nl2, JM<? super Unit>, Object> {
    public Object d;
    public InterfaceC0942Ew e;
    public InterfaceC1060Gj0 g;
    public Object h;
    public byte[] i;
    public long j;
    public long k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Long o;
    public final /* synthetic */ InterfaceC0942Ew p;
    public final /* synthetic */ InterfaceC1060Gj0<Long, Long, JM<? super Unit>, Object> q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0630Aw(Long l, InterfaceC0942Ew interfaceC0942Ew, InterfaceC1060Gj0<? super Long, ? super Long, ? super JM<? super Unit>, ? extends Object> interfaceC1060Gj0, JM<? super C0630Aw> jm) {
        super(2, jm);
        this.o = l;
        this.p = interfaceC0942Ew;
        this.q = interfaceC1060Gj0;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C0630Aw c0630Aw = new C0630Aw(this.o, this.p, this.q, jm);
        c0630Aw.n = obj;
        return c0630Aw;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC5583nl2 interfaceC5583nl2, JM<? super Unit> jm) {
        return ((C0630Aw) create(interfaceC5583nl2, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00da A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:9:0x001b, B:62:0x018f, B:40:0x00d4, B:42:0x00da, B:45:0x00f6, B:55:0x015d, B:59:0x016e), top: B:67:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6 A[Catch: all -> 0x0020, PHI: r2 r3 r4 r6 r8 r9 r11 r12 r14 r16
      0x00f6: PHI (r2v11 java.lang.Object) = (r2v30 java.lang.Object), (r2v18 java.lang.Object) binds: [B:43:0x00f2, B:27:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r3v6 O71) = (r3v8 O71), (r3v12 O71) binds: [B:43:0x00f2, B:27:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r4v5 long) = (r4v6 long), (r4v11 long) binds: [B:43:0x00f2, B:27:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r6v4 long) = (r6v5 long), (r6v8 long) binds: [B:43:0x00f2, B:27:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r8v3 java.lang.Object) = (r8v12 java.lang.Object), (r8v14 java.lang.Object) binds: [B:43:0x00f2, B:27:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r9v6 byte[]) = (r9v7 byte[]), (r9v10 byte[]) binds: [B:43:0x00f2, B:27:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r11v3 Gj0<java.lang.Long, java.lang.Long, JM<? super kotlin.Unit>, java.lang.Object>) = 
      (r11v4 Gj0<java.lang.Long, java.lang.Long, JM<? super kotlin.Unit>, java.lang.Object>)
      (r11v6 Gj0<java.lang.Long, java.lang.Long, JM<? super kotlin.Unit>, java.lang.Object>)
     binds: [B:43:0x00f2, B:27:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r12v5 Ew) = (r12v7 Ew), (r12v9 Ew) binds: [B:43:0x00f2, B:27:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r14v2 nl2) = (r14v3 nl2), (r14v6 nl2) binds: [B:43:0x00f2, B:27:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r16v2 long) = (r16v3 long), (r16v5 long) binds: [B:43:0x00f2, B:27:0x0098] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:9:0x001b, B:62:0x018f, B:40:0x00d4, B:42:0x00da, B:45:0x00f6, B:55:0x015d, B:59:0x016e), top: B:67:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0152  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0152 -> B:54:0x015a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0630Aw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
