package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3792fV1 {

    /* JADX INFO: renamed from: fV1$a */
    public static final class a implements InterfaceC3792fV1 {

        @NotNull
        public static final a a = new a();

        @Override // defpackage.InterfaceC3792fV1
        @NotNull
        public final Collection a(@NotNull InterfaceC6494s62 currentTypeConstructor, @NotNull Collection superTypes, @NotNull C7942z1 neighbors, @NotNull A1 reportLoop) {
            Intrinsics.checkNotNullParameter(currentTypeConstructor, "currentTypeConstructor");
            Intrinsics.checkNotNullParameter(superTypes, "superTypes");
            Intrinsics.checkNotNullParameter(neighbors, "neighbors");
            Intrinsics.checkNotNullParameter(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    @NotNull
    Collection a(@NotNull InterfaceC6494s62 interfaceC6494s62, @NotNull Collection collection, @NotNull C7942z1 c7942z1, @NotNull A1 a1);
}
