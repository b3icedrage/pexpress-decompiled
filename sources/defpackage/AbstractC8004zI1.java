package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8004zI1 {

    @NotNull
    public final AI1 a;

    public AbstractC8004zI1(@NotNull AI1 stateContext) {
        Intrinsics.checkNotNullParameter(stateContext, "stateContext");
        this.a = stateContext;
    }

    public abstract void a(@NotNull String str);

    public abstract void b();

    public final void c(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        C4201hS c4201hS = C6104qF0.a;
        C6104qF0.b("Call " + method + " on " + this + ", something wrong");
    }

    public abstract void d(boolean z);

    public abstract void e();

    public abstract void f(@NotNull SocketMessage socketMessage);

    public abstract void g(@NotNull String str);

    public abstract void h();

    public abstract void i(@NotNull V10 v10);

    public abstract void j();

    public abstract void k();

    @NotNull
    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
        return simpleName;
    }
}
