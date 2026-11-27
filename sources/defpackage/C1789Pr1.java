package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1789Pr1 implements InterfaceC5263mF {

    @NotNull
    public final C0667Bi0 a;

    public C1789Pr1(@NotNull C0667Bi0 screen) {
        Intrinsics.d(screen, "screen");
        this.a = screen;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof C1789Pr1) && Intrinsics.a(this.a, ((C1789Pr1) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        C0667Bi0 c0667Bi0 = this.a;
        if (c0667Bi0 != null) {
            return c0667Bi0.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        return "Replace(screen=" + this.a + ")";
    }
}
