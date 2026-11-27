package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5171lp implements InterfaceC5263mF {

    @Nullable
    public final C0667Bi0 a;

    public C5171lp(@Nullable C0667Bi0 c0667Bi0) {
        this.a = c0667Bi0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof C5171lp) && Intrinsics.a(this.a, ((C5171lp) obj).a);
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
        return "BackTo(screen=" + this.a + ")";
    }
}
