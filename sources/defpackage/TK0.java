package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TK0 {
    @Nullable
    public static final InterfaceC2699aL0 a(@NotNull SK0 sk0, @NotNull QC classId, @NotNull C7793yI0 jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(sk0, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        SK0.a.b bVarA = sk0.a(classId, jvmMetadataVersion);
        if (bVarA != null) {
            return bVarA.a;
        }
        return null;
    }
}
