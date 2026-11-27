package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7426wa {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7426wa)) {
            return false;
        }
        ((C7426wa) obj).getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }

    @NotNull
    public final String toString() {
        return "AnalyticsEvent(eventType=null, eventProperties=null, userProperties=null)";
    }
}
