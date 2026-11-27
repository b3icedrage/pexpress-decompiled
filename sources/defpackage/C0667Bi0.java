package defpackage;

import com.api.core.BaseFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0667Bi0 extends C0589Ai0 {

    @NotNull
    public final BaseFragment d;
    public final boolean e;
    public final int f;

    @Nullable
    public final Integer g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0667Bi0(BaseFragment fragment, boolean z, int i) {
        Integer d = fragment.getD();
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        String canonicalName = fragment.getClass().getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        super(canonicalName, new C2304Wg(fragment, 1));
        this.d = fragment;
        this.e = z;
        this.f = i;
        this.g = d;
    }

    @NotNull
    public final String toString() {
        String canonicalName = this.d.getClass().getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        return canonicalName;
    }
}
