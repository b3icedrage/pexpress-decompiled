package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3361dR1 {

    @NotNull
    public final List<C3151cR1> a;
    public int b;

    public C3361dR1() {
        throw null;
    }

    public C3361dR1(List listStory) {
        Intrinsics.checkNotNullParameter(listStory, "listStory");
        this.a = listStory;
        this.b = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3361dR1)) {
            return false;
        }
        C3361dR1 c3361dR1 = (C3361dR1) obj;
        return Intrinsics.a(this.a, c3361dR1.a) && this.b == c3361dR1.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "StoryBlock(listStory=" + this.a + ", lastStoryIndex=" + this.b + ")";
    }
}
