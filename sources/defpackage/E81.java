package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1", f = "OkHttpEngine.kt", l = {155}, m = "invokeSuspend")
public final class E81 extends AW1 implements Function2<InterfaceC5583nl2, JM<? super Unit>, Object> {
    public Closeable d;
    public CoroutineContext e;
    public C3241cr0 g;
    public InterfaceC2833av h;
    public C2590Zo1 i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ InterfaceC2833av l;
    public final /* synthetic */ CoroutineContext m;
    public final /* synthetic */ C3241cr0 n;

    public static final class a extends ML0 implements Function1<ByteBuffer, Unit> {
        public final /* synthetic */ C2590Zo1 d;
        public final /* synthetic */ InterfaceC2833av e;
        public final /* synthetic */ C3241cr0 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2590Zo1 c2590Zo1, InterfaceC2833av interfaceC2833av, C3241cr0 c3241cr0) {
            super(1);
            this.d = c2590Zo1;
            this.e = interfaceC2833av;
            this.g = c3241cr0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ByteBuffer byteBuffer) throws IOException {
            ByteBuffer buffer = byteBuffer;
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            try {
                this.d.d = this.e.read(buffer);
                return Unit.a;
            } catch (Throwable th) {
                if (th instanceof SocketTimeoutException) {
                    throw C1162Hr0.a(this.g, th);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E81(InterfaceC2833av interfaceC2833av, CoroutineContext coroutineContext, C3241cr0 c3241cr0, JM<? super E81> jm) {
        super(2, jm);
        this.l = interfaceC2833av;
        this.m = coroutineContext;
        this.n = c3241cr0;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        E81 e81 = new E81(this.l, this.m, this.n, jm);
        e81.k = obj;
        return e81;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC5583nl2 interfaceC5583nl2, JM<? super Unit> jm) {
        return ((E81) create(interfaceC5583nl2, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:6:0x0018, B:27:0x0076, B:15:0x003c, B:17:0x0042, B:19:0x004c, B:22:0x0054, B:24:0x0058, B:28:0x007e, B:13:0x0030), top: B:46:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x004c A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:6:0x0018, B:27:0x0076, B:15:0x003c, B:17:0x0042, B:19:0x004c, B:22:0x0054, B:24:0x0058, B:28:0x007e, B:13:0x0030), top: B:46:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [av, java.nio.channels.Channel] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0073 -> B:27:0x0076). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Unit unit;
        Closeable closeable;
        C2590Zo1 c2590Zo1;
        C3241cr0 c3241cr0;
        InterfaceC5583nl2 interfaceC5583nl2;
        CoroutineContext coroutineContext;
        ?? r4;
        XF0 xf0;
        boolean zG;
        ?? r5;
        MN mn = MN.d;
        int i = this.j;
        Throwable th = null;
        try {
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC5583nl2 interfaceC5583nl3 = (InterfaceC5583nl2) this.k;
                closeable = this.l;
                c2590Zo1 = new C2590Zo1();
                CoroutineContext coroutineContext2 = this.m;
                c3241cr0 = this.n;
                interfaceC5583nl2 = interfaceC5583nl3;
                coroutineContext = coroutineContext2;
                r4 = closeable;
                if (r4.isOpen()) {
                    xf0 = (XF0) coroutineContext.p(XF0.a.d);
                    if (xf0 != null) {
                        zG = xf0.g();
                    } else {
                        zG = true;
                    }
                    if (!zG && c2590Zo1.d >= 0) {
                        InterfaceC6245qw interfaceC6245qwI0 = interfaceC5583nl2.i0();
                        a aVar = new a(c2590Zo1, r4, c3241cr0);
                        this.k = interfaceC5583nl2;
                        this.d = closeable;
                        this.e = coroutineContext;
                        this.g = c3241cr0;
                        this.h = r4;
                        this.i = c2590Zo1;
                        this.j = 1;
                        r5 = r4;
                        if (interfaceC6245qwI0.c(aVar, this) == mn) {
                            return mn;
                        }
                    }
                    if (th != null) {
                        throw th;
                    }
                    Intrinsics.checkNotNull(unit);
                    return Unit.a;
                }
                unit = Unit.a;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (th != null) {
                    throw th;
                }
                Intrinsics.checkNotNull(unit);
                return Unit.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2590Zo1 = this.i;
            InterfaceC2833av interfaceC2833av = this.h;
            c3241cr0 = this.g;
            coroutineContext = this.e;
            closeable = this.d;
            interfaceC5583nl2 = (InterfaceC5583nl2) this.k;
            C1795Pt1.b(obj);
            r5 = interfaceC2833av;
            interfaceC5583nl2.i0().flush();
            r4 = r5;
            if (r4.isOpen()) {
                xf0 = (XF0) coroutineContext.p(XF0.a.d);
                if (xf0 != null) {
                    zG = xf0.g();
                } else {
                    zG = true;
                }
                if (!zG) {
                }
            }
            unit = Unit.a;
            if (closeable != null) {
                closeable.close();
            }
        } catch (Throwable th3) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th4) {
                    J90.a(th3, th4);
                }
            }
            th = th3;
            unit = null;
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.checkNotNull(unit);
        return Unit.a;
    }
}
