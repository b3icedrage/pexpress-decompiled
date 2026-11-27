package defpackage;

import com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2854b10 extends C0589Ai0 {

    @NotNull
    public final AbstractBottomSheetDialogFragment d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2854b10(@NotNull AbstractBottomSheetDialogFragment dialogFragment) {
        Intrinsics.checkNotNullParameter(dialogFragment, "dialogFragment");
        String canonicalName = dialogFragment.getClass().getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        super(canonicalName, new C0582Ag(dialogFragment, 1));
        this.d = dialogFragment;
    }

    @NotNull
    public final String toString() {
        String canonicalName = this.d.getClass().getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        return canonicalName;
    }
}
