package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface SK0 {

    public static abstract class a {

        /* JADX INFO: renamed from: SK0$a$a, reason: collision with other inner class name */
        public static final class C0139a extends a {
        }

        public static final class b extends a {

            @NotNull
            public final C1627Np1 a;

            public b(C1627Np1 kotlinJvmBinaryClass) {
                Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.a = kotlinJvmBinaryClass;
            }
        }
    }

    @Nullable
    a.b a(@NotNull QC qc, @NotNull C7793yI0 c7793yI0);
}
