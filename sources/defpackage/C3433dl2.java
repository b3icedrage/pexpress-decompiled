package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3433dl2 {
    public static final a a = new a();

    /* JADX INFO: renamed from: dl2$a */
    public static class a {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    /* JADX INFO: renamed from: dl2$b */
    public static final class b {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    @Nullable
    public static void a(@Nullable Object obj) throws Throwable {
        if (obj instanceof b) {
            Throwable e = ((b) obj).a;
            Intrinsics.checkNotNullParameter(e, "e");
            throw e;
        }
    }
}
