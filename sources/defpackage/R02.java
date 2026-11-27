package defpackage;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class R02 {

    @NotNull
    public final HashSet a = new HashSet();

    public final boolean a(String str) {
        return !this.a.contains(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && R02.class.equals(obj.getClass())) {
            return Intrinsics.a(((R02) obj).a, this.a);
        }
        return false;
    }
}
