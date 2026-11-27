package defpackage;

import android.graphics.Typeface;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G1 {
    public static final C5151lj1 a = new C5151lj1("image-destination");
    public static final C5151lj1 b = new C5151lj1("image-replacement-text-is-link");
    public static final C5151lj1 c = new C5151lj1("image-size");
    public static C7790yH0.a d;

    public static int c(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    public abstract void a(@NotNull InterfaceC1490Lx interfaceC1490Lx);

    public abstract boolean b(@NotNull LM1 lm1);

    @NotNull
    public abstract List d(@NotNull String str, @NotNull List list);

    public abstract void e(@NotNull InterfaceC1490Lx interfaceC1490Lx, @NotNull InterfaceC1490Lx interfaceC1490Lx2);

    @Nullable
    public abstract RJ0 f(@NotNull RI0 ri0, @NotNull List list);

    public String g() {
        return null;
    }

    public String h() {
        return null;
    }

    @Nullable
    public abstract RJ0 i(@NotNull RI0 ri0, @NotNull Object obj);

    @Nullable
    public abstract RJ0 j(@NotNull RI0 ri0, @Nullable String str);

    public abstract Object k();

    public void l(@NotNull C7483wo1 webSocket, int i, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public void m(@NotNull C7483wo1 webSocket, int i, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public void n(@NotNull C7483wo1 webSocket, @NotNull Exception t, @Nullable C0857Dt1 c0857Dt1) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(t, "t");
    }

    public abstract void o(int i);

    public abstract void p(Typeface typeface, boolean z);

    public void q(@NotNull C7483wo1 webSocket, @NotNull C1802Pw bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
    }

    public void r(@NotNull C7483wo1 webSocket, @NotNull String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
    }

    public void s(@NotNull Qf2 webSocket, @NotNull C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    @NotNull
    public abstract AbstractC4649jL0 t(@NotNull InterfaceC5702oL0 interfaceC5702oL0);

    public void u(@NotNull InterfaceC1490Lx member, @NotNull Collection overridden) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(overridden, "overridden");
        member.D0(overridden);
    }

    public abstract void v(byte[] bArr, int i, int i2);
}
