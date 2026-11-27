package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ue2 extends RuntimeException {

    @NotNull
    public final Fragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ue2(@NotNull Fragment fragment, @Nullable String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.d = fragment;
    }
}
