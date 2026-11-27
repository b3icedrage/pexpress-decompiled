package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LG91;", "", "LnS0;", "level", "", "entry", "<init>", "(LnS0;Ljava/lang/String;)V", "component1", "()LnS0;", "component2", "()Ljava/lang/String;", "copy", "(LnS0;Ljava/lang/String;)LG91;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LnS0;", "getLevel", "Ljava/lang/String;", "getEntry", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class G91 {

    @NotNull
    private final String entry;

    @NotNull
    private final EnumC5513nS0 level;

    public G91(@NotNull EnumC5513nS0 level, @NotNull String entry) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.level = level;
        this.entry = entry;
    }

    public static /* synthetic */ G91 copy$default(G91 g91, EnumC5513nS0 enumC5513nS0, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC5513nS0 = g91.level;
        }
        if ((i & 2) != 0) {
            str = g91.entry;
        }
        return g91.copy(enumC5513nS0, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC5513nS0 getLevel() {
        return this.level;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntry() {
        return this.entry;
    }

    @NotNull
    public final G91 copy(@NotNull EnumC5513nS0 level, @NotNull String entry) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(entry, "entry");
        return new G91(level, entry);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof G91)) {
            return false;
        }
        G91 g91 = (G91) other;
        return this.level == g91.level && Intrinsics.a(this.entry, g91.entry);
    }

    @NotNull
    public final String getEntry() {
        return this.entry;
    }

    @NotNull
    public final EnumC5513nS0 getLevel() {
        return this.level;
    }

    public int hashCode() {
        return this.entry.hashCode() + (this.level.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OneSignalLogEvent(level=");
        sb.append(this.level);
        sb.append(", entry=");
        return C1039Gc0.e(sb, this.entry, ')');
    }
}
