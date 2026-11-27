package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0003R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lxf2;", "", "<init>", "()V", "waitForWake", "(LJM;)Ljava/lang/Object;", "", "wake", "LOz;", "channel", "LOz;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7659xf2 {

    @NotNull
    private final InterfaceC1733Oz<Object> channel = C2889bA.a(-1, 6, null);

    @Nullable
    public final Object waitForWake(@NotNull JM<Object> jm) {
        return this.channel.h(jm);
    }

    public final void wake() {
        Object objN = this.channel.n(null);
        if (objN instanceof C3308dA.b) {
            throw new Exception("Waiter.wait failed", C3308dA.a(objN));
        }
    }
}
