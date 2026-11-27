package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2250Vp0 implements KN {

    @NotNull
    public final C1782Pp0 d;
    public InterfaceC2595Zq0 e;
    public AbstractC5391mr0 g;

    @NotNull
    private volatile /* synthetic */ int received;

    @NotNull
    public static final C2498Yk<Object> i = new C2498Yk<>("CustomResponse");
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(C2250Vp0.class, "received");

    public C2250Vp0(@NotNull C1782Pp0 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.d = client;
        this.received = 0;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:49:0x00ba, B:54:0x00ca, B:57:0x00dd, B:58:0x00f2), top: B:66:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:49:0x00ba, B:54:0x00ca, B:57:0x00dd, B:58:0x00f2), top: B:66:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        if (r9 == r1) goto L47;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.A62 r8, @org.jetbrains.annotations.NotNull defpackage.LM r9) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2250Vp0.a(A62, LM):java.lang.Object");
    }

    public boolean b() {
        return false;
    }

    @NotNull
    public final InterfaceC2595Zq0 c() {
        InterfaceC2595Zq0 interfaceC2595Zq0 = this.e;
        if (interfaceC2595Zq0 != null) {
            return interfaceC2595Zq0;
        }
        Intrinsics.l("request");
        throw null;
    }

    @NotNull
    public final AbstractC5391mr0 d() {
        AbstractC5391mr0 abstractC5391mr0 = this.g;
        if (abstractC5391mr0 != null) {
            return abstractC5391mr0;
        }
        Intrinsics.l(Payload.RESPONSE);
        throw null;
    }

    @Nullable
    public Object e() {
        return d().c();
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return d().getE();
    }

    @NotNull
    public final InterfaceC2576Zk q() {
        return c().q();
    }

    @NotNull
    public final String toString() {
        return "HttpClientCall[" + c().getUrl() + ", " + d().g() + ']';
    }
}
