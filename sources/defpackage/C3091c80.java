package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: c80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3091c80 {

    @NotNull
    public final String a;

    @Nullable
    public final LinkedHashMap b;

    @Nullable
    public final LinkedHashMap c;

    @Nullable
    public final LinkedHashMap d;

    @Nullable
    public final LinkedHashMap e;

    public C3091c80(@NotNull String eventType, @Nullable LinkedHashMap linkedHashMap, @Nullable LinkedHashMap linkedHashMap2, @Nullable LinkedHashMap linkedHashMap3, @Nullable LinkedHashMap linkedHashMap4) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.a = eventType;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = linkedHashMap3;
        this.e = linkedHashMap4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3091c80)) {
            return false;
        }
        C3091c80 c3091c80 = (C3091c80) obj;
        return Intrinsics.a(this.a, c3091c80.a) && Intrinsics.a(this.b, c3091c80.b) && Intrinsics.a(this.c, c3091c80.c) && Intrinsics.a(this.d, c3091c80.d) && Intrinsics.a(this.e, c3091c80.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        LinkedHashMap linkedHashMap = this.b;
        int iHashCode2 = (iHashCode + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31;
        LinkedHashMap linkedHashMap2 = this.c;
        int iHashCode3 = (iHashCode2 + (linkedHashMap2 == null ? 0 : linkedHashMap2.hashCode())) * 31;
        LinkedHashMap linkedHashMap3 = this.d;
        int iHashCode4 = (iHashCode3 + (linkedHashMap3 == null ? 0 : linkedHashMap3.hashCode())) * 31;
        LinkedHashMap linkedHashMap4 = this.e;
        return iHashCode4 + (linkedHashMap4 != null ? linkedHashMap4.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "Event(eventType=" + this.a + ", eventProperties=" + this.b + ", userProperties=" + this.c + ", groups=" + this.d + ", groupProperties=" + this.e + ')';
    }
}
