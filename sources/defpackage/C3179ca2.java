package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ca2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3179ca2 {

    @NotNull
    public final Map<String, C2980bd0> a;

    public C3179ca2() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3179ca2) && Intrinsics.a(this.a, ((C3179ca2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "UploadFilesState(files=" + this.a + ')';
    }

    public C3179ca2(@NotNull Map<String, C2980bd0> files) {
        Intrinsics.checkNotNullParameter(files, "files");
        this.a = files;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3179ca2(int i) {
        Map map = Collections.EMPTY_MAP;
        Intrinsics.checkNotNullExpressionValue(map, "emptyMap()");
        this((Map<String, C2980bd0>) map);
    }
}
