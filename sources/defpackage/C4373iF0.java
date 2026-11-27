package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4373iF0 extends AbstractC2766af2 {

    @NotNull
    public static final C4373iF0 c = new C4373iF0("package", false);

    @Override // defpackage.AbstractC2766af2
    @Nullable
    public final Integer a(@NotNull AbstractC2766af2 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        C5315mW0 c5315mW0 = Xe2.a;
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return visibility == Xe2.e.c || visibility == Xe2.f.c ? 1 : -1;
    }

    @Override // defpackage.AbstractC2766af2
    @NotNull
    public final String b() {
        return "public/*package*/";
    }

    @Override // defpackage.AbstractC2766af2
    @NotNull
    public final AbstractC2766af2 c() {
        return Xe2.g.c;
    }
}
