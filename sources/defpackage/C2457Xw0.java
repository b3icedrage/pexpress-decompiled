package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Xw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LXw0;", "LXs0;", "LWs0;", "LTs0;", "LSs0;", "LOs0;", "message", "<init>", "(LOs0;)V", "LOs0;", "getMessage", "()LOs0;", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class C2457Xw0 implements InterfaceC2445Xs0, InterfaceC2341Ws0, InterfaceC2103Ts0, InterfaceC2025Ss0 {

    @NotNull
    private final InterfaceC1713Os0 message;

    public C2457Xw0(@NotNull InterfaceC1713Os0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    @Override // defpackage.InterfaceC2445Xs0, defpackage.InterfaceC2341Ws0, defpackage.InterfaceC2103Ts0, defpackage.InterfaceC2025Ss0
    @NotNull
    public InterfaceC1713Os0 getMessage() {
        return this.message;
    }
}
