package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class H60 {
    public final String a;

    public H60(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H60)) {
            return false;
        }
        return this.a.equals(((H60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @NonNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
