package defpackage;

import java.io.FileNotFoundException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.core.platform.EventPipeline$upload$1", f = "EventPipeline.kt", l = {205, 122, 135}, m = "invokeSuspend")
public final class I80 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public K80 d;
    public InterfaceC0764Co1 e;
    public InterfaceC2621Zz g;
    public Iterator h;
    public Object i;
    public int j;
    public final /* synthetic */ K80 k;

    @InterfaceC3368dU(c = "com.amplitude.core.platform.EventPipeline$upload$1$1$1", f = "EventPipeline.kt", l = {124}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ K80 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K80 k80, JM<? super a> jm) {
            super(2, jm);
            this.e = k80;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C3595ea c3595ea = this.e.a;
            try {
                if (i == 0) {
                    C1795Pt1.b(obj);
                    LQ1 lq1G = c3595ea.g();
                    this.d = 1;
                    if (lq1G.d(this) == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
                return Unit.a;
            } catch (FileNotFoundException e) {
                String message = e.getMessage();
                if (message == null) {
                    return null;
                }
                c3595ea.l.warn("Event storage file not found: ".concat(message));
                return Unit.a;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I80(K80 k80, JM<? super I80> jm) {
        super(2, jm);
        this.k = k80;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new I80(this.k, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((I80) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x0022, PHI: r1 r8 r15
      0x0058: PHI (r1v7 Zz) = (r1v3 Zz), (r1v8 Zz) binds: [B:25:0x0050, B:37:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r8v5 Co1) = (r8v19 Co1), (r8v20 Co1) binds: [B:25:0x0050, B:37:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r15v21 K80) = (r15v2 K80), (r15v23 K80) binds: [B:25:0x0050, B:37:0x00a9] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0022, blocks: (B:8:0x001a, B:43:0x00cb, B:36:0x00a5, B:26:0x0058, B:30:0x006e, B:32:0x0076, B:35:0x0094, B:38:0x00ab, B:39:0x00af, B:63:0x0111, B:64:0x011b, B:66:0x0121, B:46:0x00d4, B:48:0x00de, B:53:0x00f8, B:55:0x00fe, B:57:0x0103, B:58:0x0108, B:19:0x003b, B:22:0x0045, B:25:0x0050), top: B:81:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:8:0x001a, B:43:0x00cb, B:36:0x00a5, B:26:0x0058, B:30:0x006e, B:32:0x0076, B:35:0x0094, B:38:0x00ab, B:39:0x00af, B:63:0x0111, B:64:0x011b, B:66:0x0121, B:46:0x00d4, B:48:0x00de, B:53:0x00f8, B:55:0x00fe, B:57:0x0103, B:58:0x0108, B:19:0x003b, B:22:0x0045, B:25:0x0050), top: B:81:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:8:0x001a, B:43:0x00cb, B:36:0x00a5, B:26:0x0058, B:30:0x006e, B:32:0x0076, B:35:0x0094, B:38:0x00ab, B:39:0x00af, B:63:0x0111, B:64:0x011b, B:66:0x0121, B:46:0x00d4, B:48:0x00de, B:53:0x00f8, B:55:0x00fe, B:57:0x0103, B:58:0x0108, B:19:0x003b, B:22:0x0045, B:25:0x0050), top: B:81:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #1 {all -> 0x0022, blocks: (B:8:0x001a, B:43:0x00cb, B:36:0x00a5, B:26:0x0058, B:30:0x006e, B:32:0x0076, B:35:0x0094, B:38:0x00ab, B:39:0x00af, B:63:0x0111, B:64:0x011b, B:66:0x0121, B:46:0x00d4, B:48:0x00de, B:53:0x00f8, B:55:0x00fe, B:57:0x0103, B:58:0x0108, B:19:0x003b, B:22:0x0045, B:25:0x0050), top: B:81:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c8 -> B:87:0x00cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0111 -> B:56:0x0101). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x011f -> B:56:0x0101). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0121 -> B:56:0x0101). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
