package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class H9 extends TF {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H9)) {
            return false;
        }
        ((H9) obj).getClass();
        return true;
    }

    public final int hashCode() {
        Boolean.hashCode(false);
        throw null;
    }

    @NotNull
    public final String toString() {
        return "AlertDialogWithEditTextParams(hintText=null, hintRes=null, disclaimerTextRes=null, actionButtonShouldShowProgressProgressFlow=null, shouldCloseOnActiveAction=false, activeActionEditText=null, passiveActionEditText=null)";
    }
}
