package defpackage;

import androidx.lifecycle.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCP0;", "LKN;", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CP0 implements KN {
    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract g getD();

    @NotNull
    public final void c(@NotNull Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C5189lv.k(this, null, new C8024zP0(this, block, null), 3);
    }

    @NotNull
    public final C2936bP1 d(@NotNull Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return C5189lv.k(this, null, new AP0(this, block, null), 3);
    }

    @NotNull
    public final void e(@NotNull Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C5189lv.k(this, null, new BP0(this, block, null), 3);
    }
}
